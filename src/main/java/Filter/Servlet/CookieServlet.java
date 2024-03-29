package Filter.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;
import java.time.LocalDateTime;

@WebServlet("/cookie-example")

public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("username", req.getParameter("cookie-key") /*"Artsiom"*/ /*LocalDateTime.now().toString()*/);
        resp.addCookie(cookie);
        Writer writer = resp.getWriter();
        writer.write("Cookie was added!");

    }
}
