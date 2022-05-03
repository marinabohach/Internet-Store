package entity;

public class BasketItem {
    private Good good;
    private int amount;

    public BasketItem(Good good, int amount) {
        this.good = good;
        this.amount = amount;
    }

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "good " + good +
                ", amount=" + amount;
    }
}
