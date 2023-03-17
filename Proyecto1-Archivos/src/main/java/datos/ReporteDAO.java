package datos;

import conexion.Conexion;
import entidades.Reporte;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ReporteDAO {

    public ArrayList<Reporte> verReporteCantidad(int tipo) {
        ArrayList<Reporte> reporte = new ArrayList<>();
        Connection con = Conexion.getConnection();
        PreparedStatement pr = null;
        ResultSet rs = null;
        String query = "";
        switch (tipo) {
            case 1:
                query = "SELECT COUNT(p.id_producto) as Ventas,  p.id_producto, p.nombre FROM ControlVentas.Venta v \n"
                        + "	JOIN ControlEmpresa.Producto p ON v.id_producto = p.id_producto\n"
                        + "	GROUP BY(p.id_producto) ORDER BY Ventas DESC LIMIT 10;";
                break;
            case 2:
                query = "SELECT COUNT(t.id_tienda) as Ventas,  t.id_tienda, t.nombre FROM ControlVentas.Venta v \n"
                        + "	JOIN ControlEmpresa.Tienda t ON v.id_tienda = t.id_tienda\n"
                        + "	GROUP BY(t.id_tienda) ORDER BY Ventas DESC LIMIT 3;";
                break;
            case 3:
                query = "SELECT COUNT(e.id_empleado) as Ventas,  e.id_empleado, e.nombre FROM ControlVentas.Venta v \n"
                        + "	JOIN ControlPersonal.Empleado e ON v.id_empleado = e.id_empleado\n"
                        + "	GROUP BY(e.id_empleado) ORDER BY Ventas DESC LIMIT 3;";
                break;
            default:
                query = "";
        }
        try {
            pr = con.prepareStatement(query);
            rs = pr.executeQuery();
            while (rs.next()) {
                Reporte nuevo = new Reporte();
                nuevo.setCantidad(rs.getInt(1));
                nuevo.setId(rs.getString(2));
                nuevo.setNombre(rs.getString(3));
                reporte.add(nuevo);
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
        return reporte;
    }

    public ArrayList<Reporte> verReporteSuma(int tipo) {
        ArrayList<Reporte> reporte = new ArrayList<>();
        Connection con = Conexion.getConnection();
        PreparedStatement pr = null;
        ResultSet rs = null;
        String query = "";
        switch (tipo) {
            case 1:
                query = "SELECT SUM(v.total) as Ganancia,  c.nit_cliente, c.nombre FROM ControlVentas.Venta v \n"
                        + "	JOIN ControlPersonal.Cliente c ON v.nit_cliente = c.nit_cliente\n"
                        + "	WHERE c.nit_cliente != '000000000'\n"
                        + "	GROUP BY(c.nit_cliente) ORDER BY Ganancia DESC LIMIT 10;";
                break;
            case 2:
                query = "SELECT SUM(v.Total) as Ingresos,  t.id_tienda, t.nombre FROM ControlVentas.Venta v \n"
                        + "	JOIN ControlEmpresa.Tienda t ON v.id_tienda = t.id_tienda\n"
                        + "	GROUP BY(t.id_tienda) ORDER BY Ingresos DESC LIMIT 3;";
                break;
            case 3:
                query = "SELECT SUM(v.total) as Ganancias,  e.id_empleado, e.nombre FROM ControlVentas.Venta v \n"
                        + "	JOIN ControlPersonal.Empleado e ON v.id_empleado = e.id_empleado\n"
                        + "	GROUP BY(e.id_empleado) ORDER BY Ganancias DESC LIMIT 3;";
                break;
            case 4:
                query = "SELECT SUM(v.total) as Ventas,  p.id_producto, p.nombre FROM ControlVentas.Venta v \n"
                        + "	JOIN ControlEmpresa.Producto p ON v.id_producto = p.id_producto\n"
                        + "	GROUP BY(p.id_producto) ORDER BY Ventas DESC LIMIT 10;";
                break;
            default:
                query = "";
        }
        try {
            pr = con.prepareStatement(query);
            rs = pr.executeQuery();
            while (rs.next()) {
                Reporte nuevo = new Reporte();
                nuevo.setSuma(rs.getDouble(1));
                nuevo.setId(rs.getString(2));
                nuevo.setNombre(rs.getString(3));
                reporte.add(nuevo);
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
        return reporte;
    }

    public ArrayList<Reporte> verReporteTienda(int id_tienda) {
        ArrayList<Reporte> reporte = new ArrayList<>();
        Connection con = Conexion.getConnection();
        PreparedStatement pr = null;
        ResultSet rs = null;
        String query = "SELECT COUNT(p.id_producto) as Ventas,  p.id_producto, p.nombre, p.id_tienda, t.nombre as Tienda FROM ControlEmpresa.Producto p\n"
                + "	JOIN ControlVentas.Venta v  ON v.id_producto = p.id_producto\n"
                + "	JOIN ControlEmpresa.Tienda t ON p.id_tienda = t.id_tienda\n"
                + "	WHERE p.id_tienda = ?\n"
                + "	GROUP BY(p.id_producto, t.id_tienda) ORDER BY Ventas DESC LIMIT 5;";
        try {
            pr = con.prepareStatement(query);
            pr.setInt(1, id_tienda);
            rs = pr.executeQuery();
            while (rs.next()) {
                Reporte nuevo = new Reporte();
                nuevo.setCantidad(rs.getInt(1));
                nuevo.setId(rs.getString(2));
                nuevo.setNombre(rs.getString(3));
                nuevo.setId_tienda(rs.getInt(4));
                nuevo.setNombreTienda(rs.getString(5));
                reporte.add(nuevo);
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
        return reporte;
    }

    public ArrayList<Reporte> verReporteTiendaGanancias(int id_tienda) {
        ArrayList<Reporte> reporte = new ArrayList<>();
        Connection con = Conexion.getConnection();
        PreparedStatement pr = null;
        ResultSet rs = null;
        String query = "SELECT SUM(v.total) as Ingresos,  p.id_producto, p.nombre, p.id_tienda, t.nombre as Tienda FROM ControlEmpresa.Producto p\n"
                + "	JOIN ControlVentas.Venta v  ON v.id_producto = p.id_producto\n"
                + "	JOIN ControlEmpresa.Tienda t ON p.id_tienda = t.id_tienda\n"
                + "	WHERE p.id_tienda = ?\n"
                + "	GROUP BY(p.id_producto, t.id_tienda) ORDER BY Ingresos DESC LIMIT 5;";
        try {
            pr = con.prepareStatement(query);
            pr.setInt(1, id_tienda);
            rs = pr.executeQuery();
            while (rs.next()) {
                Reporte nuevo = new Reporte();
                nuevo.setSuma(rs.getDouble(1));
                nuevo.setId(rs.getString(2));
                nuevo.setNombre(rs.getString(3));
                nuevo.setId_tienda(rs.getInt(4));
                nuevo.setNombreTienda(rs.getString(5));
                reporte.add(nuevo);
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
        return reporte;
    }
}
