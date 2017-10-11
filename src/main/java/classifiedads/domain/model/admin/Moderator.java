package classifiedads.domain.model.admin;

import classifiedads.domain.model.item.Item;
import classifiedads.domain.model.item.ItemStatus;

public class Moderator {
    private ModeratorId id;
    private String name;
    private String lastName;

    public Moderator(ModeratorId id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public ModeratorId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void approvesItem(Item item) {
        item.changeItemState(ItemStatus.APPROVED);
    }

    public void rejectsItem(Item item) {
        item.changeItemState(ItemStatus.REJECTED);
    }
}
