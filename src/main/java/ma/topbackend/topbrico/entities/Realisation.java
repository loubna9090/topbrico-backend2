package ma.topbackend.topbrico.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Data
@NoArgsConstructor

@Entity
@Table(name = "realisation")
public class Realisation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titreRealisation;
    @OneToMany(mappedBy = "realisation")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection <Photo> photo;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Artisan artisan;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private ServiceArt serviceArt;

    public Realisation(String titreRealisation,Collection<Photo> photo) {
        this.titreRealisation = titreRealisation;
        this.photo = photo;
    }

    public Realisation(String titreRealisation, Artisan artisan, ServiceArt serviceArt) {
        this.titreRealisation = titreRealisation;
        this.artisan = artisan;
        this.serviceArt = serviceArt;
    }
    public Realisation(String titreRealisation) {
        this.titreRealisation = titreRealisation;

    }

}
