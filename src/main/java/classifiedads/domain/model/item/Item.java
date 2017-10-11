package classifiedads.domain.model.item;

import classifiedads.domain.model.user.Seller;
import classifiedads.domain.model.user.UserId;

public class Item {
    private ItemId id;
    private UserId sellerId;
    private UserId buyerId;
    private String title;
    private String description;
    private Price price;
    private ItemStatus status;

    public Item(ItemId id, UserId sellerId, String title, String description, Price price) {
        this.id = id;
        this.sellerId = sellerId;
        this.title = title;
        this.description = description;
        this.price = price;
        this.status = ItemStatus.CREATED;
    }

    public ItemId getId() {
        return id;
    }

    public UserId getSellerId() {
        return sellerId;
    }

    public UserId getBuyerId() {
        return buyerId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Price getPrice() {
        return price;
    }

    public ItemStatus getStatus() {
        return status;
    }

    public void changeItemState(ItemStatus status) {
        this.status = status;
    }

    public void soldToBuyer(UserId buyerId) {
        if (status == ItemStatus.SOLD) {
            System.out.println("Item is sold!!, you can't not buys.");
            return;
        }
        changeItemState(ItemStatus.SOLD);
        this.buyerId = buyerId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Item{");
        sb.append("id=").append(id);
        sb.append(", sellerId=").append(sellerId);
        sb.append(", buyerId=").append(buyerId);
        sb.append(", title='").append(title).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", price=").append(price);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
