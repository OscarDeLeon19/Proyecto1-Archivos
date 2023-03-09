
package datos;

import conexion.Conexion;
import entidades.Producto;
import entidades.Tienda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class TiendaDAO {
    
    Conexion conexion = new Conexion();
    
    public Tienda listarTiendaPorCodigo(int id_tienda){
        Tienda tienda = null;
        Connection con = conexion.getConnection();
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
