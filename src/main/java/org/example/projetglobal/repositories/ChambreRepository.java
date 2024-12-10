package org.example.projetglobal.repositories;

import org.example.projetglobal.Entities.Chambre;
import org.example.projetglobal.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {
}
