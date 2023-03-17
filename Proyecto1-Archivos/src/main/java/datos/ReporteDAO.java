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

    public ArrayList<Reporte> verReporte1() {
        ArrayList<Reporte> reporte = new ArrayList<>();
        Connection con = Conexion.getConnection();
        PreparedStatement pr = null;
        ResultSet rs = null;
        String query = "SELECT COUNT(p.id_producto) as Ventas,  p.id_producto, p.nombre FROM ControlVentas.Venta v \n"
                + "	JOIN ControlEmpresa.Producto p ON v.id_producto = p.id_producto\n"
                + "	GROUP BY(p.id_producto) ORDER BY Ventas DESC LIMIT 10;";
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
}
