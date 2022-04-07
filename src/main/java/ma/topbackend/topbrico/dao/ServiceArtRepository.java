package ma.topbackend.topbrico.dao;

import ma.topbackend.topbrico.entities.ServiceArt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceArtRepository extends JpaRepository<ServiceArt, Long> {
    ServiceArt findByNomService(String nomService);
}
