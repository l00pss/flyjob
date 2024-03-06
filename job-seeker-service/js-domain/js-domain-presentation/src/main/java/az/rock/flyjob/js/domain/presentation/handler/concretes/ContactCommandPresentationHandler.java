package az.rock.flyjob.js.domain.presentation.handler.concretes;

import az.rock.flyjob.js.domain.core.exception.ContactAlreadyExistException;
import az.rock.flyjob.js.domain.core.root.detail.ContactRoot;
import az.rock.flyjob.js.domain.core.service.abstracts.AbstractContactDomainService;
import az.rock.flyjob.js.domain.presentation.dto.request.abstracts.CreateRequest;
import az.rock.flyjob.js.domain.presentation.dto.request.abstracts.ReorderRequest;
import az.rock.flyjob.js.domain.presentation.dto.request.abstracts.UpdateRequest;
import az.rock.flyjob.js.domain.presentation.dto.request.item.ContactCommandModel;
import az.rock.flyjob.js.domain.presentation.exception.UnknownSystemException;
import az.rock.flyjob.js.domain.presentation.handler.abstracts.AbstractContactCommandHandler;
import az.rock.flyjob.js.domain.presentation.mapper.abstracts.AbstractContactCommandDomainMapper;
import az.rock.flyjob.js.domain.presentation.ports.output.repository.command.AbstractContactCommandRepositoryAdapter;
import az.rock.flyjob.js.domain.presentation.ports.output.repository.query.AbstractContactCommandQueryRepositoryAdapter;
import az.rock.flyjob.js.domain.presentation.security.AbstractSecurityContextHolder;
import az.rock.lib.domain.id.js.ResumeID;
import com.intellibucket.lib.payload.event.create.ContactCreatedEvent;
import com.intellibucket.lib.payload.event.delete.ContactDeleteEvent;
import com.intellibucket.lib.payload.event.reorder.ContactReorderEvent;
import com.intellibucket.lib.payload.event.update.ContactUpdateEvent;
import com.intellibucket.lib.payload.payload.ContactDeletePayload;
import com.intellibucket.lib.payload.payload.ContactMergePayload;
import com.intellibucket.lib.payload.payload.ContactPayload;
import org.springframework.stereotype.Component;

import java.rmi.server.UID;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class ContactCommandPresentationHandler implements AbstractContactCommandHandler {
    private final AbstractContactCommandRepositoryAdapter abstractContactCommandRepositoryAdapter;
    private final AbstractContactCommandQueryRepositoryAdapter commandQueryRepositoryAdapter;
    private final AbstractContactCommandDomainMapper contactCommandDomainMapper;
    private final AbstractSecurityContextHolder contextHolder;

    private final AbstractContactDomainService domainService;

    public ContactCommandPresentationHandler(AbstractContactCommandRepositoryAdapter abstractContactCommandRepositoryAdapter, AbstractContactCommandQueryRepositoryAdapter commandQueryRepositoryAdapter, AbstractContactCommandDomainMapper contactCommandDomainMapper, AbstractSecurityContextHolder contextHolder, AbstractContactDomainService domainService) {
        this.abstractContactCommandRepositoryAdapter = abstractContactCommandRepositoryAdapter;
        this.commandQueryRepositoryAdapter = commandQueryRepositoryAdapter;
        this.contactCommandDomainMapper = contactCommandDomainMapper;
        this.contextHolder = contextHolder;
        this.domainService = domainService;
    }
    private ContactPayload toPayload (ContactRoot contactRoot){
        return ContactPayload.Builder
                .builder()
                .id(contactRoot.getRootID().getAbsoluteID())
                .data(contactRoot.getData().)
    }

    @Override
    public ContactCreatedEvent createContact(CreateRequest<ContactCommandModel> createRequest)
    {
        return null;
    }

    @Override
    public ContactUpdateEvent updateContact(UpdateRequest<ContactCommandModel> commandModel) {
        var resumeID = contextHolder.availableResumeID();
        var allByPID = commandQueryRepositoryAdapter.findAllByPID(resumeID);
        Optional<ContactRoot> findedcontact = allByPID.stream().filter(item -> item.getRootID()
                .equals(commandModel.getTargetId())).findFirst();
        if (findedcontact.isPresent()) {
            var contactRoot = findedcontact.get();
            var newRoot = contactRoot.changeFormatType(commandModel.getModel().getFormatType())
                    .changeData(commandModel.getModel().getData())
                    .changeLiveType(commandModel.getModel().getLiveType());
            var validatedContact = this.domainService.validateContactDuplication(allByPID, newRoot);
            var isExistContact = this.commandQueryRepositoryAdapter.isExistContact(validatedContact);
            if (isExistContact) throw new ContactAlreadyExistException();
            this.abstractContactCommandRepositoryAdapter.update(validatedContact);
            var payload =this.toPayload(validatedContact);
            return ContactUpdateEvent.of(payload);
        } else throw new UnknownSystemException();
    }
    @Override
    public ContactDeleteEvent deleteContact(UUID id) {
        var optionalContactRoot = this.abstractContactCommandRepositoryAdapter.delete(id);
//        return ContactDeleteEvent.of(
//                ContactDeletePayload.of(
//                        optionalContactRoot.orElseThrow(()->new RuntimeException()).getRootID().getRootID()
//                )
//        );

        return null;
    }

    @Override
    public ContactReorderEvent reoderContact(ReorderRequest<ContactCommandModel> commandModel) {
        return null;
    }

}
