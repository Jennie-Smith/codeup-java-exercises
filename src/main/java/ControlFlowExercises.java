import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        do {
//            System.out.printf("%d ", i);
//            i += 1;
//        } while (i <= 15);

//        int y = 0;
//        do {
//            System.out.printf("%d%n", y);
//            y += 2;
//        } while (y <= 100);

//        int y = 100;
//        do {
//            System.out.printf("%d%n", y);
//            y -= 5;
//        } while (y >= -10);

//        long y = 2;
//        do {
//            System.out.printf("%d%n", y);
//            y *= y;
//        } while (y <= 65536);

//        for (int i = 5; i <= 15; i++) {
//            System.out.printf("%d ", i);
//        }

//        for (int i = 0; i <= 100; i+=2) {
//            System.out.printf("%d%n", i);
//        }

//        for (int i = 100; i >= -10; i-=5) {
//            System.out.printf("%d%n", i);
//        }

//        for (long i = 2; i < 1000000; i*=i) {
//            System.out.printf("%d%n", i);
//        }

//        int i = 0;
//        do {
//            System.out.printf("%d%n", i);
//            i += 1;
//        } while (i <= 100);

//        for (int i = 1; i < 100; i++) {
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            } else if(i % 3 == 0){
//                System.out.println("Fizz");
//            } else if(i % 5 == 0){
//                System.out.println("Buzz");
//            } else{
//                System.out.printf("%d%n", i);
//            }
//        }

        Scanner input = new Scanner(System.in);
//        do {
//            System.out.println("What number would you like to go up to?");
//            int myNumber = input.nextInt();
//            System.out.printf("number | squared | cubed%n" +
//                    "------ | ------- | -----%n");
//            for (int i = 1; i <= myNumber; i++) {
//                int firstCol = i;
//                int squared = i * i;
//                int cubed = i * i * i;
//                System.out.printf("%-6d | %-7d | %-6d%n", firstCol, squared, cubed);
//            }
//            System.out.print("Continue? [y/N] ");
//            String userInput = input.next();
//            if (!userInput.equals("y")){
//                break;
//            }
//        }while(true);
        do{
            System.out.println("Enter a numerical grade 0-100: ");
            int grade = input.nextInt();

            if(grade <= 100 && grade >= 88){
                System.out.println("Grade A");
            } else if (grade <=87 && grade >=80) {
                System.out.println("Grade B");
            }else if (grade <=79 && grade >= 69) {
                System.out.println("Grade C");
            }else if (grade <= 66 && grade >= 60) {
                System.out.println("Grade D");
            }else{
                System.out.println("Grade F");
            }

            System.out.print("Continue? [y/N] ");
            String userInput = input.next();
            if (!userInput.equals("y")){
                break;
            }
        }while(true);

        input.close();


    }
}
