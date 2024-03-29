package Filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.time.LocalDateTime;

public class MyFirstFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("request received -" + LocalDateTime.now());
        chain.doFilter(request,response); // передай req resp следующему фильтру

    }
}
