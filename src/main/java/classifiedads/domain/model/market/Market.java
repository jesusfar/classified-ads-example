package classifiedads.domain.model.market;

import classifiedads.domain.model.item.Item;
import classifiedads.domain.model.user.UserId;

import java.util.ArrayList;
import java.util.List;

public class Market {
    private String name;
    private List<Item> items = new ArrayList<>();
    private int numberItems = 0;

    public Market() {
        this.name = "Awesome Market Place";
    }

    public Market(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Item> getItems() {
        return items;
    }

    public Item getLastItem() {
        return items.get(numberItems - 1);
    }

    public void postItem(Item item) {
        numberItems++;
        items.add(item);
    }

    public void sellsItem(Item item, UserId buyerId) {
        item.soldToBuyer(buyerId);
    }

    @Override
    public String toString() {
        return name;
    }
}
