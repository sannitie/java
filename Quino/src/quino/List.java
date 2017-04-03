package quino;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author snorr
 */
public class List {

    private ArrayList<TVShow> tvlist;
    private ArrayList<Movie> movielist;
    private HashMap<String, String> history;

    public List() {
        tvlist = new ArrayList<>();
        movielist = new ArrayList<>();
        history = new HashMap<>();

    }

    /**
     * Add a TVShow to the TVList.
     */
    public void addToTVList(TVShow newTVShow) {
        tvlist.add(newTVShow);
    }

    /**
     * Add a movie to the movielist.
     */
    public void addToMovieList(Movie newMovie) {
        movielist.add(newMovie);
    }

    /**
     * Prints out a list of all TV-shows and all information about each TV-show.
     */
    public void printTVList() {
        System.out.println("All TV-shows sorted by date added:");
        for (TVShow tvshow : tvlist) {
            tvshow.printInfo();
            System.out.println("");
        }
        System.out.println("");
    }

    /**
     * Prints out a list of all movies and all information about each movie.
     */
    public void printMovieList() {
        System.out.println("All movies sorted by date added:");
        for (Movie movie : movielist) {
            movie.printInfo();
            System.out.println("");
        }
        System.out.println("");
    }

    /**
     * Create objects to help simulate running the program.
     */
    public void createObjects() {

    TVShow oneTVShow = new TVShow("Scorpion", "Action, Drama", 8, 40, 3, 64, true);
    addToTVList (oneTVShow);
    TVShow twoTVShow = new TVShow("Smallville", "Adventure, Drama", 6, 40, 10, 217, false);

    addToTVList (twoTVShow);
    Movie oneMovie = new Movie("The Prestige", "Drama, Mystery, Sci-fi", 10, 130);

    addToMovieList (oneMovie);
    TVShow thrTVShow = new TVShow("Friday Night Lights", "Drama, Sport", 9, 40, 5, 73, false);

    addToTVList (thrTVShow);
    TVShow fouTVShow = new TVShow("Leverage", "Crime, Thriller", 7, 40, 5, 70, false);

    addToTVList (fouTVShow);
    Movie twoMovie = new Movie("Lucky Number Slevin", "Crime, Drama, Mystery", 8, 110);

    addToMovieList (twoMovie);
    Movie thrMovie = new Movie("The Dark Knight", "Action, Crime, Drama", 9, 152);

    addToMovieList (thrMovie);
    
    }
/**
 * Sort TVShow-list by rating. Creating a variable to momentarily hold an
 * object.
 */
}