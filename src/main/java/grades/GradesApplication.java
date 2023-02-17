package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        Input input = new Input();
        Student Jade = new Student("Jade");
        Jade.addGrade(90);
        Jade.addGrade(80);
        Jade.addGrade(50);
        System.out.println(Jade);
        Student Ned = new Student("Ned");
        Ned.addGrade(60);
        Ned.addGrade(56);
        Ned.addGrade(50);
        System.out.println(Ned);
        Student Luke = new Student("Luke");
        Luke.addGrade(80);
        Luke.addGrade(70);
        Luke.addGrade(45);
        System.out.println(Luke);
        Student Mary = new Student("Mary");
        Mary.addGrade(90);
        Mary.addGrade(98);
        Mary.addGrade(87);
        System.out.println(Mary);
        HashMap<String, Student> students = new HashMap<>();
        students.put("jade05", Jade);
        students.put("nedder", Ned);
        students.put("link64", Luke);
        students.put("34Mady", Mary);
        System.out.println(students);
//        It should have keys that are strings that represent github usernames,
//        and values that are Student objects.
//        Create at least 4 Student objects with at least 3 grades each,
//        and add them to the map.
        boolean done = true;
        do{
            System.out.println("""
                    Welcome!
                    Here are the GitHub usernames of our students:
                    [jade05] [nedder] [link64] [34Mady]
                    What student would you like to see more information on?""");
            String userInput = input.getString();
            if(userInput.equals("jade05")){
                System.out.println(students.get(userInput));
            } else if (userInput.equals("nedder")) {
                System.out.println(students.get(userInput));
            } else if (userInput.equals("link64")) {
                System.out.println(students.get(userInput));
            } else if (userInput.equals("34Mady")) {
                System.out.println(students.get(userInput));
            } else {
                System.out.println("Sorry, student not found for " + userInput);
            }

            System.out.println("Would you like another Student? [y/N]");
            String choice = input.getString();
            if(!choice.equals("y")){
                done = false;
                System.out.println("Bye!");
            }
        }while(done);

    }
}
