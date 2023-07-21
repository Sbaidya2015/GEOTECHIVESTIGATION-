package geotechnicalapp.geotech.domain.sample;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@Log4j2
public class SampleDomainTest {

    @Autowired
    private GeoTechSampleTableRepo geoTechSampleTableRepo;

    @Test
    public void runSampleDomanTest() {

        GeoTechSampleTable geoTechSampleTable = new GeoTechSampleTable();
        geoTechSampleTable.setSampleName(UUID.randomUUID().toString());
        geoTechSampleTable.setSampleDate(new Date());
        geoTechSampleTableRepo.save(geoTechSampleTable);

        geoTechSampleTable = new GeoTechSampleTable();
        geoTechSampleTable.setSampleName(UUID.randomUUID().toString());
        geoTechSampleTable.setSampleDate(new Date());
        geoTechSampleTableRepo.save(geoTechSampleTable);

        geoTechSampleTable = new GeoTechSampleTable();
        geoTechSampleTable.setSampleName(UUID.randomUUID().toString());
        geoTechSampleTable.setSampleDate(new Date());
        geoTechSampleTableRepo.save(geoTechSampleTable);

        geoTechSampleTable = new GeoTechSampleTable();
        geoTechSampleTable.setSampleName(UUID.randomUUID().toString());
        geoTechSampleTable.setSampleDate(new Date());
        geoTechSampleTableRepo.save(geoTechSampleTable);

        geoTechSampleTable = new GeoTechSampleTable();
        geoTechSampleTable.setSampleName(UUID.randomUUID().toString());
        geoTechSampleTable.setSampleDate(new Date());
        geoTechSampleTableRepo.save(geoTechSampleTable);

        geoTechSampleTable = new GeoTechSampleTable();
        geoTechSampleTable.setSampleName(UUID.randomUUID().toString());
        geoTechSampleTable.setSampleDate(new Date());
        geoTechSampleTableRepo.save(geoTechSampleTable);

        geoTechSampleTable = new GeoTechSampleTable();
        geoTechSampleTable.setSampleName(UUID.randomUUID().toString());
        geoTechSampleTable.setSampleDate(new Date());
        geoTechSampleTableRepo.save(geoTechSampleTable);

        geoTechSampleTable = new GeoTechSampleTable();
        geoTechSampleTable.setSampleName(UUID.randomUUID().toString());
        geoTechSampleTable.setSampleDate(new Date());
        geoTechSampleTableRepo.save(geoTechSampleTable);

        geoTechSampleTable = new GeoTechSampleTable();
        geoTechSampleTable.setSampleName(UUID.randomUUID().toString());
        geoTechSampleTable.setSampleDate(new Date());
        geoTechSampleTableRepo.save(geoTechSampleTable);


        List<GeoTechSampleTable> all = geoTechSampleTableRepo.findAll();
        all.forEach(geoTechSampleTable1 -> {
            log.info("GeoTechSample: " + geoTechSampleTable1.getSampleDate() + "  " + geoTechSampleTable1.getId() + "  " + geoTechSampleTable1.getSampleName());

        });


    }


}
