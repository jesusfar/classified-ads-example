package classifiedads.domain.model.user;

import classifiedads.domain.model.item.Item;
import classifiedads.domain.model.item.ItemId;
import classifiedads.domain.model.item.Price;
import classifiedads.domain.model.market.Market;


import java.util.Date;

public class Seller extends User {


    public Seller(UserId id, String name, String lastName, Date dateBirth, String email, Account account) {
        super(id, name, lastName, dateBirth, email, account);
    }

    public void postItemInMarket(Market market, String title, String description, Price price) {
        market.postItem(new Item(
                new ItemId(),
                this.id,
                title,
                description,
                price
        ));
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id.getId() +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateBirth=" + dateBirth +
                ", email='" + email + '\'' +
                ", account=" + account.getId().toString() +
                '}';
    }
}
