package org.example.projetglobal.grpc;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.example.projetglobal.entities.Chambre;
import org.example.projetglobal.entities.Client;
import org.example.projetglobal.entities.Reservation;
import org.example.projetglobal.entities.TypeChambre;
import org.example.projetglobal.repositories.ChambreRepository;
import org.example.projetglobal.repositories.ClientRepository;
import org.example.projetglobal.repositories.ReservationRepository;
import org.example.projetglobal.stubs.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;

import java.util.List;


@GrpcService
public class ReservationGrpcService extends HotelServiceGrpc.HotelServiceImplBase {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ChambreRepository chambreRepository;

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
                .setClient(clientGrpc)
                .setChambre(grpcChambre)
                .setDateDebut(reservation.getDateDebut())
                .setDateFin(reservation.getDateFin())
                .setPreferences(reservation.getPreferences())
                .build();
    }

    @Override
    public void allReservations(Hotel.Empty request, StreamObserver<Hotel.GetAllReservationsResponse> responseObserver) {
//        List<Reservation> reservations = reservationRepository.findAll();
//
//        Hotel.GetAllReservationsResponse.Builder responseBuilder = Hotel.GetAllReservationsResponse.newBuilder();
//        responseBuilder.addAllReservations(reservations);
//
//        responseObserver.onNext(responseBuilder.build());
//        responseObserver.onCompleted();
    }

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
        Client client = new Client();
        client.setId(request.getClient().getId());
        client.setEmail(request.getClient().getEmail());
        client.setNom(request.getClient().getNom());
        client.setPrenom(request.getClient().getPrenom());
        client.setTelephone(request.getClient().getTelephone());

        Chambre chambre = new Chambre();
        chambre.setId(request.getChambre().getId());
        chambre.setDisponible(request.getChambre().getDisponible());
        chambre.setPrix(request.getChambre().getPrix());
        chambre.setType(TypeChambre.valueOf(request.getChambre().getType()));

        Reservation reservation = new Reservation();
        reservation.setChambre(chambre);
        reservation.setClient(client);
        reservation.setPreferences(request.getPreferences());
        reservation.setDateFin(request.getDateFin());
        reservation.setDateDebut(request.getDateDebut());

        if(reservation != null) {
            reservationRepository.save(reservation);
            Hotel.Reservation grpcReservation = entityToGrpc(reservation);

            responseObserver.onNext(grpcReservation);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void deleteReservation(Hotel.ReservationIdRequest request, StreamObserver<Hotel.BoolResponse> responseObserver){
        reservationRepository.deleteById(request.getId());

        responseObserver.onNext(Hotel.BoolResponse.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void updateReservation(Hotel.UpdateReservationRequest request, StreamObserver<Hotel.Reservation> responseObserver) {
        Reservation reservation = reservationRepository.findById(request.getId())
                .orElseThrow(() -> new ResourceNotFoundException("Reservation not found"));

        Hotel.Chambre chambreGrpc = request.getReservation().getChambre();

        Chambre chambre = new Chambre();
        chambre.setId(chambreGrpc.getId());
        chambre.setPrix(chambreGrpc.getPrix());
        chambre.setDisponible(chambreGrpc.getDisponible());
        chambre.setType(TypeChambre.valueOf(chambreGrpc.getType()));

        reservation.setChambre(chambre);
    }

}
