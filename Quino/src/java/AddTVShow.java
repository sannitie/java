
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

        
        try (PrintWriter out = res.getWriter()) {

        }
    }
}
