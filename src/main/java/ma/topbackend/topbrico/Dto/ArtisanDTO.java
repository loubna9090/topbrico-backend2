package ma.topbackend.topbrico.Dto;

import ma.topbackend.topbrico.entities.Realisation;
import ma.topbackend.topbrico.entities.ServiceArt;
import org.springframework.web.multipart.MultipartFile;

import java.util.Collection;
import java.util.List;

public class ArtisanDTO {
    private Long id;
    private String nomArtisan;
    private String prenomArtisan;
    private String rsArtisan;
    private String emailArtisan;
    private String adressArtisan;
    private String adressArtisan2;
    private String mdpArtisan;
    private String telArtisan;
    private MultipartFile photo;
    private Collection<ServiceArt> serviceArt;
    private Collection<Realisation> realisations;
    private List<Long> ville;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomArtisan() {
        return nomArtisan;
    }

    public void setNomArtisan(String nomArtisan) {
        this.nomArtisan = nomArtisan;
    }

    public String getPrenomArtisan() {
        return prenomArtisan;
    }

    public void setPrenomArtisan(String prenomArtisan) {
        this.prenomArtisan = prenomArtisan;
    }

    public String getRsArtisan() {
        return rsArtisan;
    }

    public void setRsArtisan(String rsArtisan) {
        this.rsArtisan = rsArtisan;
    }

    public String getEmailArtisan() {
        return emailArtisan;
    }

    public void setEmailArtisan(String emailArtisan) {
        this.emailArtisan = emailArtisan;
    }

    public String getAdressArtisan() {
        return adressArtisan;
    }

    public void setAdressArtisan(String adressArtisan) {
        this.adressArtisan = adressArtisan;
    }

    public String getAdressArtisan2() {
        return adressArtisan2;
    }

    public void setAdressArtisan2(String adressArtisan2) {
        this.adressArtisan2 = adressArtisan2;
    }

    public String getMdpArtisan() {
        return mdpArtisan;
    }

    public void setMdpArtisan(String mdpArtisan) {
        this.mdpArtisan = mdpArtisan;
    }

    public String getTelArtisan() {
        return telArtisan;
    }

    public void setTelArtisan(String telArtisan) {
        this.telArtisan = telArtisan;
    }

    public MultipartFile getPhoto() {
        return photo;
    }

    public void setPhoto(MultipartFile photo) {
        this.photo = photo;
    }

    public Collection<ServiceArt> getServiceArt() {
        return serviceArt;
    }

    public void setServiceArt(Collection<ServiceArt> serviceArt) {
        this.serviceArt = serviceArt;
    }

    public Collection<Realisation> getRealisations() {
        return realisations;
    }

    public void setRealisations(Collection<Realisation> realisations) {
        this.realisations = realisations;
    }

    public Iterable<Long> getVille() {
        return ville;
    }

    public void setVille(List<Long> ville) {
        this.ville = ville;
    }
}