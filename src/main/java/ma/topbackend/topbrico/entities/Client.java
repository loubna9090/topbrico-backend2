package ma.topbackend.topbrico.entities;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Data
@NoArgsConstructor
@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomClient;
    private String prenomClient;
    private String emailClient;
    private String mdpClient;
    @OneToMany
    private Collection<Commentaire> commentaire;
    @ManyToMany
    private Collection<Ville> ville;

    public Client(String nomClient, String prenomClient, String emailClient, String mdpClient) {

        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.emailClient = emailClient;
        this.mdpClient = mdpClient;
    }

    public Client(String nomClient, String prenomClient, String emailClient, String mdpClient, Collection<Ville> ville) {
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.emailClient = emailClient;
        this.mdpClient = mdpClient;
        this.ville = ville;
    }
}
