package org.example.projetglobal.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.projetglobal.Entities.Role;
import org.example.projetglobal.Entities.Utilisateur;
import org.example.projetglobal.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@WebService(serviceName = "UtilisateurWS")
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @WebMethod
    public List<Utilisateur> getUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    @WebMethod
    public Utilisateur getUtilisateurById(@WebParam(name = "id") Long id) {
        return utilisateurRepository.findById(id).orElse(null);
    }

    @WebMethod
    public Utilisateur createUtilisateur(@WebParam(name = "nomUtilisateur") String nomUtilisateur,
                                         @WebParam(name = "motDePasse") String motDePasse,
                                         @WebParam(name = "role") Role role) {
        Utilisateur utilisateur = new Utilisateur( nomUtilisateur, motDePasse, role);
        return utilisateurRepository.save(utilisateur);
    }

    @WebMethod
    public boolean deleteUtilisateur(@WebParam(name = "id") Long id) {
        if (utilisateurRepository.existsById(id)) {
            utilisateurRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

