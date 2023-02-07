import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %4.2f.%n", pi);

        Scanner input = new Scanner(System.in);

//        System.out.println("Enter number: ");
//        int numberInput = input.nextInt();
//        System.out.println("Your number is: " + numberInput);

//        System.out.println("Enter three words: ");
//        String aName = input.nextLine();
//        String bName = input.nextLine();
//        String cName = input.nextLine();
//        System.out.println("Your words are: " + aName + " " + bName + " " + cName + ".");

//        System.out.println("Enter a sentence: ");
//        String sentence = input.nextLine();
//        System.out.println(sentence);
        System.out.println("Enter Length of room: ");
        int length = input.nextInt();
        System.out.println("Enter Width of room: ");
        int width = input.nextInt();
        int area = (length * 2) + (width * 2);
        System.out.println("The area of the room is: " + area);



        input.close();
    }
}
