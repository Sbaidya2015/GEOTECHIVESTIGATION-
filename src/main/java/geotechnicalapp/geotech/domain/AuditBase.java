package geotechnicalapp.geotech.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

/**
 * @author Sanjeet Baidya
 */
@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AuditBase {

    @CreatedDate
    @Column(name = "d_created")
    private LocalDateTime createdDate;

    @CreatedBy
    @Column(name = "t_createdby", length = 500)
    private String createdBy;

    @LastModifiedDate
    @Column(name = "d_updated")
    private LocalDateTime lastUpdatedDate;

    @LastModifiedBy
    @Column(name = "t_updatedby", length = 500)
    private String lastUpdatedBy;

}
