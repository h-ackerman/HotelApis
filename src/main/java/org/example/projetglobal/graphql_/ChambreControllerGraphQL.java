package org.example.projetglobal.graphql_;

import org.example.projetglobal.entities.Chambre;
import org.example.projetglobal.repositories.ChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ChambreControllerGraphQL {

    @Autowired
    private ChambreRepository chambreRepository;

    @QueryMapping
    public List<Chambre> allChambres() {
        return chambreRepository.findAll();
    }

    @QueryMapping
    public Chambre chambreById(@Argument Long id) {
        Chambre chambre = chambreRepository.findById(id).orElse(null);
        if (chambre == null) {
            throw new RuntimeException(String.format("Chambre %s not found", id));
        }
        return chambre;
    }

    @MutationMapping
    public Chambre saveChambre(@Argument Chambre chambre) {
        return chambreRepository.save(chambre);
    }
}
