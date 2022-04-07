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
@Table(name = "ville")
public class Ville {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomVille;
    private String cdInsee;
    private String cp;

    @ManyToMany (mappedBy = "ville")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Artisan> artisan;

    @ManyToMany(mappedBy = "ville")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Client> client;

    public Ville(String nomVille, String cdInsee, String cp) {
        this.nomVille = nomVille;
        this.cdInsee = cdInsee;
        this.cp = cp;
    }
    public Ville(String nomVille) {
        this.nomVille = nomVille;


    }


}
