package datos;

import conexion.Conexion;
import entidades.Tienda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TiendaDAO {

    /**
     * Lista las tiendas que se encuetran en la base de datos
     * @return La lista de tiendas
     */
    public ArrayList<Tienda> listarTiendas() {
        ArrayList<Tienda> empleados = new ArrayList<>();
        Connection con = Conexion.getConnection();
        PreparedStatement pr = null;
        ResultSet rs = null;
        String query = "SELECT * FROM ControlEmpresa.Tienda;";
        try {
            pr = con.prepareStatement(query);
            rs = pr.executeQuery();
            while (rs.next()) {
                Tienda nuevo = new Tienda();
                nuevo.setId_tienda(rs.getInt(1));
                nuevo.setNombre(rs.getString(2));
                nuevo.setDireccion(rs.getString(3));
                nuevo.setTelefono(rs.getString(4));
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
     * Lista una tienda de la base de datos segun su codigo
     *
     * @param id_tienda El identificador de la tienda
     * @return La tienda de la base de datos.
     */
    public Tienda listarTiendaPorCodigo(int id_tienda) {
        Tienda tienda = null;
        Connection con = Conexion.getConnection();
        PreparedStatement pr = null;
        ResultSet rs = null;
        String query = "SELECT * FROM ControlEmpresa.Tienda WHERE id_tienda = ?;";
        try {
            pr = con.prepareStatement(query);
            pr.setInt(1, id_tienda);
            rs = pr.executeQuery();
            while (rs.next()) {
                tienda = new Tienda();
                tienda.setId_tienda(rs.getInt(1));
                tienda.setNombre(rs.getString(2));
                tienda.setDireccion(rs.getString(3));
                tienda.setTelefono(rs.getString(4));
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
        return tienda;
    }
}
