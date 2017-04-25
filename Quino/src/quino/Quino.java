package quino;

import java.util.Date;
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
        oneList.createObjects();
        if ("date".equals(args[0])) {
            oneList.printTVList();
            oneList.printMovieList();
        } else if ("rating".equals(args[0])) {
            System.out.println("hei");
            oneTVShow.getRating;
        } else if ("history".equals(args[0])) {
            oneList.createHistoryMap();
            oneList.printHistoryMap();
        }
    }
}
