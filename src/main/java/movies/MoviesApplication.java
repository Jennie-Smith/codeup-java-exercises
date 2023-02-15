package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    private static Movie [] movies;

    private static String menu(){
        String menu = "What would you like to do?%n" +
                "0 - exit%n" +
                "1 - view all movies%n" +
                "2 - view movies in animated category%n" +
                "3 - view movies in the drama category%n" +
                "4 - view movies in the horror category%n" +
                "5 - view movies in teh sci-fi category%n";
        return menu;
    }

    public static void getMovies(String category){
        for (Movie movie: movies) {
            if(movie.getCategory().equals(category)){
                System.out.println(movie);
            }
        }
    }


    public static String getChoice(int choice){
        switch(choice)
        {
            case 1:
//                get movie genre function;
                getMovies("all");
                break;
            case 2:
//                get movie genre function;
                getMovies("animated");
                break;
            case 3:
//                get movie genre function;
                getMovies("drama");
                break;
            case 4:
//                get movie genre function;
                getMovies("horror");
                break;
            case 5:
//                get movie genre function;
                getMovies("scifi");
                break;
            default:
                System.out.println("miss");
                break;
        }
        return "yay";
    }


    public static void main(String[] args) {
//        System.out.printf(menu());
        Input input = new Input();
        movies = MoviesArray.findAll();
        String userInput = "";
        boolean done = true;
//        getMovies(movies);
        do{
            System.out.printf(menu());
            System.out.println("Enter number: ");
            int choice = input.getInt();
            if (choice == 0){
                System.out.println("Bye Bye!");
                break;
            }
            System.out.println(getChoice(choice));



        }while(done);



    }
}
