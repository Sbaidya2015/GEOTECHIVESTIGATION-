package geotechnicalapp.geotech.domain.client;

import geotechnicalapp.geotech.domain.AuditBase;
import geotechnicalapp.geotech.domain.addess.GeoTechAddressInfo;
import geotechnicalapp.geotech.domain.contacts.GeoTechContactInfo;
import geotechnicalapp.geotech.domain.inspection.GeoTechInspectionReqInfo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

import static geotechnicalapp.geotech.domain.addess.GeoTechAddressInfo.S_ADDRESS_ID;
import geotechnicalapp.geotech.domain.common.GenderEnum;
import lombok.NoArgsConstructor;
import lombok.ToString;

import static geotechnicalapp.geotech.domain.contacts.GeoTechContactInfo.S_CONTACT_ID;

/**
 * @author Sanjeet Baidya
 */
@Data
@Entity
@Table(name = GeoTechClientInfo.GEOTECH_CLIENT_INFO)
@AttributeOverride(name = "id", column = @Column(name = GeoTechClientInfo.S_CLIENT_ID))
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GeoTechClientInfo extends AuditBase {

    public static final String GEOTECH_CLIENT_INFO = "GEOTECH_CLIENT_INFO";
    public static final String S_CLIENT_ID = "S_CLIENT_ID";
    public static final String GEOTECH_CLIENT_CONTACT = "GEOTECH_CLIENT_CONTACT";
    public static final String GEOTECH_CLIENT_ADDRESS = "GEOTECH_CLIENT_ADDRESS";
    public static final String GEOTECH_CLIENT_INSPCT_REQ = "GEOTECH_CLIENT_INSPCT_REQ";
    public static final String T_FIRST_NAME = "T_FIRST_NAME";
    public static final String T_MID_NAME = "T_MID_NAME";
    public static final String T_LAST_NAME = "T_LAST_NAME";
    public static final String D_DOB = "D_DOB";
    public static final String T_SEX = "T_SEX";

    @Column(name = T_FIRST_NAME, nullable = false,length = 1000)
    private String firstName;

    @Column(name = T_MID_NAME, nullable = true,length = 1000)
    private String middleName;

    @Column(name = T_LAST_NAME, nullable = false,length = 1000)
    private String lastName;

    @Column(name = D_DOB, nullable = true)
    private Date dob;

    @Enumerated(EnumType.STRING)
    @Column(name = T_SEX, nullable = true)
    private GenderEnum gender;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = GEOTECH_CLIENT_CONTACT, joinColumns = {
        @JoinColumn(name = S_CLIENT_ID)

    }, inverseJoinColumns = {
        @JoinColumn(name = S_CONTACT_ID)
    })
    private GeoTechContactInfo geoTechContactInfo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = GEOTECH_CLIENT_ADDRESS, joinColumns = {
        @JoinColumn(name = S_CLIENT_ID)
    }, inverseJoinColumns = {
        @JoinColumn(name = S_ADDRESS_ID)
    })
    private GeoTechAddressInfo geoTechAddressInfo;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = S_CLIENT_ID, nullable = false)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = GEOTECH_CLIENT_INSPCT_REQ, joinColumns = {
        @JoinColumn(name = S_CLIENT_ID)
    }, inverseJoinColumns = {
        @JoinColumn(name = GeoTechInspectionReqInfo.S_INSP_REQ_ID)
    })
    private List<GeoTechInspectionReqInfo> geoTechInspectionReqInfo;

}
