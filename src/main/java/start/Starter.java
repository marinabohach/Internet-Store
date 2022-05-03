package start;

import entity.InternetStore;
import entity.MyFunctionalInterface;

import java.util.Scanner;

public class Starter {
    Scanner scanner = new Scanner(System.in);
    InternetStore internetStore = new InternetStore();

    public void start(){
        while(true){
            switch (menu()){
                case 1: {
                   internetStore.manyCalls(internetStore::restock);
                    break;
                }
                case 2:{
                    internetStore.restock();
                    break;
                }
                case 3:{
                    internetStore.display();
                    break;
                }
                case 4:{
                    internetStore.displayByCategory();
                    break;
                }
                case 5:{
                    internetStore.manyCalls(internetStore::addToBasket);
                    break;
                }
                case 6:{
                    internetStore.addToBasket();
                    break;
                }
                case 7:{
                    internetStore.displayBasket();
                    break;
                }
                case 8:{
                    internetStore.clearBasket();
                    break;
                }
                case 9: {
                    internetStore.toBuy();
                    break;
                }
                case 10:{
                    internetStore.changeCurrency();
                    break;
                }
                default:{
                    return;
                }
            }
        }

    }

    private int menu(){
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println("1 to restock");
        System.out.println("2 to add one product");
        System.out.println("3 to display the products");
        System.out.println("4 to display by categories");
        System.out.println("5 to add items to the basket");
        System.out.println("6 to add one item to the basket");
        System.out.println("7 to display the basket");
        System.out.println("8 to clear the basket");
        System.out.println("9 to purchase the items from basket");
        System.out.println("10 to change the currency");
        System.out.println("other to exit");
        return scanner.nextInt();
    }
}
