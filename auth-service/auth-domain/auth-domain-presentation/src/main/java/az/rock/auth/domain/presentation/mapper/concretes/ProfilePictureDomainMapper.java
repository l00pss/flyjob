package az.rock.auth.domain.presentation.mapper.concretes;

import az.rock.auth.domain.presentation.mapper.abstracts.AbstractProfilePictureDomainMapper;
import az.rock.flyjob.auth.root.user.ProfilePictureRoot;
import az.rock.lib.domain.id.ProfilePictureID;
import az.rock.lib.domain.id.UserID;
import az.rock.lib.valueObject.*;
import org.springframework.stereotype.Component;

@Component
public class ProfilePictureDomainMapper implements AbstractProfilePictureDomainMapper {
    @Override
    public ProfilePictureRoot of(UserID userID, FileMetaData fileMetaData) {
        return ProfilePictureRoot.Builder
                .builder()
                .id(ProfilePictureID.of())
                .userID(userID)
                .accessModifier(AccessModifier.PUBLIC)
                .processStatus(ProcessStatus.ON_WAITING)
                .rowStatus(RowStatus.ACTIVE)
                .version(Version.ONE)
                .filename("file name")
                .isCurrent(Boolean.TRUE)
                .fileFormat(fileMetaData.fileFormat())
                .filepath(fileMetaData.getObject())
                .build();
    }
}
