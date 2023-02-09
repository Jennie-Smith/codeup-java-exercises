import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Say something to Bob!");
            String myPhrase = input.nextLine();
            myPhrase = myPhrase.replaceAll(" ","");
            if(myPhrase.endsWith("?")){
                System.out.println("Bob: Sure");
            } else if(myPhrase.endsWith("!")){
                System.out.println("Bob: Whoa, chill out!");
            } else if (myPhrase.equals("")) {
                System.out.println("Bob: Fine. Be that Way!");
            } else {
                System.out.println("Bob: Whatever.");
            }
            System.out.print("Continue speaking to Bob? [y/N] ");
            String userInput = input.nextLine();
            if (!userInput.equals("y")){
                break;
            }

        }while(true);

        input.close();
    }
}
