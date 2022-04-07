package ma.topbackend.topbrico.services;

import ma.topbackend.topbrico.dao.*;
import ma.topbackend.topbrico.entities.Artisan;
import ma.topbackend.topbrico.entities.Client;
import ma.topbackend.topbrico.entities.Ville;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class BricoServiceImplTest {

    //    les injections des dépendences:
    @Autowired
    private ArtisanRepository artisanRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private RealisationRepository realisationRepository;
    @Autowired
    private CommentaireRepository commentaireRepository;
    @Autowired
    private PhotoRepository photoRepository;
    @Autowired
    private ServiceArtRepository serviceArtRepository;
    @Autowired
    private VilleRepository villeRepository;

    @Test
    void initLoad(){

    }


    @Test
    void saveArtisan() {
        Artisan art1= new Artisan("loubna","damri","plombierRS","email@gmail.com","ad1","ad2","123mdp","01020304");
        Artisan art2 = artisanRepository.save(art1);
        assertEquals(art1, art2);
    }


    @Test
    void saveClient() {
        Client client1=new Client("nomClie","prnomCli","email@client.com","123mdp");
        Client client2 = clientRepository.save(client1);
        assertEquals(client1, client2);
    }

    @Test
    void getClient() {
        Client client = clientRepository.findById(1L).orElse(new Client());
        assertEquals(client.getNomClient(),"nomClient");
    }

    @Test
    void getVille() {
        Ville ville1 = villeRepository.findById(1L).orElse(new Ville());
        assertEquals(ville1.getNomVille(),"ParisTest");
    }

    @Test
    void getAllArtisan() {
        Artisan arti = (Artisan) artisanRepository.findAll();
        assertEquals(arti, "");
    }

}