package az.rock.auth.domain.presentation.ports.input.outbox.abstracts;

import az.rock.flyjob.auth.model.root.UserOutboxRoot;
import az.rock.flyjob.auth.model.root.user.UserRoot;
import az.rock.lib.annotation.InputPort;
import com.intellibucket.lib.payload.event.abstracts.AbstractDomainEvent;
import org.springframework.transaction.annotation.Transactional;

@InputPort
@Transactional
public interface AbstractUserOutboxInputPort extends AbstractOutboxInputPort<AbstractDomainEvent<UserRoot>, UserOutboxRoot> {
}
