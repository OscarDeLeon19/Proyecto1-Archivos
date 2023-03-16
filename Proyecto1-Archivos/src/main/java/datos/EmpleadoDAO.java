package datos;

import conexion.Conexion;
import entidades.Empleado;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EmpleadoDAO {

    public boolean actualizarEmpleado(Empleado empleado) {
        boolean resultado = true;
        Connection con = Conexion.getConnection();
        PreparedStatement pr = null;
        String query = "UPDATE ControlPersonal.Empleado SET nombre = ?, telefono = ?, rol = ?, dpi = ?, id_tienda = ? WHERE id_empleado = ?";
        try {
            pr = con.prepareStatement(query);
            pr.setString(1, empleado.getNombre());
            pr.setString(2, empleado.getTelefono());
            pr.setString(3, empleado.getRol());
            pr.setString(4, empleado.getDpi());
            pr.setInt(5, empleado.getId_tienda());
            pr.setInt(6, empleado.getId_empleado());
            pr.executeUpdate();
        } catch (SQLException e) {
            resultado = false;
            JOptionPane.showMessageDialog(null, "Error al ingresar empleado: " + e.getMessage());
        } finally {
            try {
                con.close();
                pr.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar conexiones: " + e.getMessage());
            }
        }
        return resultado;
    }

    public boolean insertarEmpleado(Empleado empleado) {
        boolean resultado = true;
        Connection con = Conexion.getConnection();
        PreparedStatement pr = null;
        String query = "INSERT INTO ControlPersonal.Empleado (nombre, telefono, rol, dpi, id_tienda, username, password) VALUES (?, ?, ?, ?, ?, ?, ?);";
        try {
            pr = con.prepareStatement(query);
            pr.setString(1, empleado.getNombre());
            pr.setString(2, empleado.getTelefono());
            pr.setString(3, empleado.getRol());
            pr.setString(4, empleado.getDpi());
            pr.setInt(5, empleado.getId_tienda());
            pr.setString(6, empleado.getUsername());
            pr.setString(7, empleado.getPassword());
            pr.executeUpdate();
            JOptionPane.showMessageDialog(null, "Empleado registrado correctamente");
        } catch (SQLException e) {
            resultado = false;
            JOptionPane.showMessageDialog(null, "Error al ingresar empleado: " + e.getMessage());
        } finally {
            try {
                con.close();
                pr.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar conexiones: " + e.getMessage());
            }
        }
        return resultado;
    }

    public Empleado obtenerEmpleadoPorId(int id_empleado) {
        Empleado empleado = null;
        Connection con = Conexion.getConnection();
        PreparedStatement pr = null;
        ResultSet rs = null;
        String query = "SELECT * FROM ControlPersonal.Empleado WHERE Id_empleado = ?";
        try {
            pr = con.prepareStatement(query);
            pr.setInt(1, id_empleado);
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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al hacer busqueda en base de datos: " + e.getMessage());
        } finally {
            try {
                con.close();
                pr.close();
                rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar conexiones: " + e.getMessage());
            }
        }
        return empleado;
    }

    public ArrayList<Empleado> listarEmpleadosPorNombre(String nombre) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Connection con = Conexion.getConnection();
        PreparedStatement pr = null;
        ResultSet rs = null;
        String query = "SELECT e.Id_empleado, e.Nombre, e.Telefono, e.Rol, e.Dpi, t.Nombre\n"
                + "	FROM ControlPersonal.Empleado e JOIN ControlEmpresa.Tienda t\n"
                + "	ON e.Id_tienda = t.Id_tienda WHERE e.Nombre ILIKE '%" + nombre + "%' ORDER BY e.Id_empleado ASC;";
        try {
            pr = con.prepareStatement(query);
            rs = pr.executeQuery();
            while (rs.next()) {
                Empleado nuevo = new Empleado();
                nuevo.setId_empleado(rs.getInt(1));
                nuevo.setNombre(rs.getString(2));
                nuevo.setTelefono(rs.getString(3));
                nuevo.setRol(rs.getString(4));
                nuevo.setDpi(rs.getString(5));
                nuevo.setNombre_tienda(rs.getString(6));
                empleados.add(nuevo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al hacer busqueda en base de datos: " + e.getMessage());
        } finally {
            try {
                con.close();
                pr.close();
                rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar conexiones: " + e.getMessage());
            }
        }
        return empleados;
    }

    public ArrayList<Empleado> listarEmpleados() {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Connection con = Conexion.getConnection();
        PreparedStatement pr = null;
        ResultSet rs = null;
        String query = "SELECT e.Id_empleado, e.Nombre, e.Telefono, e.Rol, e.Dpi, t.Nombre\n"
                + "	FROM ControlPersonal.Empleado e JOIN ControlEmpresa.Tienda t\n"
                + "	ON e.Id_tienda = t.Id_tienda ORDER BY e.Id_empleado ASC;";
        try {
            pr = con.prepareStatement(query);
            rs = pr.executeQuery();
            while (rs.next()) {
                Empleado nuevo = new Empleado();
                nuevo.setId_empleado(rs.getInt(1));
                nuevo.setNombre(rs.getString(2));
                nuevo.setTelefono(rs.getString(3));
                nuevo.setRol(rs.getString(4));
                nuevo.setDpi(rs.getString(5));
                nuevo.setNombre_tienda(rs.getString(6));
                empleados.add(nuevo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al hacer busqueda en base de datos: " + e.getMessage());
        } finally {
            try {
                con.close();
                pr.close();
                rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar conexiones: " + e.getMessage());
            }
        }
        return empleados;
    }

    /**
     * Obtiene los datos del empleado que ingresa al sistema.
     *
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
