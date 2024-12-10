package org.example.projetglobal.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.projetglobal.entities.Chambre;
import org.example.projetglobal.entities.Client;
import org.example.projetglobal.entities.Reservation;
import org.example.projetglobal.repositories.ChambreRepository;
import org.example.projetglobal.repositories.ClientRepository;
import org.example.projetglobal.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Component
@WebService(serviceName = "ReservationWS")
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;
    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ChambreRepository chambreRepository;

    @WebMethod
    public List<Reservation> getReservations() {
        return reservationRepository.findAll();
    }

    @WebMethod
    public Reservation getReservationById(@WebParam(name = "id") Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @WebMethod
    public Reservation createReservation(@WebParam(name = "clientId") Long clientId,
                                         @WebParam(name = "chambreId") Long chambreId,
                                         @WebParam(name = "dateDebut") Date dateDebut,
                                         @WebParam(name = "dateFin") Date dateFin,
                                         @WebParam (name = "preferences" )String preferences) {

        // Vérification de l'existence du client
        Optional<Client> clientOpt = clientRepository.findById(clientId);
        if (!clientOpt.isPresent()) {
            throw new IllegalArgumentException("Le client avec l'ID " + clientId + " n'existe pas.");
        }

        // Vérification de l'existence de la chambre
        Optional<Chambre> chambreOpt = chambreRepository.findById(chambreId);
        if (!chambreOpt.isPresent()) {
            throw new IllegalArgumentException("La chambre avec l'ID " + chambreId + " n'existe pas.");
        }

        // Vérification si la chambre est disponible
        Chambre chambre = chambreOpt.get();
        if (!chambre.isDisponible()) {
            throw new IllegalStateException("La chambre avec l'ID " + chambreId + " n'est pas disponible.");
        }

        // Création de la réservation si les vérifications sont passées
        Reservation reservation = new Reservation(clientOpt.get(), chambre, dateDebut, dateFin, preferences);
        return reservationRepository.save(reservation);
    }

    @WebMethod
    public boolean deleteReservation(@WebParam(name = "id") Long id) {
        if (reservationRepository.existsById(id)) {
            reservationRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @WebMethod
    public Reservation updateReservation(
            @WebParam(name = "id") Long id,
            @WebParam(name = "reservation") Reservation updatedReservation) throws Exception {

        return reservationRepository.findById(id).map(reservation -> {
            reservation.setClient(updatedReservation.getClient());
            reservation.setChambre(updatedReservation.getChambre());
            reservation.setDateDebut(updatedReservation.getDateDebut());
            reservation.setDateFin(updatedReservation.getDateFin());
            reservation.setPreferences(updatedReservation.getPreferences());

            return reservationRepository.save(reservation);
        }).orElseThrow(() -> new Exception("Reservation with ID " + id + " not found"));
    }

}

