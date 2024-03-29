package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String USER = "postgres";
    private static final String PASSWORD = "af5435269xdB";
    private static final String PATH = "jdbc:postgresql://localhost:5432/proyecto1_archivos";
    public static Connection connection = null;

    /**
     * Crea la conexion con la base de Datos
     *
     */
    public void iniciarConexion() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(PATH, USER, PASSWORD);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion: " + e.toString());
        }
    }
}
