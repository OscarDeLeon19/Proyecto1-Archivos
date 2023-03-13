package datos;

import conexion.Conexion;
import entidades.Cliente;
import entidades.Tienda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClienteDAO {

    Conexion conexion = new Conexion();

    public Cliente listarClientePorNit(String nit_cliente) {
        Cliente cliente = null;
        Connection con = conexion.getConnection();
        PreparedStatement pr = null;
        ResultSet rs = null;
        String query = "SELECT * FROM ControlPersonal.Cliente WHERE nit_cliente = ?;";
        try {
            pr = con.prepareStatement(query);
            pr.setString(1, nit_cliente);
            rs = pr.executeQuery();
            while (rs.next()) {
                cliente = new Cliente();
                cliente.setNit_cliente(rs.getString(1));
                cliente.setNombre(rs.getString(2));
                cliente.setCorreo(rs.getString(3));
                cliente.setTelefono(rs.getString(4));
                cliente.setDpi(rs.getString(5));
                cliente.setDescuento(rs.getInt(6));
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
        return cliente;
    }

    public boolean insertarCliente(Cliente cliente) {
        boolean resultado = true;
        Connection con = conexion.getConnection();
        PreparedStatement pr = null;
        String query = "INSERT INTO ControlPersonal.Cliente VALUES (?, ?, ?, ?, ?, ?);";
        try {
            pr = con.prepareStatement(query);
            pr.setString(1, cliente.getNit_cliente());
            pr.setString(2, cliente.getNombre());
            pr.setString(3, cliente.getCorreo());
            pr.setString(4, cliente.getTelefono());
            pr.setString(5, cliente.getDpi());
            pr.setInt(6, 0);
            pr.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente registrado correctamente");
        } catch (SQLException e) {
            resultado = false;
            JOptionPane.showMessageDialog(null, "Error al ingresar cliente: " + e.getMessage());
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
    
    public boolean actualizarCliente(Cliente cliente){
        boolean resultado = true;
        Connection con = conexion.getConnection();
        PreparedStatement pr = null;
        String query = "UPDATE ControlPersonal.Cliente SET nombre = ?, correo = ?, telefono = ?, dpi = ? WHERE nit_cliente = ?";
        try {
            pr = con.prepareStatement(query);
            pr.setString(1, cliente.getNombre());
            pr.setString(2, cliente.getCorreo());
            pr.setString(3, cliente.getTelefono());
            pr.setString(4, cliente.getDpi());
            pr.setString(5, cliente.getNit_cliente());
            pr.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente actualizado correctamente");
        } catch (SQLException e) {
            resultado = false;
            JOptionPane.showMessageDialog(null, "Error al actualizar cliente: " + e.getMessage());
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
}
