package datos;

import conexion.Conexion;
import entidades.Producto;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProductoDAO {

    /**
     * Elimina un producto de la base de datos
     * @param producto El producto que se eliminará
     * @return Un booleano que indica si la operacion fue exitosa
     */
    public boolean eliminarProducto(Producto producto) {
        boolean resultado = true;
        Connection con = Conexion.getConnection();
        PreparedStatement pr = null;
        String query = "DELETE FROM ControlEmpresa.Producto WHERE id_producto = ?";
        try {
            pr = con.prepareStatement(query);
            pr.setInt(1, producto.getId_producto());
            pr.executeUpdate();
        } catch (SQLException e) {
            resultado = false;
            JOptionPane.showMessageDialog(null, "Error al borrar producto: " + e.getMessage());
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
     * Actualiza la informacion del producto de una base de datos
     * @param producto El producto que se actualizará
     * @return Un booleano que indica si la operacion fue exitosa
     */
    public boolean actualizarProducto(Producto producto) {
        boolean resultado = true;
        Connection con = Conexion.getConnection();
        PreparedStatement pr = null;
        String query = "UPDATE ControlEmpresa.Producto SET nombre = ?, fabricante = ?, codigo = ?, precio = ?, cantidad = ? WHERE id_producto = ?";
        try {
            pr = con.prepareStatement(query);
            pr.setString(1, producto.getNombre());
            pr.setString(2, producto.getFabricante());
            pr.setString(3, producto.getCodigo());
            pr.setDouble(4, producto.getPrecio());
            pr.setInt(5, producto.getCantidad());
            pr.setInt(6, producto.getId_producto());
            pr.executeUpdate();
        } catch (SQLException e) {
            resultado = false;
            JOptionPane.showMessageDialog(null, "Error al actualizar producto: " + e.getMessage());
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
     * Inserta un producto en la base de datos
     * @param producto El producto que se insertará en la base de datos
     * @return Un booleano que indica si la operacion fue exitosa
     */
    public boolean insertarProducto(Producto producto) {
        boolean resultado = true;
        Connection con = Conexion.getConnection();
        PreparedStatement pr = null;
        String query = "INSERT INTO ControlEmpresa.Producto (nombre, fabricante, codigo, precio, cantidad, id_tienda) VALUES (?, ?, ?, ?, ?, ?);";
        try {
            pr = con.prepareStatement(query);
            pr.setString(1, producto.getNombre());
            pr.setString(2, producto.getFabricante());
            pr.setString(3, producto.getCodigo());
            pr.setDouble(4, producto.getPrecio());
            pr.setInt(5, producto.getCantidad());
            pr.setInt(6, producto.getId_tienda());
            pr.executeUpdate();
            JOptionPane.showMessageDialog(null, "Producto registrado correctamente");
        } catch (SQLException e) {
            resultado = false;
            JOptionPane.showMessageDialog(null, "Error al ingresar producto: " + e.getMessage());
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
     * Lista a los productos por codigo y el id de la tienda
     * @param codigo El codigo del producto
     * @param id_tienda El id de la tienda
     * @return La informacion del producto
     */
    public Producto listarProductosPorCodigo(String codigo, int id_tienda) {
        Producto producto = null;
        Connection con = Conexion.getConnection();
        PreparedStatement pr = null;
        ResultSet rs = null;
        String query = "SELECT * FROM ControlEmpresa.Producto WHERE codigo = ? AND id_tienda = ?;";
        try {
            pr = con.prepareStatement(query);
            pr.setString(1, codigo);
            pr.setInt(2, id_tienda);
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

    /**
     * Lista a los productos que se encuentran en una tienda diferente a la indicada
     * @param id_tienda El identificador de la tienda actual
     * @return La lista de productos
     */
    public ArrayList<Producto> listarProductosDeOtraTienda(int id_tienda) {
        ArrayList<Producto> productos = new ArrayList<>();
        Connection con = Conexion.getConnection();
        PreparedStatement pr = null;
        ResultSet rs = null;
        String query = "SELECT p.id_producto, p.nombre, p.fabricante, p.codigo, p.precio, p.cantidad, t.nombre as Tienda \n"
                + "	FROM ControlEmpresa.Producto p\n"
                + "	JOIN ControlEmpresa.Tienda t ON p.id_tienda = t.id_tienda \n"
                + "	WHERE p.id_tienda != ? AND p.cantidad > 0\n"
                + "	ORDER BY p.id_producto ASC;";
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
                nuevo.setNombreTienda(rs.getString(7));
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
     * Lista a los productos filtrados por un parametro de busqueda
     * @param id_tienda El id de la tienda actual
     * @param nombre El paremetro de busqueda
     * @return La lista de productos
     */
    public ArrayList<Producto> listarProductosPorNombreInventario(int id_tienda, String nombre) {
        ArrayList<Producto> productos = new ArrayList<>();
        Connection con = Conexion.getConnection();
        PreparedStatement pr = null;
        ResultSet rs = null;
        String query = "SELECT p.id_producto, p.nombre, p.fabricante, p.codigo, p.precio, p.cantidad, t.nombre as Tienda \n"
                + "	FROM ControlEmpresa.Producto p\n"
                + "	JOIN ControlEmpresa.Tienda t ON p.id_tienda = t.id_tienda \n"
                + "	WHERE p.nombre ILIKE '%" + nombre + "%' AND p.id_tienda != ? AND p.cantidad > 0\n"
                + "	ORDER BY p.id_producto ASC;";
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
                nuevo.setNombreTienda(rs.getString(7));
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
     * Actualiza las existencias de un producto en la base de datos
     * posteriormente a la realizacion de una venta
     *
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
            JOptionPane.showMessageDialog(null, "Error al actualizar producto: " + e.getMessage());
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
     *
     * @param id_tienda El id de la tienda actual
     * @return La lista de productos de la tienda
     */
    public ArrayList<Producto> listarProductosPorTienda(int id_tienda, boolean inventario, int orden) {
        ArrayList<Producto> productos = new ArrayList<>();
        Connection con = Conexion.getConnection();
        PreparedStatement pr = null;
        ResultSet rs = null;
        String query = "";
        if (inventario == true) {
            query = "SELECT * FROM ControlEmpresa.Producto WHERE id_tienda = ? ";
        } else {
            query = "SELECT * FROM ControlEmpresa.Producto WHERE id_tienda = ? AND cantidad > 0 ";
        }
        switch (orden) {
            case 1:
                query += "ORDER BY nombre ASC;";
                break;
            case 2:
                query += "ORDER BY fabricante ASC;";
                break;
            case 3:
                query += "ORDER BY precio ASC;";
                break;
            default:
                query += "ORDER BY id_producto ASC;";
        }
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
     *
     * @param id_tienda El identificador de la tienda
     * @param nombre El nombre del producto
     * @return La lista de productos encontrados
     */
    public ArrayList<Producto> listarProductosPorNombre(int id_tienda, String nombre) {
        ArrayList<Producto> productos = new ArrayList<>();
        Connection con = Conexion.getConnection();
        PreparedStatement pr = null;
        ResultSet rs = null;
        String query = "SELECT * FROM ControlEmpresa.Producto WHERE nombre ILIKE '%" + nombre + "%' AND id_tienda = ? AND cantidad > 0 ORDER BY id_producto ASC;";
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
     *
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
