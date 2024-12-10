package org.example.projetglobal.rest;

import org.example.projetglobal.entities.Reservation;
import org.example.projetglobal.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")
public class ReservationRestController {

    @Autowired
    private ReservationRepository reservationRepository;

    @GetMapping
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reservation> getReservationById(@PathVariable Long id) {
        return reservationRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Reservation> deleteReservation(@PathVariable Long id) {
        if (reservationRepository.existsById(id)) {
            reservationRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Reservation> updateReservation(
            @PathVariable Long id,
            @RequestBody Reservation updatedReservation) {

        return reservationRepository.findById(id)
                .map(reservation -> {
                    reservation.setClient(updatedReservation.getClient());
                    reservation.setChambre(updatedReservation.getChambre());
                    reservation.setDateDebut(updatedReservation.getDateDebut());
                    reservation.setDateFin(updatedReservation.getDateFin());
                    reservation.setPreferences(updatedReservation.getPreferences());

                    Reservation savedReservation = reservationRepository.save(reservation);
                    return ResponseEntity.ok(savedReservation);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
