import java.util.Scanner;

public class HighLow {

    public static int getNum(Scanner input) {
        System.out.println("Enter a number between 1-100: ");
        int num = input.nextInt();
        if (num < 1 || num > 100) {
            return getNum(input);
        }
        return num;
    }

    private static int getRandomNum(){
        return (int) (Math.random() * (100 - 1) + 1);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int random = getRandomNum();
        System.out.println("The random number is: " + random);
        System.out.println("you have 10 guesses");

        int count = 2;
        for (int i = 1; i <= count; i++) {
            int randomNum = getNum(input);
            System.out.println("Your number is: " + randomNum);
            if (randomNum < random){
                System.out.println("HIGHER");
                if(i == count){
                    System.out.println("Out of guesses! You Lost!");
                }
            } else if(randomNum > random){
                System.out.println("LOWER");
                if(i == count){
                    System.out.println("Out of guesses! You Lost!");
                }
            } else if (randomNum == random){
                System.out.println("GOOD GUESS! You Won!");
                break;
            }
        }

        input.close();
    }
}
