package ma.topbackend.topbrico.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;


@NoArgsConstructor
@Entity
@Table(name = "service_art")
public class ServiceArt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String nomService;
    @ManyToMany
    @JsonIgnore
    private Collection<Artisan> artisans=new ArrayList<>();

    @OneToMany(mappedBy = "serviceArt")
    @JsonIgnore
    private Collection<Realisation>  realisation;

    public ServiceArt(String nomService) {
        this.nomService = nomService;
    }

    public ServiceArt(String nomService, Collection<Artisan> artisans, Collection<Realisation> realisation) {
        this.nomService = nomService;
        this.artisans = artisans;
        this.realisation = realisation;
    }
    public ServiceArt(String nomService, Collection<Artisan> artisans) {
        this.nomService = nomService;
        this.artisans = artisans;

    }

    public Long getId() {
        return id;
    }

    public String getNomService() {
        return nomService;
    }

    public Collection<Artisan> getArtisans() {
        return artisans;
    }

    public Collection<Realisation> getRealisation() {
        return realisation;
    }

    public void setNomService(String nomService) {
        this.nomService = nomService;
    }

    public void setArtisans(Collection<Artisan> artisans) {
        this.artisans = artisans;
    }

    public void setRealisation(Collection<Realisation> realisation) {
        this.realisation = realisation;
    }
}
