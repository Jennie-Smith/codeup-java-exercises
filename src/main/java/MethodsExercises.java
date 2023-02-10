import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {

    private static int addition(int firstNum, int secNum) {
        return firstNum + secNum;
    }

    private static int subtraction(int firstNum, int secNum) {
        return firstNum - secNum;
    }

    private static int multiplication(int firstNum, int secNum) {
        return firstNum * secNum;
    }

    private static int division(int firstNum, int secNum) {
        return firstNum / secNum;
    }

    private static int modulus(int firstNum, int secNum) {
        return firstNum % secNum;
    }

    public static int getInteger(Scanner input) {
        System.out.print("Enter a number between 1 and 10: ");
        int num = input.nextInt();
        if (num < 1 || num > 10) {
            return getInteger(input);
        }
        return num;
    }

    public static int getFactInput(Scanner input) {
        System.out.print("Enter a number between 1 and 10: ");
        int inputNum = input.nextInt();
        if (inputNum < 1 || inputNum > 10) {
            return getFactInput(input);
        }
      return  inputNum;
    }
    public static long factorial(long n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return n * factorial(n - 1);
    }

    private static int getDice(Scanner input) {
        System.out.print("Enter the number of sides for dice: ");
        int dice = input.nextInt();
        double dice1 = Math.random() * (dice - 1) + 1;
        double dice2 = Math.random() * (dice - 1) + 1;
        return (int) (dice1 + dice2);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter two numbers: ");
//        int firstNum = input.nextInt();
//        int secNum = input.nextInt();
//        System.out.println("Addition: " + addition(firstNum, secNum));
//        System.out.println("Subtraction: " + subtraction(firstNum, secNum));
//        System.out.println("Multiplication: " + multiplication(firstNum, secNum));
//        System.out.println("Division: " + division(firstNum, secNum));
//        System.out.println("Modulus: " + modulus(firstNum, secNum));

//        int betweenNum = getInteger(input);

//        do{
//            int getInput = getFactInput(input);
//
//            System.out.println(factorial(getInput));
//
//            System.out.println("Do you wish to continue? [y/N]");
//            String userInput = input.next();
//            if (!userInput.equals("y")){
//                break;
//            }
//        }while(true);

        int getDieNum = getDice(input);
        System.out.println("From both dice: " + getDieNum);

        input.close();
    }



//


}
