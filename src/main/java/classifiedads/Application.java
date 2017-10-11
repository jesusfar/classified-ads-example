package classifiedads;

import classifiedads.domain.model.item.Item;
import classifiedads.domain.model.item.Price;
import classifiedads.domain.model.market.Market;
import classifiedads.domain.model.user.*;


public class Application {
    public static void main(String[] args) {
        Market market = new Market();

        System.out.println("Market place: " + market.toString());

        // Create a Seller
        Account sellerAccount = new Account(new AccountId(), "seller", "seller123");
        Seller seller = new Seller(
                new UserId(),
                "Pepe",
                "Best Seller",
                null,
                "seller@bay.com",
                sellerAccount
        );
        System.out.println("Seller : " + seller.toString());

        // Create a Buyer
        Account buyerAccount = new Account(new AccountId(), "buyer", "buyer123");
        Buyer buyer = new Buyer(
                new UserId(),
                "Joan",
                "Best Buyer",
                null,
                "buyer@bay.com",
                buyerAccount
        );
        System.out.println("Buyer : " + buyer.toString());

        seller.postItemInMarket(market, "New BMW GT200", "Awosome car 2017", new Price(1000000.0, "US"));
        Item item = market.getLastItem();

        System.out.println("Item status: " + item.getStatus());
        System.out.println("Buyer wants to buy item: " + item.toString());

        buyer.buysItemInMarket(market, item);
        System.out.println("Item is sold: " + item.getStatus());
        buyer.buysItemInMarket(market, item);
    }
}