import org.apache.commons.lang3.StringUtils;
import util.Input;

public class MavenExercise {

    public static void main(String[] args) {
//        String name = "jennie";
        System.out.println("Enter something: ");
        Input input = new Input();
        String phrase = input.getString();
        System.out.println("This is what you entered: " + phrase);
        System.out.println(StringUtils.isNumeric(phrase) + ": " + phrase + " is not a number");
        System.out.println("Flipped Case: " + StringUtils.swapCase(phrase));
        System.out.println("Reversed: " + StringUtils.reverse(phrase));
    }
}
