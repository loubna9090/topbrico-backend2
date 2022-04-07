package ma.topbackend.topbrico.dao;

import ma.topbackend.topbrico.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VilleRepository extends JpaRepository<Ville, Long> {
    Ville findByNomVille(String nomVille);
}