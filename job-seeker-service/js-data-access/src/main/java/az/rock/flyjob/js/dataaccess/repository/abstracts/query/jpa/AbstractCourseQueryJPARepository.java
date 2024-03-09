package az.rock.flyjob.js.dataaccess.repository.abstracts.query.jpa;

import az.rock.flyjob.js.dataaccess.model.entity.resume.ResumeEntity;
import az.rock.flyjob.js.dataaccess.model.entity.resume.details.CourseEntity;
import az.rock.lib.domain.id.js.ResumeID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface AbstractCourseQueryJPARepository extends JpaRepository<CourseEntity, UUID> {
    @Query("SELECT COUNT(c) > 0 FROM CourseEntity c WHERE c.courseTitle = :title AND c.resume.id = :resume AND c.rowStatus = 'ACTIVE'")
    Boolean existsByTitleAndResume(@Param("title") String title, @Param("resume") UUID resume);

    @Query("SELECT c FROM CourseEntity c WHERE c.uuid=:id AND c.rowStatus = 'ACTIVE'")
    Optional<CourseEntity> findById(@Param("id") UUID id);
}
