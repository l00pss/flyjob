package az.rock.flyjob.auth.messaging.publisher;

import az.rock.auth.domain.presentation.ports.output.publisher.AbstractFollowRelationMessagePublisher;
import az.rock.flyjob.auth.model.root.network.FollowRelationRoot;
import com.intellibucket.lib.payload.event.abstracts.AbstractDomainEvent;
import com.intellibucket.lib.payload.trx.Saga;
import org.springframework.stereotype.Component;

@Component
public class FollowRelationMessagePublisher implements AbstractFollowRelationMessagePublisher {
    @Override
    public void publish(Saga<AbstractDomainEvent<FollowRelationRoot>> sagaRoot) {

    }
}
