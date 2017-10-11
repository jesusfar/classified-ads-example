package classifiedads.domain.model.item;

import java.util.UUID;

public class CategoryId {
    private String id;

    public CategoryId() {
        id = UUID.randomUUID().toString();
    }

    public CategoryId(String id) {
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

        CategoryId CategoryId = (CategoryId) o;

        return id != null ? id.equals(CategoryId.id) : CategoryId.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
