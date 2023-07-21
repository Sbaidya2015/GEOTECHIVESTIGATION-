package geotechnicalapp.geotech.domain.user;

import geotechnicalapp.geotech.domain.AuditBase;
import geotechnicalapp.geotech.domain.addess.GeoTechAddressInfo;
import geotechnicalapp.geotech.domain.contacts.GeoTechContactInfo;
import geotechnicalapp.geotech.domain.sample.GeoTechSampleTable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import static geotechnicalapp.geotech.domain.sample.GeoTechSampleTable.GEOTECH_SAMPLE;
import static geotechnicalapp.geotech.domain.user.GeoTechUserInfo.S_USER_ID;

/**
 * @author Sanjeet Baidya
 */

@Data
@Entity
@Table(name = GeoTechUserInfo.GEOTECH_USER_INFO)
@AttributeOverride(name = "id", column = @Column(name = S_USER_ID))
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GeoTechUserInfo extends AuditBase {

    public static final String GEOTECH_USER_INFO = "GEOTECH_USER_INFO";
    public static final String USER_NAME="USER_NAME";
    public static final String PASS_WORD ="PASS_WORD";
    public static final String S_USER_ID="S_USER_ID";

    @Column(name = USER_NAME, nullable = false)
    private String userName;

    @Column(name = PASS_WORD, nullable = false)
    private String password;

    @OneToOne
    private GeoTechContactInfo geoTechContactInfo;

    @OneToOne
    private GeoTechAddressInfo geoTechAddressInfo;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = S_USER_ID, nullable = false)
    private Long id;


}
