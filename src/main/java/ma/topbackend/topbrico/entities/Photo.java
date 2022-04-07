package ma.topbackend.topbrico.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor

@Entity
@Table(name = "photo")
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String urlPhoto;
    @ManyToOne
    private Realisation realisation;

    public Photo(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public Photo(String urlPhoto, Realisation realisation) {
        this.urlPhoto = urlPhoto;
        this.realisation = realisation;
    }
}
