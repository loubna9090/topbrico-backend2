package ma.topbackend.topbrico.services;

import ma.topbackend.topbrico.entities.Artisan;
import ma.topbackend.topbrico.entities.Photo;
import ma.topbackend.topbrico.entities.Realisation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Service
public class ImageServise {
    @Value("${artisan.img.path}")
    String path;


    public Realisation savePhoto(Realisation r, InputStream fi, int photoNumber) {
        List<Photo> photos = new ArrayList<>();
        Photo photo = new Photo();

        for (int i = 0; i > photoNumber; i++) {
            photo.setUrlPhoto( save("r", "realisation", fi));
            photos.add(photo);
            photo.setUrlPhoto("");
        }
        r.setPhoto(photos);
        return r;
    }

    private String save(String prefix, String subPath, InputStream fi) {
        String fileName = "";
        try (DirectoryStream<Path> dir = Files.newDirectoryStream(Paths.get(path + "/" + subPath), prefix + "*")) {

            for (Path file : dir
            ) {
                if (fileName.compareTo(file.getFileName().toString()) < 0) {
                    fileName = file.getFileName().toString();
                }
            }
            String numStr = fileName.substring(1, fileName.indexOf(".jpg"));

            Integer num = Integer.parseInt(numStr);

            numStr = String.format("%04d", num + 1);

            fileName = prefix + numStr + ".jpg";

            String filePath = path + "/" + subPath + "/" + fileName;

            Files.copy(fi, new File(filePath).toPath());

        } catch (IOException ioe) {
            System.out.println("Erreur sur nom d'image : " + ioe.getMessage());
        }
        return fileName;
    }

}
