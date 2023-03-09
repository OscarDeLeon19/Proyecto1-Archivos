package datos;

import conexion.Conexion;
import entidades.Producto;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProductoDAO {

    Conexion conexion = new Conexion();

    public ArrayList<Producto> listarProductosPorTienda(int id_tienda) {
        ArrayList<Producto> productos = new ArrayList<>();
        Connection con = conexion.getConnection();
        PreparedStatement pr = null;
        ResultSet rs = null;
        String query = "SELECT * FROM ControlEmpresa.Producto WHERE id_tienda = ? ORDER BY id_producto ASC;";
        try {
            pr = con.prepareStatement(query);
            pr.setInt(1, id_tienda);
            rs = pr.executeQuery();
            while (rs.next()) {
                Producto nuevo = new Producto();
                nuevo.setId_producto(rs.getInt(1));
                nuevo.setNombre(rs.getString(2));
                nuevo.setFabricante(rs.getString(3));
                nuevo.setCodigo(rs.getString(4));
                nuevo.setPrecio(rs.getDouble(5));
                nuevo.setCantidad(rs.getInt(6));
                nuevo.setId_tienda(rs.getInt(7));
                productos.add(nuevo);
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
        return productos;
    }
    
    public Producto listarProductosPorId(int id_producto) {
        Producto producto = null;
        Connection con = conexion.getConnection();
        PreparedStatement pr = null;
        ResultSet rs = null;
        String query = "SELECT * FROM ControlEmpresa.Producto WHERE id_producto = ?;";
        try {
            pr = con.prepareStatement(query);
            pr.setInt(1, id_producto);
            rs = pr.executeQuery();
            while (rs.next()) {
                producto = new Producto();
                producto.setId_producto(rs.getInt(1));
                producto.setNombre(rs.getString(2));
                producto.setFabricante(rs.getString(3));
                producto.setCodigo(rs.getString(4));
                producto.setPrecio(rs.getDouble(5));
                producto.setCantidad(rs.getInt(6));
                producto.setId_tienda(rs.getInt(7));
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
        return producto;
    }
}
