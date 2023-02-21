package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }
    public String getString(){
        return scanner.nextLine();
    }

    public String getString(String category){
//        System.out.printf("What is your name?%n");
//        String name = scanner.nextLine();
//        return String.format("Hello " + name);
        return scanner.nextLine();
    }

    public boolean yesNo(){
        String input = getString("enter movie category");
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")){
            return true;
        } else {
            return false;
        }
    }
//
    public int getInt(int min, int max, String s){
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int num = scanner.nextInt();
        if (num < min || num > max) {
            return getInt(min, max, "Enter your choice: ");
        }
        return num;
    }

    public int getInt(){
//        System.out.print("Enter a number between 1 and 10: ");
//        int num = scanner.nextInt();
//        if (num < 1 || num > 10) {
//            return getInt();
//        }
//        return num;
//        return scanner.nextInt();
        String s = getString();
        int userNum = 0;
        try{
            userNum = Integer.valueOf(s);
        }catch (Exception e){
            System.out.println("Hey that's not a number!");
            userNum =  getInt();
        }
        return userNum;
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
//        System.out.print("Enter a number a double: ");
//        double num = scanner.nextDouble();
////        if (num < 1 || num > 10) {
////            return getDouble();
////        }
//        return (double) num;
//        return scanner.nextDouble();
        String s = getString();
        double userNum = 0;
        try{
            userNum = Double.valueOf(s);
        }catch (Exception e){
            System.out.println("Hey that's not a number!");
            return getInt();
        }
        return userNum;
    }

    public String nextLine() {
        return " ";
    }

    public static void main(String[] args) {
        Input myInput = new Input();

//        don't want this to crash
        int anInt = myInput.getInt();
        System.out.println(anInt);
        double aDouble = myInput.getDouble();
        System.out.println(aDouble);
    }
}
