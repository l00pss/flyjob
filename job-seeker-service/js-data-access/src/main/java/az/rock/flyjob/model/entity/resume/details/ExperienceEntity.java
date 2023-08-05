package az.rock.flyjob.model.entity.resume.details;

import az.rock.flyjob.model.entity.resume.ResumeEntity;
import az.rock.lib.domain.BaseEntity;
import az.rock.lib.valueObject.WorkingTimeType;
import az.rock.lib.valueObject.WorkingType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "experiences", schema = "resume")
@Entity(name = "ExperienceEntity")
public class ExperienceEntity extends BaseEntity {
    @ManyToOne
    private ResumeEntity resume;

    @Column(name = "employer", nullable = false)
    private String employer;

    @Column(name = "link")
    private String link;

    @Column(name = "job_title", nullable = false)
    private String jobTitle;

    @Column(name = "city_id")
    private UUID cityId;

    @Enumerated(EnumType.STRING)
    private WorkingType workingType;

    @Enumerated(EnumType.STRING)
    private WorkingTimeType workingTimeType;

    @Column(name = "description")
    private String description;

    @Temporal(value = TemporalType.DATE)
    private Timestamp startDate;

    @Temporal(value = TemporalType.DATE)
    private Timestamp endDate;
}
