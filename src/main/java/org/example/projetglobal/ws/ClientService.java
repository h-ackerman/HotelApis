package org.example.projetglobal.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.projetglobal.Entities.Client;
import org.example.projetglobal.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@WebService(serviceName = "ClientWS")
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @WebMethod
    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    @WebMethod
    public Client getClientById(@WebParam(name = "id") Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @WebMethod
    public Client createClient(@WebParam(name = "nom") String nom,
                               @WebParam(name = "prenom") String prenom,
                               @WebParam(name = "email") String email,
                               @WebParam(name = "telephone") String telephone) {
        Client client = new Client(nom, prenom, email, telephone);
        return clientRepository.save(client);
    }

    @WebMethod
    public boolean deleteClient(@WebParam(name = "id") Long id) {
        if (clientRepository.existsById(id)) {
            clientRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

