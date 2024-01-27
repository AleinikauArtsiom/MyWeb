package Filter.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/balance")
public class Balance extends HttpServlet {
    //HashMap <String,Integer> balance = new HashMap<>();

  /*  @Override
    public void init() throws ServletException {
        balance.put("MAXIM", 15);
        balance.put("ARTI", 20);
        balance.put("IGOR", 30);
    }
 */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String [] names = {"Ar", "Bar", "bor", "tor", "spore"};
        req.setAttribute("name1", names);

        req.setAttribute("visible", req.getParameter("visible"));

/*        String name = req.getParameter("name");

        req.setAttribute("name", name);
        req.setAttribute("money", balance.get(name));
        balance?name=ARTI0*/
        getServletContext().getRequestDispatcher("/pages/balance-page.jsp").forward(req,resp);
    }
                                        //ШАБЛОНИЗАТОР (JavaServerPages)
}
