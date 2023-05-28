package az.rock.flyjob.auth.dataAccess.mapper.concretes;

import az.rock.flyjob.auth.dataAccess.entity.detail.DetailEntity;
import az.rock.flyjob.auth.dataAccess.mapper.abstracts.AbstractDetailDataAccessMapper;
import az.rock.flyjob.auth.root.detail.DetailRoot;
import az.rock.lib.domain.id.DetailID;
import az.rock.lib.util.GDateTime;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class DetailDataAccessMapper implements AbstractDetailDataAccessMapper<DetailEntity, DetailRoot> {

    @Override
    public DetailRoot toRoot(DetailEntity entity) {
        return DetailRoot.Builder
                .builder()
                .detailID(DetailID.of(entity.getUuid()))
                .createdDate(GDateTime.of(entity.getCreatedDate()))
                .modificationDate(GDateTime.of(entity.getLastModifiedDate()))
                .version(entity.getVersion())
                .build();
    }

    @Override
    public DetailEntity toEntity(DetailRoot root) {
        return DetailEntity.Builder
                .builder()
                .uuid(root.getUUID().getId())
                .createdDate(GDateTime.of(root.getCreatedDate()))
                .lastModifiedDate(GDateTime.of(root.getModificationDate()))
                .version(root.getVersionValue())
                .build();
    }

    @Override
    public DetailEntity toNewEntity(DetailRoot root) {
        return DetailEntity.Builder
                .builder()
                .uuid(root.getUUID().getId())
                .version(root.getVersionValue())
                .processStatus(root.getProcessStatus())
                .rowStatus(root.getRowStatus())
                .createdDate(GDateTime.of(root.getCreatedDate()))
                .lastModifiedDate(GDateTime.of(root.getModificationDate()))
                .isAccountNonExpired(root.isAccountNonExpired())
                .isAccountNonLocked(root.isAccountNonLocked())
                .isCredentialsNonExpired(root.isCredentialsNonExpired())
                .isEnabled(root.isEnabled())
                .isDeleted(root.isDeleted())
                .isFrozen(root.isFrozen())
                .build();
    }
}
