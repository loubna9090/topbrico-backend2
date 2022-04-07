package ma.topbackend.topbrico.dao;

import ma.topbackend.topbrico.entities.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentaireRepository extends JpaRepository<Commentaire, Long> {
    


//    List<Commentaire> findCommentaireByIdArtisan(Long id);
}
