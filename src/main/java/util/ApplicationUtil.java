package util;

import java.util.Scanner;

public class ApplicationUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static int getIndex() {
        return scanner.nextInt() - 1;
    }
    public static boolean isIndexIncorrect(int index){
       return index < 0;
    }
}
