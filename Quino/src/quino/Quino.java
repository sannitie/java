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

        if ("date".equals(args[0])) {
            List oneList = new List();
            oneList.createObjects();
            oneList.printTVList();
            oneList.printMovieList();
        } else if ("rating".equals(args[0])) {
            List oneList = new List();

        }
    }
}
