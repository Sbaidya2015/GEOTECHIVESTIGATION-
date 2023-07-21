package geotechnicalapp.geotech.service.sample;

import geotechnicalapp.geotech.domain.sample.GeoTechSampleTable;

import java.util.Optional;
import java.util.function.Function;

/**
 * @author Sanjeet Baidya
 */

public interface GeoTechSampleService {

    Function<Long, Optional<GeoTechSampleTable>> readSampleTableDataById();


}
