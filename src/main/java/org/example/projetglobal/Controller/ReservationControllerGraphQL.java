package org.example.projetglobal.Controller;

import org.example.projetglobal.Entities.Reservation;
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
}
