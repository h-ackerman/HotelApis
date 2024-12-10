package org.example.projetglobal.graphql_;

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
import org.springframework.http.ResponseEntity;
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
    public Reservation saveReservation(@Argument Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @MutationMapping
    public boolean deleteReservation(@Argument Long id) {
        if(reservationRepository.existsById(id)) {
            reservationRepository.deleteById(id);
            return true;
        } return false;
    }

    public Reservation updateReservation(Long id, Reservation updateInput) {
        // Find the reservation by ID
        Reservation reservation = reservationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reservation not found"));

        // Update fields if they are provided in the input
        if (updateInput.getClient() != null) {
            Client client = updateInput.getClient();
            reservation.setClient(client);
        }

        if (updateInput.getChambre() != null) {
            Chambre chambre = updateInput.getChambre();
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

        // Save and return the updated reservation
        return reservationRepository.save(reservation);
    }

}
