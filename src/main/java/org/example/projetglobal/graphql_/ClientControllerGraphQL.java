package org.example.projetglobal.graphql_;

import org.example.projetglobal.entities.Client;
import org.example.projetglobal.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ClientControllerGraphQL {

    @Autowired
    private ClientRepository clientRepository;

    @QueryMapping
    public List<Client> allClients() {
        return clientRepository.findAll();
    }

    @QueryMapping
    public Client clientById(@Argument Long id) {
        Client client = clientRepository.findById(id).orElse(null);
        if (client == null) {
            throw new RuntimeException(String.format("Client %s not found", id));
        }
        return client;
    }

    @MutationMapping
    public Client saveClient(@Argument Client client) {
        return clientRepository.save(client);
    }
}

