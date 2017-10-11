package classifiedads.domain.model.item;

public class Price {
    private Double amount;
    private String currency;
    public Price(Double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }


    public Double getAmount() {
        return amount;
    }


    @Override
    public String toString() {
        return "Price{" +
                "currency=" + currency +
                ", amount=" + amount +
                '}';
    }
}
