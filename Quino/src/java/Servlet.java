
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;

/**
 *
 * @author snorr
 */
@WebServlet(urlPatterns = {"/Print"})
public class Servlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

        List oneList = new List();
        ArrayList<Info> list = oneList.getArraylist();

        try (PrintWriter out = res.getWriter()) {
            
            out.println("TV Shows: \n");
            for (Info tvshow : list) {
                if (tvshow instanceof TVShow) {
                    String title = tvshow.getTitle();
                    String genre = tvshow.getGenre();
                    int rating = tvshow.getRating();
                    int duration = tvshow.getDuration();
                    int seasons = ((TVShow) tvshow).getSeasons();
                    int episodes = ((TVShow) tvshow).getEpisodes();
                    boolean stillrunning = ((TVShow) tvshow).getStillrunning();

                    out.println("Title: " + title);
                    out.println("Genre: " + genre);
                    out.println("Rating: " + rating);
                    out.println("Duration: " + duration);
                    out.println("Number of seasons: " + seasons);
                    out.println("Number of episodes: " + episodes);
                    if (stillrunning) {
                        out.println("Is still running" + "\n");
                    } else if (stillrunning == false) {
                        out.println("Is not running anymore" + "\n \n");
                    }
                }
            }
            out.println("Movies: \n");
            for (Info movie : list) {
                if (movie instanceof Movie) {
                    String title2 = movie.getTitle();
                    String genre2 = movie.getGenre();
                    int rating2 = movie.getRating();
                    int duration2 = movie.getDuration();

                    out.println("Title: " + title2);
                    out.println("Genre: " + genre2);
                    out.println("Rating: " + rating2);
                    out.println("Duration: " + duration2 + "\n");
                }
            }
        }

    }
}
