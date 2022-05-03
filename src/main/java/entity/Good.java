package entity;

import constants.Category;
import constants.Currency;
import util.ApplicationUtil;

public class Good {
    private String name;
    private int amount;
    private double price;
    private Currency currency;
    private Category category;

    public void toMinus(int itemAmount){
        amount -= itemAmount;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "name " + name +
                ", category " + category.getValue() +
                ", amount " + amount +
                ", price " + price +
                ", currency " + currency;
    }
    public String displayInCurrency(Currency currency){
        return "name " + name +
                ", category " + category.getValue() +
                ", amount " + amount +
                ", price " + ApplicationUtil.getPriceByCurrency(this, currency) +
                ", currency " + currency;
    }
}
