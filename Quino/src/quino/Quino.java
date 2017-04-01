package quino;

/**
 *
 * @author snorr
 */
public class Quino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List oneList = new List();
        TVShow oneTVShow = new TVShow(3, 64, "Scorpion", "Action, Drama", 9, 40);
        TVShow twoTVShow = new TVShow(10, 217, "Smallville", "Adventure, Drama", 8, 40);
        Movie oneMovie = new Movie("The Prestige", "Drama, Mystery, Sci-fi", 10, 130);
        oneList.addToTVList(oneTVShow);
        oneList.addToTVList(twoTVShow);
        oneList.addToMovieList(oneMovie);
        oneList.printTVList();
        oneList.printMovieList();
    }

}
