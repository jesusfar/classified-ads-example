package classifiedads.domain.model.item;

import java.util.UUID;

public class ItemId {
    private String id;

    public ItemId() {
        id = UUID.randomUUID().toString();
    }

    public ItemId(String id) {
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

        ItemId itemId = (ItemId) o;

        return id != null ? id.equals(itemId.id) : itemId.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
