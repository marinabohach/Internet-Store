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
    public void toBuy(){
        for (BasketItem item :items) {
            if(item.getAmount()>item.getGood().getAmount()){
                System.out.println("Such amount of goods is not available");
                return;
            }
        }
        for (BasketItem item :items) {
            item.getGood().toMinus(item.getAmount());
        }
        System.out.println("Success");
        items.clear();


    }

    public void display(){
        if(items.isEmpty()){
            System.out.println("Your basket is empty");
        }
        else {
            for (int i = 0; i < items.size(); i++) {
                System.out.println(i + 1 + " " + items.get(i));
            }
        }
    }

    public void clear(){
        items.clear();
        System.out.println("Your basket is empty");
    }

    public void addItem(Good good, int amount){
        BasketItem basketItem = new BasketItem(good, amount);
        items.add(basketItem);
        System.out.println("Successfully added");
    }

}
