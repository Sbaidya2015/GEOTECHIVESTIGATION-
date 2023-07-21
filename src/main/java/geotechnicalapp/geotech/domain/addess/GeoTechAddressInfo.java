package geotechnicalapp.geotech.domain.addess;

import geotechnicalapp.geotech.domain.contacts.GeoTechContactInfo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import static geotechnicalapp.geotech.domain.addess.GeoTechAddressInfo.S_ADDRESS_ID;

/**
 * @author Sanjeet Baidya
 */
@Data
@Entity
@Table(name = GeoTechAddressInfo.GEOTECH_ADDRESS_INFO)
@AttributeOverride(name = "id", column = @Column(name = S_ADDRESS_ID))
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GeoTechAddressInfo {

    public static final String GEOTECH_ADDRESS_INFO = "GEOTECH_ADDRESS_INFO";
    public static final String S_ADDRESS_ID = "S_ADDRESS_ID";
    public static final String T_STREET_ADD = "T_STREET_ADD";
    public static final String T_STATE = "T_STATE";
    public static final String T_COUNTRY = "T_COUNTRY";
    public static final String T_ZIP_CODE = "T_ZIP_CODE";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = GeoTechContactInfo.S_CONTACT_ID, nullable = false)
    private Long id;
    @Column(name = T_STREET_ADD, nullable = true)
    private String streetAddress;
    @Column(name = T_STATE, nullable = false)
    private String state;
    @Column(name = T_COUNTRY, nullable = false)
    private String country;
    @Column(name = T_ZIP_CODE, nullable = false)
    private Long zipCode;

}
