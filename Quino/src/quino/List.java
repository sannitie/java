package quino;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Date;

/**
 *
 * @author snorr
 */
public class List {

    private ArrayList<TVShow> tvlist;
    private ArrayList<Movie> movielist;
    private HashMap<Date, Info> historyMap;

    public List() {
        tvlist = new ArrayList<>();
        movielist = new ArrayList<>();
        historyMap = new HashMap<>();

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
     * Add the current date and time to the key in the history map.
     * Add a TVShow or movie to the value in the history map.
     */
    public void addToHistoryMap(Info newInfo) {
        Date date = new Date(System.currentTimeMillis());
        historyMap.put(date, newInfo);
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
     * Prints out the historymap.
     */
    public void printHistoryMap() {
        int index = 1;
        for (Iterator it = historyMap.entrySet().iterator(); it.hasNext();) {
            Map.Entry map = (Map.Entry) it.next();
            System.out.print(index + ": Date added: " + map.getKey());
            Info x = (Info) map.getValue();
            System.out.println(" - " + x.getTitle());
            index++;
        }
    }

    /**
     * Create objects to help simulate running the program.
     * CREATE A LOOP THAT ADDS EACH OBJECT TO THEIR RESPECTIVE LIST AND ALSO ADDS EACH
     * OBJECT TO THE HISTORY MAP.
     */
    public void createObjects() {

        TVShow oneTVShow = new TVShow("Scorpion", "Action, Drama", 8, 40, 3, 64, true);
        addToTVList(oneTVShow);
        addToHistoryMap(oneTVShow);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        TVShow twoTVShow = new TVShow("Smallville", "Adventure, Drama", 6, 40, 10, 217, false);
        addToTVList(twoTVShow);
        addToHistoryMap(twoTVShow);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        Movie oneMovie = new Movie("The Prestige", "Drama, Mystery, Sci-fi", 10, 130);
        addToMovieList(oneMovie);
        addToHistoryMap(oneMovie);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        TVShow thrTVShow = new TVShow("Friday Night Lights", "Drama, Sport", 9, 40, 5, 73, false);
        addToTVList(thrTVShow);
        addToHistoryMap(thrTVShow);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        TVShow fouTVShow = new TVShow("Leverage", "Crime, Thriller", 7, 40, 5, 70, false);
        addToTVList(fouTVShow);
        addToHistoryMap(fouTVShow);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        Movie twoMovie = new Movie("Lucky Number Slevin", "Crime, Drama, Mystery", 8, 110);
        addToMovieList(twoMovie);
        addToHistoryMap(twoMovie);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        Movie thrMovie = new Movie("The Dark Knight", "Action, Crime, Drama", 9, 152);
        addToMovieList(thrMovie);
        addToHistoryMap(thrMovie);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

    }

    /**
     * Sort TVShow-list by rating. Creating a variable to momentarily hold an
     * object.
     */
    public void sortTVShowByRating() {

    }

    /**
     * Ceate a hashmap that stores information about when TV-shows and movies
     * were added to the lists.
     */
    public void createHistoryMap() {

    }
}
