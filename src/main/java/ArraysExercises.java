import java.util.Arrays;

import util.Input;

import static java.util.Arrays.copyOf;

public class ArraysExercises {

    public static Person[] addPerson(Person[] myArray, Person newperson){
        Person [] newPeople = Arrays.copyOf(myArray, myArray.length+1 );
        newPeople[newPeople.length -1] = newperson;
        return newPeople;
    }
//     lecture example below
//    public static Person [] addPerson(Person[] people, Person newPerson){
//            Person [] newArray = Arrays.copyOf(people, people.length + 1);
//            newArray[newArray.length - 1] = newPerson;
//            return newArray;
//    }
//    functions public, variables private

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        Input arrayInput = new Input();
        Person [] people = new Person[3];
        people[0] = new Person("Bob");
        people[1] = new Person("Jane");
        people[2] = new Person("Sal");
        System.out.println(Arrays.toString(people));
        System.out.println(people[1]);

        for(Person person : people){
            System.out.println("Hey " + person.getName());
        }

        System.out.println("Enter a new name: ");
        String newName = arrayInput.getString("enter movie category");

        people = addPerson(people, new Person(newName));
        System.out.println(Arrays.toString(people));

    }


}
