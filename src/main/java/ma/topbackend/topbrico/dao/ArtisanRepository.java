package ma.topbackend.topbrico.dao;

import ma.topbackend.topbrico.entities.Artisan;
import ma.topbackend.topbrico.entities.ServiceArt;
import ma.topbackend.topbrico.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ArtisanRepository extends JpaRepository<Artisan, Long> {

}
