package geotechnicalapp.geotech.domain.inspection;

import geotechnicalapp.geotech.domain.AuditBase;
import geotechnicalapp.geotech.domain.client.GeoTechClientInfo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Sanjeet Baidya
 */

@Data
@Entity
@Table(name = GeoTechInspectionReqInfo.GEOTECH_INSP_REQ_INFO)
@AttributeOverride(name = "id", column = @Column(name = GeoTechInspectionReqInfo.S_INSP_REQ_ID))
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GeoTechInspectionReqInfo extends AuditBase {
    public static final String S_INSP_REQ_ID = "S_INSP_REQ_ID";
    public static final String GEOTECH_INSP_REQ_INFO = "GEOTECH_INSP_REQ_INFO";
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = S_INSP_REQ_ID, nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    private GeoTechClientInfo geoTechClientInfo;


}
