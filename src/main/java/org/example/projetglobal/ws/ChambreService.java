package org.example.projetglobal.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.projetglobal.Entities.Chambre;
import org.example.projetglobal.Entities.TypeChambre;
import org.example.projetglobal.repositories.ChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@WebService(serviceName = "ChambreWS")
public class ChambreService {

    @Autowired
    private ChambreRepository chambreRepository;

    @WebMethod
    public List<Chambre> getChambres() {
        return chambreRepository.findAll();
    }

    @WebMethod
    public Chambre getChambreById(@WebParam(name = "id") Long id) {
        return chambreRepository.findById(id).orElse(null);
    }

    @WebMethod
    public Chambre createChambre(@WebParam(name = "type") TypeChambre type,
                                 @WebParam(name = "prix") double prix,
                                 @WebParam(name = "disponible") boolean disponible) {
        Chambre chambre = new Chambre(type, prix, disponible);
        return chambreRepository.save(chambre);
    }

    @WebMethod
    public boolean deleteChambre(@WebParam(name = "id") Long id) {
        if (chambreRepository.existsById(id)) {
            chambreRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

