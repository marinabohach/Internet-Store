package util;

import constants.Currency;
import entity.Good;

import java.util.Scanner;

public class ApplicationUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static int getIndex() {
        return scanner.nextInt() - 1;
    }
    public static boolean isIndexIncorrect(int index){
       return index < 0;
    }

    public static double getPriceByCurrency(Good good, Currency currency){
        if(good.getCurrency().equals(currency)){
            return good.getPrice();
        }
        if(good.getCurrency().equals(Currency.UAH)&&currency.equals(Currency.USD)){
            return good.getPrice()/29.41;
        } else if(good.getCurrency().equals(Currency.UAH)&&currency.equals(Currency.EUR)){
            return good.getPrice()/31.07;
        } else if(good.getCurrency().equals(Currency.USD)&&currency.equals(Currency.EUR)){
            return good.getPrice()/1.056;
        } else if(good.getCurrency().equals(Currency.USD)&&currency.equals(Currency.UAH)){
            return good.getPrice() * 29.41;
        } else if(good.getCurrency().equals(Currency.EUR)&&currency.equals(Currency.USD)){
            return good.getPrice() * 1.056;
        } else{
            return good.getPrice() * 31.07;
        }
    }
}
