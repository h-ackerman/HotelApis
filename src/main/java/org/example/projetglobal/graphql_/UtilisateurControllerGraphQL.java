package org.example.projetglobal.graphql_;

import org.example.projetglobal.entities.Utilisateur;
import org.example.projetglobal.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UtilisateurControllerGraphQL {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @QueryMapping
    public List<Utilisateur> allUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    @QueryMapping
    public Utilisateur utilisateurById(@Argument Long id) {
        Utilisateur utilisateur = utilisateurRepository.findById(id).orElse(null);
        if (utilisateur == null) {
            throw new RuntimeException(String.format("Utilisateur %s not found", id));
        }
        return utilisateur;
    }

    @MutationMapping
    public Utilisateur saveUtilisateur(@Argument Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @MutationMapping
    public boolean deleteUtilisateur(@Argument Long id) {
        if(utilisateurRepository.existsById(id)) {
            utilisateurRepository.deleteById(id);
            return true;
        } return false;
    }
}
