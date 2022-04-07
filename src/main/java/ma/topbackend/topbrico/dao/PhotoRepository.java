package ma.topbackend.topbrico.dao;

import ma.topbackend.topbrico.entities.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository extends JpaRepository<Photo, Long> {
}
