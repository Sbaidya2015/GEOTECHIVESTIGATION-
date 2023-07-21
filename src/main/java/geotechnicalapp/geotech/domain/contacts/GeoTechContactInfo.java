package geotechnicalapp.geotech.domain.contacts;

import geotechnicalapp.geotech.domain.AuditBase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import static geotechnicalapp.geotech.domain.contacts.GeoTechContactInfo.S_CONTACT_ID;

/**
 * @author Sanjeet Baidya
 */
@Data
@Entity
@Table(name = GeoTechContactInfo.GEOTECH_CONTACT_INFO)
@AttributeOverride(name = "id", column = @Column(name = S_CONTACT_ID))
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GeoTechContactInfo extends AuditBase {

    public static final String GEOTECH_CONTACT_INFO = "GEOTECH_CONTACT_INFO";
    public static final String S_CONTACT_ID = "S_CONTACT_ID";
    public static final String T_EMAIL_PRIMARY = "T_EMAIL_PRIMARY";
    public static final String T_EMAIL_SECONDARY = "T_EMAIL_SECONDARY";
    public static final String T_PHONE_PRIMARY = "T_PHONE_PRIMARY";
    public static final String T_PHONE_SECONDARY = "T_PHONE_SECONDARY";
    public static final String T_MOBILE_PRIMARY = "T_MOBILE_PRIMARY";
    public static final String T_MOBILE_SECONDARY = "T_MOBILE_SECONDARY";

    @Column(name = T_EMAIL_PRIMARY, nullable = true)
    private String emailPrimary;

    @Column(name = T_EMAIL_SECONDARY, nullable = true)
    private String emailSecondary;

    @Column(name = T_PHONE_PRIMARY, nullable = true)
    private String phonePrimary;

    @Column(name = T_PHONE_SECONDARY, nullable = true)
    private String phoneSecondary;

    @Column(name = T_MOBILE_PRIMARY, nullable = true)
    private String mobilePrimary;

    @Column(name = T_MOBILE_SECONDARY, nullable = true)
    private String mobileSecondary;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = S_CONTACT_ID, nullable = false)
    private Long id;


}
