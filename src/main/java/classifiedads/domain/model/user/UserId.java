package classifiedads.domain.model.user;

import java.util.UUID;

public class UserId {
    private String id;

    public UserId() {
        id = UUID.randomUUID().toString();
    }

    public UserId(String id) {
        if (id == null) {
            id = UUID.randomUUID().toString();
        }
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserId userId = (UserId) o;

        return id != null ? id.equals(userId.id) : userId.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
