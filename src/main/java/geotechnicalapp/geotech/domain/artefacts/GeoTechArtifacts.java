package geotechnicalapp.geotech.domain.artefacts;

import geotechnicalapp.geotech.domain.AuditBase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Blob;
import java.sql.Clob;

/**
 * @author Sanjeet Baidya
 */
@Data
@Entity
@Table(name = GeoTechArtifacts.GEOTECH_ARTIFACTS)
@AttributeOverride(name = "id", column = @Column(name = GeoTechArtifacts.GEOTECH_ARTIFACT_ID))
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GeoTechArtifacts extends AuditBase {

    public static final String GEOTECH_ARTIFACT_ID = "GEOTECH_ARTIFACT_ID";
    public static final String GEOTECH_ARTIFACT_BLOB = "GEOTECH_ARTIFACT_BLOB";
    public static final String GEOTECH_ARTIFACT_CLOB = "GEOTECH_ARTIFACT_CLOB";
    public static final String GEOTECH_ARTIFACTS = "GEOTECH_ARTIFACTS";

    @Column(name = GEOTECH_ARTIFACT_BLOB)
    @Lob
    private Blob artifactBlob;

    @Column(name = GEOTECH_ARTIFACT_CLOB)
    @Lob
    private StringBuffer artifactClob;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = GEOTECH_ARTIFACT_ID, nullable = false)
    private Long id;


    public void populate(){}
}
