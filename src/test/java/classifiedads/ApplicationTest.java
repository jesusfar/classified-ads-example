package classifiedads;

import classifiedads.domain.model.item.Item;
import classifiedads.domain.model.item.ItemStatus;
import classifiedads.domain.model.item.Price;
import classifiedads.domain.model.market.Market;
import classifiedads.domain.model.user.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplicationTest {

    @Test
    public void shouldReturnsMyMarket() {
        Market market = new Market("MyMarket");
        assertEquals("MyMarket", market.getName());
    }

    @Test
    public void shouldReturnsASellerAccount() {
        AccountId accountId = new AccountId();

        Account sellerAccount = new Account(accountId, "seller", "seller123");
        Seller seller = new Seller(
                new UserId(),
                "Pepe",
                "Best Seller",
                null,
                "seller@bay.com",
                sellerAccount
        );

        assertEquals(accountId, seller.getAccount().getId());
    }

    @Test
    public void shouldReturnsABuyerAccount() {
        AccountId accountId = new AccountId();

        Account buyerAccount = new Account(accountId, "buyer", "buyer123");
        Buyer buyer = new Buyer(
                new UserId(),
                "Joan",
                "Best Buyer",
                null,
                "buyer@bay.com",
                buyerAccount
        );

        assertEquals(accountId, buyer.getAccount().getId());
    }

    @Test
    public void marketShouldHaveOneItem() {
        Market market = new Market();
        Account sellerAccount = new Account(new AccountId(), "seller", "seller123");
        Seller seller = new Seller(
                new UserId(),
                "Pepe",
                "Best Seller",
                null,
                "seller@bay.com",
                sellerAccount
        );

        seller.postItemInMarket(market, "New BMW GT200", "Awosome car 2017", new Price(1000000.0, "US"));

        assertEquals(1, market.getItems().size());
    }

    @Test
    public void itemShouldHaveSoldState() {
        Market market = new Market();
        Account sellerAccount = new Account(new AccountId(), "seller", "seller123");
        Seller seller = new Seller(
                new UserId(),
                "Pepe",
                "Best Seller",
                null,
                "seller@bay.com",
                sellerAccount
        );

        seller.postItemInMarket(market, "New BMW GT200", "Awosome car 2017", new Price(1000000.0, "US"));

        Item item = market.getLastItem();

        assertEquals(ItemStatus.CREATED, item.getStatus());

        Account buyerAccount = new Account(new AccountId(), "buyer", "buyer123");
        Buyer buyer = new Buyer(
                new UserId(),
                "Joan",
                "Best Buyer",
                null,
                "buyer@bay.com",
                buyerAccount
        );

        buyer.buysItemInMarket(market, item);

        assertEquals(ItemStatus.SOLD, item.getStatus());
    }
}