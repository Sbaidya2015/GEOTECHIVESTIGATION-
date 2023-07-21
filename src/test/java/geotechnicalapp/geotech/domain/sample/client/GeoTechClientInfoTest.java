package geotechnicalapp.geotech.domain.sample.client;

import geotechnicalapp.geotech.domain.client.GeoTechClientInfo;
import geotechnicalapp.geotech.domain.client.GeoTechClientInfoRepo;
import geotechnicalapp.geotech.domain.common.GenderEnum;
import geotechnicalapp.geotech.domain.contacts.GeoTechContactInfo;
import geotechnicalapp.geotech.domain.inspection.GeoTechInspectionReqInfo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Function;

import geotechnicalapp.geotech.domain.addess.GeoTechAddressInfo;

import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@Log4j2
public class GeoTechClientInfoTest {

    @Autowired
    GeoTechClientInfoRepo geoTechClientInfoRepo;

    @Test
    public void GeoTechClientInfoTest() {

        GeoTechClientInfo geoTechClientInfo = new GeoTechClientInfo();
        geoTechClientInfo.setDob(new Date());
        geoTechClientInfo.setGender(GenderEnum.MALE);
        geoTechClientInfo.setFirstName("Sanjeet");
        geoTechClientInfo.setLastName("Baidya");
        geoTechClientInfo.setMiddleName("Bom");
        GeoTechAddressInfo geoTechAddressInfo = new GeoTechAddressInfo();
        geoTechAddressInfo.setCountry("USA");
        geoTechAddressInfo.setStreetAddress("8 Kalamoun ct");
        geoTechAddressInfo.setZipCode(4503L);
        geoTechAddressInfo.setState("QLD");
        geoTechClientInfo.setGeoTechAddressInfo(geoTechAddressInfo);
        GeoTechContactInfo geoTechContactInfo = new GeoTechContactInfo();
        geoTechContactInfo.setEmailPrimary("Nepal@Yahoo.com");
        geoTechContactInfo.setEmailSecondary("yahoo@Yahoo.com");
        geoTechClientInfo.setGeoTechContactInfo(geoTechContactInfo);

        List<GeoTechInspectionReqInfo> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            GeoTechInspectionReqInfo geoTechInspectionReqInfo = new GeoTechInspectionReqInfo();
            list.add(geoTechInspectionReqInfo);
        }
        geoTechClientInfo.setGeoTechInspectionReqInfo(list);

        GeoTechClientInfo geoTechClientInfo1 = geoTechClientInfoRepo.save(geoTechClientInfo);
        log.info(geoTechClientInfo.toString());
        log.info(geoTechClientInfo1.getGeoTechAddressInfo().toString());
        log.info(geoTechClientInfo1.getGeoTechInspectionReqInfo().toString());

    }

}
