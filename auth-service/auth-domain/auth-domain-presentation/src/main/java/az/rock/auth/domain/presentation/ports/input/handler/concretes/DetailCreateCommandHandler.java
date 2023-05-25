package az.rock.auth.domain.presentation.ports.input.handler.concretes;

import az.rock.auth.domain.presentation.mapper.abstracts.AbstractDetailDomainMapper;
import az.rock.auth.domain.presentation.ports.input.handler.abstracts.AbstractDetailCreateCommandHandler;
import az.rock.auth.domain.presentation.ports.output.repository.AbstractDetailRepositoryAdapter;
import az.rock.flyjob.auth.event.DetailCreatedEvent;
import az.rock.flyjob.auth.event.UserCreatedEvent;
import az.rock.flyjob.auth.root.UserRoot;
import az.rock.flyjob.auth.service.abstracts.AbstractDetailDomainService;
import org.springframework.stereotype.Component;

@Component
public class DetailCreateCommandHandler implements AbstractDetailCreateCommandHandler {

    private final AbstractDetailDomainService detailDomainService;

    private final AbstractDetailDomainMapper detailDomainMapper;

    private final AbstractDetailRepositoryAdapter detailRepositoryAdapter;

    public DetailCreateCommandHandler(AbstractDetailDomainService detailDomainService,
                                      AbstractDetailDomainMapper detailDomainMapper,
                                      AbstractDetailRepositoryAdapter detailRepositoryAdapter) {
        this.detailDomainService = detailDomainService;
        this.detailDomainMapper = detailDomainMapper;
        this.detailRepositoryAdapter = detailRepositoryAdapter;
    }


    @Override
    public DetailCreatedEvent handle(UserRoot userRoot) {
        return null;
    }
}
