package org.example.projetglobal.graphql_;

import org.example.projetglobal.dto.ReservationInput;
import org.example.projetglobal.entities.Chambre;
import org.example.projetglobal.entities.Client;
import org.example.projetglobal.entities.Reservation;
import org.example.projetglobal.repositories.ChambreRepository;
import org.example.projetglobal.repositories.ClientRepository;
import org.example.projetglobal.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ReservationControllerGraphQL {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ChambreRepository chambreRepository;

    @QueryMapping
    public List<Reservation> allReservations() {
        return reservationRepository.findAll();
    }

    @QueryMapping
    public Reservation reservationById(@Argument Long id) {
        Reservation reservation = reservationRepository.findById(id).orElse(null);
        if (reservation == null) {
            throw new RuntimeException(String.format("Reservation %s not found", id));
        }
        return reservation;
    }

    @MutationMapping
    public Reservation saveReservation(@Argument("reservation") ReservationInput reservationInput) {
        Client client = clientRepository.findById(reservationInput.getClientId())
                .orElseThrow(() -> new RuntimeException("Client not found"));

        Chambre chambre = chambreRepository.findById(reservationInput.getChambreId())
                .orElseThrow(() -> new RuntimeException("Chambre not found"));

        if (!chambre.isDisponible()) {
            throw new RuntimeException("Chambre is not available");
        }

        Reservation reservation = new Reservation();
        reservation.setClient(client);
        reservation.setChambre(chambre);
        reservation.setDateDebut(reservationInput.getDateDebut());
        reservation.setDateFin(reservationInput.getDateFin());
        reservation.setPreferences(reservationInput.getPreferences());

        return reservationRepository.save(reservation);
    }

    @MutationMapping
    public Reservation updateReservation(@Argument Long id, @Argument("reservation") ReservationInput updateInput) {
        Reservation reservation = reservationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reservation not found"));

        Client client = clientRepository.findById(updateInput.getClientId())
                .orElseThrow(() -> new RuntimeException("Client not found"));

        Chambre chambre = chambreRepository.findById(updateInput.getChambreId())
                .orElseThrow(() -> new RuntimeException("Chambre not found"));

        // Update fields if they are provided in the input
        if (updateInput.getClientId() != null) {
            reservation.setClient(client);
        }

        if (updateInput.getChambreId() != null) {
            reservation.setChambre(chambre);
        }

        if (updateInput.getDateDebut() != null) {
            reservation.setDateDebut(updateInput.getDateDebut());
        }

        if (updateInput.getDateFin() != null) {
            reservation.setDateFin(updateInput.getDateFin());
        }

        if (updateInput.getPreferences() != null) {
            reservation.setPreferences(updateInput.getPreferences());
        }

        return reservationRepository.save(reservation);
    }

    @MutationMapping
    public boolean deleteReservation(@Argument Long id) {
        if(reservationRepository.existsById(id)) {
            reservationRepository.deleteById(id);
            return true;
        } return false;
    }
}
