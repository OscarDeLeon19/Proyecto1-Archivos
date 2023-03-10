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

    public Cliente listarClientePorCodigo(String nit_cliente) {
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
            int u = pr.executeUpdate();
            System.out.println("U: " + u);
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
        System.out.println("resut: " + resultado);    
        return resultado;
    }
}
