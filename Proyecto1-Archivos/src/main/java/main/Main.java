package main;

import conexion.Conexion;
import java.sql.Connection;
import ventanas.Login;

public class Main {

    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        conexion.iniciarConexion();
        Login log = new Login();
        log.setVisible(true);
    }
    
}
