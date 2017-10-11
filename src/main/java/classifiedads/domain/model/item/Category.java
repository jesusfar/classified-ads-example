package classifiedads.domain.model.item;

public class Category {
    private CategoryId id;
    private String name;
    private CategoryId parentId;

    public Category(CategoryId id, String name, CategoryId parentId) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
    }

    public CategoryId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CategoryId getParentId() {
        return parentId;
    }
}
