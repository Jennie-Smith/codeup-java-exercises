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

    public static String getMovies(Movie[] movies, String category){
        for (int i = 0; i < movies.length; i++) {
            if (category.equals(movies[i].getCategory("animated"))){
                System.out.println(movies[i]);
            } else if (category.equals(movies[i].getCategory("drama"))){
                System.out.println(movies[i]);
            }else if (category.equals(movies[i].getCategory("horror"))){
                System.out.println(movies[i]);
            }else if (category.equals(movies[i].getCategory("scifi"))){
                System.out.println(movies[i]);
            }else if (category.equals("all")){
                System.out.println(movies[i]);
            }
        }
        return category;
    }

    public static String getMovies(int choice){
        switch(choice)
        {
            case 0:
                System.out.println("Exit");
                break;
            case 1:
//                get movie genre function;
                return getMovies(movies, "all");
            case 2:
//                get movie genre function;
                return getMovies(movies, "animated");
            case 3:
//                get movie genre function;
                return getMovies(movies, "drama");
            case 4:
//                get movie genre function;
                return getMovies(movies, "horror");
            case 5:
//                get movie genre function;
                return getMovies(movies, "scifi");
            default:
                System.out.println("miss");
                return "miss";
        }
          return "Bye!";
    }


    public static void main(String[] args) {
        System.out.printf(menu());
        Input input = new Input();
        movies = MoviesArray.findAll();
        String userInput = "";
        boolean done = false;
//        getMovies(movies);
        do{
            System.out.println("Enter number: ");
            int choice = input.getInt();
            System.out.println(getMovies(choice));

            System.out.print("Continue speaking to Bob? [y/N] ");
            String userInput = input.nextLine();
            if (!userInput.equals("y")){
                break;
            }
        }while(true);



    }
}
