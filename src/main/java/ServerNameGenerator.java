import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Random;

public class ServerNameGenerator {

    public static String getRandom(String[] array) {
        Random randomArrayIndex = new Random();
        int index = randomArrayIndex.nextInt(array.length);
        return array[index];

    }

    public static void main(String[] args) {
        String [] adjectives = {"bright", "lovely", "blue", "dull", "great", "boring", "red", "big", "small", "noisy"};
        String [] nouns = {"ball", "car", "soda", "friend", "cup", "toy", "computer", "house", "dog", "cat"};
        System.out.println("Server name is: ");
        System.out.println(getRandom(adjectives) + "-" + getRandom(nouns));
//        System.out.println(getRandom(nouns));

//        System.out.println(nouns.length);
    }

}
