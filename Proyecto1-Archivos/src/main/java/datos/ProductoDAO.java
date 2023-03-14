package datos;

import conexion.Conexion;
import entidades.Producto;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProductoDAO {

    /**
     * Actualiza las existencias de un producto en la base de datos posteriormente a la realizacion de una venta
     * @param producto El producto al que se le actualizaran las existencias
     * @return Un boolean que indica si la operacion fue exitosa.
     */
    public boolean actualizarExistencias(Producto producto) {
        boolean resultado = true;
        Connection con = Conexion.getConnection();
        PreparedStatement pr = null;
        String query = "UPDATE ControlEmpresa.Producto SET cantidad = ? WHERE id_producto = ?";
        try {
            pr = con.prepareStatement(query);
            pr.setInt(1, producto.getCantidad());
            pr.setInt(2, producto.getId_producto());
            pr.executeUpdate();
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

    /**
     * Lista todos los productos que se encuentran en una tienda
     * @param id_tienda El id de la tienda actual
     * @return La lista de productos de la tienda
     */
    public ArrayList<Producto> listarProductosPorTienda(int id_tienda) {
        ArrayList<Producto> productos = new ArrayList<>();
        Connection con = Conexion.getConnection();
        PreparedStatement pr = null;
        ResultSet rs = null;
        String query = "SELECT * FROM ControlEmpresa.Producto WHERE id_tienda = ? AND cantidad > 0 ORDER BY id_producto ASC;";
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

    /**
     * Lista los productos segun un nombre
     * @param id_tienda El identificador de la tienda
     * @param nombre El nombre del producto
     * @return La lista de productos encontrados
     */
    public ArrayList<Producto> listarProductosPorNombre(int id_tienda, String nombre) {
        ArrayList<Producto> productos = new ArrayList<>();
        Connection con = Conexion.getConnection();
        PreparedStatement pr = null;
        ResultSet rs = null;
        String query = "SELECT * FROM ControlEmpresa.Producto WHERE nombre ILIKE '%"+nombre+"%' AND id_tienda = ? AND cantidad > 0 ORDER BY id_producto ASC;";
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
    
    /**
     * Lista un producto segun su identificador
     * @param id_producto El identificador del producto
     * @return El producto obtenido
     */
    public Producto listarProductosPorId(int id_producto) {
        Producto producto = null;
        Connection con = Conexion.getConnection();
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
