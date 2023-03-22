package datos;

import conexion.Conexion;
import entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClienteDAO {

    /**
     * Lista a los clientes de la base de datos segun el Nit
     * @param nit_cliente El nit del cliente que se buscara
     * @return El cliente de la base de datos
     */
    public Cliente listarClientePorNit(String nit_cliente) {
        Cliente cliente = null;
        PreparedStatement pr = null;
        ResultSet rs = null;
        String query = "SELECT * FROM ControlPersonal.Cliente WHERE nit_cliente = ?;";
        try {
            pr = Conexion.connection.prepareStatement(query);
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
                pr.close();
                rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar conexiones: " + e.getMessage());
            }
        }
        return cliente;
    }

    /**
     * Inserta un cliente en la base de datos
     * @param cliente El cliente que se insertará
     * @return Un booleano que indica si la operacion fue exitosa.
     */
    public boolean insertarCliente(Cliente cliente) {
        boolean resultado = true;
        PreparedStatement pr = null;
        String query = "INSERT INTO ControlPersonal.Cliente VALUES (?, ?, ?, ?, ?, ?);";
        try {
            pr = Conexion.connection.prepareStatement(query);
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
                pr.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar conexiones: " + e.getMessage());
            }
        }
        return resultado;
    }
    
    /**
     * Actualiza los datos de nombre, correo, telefono y dpi de un cliente.
     * @param cliente El cliente con los datos nuevos
     * @return Un booleano que indica si la operacion fue exitosa
     */
    public boolean actualizarCliente(Cliente cliente) {
        boolean resultado = true;
        PreparedStatement pr = null;
        String query = "UPDATE ControlPersonal.Cliente SET nombre = ?, correo = ?, telefono = ?, dpi = ? WHERE nit_cliente = ?";
        try {
            pr = Conexion.connection.prepareStatement(query);
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
                pr.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar conexiones: " + e.getMessage());
            }
        }
        return resultado;
    }

    /**
     * Obtiene el descuento que se asignara a u cliente en la base de datos.
     * @param descuento El descuento que se asignara al cliente
     * @param nit_cliente El nit del cliente que vamos a actualizar
     * @param hayDescuento Si el descuento anterior fue usado o no
     */
    public void actualizarDescuento(int descuento, String nit_cliente, boolean hayDescuento) {
        try {
            Cliente cliente = listarClientePorNit(nit_cliente);
            int descuentoActual = 0;
            if (hayDescuento == false) {
                descuentoActual = cliente.getDescuento();
            }
            cliente.setDescuento(descuentoActual + descuento);
            actualizarDescuentoCliente(cliente);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el descuento del cliente: " + e);
        }

    }

    /**
     * Actualiza el descuento de un cliente en la base de datos.
     * @param cliente El cliene al que se le actualizara el descuento
     * @return Un booleano que indica si la operacion fue exitosa
     * @throws SQLException Error en la base de datos
     */
    public boolean actualizarDescuentoCliente(Cliente cliente) throws SQLException {
        boolean resultado = true;
        PreparedStatement pr = null;
        String query = "UPDATE ControlPersonal.Cliente SET descuento = ? WHERE nit_cliente = ?";
        pr = Conexion.connection.prepareStatement(query);
        pr.setInt(1, cliente.getDescuento());
        pr.setString(2, cliente.getNit_cliente());
        pr.executeUpdate();
        pr.close();
        return resultado;
    }
}
