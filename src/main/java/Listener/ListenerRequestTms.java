package Listener;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ListenerRequestTms implements ServletRequestListener {


    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("request in " );
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("request out ");
    }

}
