package az.rock.lib.domain.id;

import az.rock.lib.domain.RootID;

import java.util.UUID;

public class ProfilePictureID extends RootID<UUID> implements IdReference<UUID> {
    protected ProfilePictureID(UUID value) {
        super(value);
    }

    @Override
    public UUID getAbsoluteID() {
        return super.getRootID();
    }

    public static ProfilePictureID of(UUID value) {
        return new ProfilePictureID(value);
    }

    public static ProfilePictureID of() {
        return new ProfilePictureID(UUID.randomUUID());
    }
}
