
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
@WebServlet(urlPatterns = {"/Operator"})
public class Operator extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String operator = " ";
        int i = Integer.parseInt(req.getParameter("t1"));
        int j = Integer.parseInt(req.getParameter("t2"));
        operator = req.getParameter("operator");
        int k = 0;
        if (operator.contains("+")) {
            k = i + j;
        } else if (operator.contains("-")) {
            k = i - j;
        } else if (operator.contains("*")) {
            k = i * j;
        } else if (operator.contains("/")) {
            k = i / j;
        }
            
        try (PrintWriter out = res.getWriter()) {
            out.println(k);
            /*
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + k + "</h1>");
            out.println("</body>");
            out.println("</html>");
           // out.println(k);
             */
        }

    }

}
