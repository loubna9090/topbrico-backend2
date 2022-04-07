package ma.topbackend.topbrico;


import ma.topbackend.topbrico.dao.*;
import ma.topbackend.topbrico.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class TopBricoApplication implements CommandLineRunner {
    //    les injections des dépendances:
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

    public static void main(String[] args) {
        SpringApplication.run(TopBricoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Ville villeArt21=new Ville("paris","75","0075");
        Collection<Ville>villeArt2=new ArrayList<>();
        villeArt2.add(villeArt21);
        villeRepository.save(villeArt21);

        Client clien2=new Client("nomClie2","prnomCli","email@client.com","123mdp",villeArt2);
        clientRepository.save(clien2);

        Artisan art2= new Artisan("bob","damri","plombierRS","email@gmail.com","ad1","ad2","123mdp","01020304", villeArt2);
      Collection<Artisan>artisans=new ArrayList<>();
      artisans.add(art2);
        artisanRepository.save(art2);

        ServiceArt serv2=new ServiceArt("carellage");
        Collection<ServiceArt>serviceArts1=new ArrayList<>();
        serviceArts1.add(serv2);
        serviceArtRepository.save(serv2);


      Realisation reaArt1=new Realisation("textRea1",art2,serv2);
      Collection<Realisation>realisations=new ArrayList<>();
      realisations.add(reaArt1);
       realisationRepository.save(reaArt1);

        ServiceArt serv3=new ServiceArt("plomberie",artisans,realisations);
        Collection<ServiceArt>serviceArts3=new ArrayList<>();
        serviceArts1.add(serv3);
        serviceArtRepository.save(serv3);

       Photo photoArt1= new Photo("photpArt1",reaArt1);
       Collection<Photo>photos=new ArrayList<>();
       photos.add(photoArt1);
       photoRepository.save(photoArt1);

       Commentaire com11=new Commentaire("commenechtaire artisan 3 louan", new Date(),5,art2,clien2);
       Collection<Commentaire>commentaires11=new ArrayList<>();
       commentaires11.add(com11);
       commentaireRepository.save(com11);


        Artisan art1= new Artisan("john","damri","john & co","email@gmail.com","ad1","ad2","123mdp","01020304", villeArt2,serviceArts1,realisations);
        Collection<Artisan>artisans1=new ArrayList<>();
        artisans.add(art1);
        artisanRepository.save(art1);

        ServiceArt serv4=new ServiceArt("maçonnerie",artisans1,realisations);
        Collection<ServiceArt>serviceArts4=new ArrayList<>();
        serviceArts1.add(serv4);
        serviceArtRepository.save(serv4);



//        ServiceArt serv1=new ServiceArt("plomberie");
//        Collection<ServiceArt>serviceArts=new ArrayList<>();
//        serviceArts.add(serv1);
//        serviceArtRepository.save(serv1);
//
//        ServiceArt serv22=new ServiceArt("maçonnerie",artisans,realisations);
//        Collection<ServiceArt>serviceArts2=new ArrayList<>();
//        serviceArts2.add(serv22);
//        serviceArtRepository.save(serv22);
//
//       Artisan art1= new Artisan("abdallah","damri","plombierrs","email@gmail.com",
//               "ad1","ad2","123mdp","01020304",villeArt2,serviceArts, realisations );
//       artisanRepository.save(art1);


//        Client clien1=new Client("nomClie","prnomCli","email@client.com","123mdp",commentaires11,villeArt2);
//        clientRepository.save(clien1);
//
//
//
//        Commentaire com1=new Commentaire("commenetaire artisan 3 louan", new Date(),5, art1, clien1);
//        Collection<Commentaire>commentaires=new ArrayList<>();
//        commentaires.add(com1);
//        commentaireRepository.save(com1);
//

//
//        Artisan art3= new Artisan("louane","damri","plombierrs","email@gmail.com",
//                "ad1","ad2","123mdp","01020304",villeArt2,serviceArts2, realisations,commentaires );
//        artisanRepository.save(art3);



    }
}