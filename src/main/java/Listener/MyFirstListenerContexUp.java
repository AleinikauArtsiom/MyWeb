package Listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

import java.time.LocalDateTime;

public class MyFirstListenerContexUp implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("!!!!!!!!!!!!!Application started Time!!!!!!!!!!!: " + LocalDateTime.now());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("!!!!!!!!!!!Applicationn closing. Time!!!!!!!!!!! " + LocalDateTime.now());
    }
}
