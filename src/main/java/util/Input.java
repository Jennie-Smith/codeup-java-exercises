package util;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString(){
        String input = scanner.nextLine();
        return input;
    }

    public boolean yesNo(){
        String input = scanner.nextLine();
        if (Objects.equals(input, "y") || Objects.equals(input, "yes")){
            return true;
        } else {
            return false;
        }
    }
//
    public int getInt(int min, int max){
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int num = scanner.nextInt();
        if (num < min || num > max) {
            return getInt(min, max);
        }
        return num;
    }

    public int getInt(){
        System.out.print("Enter a number between 1 and 10: ");
        int num = scanner.nextInt();
        if (num < 1 || num > 10) {
            return getInt();
        }
        return num;
    }

    public double getDouble(double min, double max){
        System.out.printf("Enter a number between %f and %f: ", min, max);
        double num = scanner.nextDouble();
        if (num < min || num > max) {
            return getDouble(min, max);
        }
        return (double) num;
    }

    public double getDouble(){
        System.out.print("Enter a number a double: ");
        double num = scanner.nextDouble();
//        if (num < 1 || num > 10) {
//            return getDouble();
//        }
        return (double) num;
    }

}
