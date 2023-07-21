package geotechnicalapp.geotech.domain.sample;

import geotechnicalapp.geotech.domain.AuditBase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

import static geotechnicalapp.geotech.domain.sample.GeoTechSampleTable.GEOTECH_SAMPLE;

/**
 * @author Sanjeet Baidya
 */
@Data
@Entity
@Table(name = GEOTECH_SAMPLE)
@AttributeOverride(name = "id", column = @Column(name = GeoTechSampleTable.S_SAMPLE_ID))
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GeoTechSampleTable extends AuditBase {

    public static final String GEOTECH_SAMPLE = "GEOTECH_SAMPLE";
    public static final String S_SAMPLE_ID = "S_SAMPLE_ID";
    public static final String T_SAMPLE_NAME = "T_SAMPLE_NAME";
    public static final String N_SAMPLE_SIZE = "N_SAMPLE_SIZE";
    public static final String D_SAMPLE_DATE = "D_SAMPLE_DATE";
    public static final String N_SAMPLE_LENGTH = "N_SAMPLE_LENGTH";
    public static final String F_SAMPLE_VERIFIED = "F_SAMPLE_VERIFIED";
    public static final String N_SAMPLE_DISTNACE = "N_SAMPLE_DISTNACE";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = S_SAMPLE_ID, nullable = false)
    private Long id;
    @Column(name = T_SAMPLE_NAME, nullable = true)
    private String sampleName;
    @Column(name = N_SAMPLE_SIZE, nullable = true)
    private Integer sampleSize;
    @Column(name = D_SAMPLE_DATE, nullable = true)
    private Date sampleDate;
    @Column(name = N_SAMPLE_LENGTH, nullable = true)
    private Long sampleLength;
    @Column(name = F_SAMPLE_VERIFIED, nullable = true)
    private Boolean isSampleVerified;
    @Column(name = N_SAMPLE_DISTNACE, nullable = true)
    private float sampleDistance;

}
