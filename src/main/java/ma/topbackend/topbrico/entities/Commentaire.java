package ma.topbackend.topbrico.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data
@NoArgsConstructor

@Entity
@Table(name = "commentaire")
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String textCom;
    @Temporal(TemporalType.DATE)
    private Date dateCom;
    private int note;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Artisan artisan;
    @ManyToOne
    private Client client;

    public Commentaire(String textCom, Date dateCom, int note) {
        this.textCom = textCom;
        this.dateCom = dateCom;
        this.note = note;
    }

    public Commentaire(String textCom, Date dateCom, int note, Artisan artisan, Client client) {
        this.textCom = textCom;
        this.dateCom = dateCom;
        this.note = note;
        this.artisan=artisan;
        this.client=client;
    }

}
