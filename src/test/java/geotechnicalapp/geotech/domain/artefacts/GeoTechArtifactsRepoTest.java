package geotechnicalapp.geotech.domain.artefacts;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.File;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@Log4j2
public class GeoTechArtifactsRepoTest {
    @Autowired
    GeoTechArtifactsRepo geoTechArtifactsRepo;

    @Test
    public void geoTechArtifactsRepoTest() {

        File file = new File("application.properties");
        try {

            //  byte[] bytes = Files.readAllBytes(file.toPath());
            GeoTechArtifacts geoTechArtifacts = new GeoTechArtifacts();
            StringBuffer buffer = new StringBuffer();
            buffer.append("sdssaddddddddddddddddddddddddddddddddddddddddddddddddddd");
            geoTechArtifacts.setArtifactClob(buffer);
            GeoTechArtifacts geoTechArtifacts1 = geoTechArtifactsRepo.save(geoTechArtifacts);
            log.info("geoTechArtifacts1    :::" + geoTechArtifacts1);


        } catch (Exception e) {
            e.printStackTrace();
        }


        //geoTechArtifacts.setArtifactClob();
        //geoTechArtifactsRepo.save()

    }

}
