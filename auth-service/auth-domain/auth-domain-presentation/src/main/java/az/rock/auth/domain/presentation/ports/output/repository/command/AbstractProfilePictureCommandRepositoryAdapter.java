package az.rock.auth.domain.presentation.ports.output.repository.command;

import az.rock.auth.domain.presentation.ports.output.repository.AbstractCommandRepositoryAdapter;
import az.rock.flyjob.auth.root.user.ProfilePictureRoot;
import az.rock.lib.annotation.DomainOutputPort;

@DomainOutputPort
public interface AbstractProfilePictureCommandRepositoryAdapter extends AbstractCommandRepositoryAdapter<ProfilePictureRoot> {
}
