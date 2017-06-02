
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author snorr
 */
@WebServlet(urlPatterns = {"/AddTVShow"})
public class AddTVShow extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

        
        String title = req.getParameter("title");
        String genre = req.getParameter("genre");
        int rating = Integer.parseInt(req.getParameter("rating"));
        int duration = Integer.parseInt(req.getParameter("duration"));
        int seasons = Integer.parseInt(req.getParameter("seasons"));
        int episodes = Integer.parseInt(req.getParameter("episodes"));
        boolean stillrunning = false;
        
        try (PrintWriter out = res.getWriter()) {

        }
    }
}
