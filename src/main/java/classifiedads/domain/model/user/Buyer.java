package classifiedads.domain.model.user;

import classifiedads.domain.model.item.Item;
import classifiedads.domain.model.market.Market;

import java.util.Date;

public class Buyer extends User {
    public Buyer(UserId id, String name, String lastName, Date dateBirth, String email, Account account) {
        super(id, name, lastName, dateBirth, email, account);
    }

    public void buysItemInMarket(Market market, Item item) {
        market.sellsItem(item, this.id);
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "id=" + id.getId() +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateBirth=" + dateBirth +
                ", email='" + email + '\'' +
                ", account=" + account.getId().toString() +
                '}';
    }
}
