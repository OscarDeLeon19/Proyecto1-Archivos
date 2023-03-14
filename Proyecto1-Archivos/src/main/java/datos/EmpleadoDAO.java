package datos;

import conexion.Conexion;
import entidades.Empleado;
import java.sql.*;

public class EmpleadoDAO {

    /**
     * Obtiene los datos del empleado que ingresa al sistema.
     * @param username Username del usuario
     * @param password Contraseña del usuario
     * @return Los datos del empleado
     * @throws SQLException Error que puede surgir en la base de datos
     */
    public Empleado obtenerEmpleadoLogin(String username, String password) throws SQLException {
        Empleado empleado = null;
        Connection con = Conexion.getConnection();
        PreparedStatement pr;
        ResultSet rs;
        String query = "SELECT * FROM ControlPersonal.Empleado WHERE username = ? AND password = ?;";
        pr = con.prepareStatement(query);
        pr.setString(1, username);
        pr.setString(2, password);
        rs = pr.executeQuery();
        while (rs.next()) {
            empleado = new Empleado();
            empleado.setId_empleado(rs.getInt(1));
            empleado.setNombre(rs.getString(2));
            empleado.setTelefono(rs.getString(3));
            empleado.setRol(rs.getString(4));
            empleado.setDpi(rs.getString(5));
            empleado.setId_tienda(rs.getInt(6));
            empleado.setUsername(rs.getString(7));
            empleado.setPassword(rs.getString(8));
        }

        con.close();
        pr.close();
        rs.close();
        return empleado;
    }

}
