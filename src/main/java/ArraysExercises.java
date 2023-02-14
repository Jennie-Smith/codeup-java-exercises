import java.util.Arrays;

import util.Input;

import static java.util.Arrays.copyOf;

public class ArraysExercises {

    public static String addPerson(Person[] myArray, Person person){
        Person [] newPeople = copyOf(myArray, myArray.length+1 );
        newPeople[newPeople.length -1] = person;
        return Arrays.toString(newPeople);
    }

//    public static String getRandom(String[] array) {
//        Random randomArrayIndex = new Random();
//        int index = randomArrayIndex.nextInt(array.length);
//        return array[index];
//
//    }

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

        System.out.println("Enter a new name: ");
        String newName = arrayInput.getString();
        System.out.println(addPerson(people, new Person(newName)));
//        System.out.println(newName);

    }


}
