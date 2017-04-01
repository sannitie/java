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
     * For each-loop.
     */
    public void printTVList() {
        for (TVShow tvshow : tvlist) {
            tvshow.printInfo();
            System.out.println("");
        }
        System.out.println("");
    }

    /**
     * For each-loop.
     */
    public void printMovieList() {
        for (Movie movie : movielist) {
            movie.printInfo();
            System.out.println("");
        }
        System.out.println("");
    }
}
