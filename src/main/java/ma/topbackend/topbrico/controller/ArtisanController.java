package ma.topbackend.topbrico.controller;

import ma.topbackend.topbrico.Dto.ArtisanDTO;
import ma.topbackend.topbrico.dao.*;
import ma.topbackend.topbrico.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/artisans")
public class ArtisanController {


    ArtisanRepository artisanRepository;


    VilleRepository villeRepository;


    ServiceArtRepository serviceArtRepository;


    RealisationRepository realisationRepository;


    PhotoRepository photoRepository;
    @Autowired
    public ArtisanController(ArtisanRepository artisanRepository, VilleRepository villeRepository, ServiceArtRepository serviceArtRepository, RealisationRepository realisationRepository, PhotoRepository photoRepository) {
        this.artisanRepository = artisanRepository;
        this.villeRepository = villeRepository;
        this.serviceArtRepository = serviceArtRepository;
        this.realisationRepository = realisationRepository;
        this.photoRepository = photoRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    List<Artisan> getAllArtisan() {
       return artisanRepository.findAll();
    }


    @RequestMapping(value = "/addartisan", headers = ("content-type=multipart/form-data"),method = RequestMethod.POST)
    public Artisan fihcier(ArtisanDTO artisanDTO, HttpServletRequest request){
        artisanDTO.getPhoto();
        List<Ville> villes=new ArrayList<>();
        for (Long idVille: artisanDTO.getVille()
             ) {
            System.out.println(idVille);
            villes.add(villeRepository.findById(idVille).get());
        }
        Artisan newArtisan= new Artisan();
        newArtisan.setNomArtisan(artisanDTO.getNomArtisan());
        newArtisan.setPrenomArtisan(artisanDTO.getPrenomArtisan());
        newArtisan.setRsArtisan(artisanDTO.getRsArtisan());
        newArtisan.setEmailArtisan(artisanDTO.getEmailArtisan());
        newArtisan.setMdpArtisan(artisanDTO.getMdpArtisan());
        newArtisan.setTelArtisan(artisanDTO.getTelArtisan());
        newArtisan.setAdressArtisan(artisanDTO.getAdressArtisan());
        newArtisan.setAdressArtisan2(artisanDTO.getAdressArtisan2());
        newArtisan.setVille(villes);
        Collection<Realisation> realisations= artisanDTO.getRealisations();
        MultipartFile file = artisanDTO.getPhoto();
        if(!file.isEmpty()) {
            System.out.println("Nom du champ     : "+file.getName());
            System.out.println("Nom du fichier   : "+file.getOriginalFilename());
            System.out.println("Type de fichier  : "+file.getContentType());
            System.out.println("Taille en octets : "+file.getSize());
        }
        realisations.forEach(realisation -> photoRepository.saveAll(realisation.getPhoto()));
        List<Realisation> real=realisationRepository.saveAll(realisations);
        List<ServiceArt> listeServices=  artisanDTO.getServiceArt().stream().map(serviceArt -> serviceArtRepository.findByNomService(serviceArt.getNomService())).map(serviceArt -> {serviceArt.setRealisation(real); serviceArt.setArtisans(List.of(newArtisan)); return serviceArt; }).collect(Collectors.toList());

        artisanDTO.setServiceArt(listeServices );

        return artisanRepository.save(newArtisan);
    }

}