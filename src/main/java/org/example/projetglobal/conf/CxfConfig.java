package org.example.projetglobal.conf;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.example.projetglobal.ws.ChambreService;
import org.example.projetglobal.ws.ClientService;
import org.example.projetglobal.ws.ReservationService;
import org.example.projetglobal.ws.UtilisateurService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;




@Configuration
public class CxfConfig {

    private UtilisateurService utilisateurService;
    private ClientService clientService;
    private ChambreService chambreService;
    private ReservationService reservationService;
    private Bus bus;

    public CxfConfig(UtilisateurService utilisateurService, ClientService clientService, ChambreService chambreService, ReservationService reservationService, Bus bus) {
        this.utilisateurService = utilisateurService;
        this.clientService = clientService;
        this.chambreService = chambreService;
        this.reservationService = reservationService;
        this.bus = bus;
    }

    @Bean
    public EndpointImpl clientendpoint() {
        EndpointImpl endpoint = new EndpointImpl (bus, clientService);
        endpoint.publish("/client");
        return endpoint;
    }
    @Bean
    public EndpointImpl chambreEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, chambreService);
        endpoint.publish("/chambre");
        return  endpoint;
    }

    @Bean
    public EndpointImpl reservationEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, reservationService);
        endpoint.publish("/reservation");
        return  endpoint;
    }

    @Bean
    public EndpointImpl utilisateurEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, utilisateurService);
        endpoint.publish("/utilisateur");
        return  endpoint;
    }
}