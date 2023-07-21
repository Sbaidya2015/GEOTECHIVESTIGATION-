package geotechnicalapp.geotech.service.sample;

import geotechnicalapp.geotech.domain.sample.GeoTechSampleTable;
import geotechnicalapp.geotech.domain.sample.GeoTechSampleTableRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.function.Function;

/**
 * @author Sanjeet Baidya
 */
public class GeoTechSampleServiceImpl implements GeoTechSampleService {


    GeoTechSampleTableRepo geoTechSampleTableRepo;

    @Override
    public Function<Long, Optional<GeoTechSampleTable>> readSampleTableDataById() {
        Function<Long, Optional<GeoTechSampleTable>> function = (iD) -> {
            return this.geoTechSampleTableRepo.findById(iD);
        };
        return function;
    }

    public void setOff() {
        Function<Long, Optional<GeoTechSampleTable>> function = readSampleTableDataById();
        function.apply(Long.MIN_VALUE);
        //Function<Long, Integer> vv =  function.andThen(value->{ value.});
        //vv.apply(Long.MIN_VALUE);
    }

}
