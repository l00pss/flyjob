package az.rock.flyjob.js.dataaccess.adapter.query;

import az.rock.flyjob.js.dataaccess.mapper.abstracts.AbstractProjectDataAccessMapper;
import az.rock.flyjob.js.dataaccess.repository.abstracts.query.jpa.AbstractProjectQueryJPARepository;
import az.rock.flyjob.js.domain.core.root.detail.ProjectRoot;
import az.rock.flyjob.js.domain.presentation.dto.criteria.InterestCriteria;
import az.rock.flyjob.js.domain.presentation.dto.criteria.ProjectCriteria;
import az.rock.flyjob.js.domain.presentation.ports.output.repository.query.AbstractProjectQueryRepositoryAdapter;
import az.rock.lib.domain.id.js.ProjectID;
import az.rock.lib.domain.id.js.ResumeID;
import az.rock.lib.valueObject.AccessModifier;
import az.rock.lib.valueObject.SimplePageableRequest;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class ProjectQueryRepositoryAdapter implements AbstractProjectQueryRepositoryAdapter {
    private final AbstractProjectQueryJPARepository projectQueryJPARepository;
    private final AbstractProjectDataAccessMapper projectDataAccessMapper;

    public ProjectQueryRepositoryAdapter(AbstractProjectQueryJPARepository projectQueryJPARepository
            , AbstractProjectDataAccessMapper projectDataAccessMapper) {
        this.projectQueryJPARepository = projectQueryJPARepository;
        this.projectDataAccessMapper = projectDataAccessMapper;
    }

    @Override
    public Optional<ProjectRoot> findByResumeAndUuidAndRowStatusTrue(ResumeID resumeID, UUID projectId) {
        var entity = this.projectQueryJPARepository.findByIdAndResumeIdAndRowStatusActive(resumeID.getAbsoluteID(), projectId);
        if (entity.isEmpty()) return Optional.empty();
        return this.projectDataAccessMapper.toRoot(entity.get());
    }

    @Override
    public Optional<ProjectRoot> fetchAnyById(ProjectCriteria criteria) {
        return Optional.empty();
    }

    @Override
    public List<ProjectRoot> fetchAllAnyProjectIs(ProjectCriteria criteria, SimplePageableRequest pageableRequest) {
        return null;
    }

    @Override
    public List<ProjectRoot> fetchAllAnySimpleProjectI(ProjectCriteria criteria, SimplePageableRequest request) {
        return null;
    }

    @Override
    public Optional<ProjectRoot> findMyProjectIById(ProjectCriteria criteria) {
        return Optional.empty();
    }

    @Override
    public List<ProjectRoot> queryAllMyProjectIs(ProjectCriteria criteria, SimplePageableRequest pageableRequest) {
        return null;
    }

    @Override
    public List<ProjectRoot> queryAllMySimpleProjectIs(ProjectCriteria criteria, SimplePageableRequest pageableRequest) {
        return null;
    }

    @Override
    public Optional<ProjectRoot> findOwnByID(ResumeID parentID, ProjectID rootId, List<AccessModifier> accessModifiers) {
        return Optional.empty();
    }

    @Override
    public List<ProjectRoot> findAllByPID(ResumeID parentID, List<AccessModifier> accessModifiers) {
        return null;
    }

    @Override
    public Optional<Integer> getLimit(ResumeID resumeID) {
        return Optional.empty();
    }


    @Override
    public Optional<ProjectRoot> findOwnByID(ResumeID parentID, ProjectID rootId) {
        return AbstractProjectQueryRepositoryAdapter.super.findOwnByID(parentID, rootId);
    }

    @Override
    public Optional<ProjectRoot> findById(ProjectID rootId) {
        return Optional.empty();
    }

    @Override
    public Optional<ProjectRoot> findByPID(ResumeID parentID) {
        return AbstractProjectQueryRepositoryAdapter.super.findByPID(parentID);
    }

    @Override
    public List<ProjectRoot> findAllByPID(ResumeID parentID) {
        var projectEntityList = projectQueryJPARepository.findAll();
        return projectEntityList
                .stream()
                .map(this.projectDataAccessMapper::toRoot)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .toList();
    }
}
