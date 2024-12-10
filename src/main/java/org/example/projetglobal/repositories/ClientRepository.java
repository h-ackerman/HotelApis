package org.example.projetglobal.repositories;

import org.example.projetglobal.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

    @Override
    Optional<Client> findById(Long aLong);
}
