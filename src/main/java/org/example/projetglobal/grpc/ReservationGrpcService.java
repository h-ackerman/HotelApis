package org.example.projetglobal.grpc;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.example.projetglobal.entities.Reservation;
import org.example.projetglobal.repositories.ReservationRepository;
import org.example.projetglobal.stubs.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;

import java.util.List;


@GrpcService
public class ReservationGrpcService extends HotelServiceGrpc.HotelServiceImplBase {

    @Autowired
    private ReservationRepository reservationRepository;

    private Hotel.Reservation entityToGrpc(Reservation reservation) {

        var clientGrpc = Hotel.Client.newBuilder()
                .setId(reservation.getClient().getId())
                .setEmail(reservation.getClient().getEmail())
                .setNom(reservation.getClient().getNom())
                .setPrenom(reservation.getClient().getPrenom())
                .setTelephone(reservation.getClient().getTelephone())
                .build();

        var grpcChambre = Hotel.Chambre.newBuilder()
                .setId(reservation.getChambre().getId())
                .setDisponible(reservation.getChambre().isDisponible())
                .setPrix((float)reservation.getChambre().getPrix())
                .setType(reservation.getChambre().getType().name())
                .build();

        return Hotel.Reservation.newBuilder()
                .setId(reservation.getId())
                .setClient(clientGrpc)
                .setChambre(grpcChambre)
                .setDateDebut(reservation.getDateDebut())
                .setDateFin(reservation.getDateFin())
                .setPreferences(reservation.getPreferences())
                .build();
    }

//    @Override
//    public void allReservations(Hotel.Empty request, StreamObserver<Hotel.GetAllReservationsResponse> responseObserver) {
//        List<Reservation> reservations = reservationRepository.findAll();
//
//        Hotel.GetAllReservationsResponse.Builder responseBuilder = Hotel.GetAllReservationsResponse.newBuilder();
//        responseBuilder.addAllReservations(reservations);
//
//        responseObserver.onNext(responseBuilder.build());
//        responseObserver.onCompleted();
//    }

    @Override
    public void reservationById(Hotel.ReservationIdRequest request, StreamObserver<Hotel.Reservation> responseObserver) {
        Reservation reservation = reservationRepository.findById(request.getId())
                .orElseThrow(() -> new ResourceNotFoundException("Reservation not found"));

        if(reservation != null) {
            Hotel.Reservation grpcReservation = entityToGrpc(reservation);

            responseObserver.onNext(grpcReservation);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void saveReservation(Hotel.ReservationRequest request, StreamObserver<Hotel.Reservation> responseObserver) {

    }





}
