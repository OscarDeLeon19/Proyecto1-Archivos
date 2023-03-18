package main;

import conexion.Conexion;
import java.sql.Connection;
import ventanas.Login;

public class Main {

    /**
     * Inicia la ventana de login
     * @param args 
     */
    public static void main(String[] args) {
        Login log = new Login();
        log.setVisible(true);
    }
    
}
