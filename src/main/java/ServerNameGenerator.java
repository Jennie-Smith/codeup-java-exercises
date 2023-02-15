import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Random;

public class ServerNameGenerator {
//      lecture examples
//    private static Random random = new Random();

    public static String getRandom(String[] array) {
        Random randomArrayIndex = new Random();
        int index = randomArrayIndex.nextInt(array.length);
        return array[index];
    }
//    lecture examples
//    public static String getRandom(String[] array) {
//        int newRandom = random.nextInt(array.length);
//        return array[newRandom];
//        Random randomArrayIndex = new Random();
//        int index = randomArrayIndex.nextInt(array.length);
//        return array[index];
//    }

//    private static String [] noun = {
//            "ball", "car", "soda", "friend", "cup", "toy", "computer", "house", "dog", "cat"
//    };
//    private static String [] adjectives = {
//            "bright", "lovely", "blue", "dull", "great", "boring", "red", "big", "small", "noisy"
//    };

    public static void main(String[] args) {
        String [] adjectives = {"bright", "lovely", "blue", "dull", "great", "boring", "red", "big", "small", "noisy"};
        String [] nouns = {"ball", "car", "soda", "friend", "cup", "toy", "computer", "house", "dog", "cat"};
        System.out.println("Server name is: ");

//        lecture examples:
//        System.out.println(getRandom(noun));
//        System.out.println(getRandom(adjectives));

        System.out.println(getRandom(adjectives) + "-" + getRandom(nouns));

    }

}
