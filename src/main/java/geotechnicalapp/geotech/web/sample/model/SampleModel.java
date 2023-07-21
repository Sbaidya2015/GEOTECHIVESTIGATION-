package geotechnicalapp.geotech.web.sample.model;

import lombok.Data;

import java.util.Date;

/**
 * @author Sanjeet Baidya
 */
@Data
public class SampleModel {

    private String sampleName;
    private Integer sampleSize;
    private Date sampleDate;
    private Long sampleLength;
    private Boolean isSampleVerified;
    private float sampleDistance;


}
