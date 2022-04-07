package ma.topbackend.topbrico.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Data
@NoArgsConstructor

@Entity
@Table(name = "artisan")
public class Artisan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomArtisan;
    private String prenomArtisan;
    private String rsArtisan;
    private String emailArtisan;
    private String adressArtisan;
    private String adressArtisan2;
    private String mdpArtisan;
    private String telArtisan;
    @ManyToMany
    private Collection<Ville> ville ;

    @OneToMany(mappedBy = "artisan")
    private Collection<Commentaire> commentaire;

    @ManyToMany(mappedBy = "artisans" )
    private Collection<ServiceArt>  serviceArt=new ArrayList<>();

    @OneToMany(mappedBy = "artisan")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Realisation>  realisation=new ArrayList<>();;

    public Artisan(String nomArtisan, String prenomArtisan, String rsArtisan, String emailArtisan, String adressArtisan, String adressArtisan2, String mdpArtisan, String telArtisan) {
        this.nomArtisan = nomArtisan;
        this.prenomArtisan = prenomArtisan;
        this.rsArtisan = rsArtisan;
        this.emailArtisan = emailArtisan;
        this.adressArtisan = adressArtisan;
        this.adressArtisan2 = adressArtisan2;
        this.mdpArtisan = mdpArtisan;
        this.telArtisan = telArtisan;
    }

    public Artisan(String nomArtisan, String prenomArtisan, String rsArtisan, String emailArtisan, String adressArtisan, String adressArtisan2, String mdpArtisan, String telArtisan, Collection<Ville> ville) {
        this.nomArtisan = nomArtisan;
        this.prenomArtisan = prenomArtisan;
        this.rsArtisan = rsArtisan;
        this.emailArtisan = emailArtisan;
        this.adressArtisan = adressArtisan;
        this.adressArtisan2 = adressArtisan2;
        this.mdpArtisan = mdpArtisan;
        this.telArtisan = telArtisan;
        this.ville = ville;

    }
    public Artisan(String nomArtisan, String prenomArtisan, String rsArtisan, String emailArtisan, String adressArtisan, String adressArtisan2, String mdpArtisan, String telArtisan, Collection<Ville> ville, Collection<ServiceArt> serviceArts, Collection<Realisation> realisations, Collection<Commentaire> commentaires) {
        this.nomArtisan = nomArtisan;
        this.prenomArtisan = prenomArtisan;
        this.rsArtisan = rsArtisan;
        this.emailArtisan = emailArtisan;
        this.adressArtisan = adressArtisan;
        this.adressArtisan2 = adressArtisan2;
        this.mdpArtisan = mdpArtisan;
        this.telArtisan = telArtisan;
        this.ville = ville;
        this.serviceArt = serviceArts;
        this.realisation = realisations;
        this.commentaire=commentaires;
    }
    public Artisan(String nomArtisan, String prenomArtisan, String rsArtisan, String emailArtisan, String adressArtisan, String adressArtisan2, String mdpArtisan, String telArtisan, Collection<Ville> ville, Collection<ServiceArt> serviceArts, Collection<Realisation> realisations) {
        this.nomArtisan = nomArtisan;
        this.prenomArtisan = prenomArtisan;
        this.rsArtisan = rsArtisan;
        this.emailArtisan = emailArtisan;
        this.adressArtisan = adressArtisan;
        this.adressArtisan2 = adressArtisan2;
        this.mdpArtisan = mdpArtisan;
        this.telArtisan = telArtisan;
        this.ville = ville;
        this.serviceArt = serviceArts;
        this.realisation = realisations;

    }


}
