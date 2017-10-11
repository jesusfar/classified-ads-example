package classifiedads.domain.model.admin;

import java.util.UUID;

public class ModeratorId {
    private String id;

    public ModeratorId(String id) {
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

        ModeratorId that = (ModeratorId) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ModeratorId{" +
                "id='" + id + '\'' +
                '}';
    }
}
