package ma.topbackend.topbrico.Dto;

import org.springframework.web.multipart.MultipartFile;

public class FichierDTO {
      private MultipartFile photo;

    public MultipartFile getPhoto() {
        return photo;
    }

    public void setPhoto(MultipartFile photo) {
        this.photo = photo;
    }
}
