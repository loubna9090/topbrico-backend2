package ma.topbackend.topbrico.dao;

import ma.topbackend.topbrico.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
