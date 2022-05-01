package entity;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<BasketItem> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public List<BasketItem> getItems() {
        return items;
    }

    public void setItems(List<BasketItem> items) {
        this.items = items;
    }
    public void addItem(Good good, int amount){
        BasketItem basketItem = new BasketItem(good, amount);
        items.add(basketItem);
        System.out.println("Successfully added");
    }
}
