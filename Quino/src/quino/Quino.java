package quino;

/**
 *
 * @author snorr
 */
public class Quino {

    /**
     * @param args the command line arguments
     * Available parameters are:
     * "date": Prints out both array lists in the original order.
     * "rating": Prints out both array lists sorted by rating.
     * "history": Prints out the hash map showing what dates each object was added
     * to their respective lists.
     * "tvsearch" checks if a TV show is in the array list tvlist. This needs
     * another parameter that you want to search for.
     * "moviesearch" checks if a movie is in the array list movielist. This needs
     * another parameter that you want to search for.
     */
    public static void main(String[] args) {
        List oneList = new List();
        oneList.createObjects();
        if ("date".equals(args[0])) {
            oneList.printTVList();
            oneList.printMovieList();
        } else if ("rating".equals(args[0])) {
            oneList.sortByRatingAndPrint();
        } else if ("history".equals(args[0])) {
            oneList.printHistoryMap();
        } else if ("tvsearch".equals(args[0])) {
            oneList.searchForTVShow(args[1]);
        } else if ("moviesearch".equals(args[0])) {
            oneList.searchForMovie(args[1]);
        }
    }
}
