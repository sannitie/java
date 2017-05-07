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
     * Add the current date and time to the key in the history map. Add a TVShow
     * or movie to the value in the history map.
     */
    public void addToHistoryMap(Info newInfo) {
        Date date = new Date(System.currentTimeMillis());
        historyMap.put(date, newInfo);
    }

    /**
     * Prints out a list of all TV-shows and all information about each TV-show.
     */
    public void printTVList() {
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
     * Create objects to help simulate running the program. CREATE A LOOP THAT
     * ADDS EACH OBJECT TO THEIR RESPECTIVE LIST AND ALSO ADDS EACH OBJECT TO
     * THE HISTORY MAP.
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
     * A loop that sorts all the TV shows by rating (descending) and calls the
     * printTVList to print out all the TV shows in the ArrayList tvlist.
     */
    public void sortTVShowByRatingAndPrint() {
        ArrayList<TVShow> templist = new ArrayList<>();
        TVShow temp = tvlist.get(0);
        int i = 0;
        while (tvlist.size() > 1) {
            if (tvlist.get(i).getRating() > temp.getRating()) {
                temp = tvlist.get(i);
            }
            i++;
            if (i > tvlist.size() - 1) {
                i = 0;
                templist.add(temp);
                tvlist.remove(temp);

                temp = tvlist.get(0);
            }
        }
        templist.add(temp);
        tvlist = (ArrayList<TVShow>) templist.clone();
        System.out.println("All TV-shows sorted by rating:");
        System.out.println("");
        printTVList();
    }

    /**
     * A loop that sorts all the movies by rating (descending) and calls the
     * printMovieList to print out all the movies in the ArrayList movielist.
     */
    public void sortMovieByRatingAndPrint() {
        ArrayList<Movie> templist = new ArrayList<>();
        Movie temp = movielist.get(0);
        int i = 0;
        while (movielist.size() > 1) {
            if (movielist.get(i).getRating() > temp.getRating()) {
                temp = movielist.get(i);
            }
            i++;
            if (i > movielist.size() - 1) {
                i = 0;
                templist.add(temp);
                movielist.remove(temp);

                temp = movielist.get(0);
            }
        }
        templist.add(temp);
        movielist = (ArrayList<Movie>) templist.clone();
        System.out.println("All movies sorted by rating:");
        System.out.println("");
        printMovieList();
    }

    // Sorting both TV shows and movies by rating.
    public void sortByRatingAndPrint() {
        sortTVShowByRatingAndPrint();
        sortMovieByRatingAndPrint();
    }

    /**
     * Search for a TV show in the array list tvlist.
     * @param wanted The title you want to search for.
     */
    public void searchForTVShow(String wanted) {
        int i = 0;
        boolean found = false;
        String plustospace = "";
        String spacetoplus = "";
        Iterator<TVShow> it = tvlist.iterator();
        while (it.hasNext() && !found) {
            plustospace = tvlist.get(i).getTitle().replace(' ', '+');
            if (plustospace.equalsIgnoreCase(wanted)) {
                found = true;
            }
            i++;
            it.next();
        }
        spacetoplus = plustospace.replace('+', ' ');
        System.out.println(spacetoplus + " is in the list.");
    }

    /**
     * Search for a movie in the array list movielist.
     * @param wanted The title you want to search for.
     */
    public void searchForMovie(String wanted) {
        int i = 0;
        boolean found = false;
        String plustospace = "";
        String spacetoplus = "";
        Iterator<Movie> it = movielist.iterator();
        while (it.hasNext() && !found) {
            plustospace = movielist.get(i).getTitle().replace(' ', '+');
            if (plustospace.equalsIgnoreCase(wanted)) {
                found = true;
            }
            i++;
            it.next();
        }
        spacetoplus = plustospace.replace('+', ' ');
        if (wanted.equals(spacetoplus)) {
            System.out.println(spacetoplus + " is in the list.");
        } else {
            System.err.println("Error!");
        }
    }
}
