package movies;

import util.Input;

import java.util.Arrays;

public class LectureMoviesApplicationExample {
    private static Movie[] movies;
    private static Input input;

    public static void main(String[] args) {
//        could put two lines below into an initialization function
        movies = MoviesArray.findAll();
        input = new Input();

        // command loop
        // each iteration:
        // 1. print the menu
        // 2. wait for the user to enter a choice
        // 3. do whatever the choice is
        // until the user enters choice 0
        while(true) {
            // 1. print the menu
            printMenu();

            // 2. wait for the user to enter a choice
            int choice = input.getInt(0, 5, "Enter your choice: ");

            // 3. do whatever the choice is
            doChoice(choice);

            // until the user enters choice 0
            if(choice == 0) {
                break;
            }
        }

        System.out.println("Bye");

    }

    private static void printMenu() {
        System.out.println("""
                0 - exit
                1 - all
                2 - animated
                3 - drama
                4 - horror
                5 - scifi""");
    }

    private static void viewAllMovies(){
        for (Movie movie: movies) {
            System.out.println(movie);
//            goes to the get string method in Movie.java
        }
        System.out.println();
    }

    private static void doChoice(int choice) {
        switch(choice) {
            case 1:
                viewAllMovies();
                break;
            // ...
            case 2:
                viewMoviesByCategory("animated");
                break;
            case 3:
                viewMoviesByCategory("drama");
                break;
            case 4:
                viewMoviesByCategory("horror");
                break;
            case 5:
                viewMoviesByCategory("scifi");
                break;
//            case 6:
//                Input.getString();
//                addMovie();
//                break;
        }
    }

    private static void viewMoviesByCategory(String category){
        for (Movie movie: movies) {
            if(movie.getCategory().equals(category)){
                System.out.println(movie);
            }
        }
        System.out.println();
    }

//    public static void addMovie(){
//        String movieName = input.getString("enter movie name");
//        String movieCategory = input.getString("enter movie category");
//        Movie movie = new Movie(movieName, movieCategory);
//        movies = Arrays.copyOf(movies, movies.length + 1);
//        movies[movies.length -1 ] = movies;
//    }
}
