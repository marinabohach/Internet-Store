package entity;

import constants.Category;
import constants.Currency;
import entity.Basket;
import entity.Good;
import util.ApplicationUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;

import static util.ApplicationUtil.getIndex;

public class InternetStore {
    private Scanner scanner = new Scanner(System.in);
    private List<Good> goods = new ArrayList<>();
    private Basket basket = new Basket();
    private Currency currency = Currency.UAH;

    public void restock(){
            Good good = new Good();
            System.out.println("Enter name of a good");
            good.setName(scanner.next());
            System.out.println("Enter amount");
            good.setAmount(scanner.nextInt());
            System.out.println("Enter price in UAH");
            good.setPrice(scanner.nextDouble());
            good.setCurrency(Currency.UAH);
            System.out.println("Choose a category");
            displayCategories();
            good.setCategory(getCategory(scanner.nextInt()));
            goods.add(good);
    }

    public void display(){
        for (int i = 0; i < goods.size(); i++) {
            System.out.println(i + 1 + ": " + goods.get(i).displayInCurrency(currency));
        }
    }
    public void changeCurrency(){
        System.out.println("Choose a currency");
        System.out.println("1 UAH, 2 USD, 3 EUR");
        switch (scanner.nextInt()){
            case 1: {
                currency = Currency.UAH;
                break;
            }
            case 2:{
                currency = Currency.USD;
                break;
            }
            default:{
                currency = Currency.EUR;
            }
        }
    }

    public void displayByCategory(){
        System.out.println("Choose a category");
        displayCategories();
        Category category = getCategory(scanner.nextInt());
        for (int i = 0; i < goods.size(); i++) {
            if(goods.get(i).getCategory().equals(category)){
                System.out.println(i + 1 + " " + goods.get(i));
            }
        }
    }

    public void addToBasket(){
        System.out.println("1 - to display the general list");
        System.out.println("2 - to display by categories");
        if(scanner.nextInt() == 1){
            display();
        }
        else{
            displayByCategory();
        }
        System.out.println("Choose a product");
        int index = getIndex();
        System.out.println("Enter amount");
        int amount = scanner.nextInt();
        if(amount <= 0|| ApplicationUtil.isIndexIncorrect(index)){
            System.out.println("Invalid value");
            return;
        } 
        basket.addItem(goods.get(index), amount);

    }
    public void displayBasket(){
       basket.display();
    }
    public void clearBasket(){
        basket.clear();
    }
    public void toBuy(){
        basket.toBuy();
    }

    public void manyCalls(MyFunctionalInterface s){
        while (true){
            s.accept();
            System.out.println("Would you like to continue, y/n");
            if(!scanner.next().equals("y")){
                return;
            }
        }
    }


    public void displayCategories(){
        System.out.println("1 - FRAGRANCES, 2 - FACE, 3 - BODY");
        System.out.println("4 - HAIR, 5 - NAILS, 6 - MAKEUP");
    }

    private Category getCategory(int category){
        switch(category){
            case 1:{
                return Category.FRAGRANCES;
            }
            case 2:{
                return Category.FACE;
            }
            case 3:{
                return Category.BODY;
            }
            case 4:{
                return Category.HAIR;
            }
            case 5:{
                return Category.NAILS;
            }
            default:{
                return Category.MAKEUP;
            }
        }
    }


}
