package datos;

import conexion.Conexion;
import entidades.Cliente;
import entidades.Empleado;
import entidades.Producto;
import entidades.Tienda;
import entidades.Venta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VentaDAO {

    /**
     * Inserta una venta en la base de datos
     * @param venta La venta que se insertará
     * @return Un boolean que indica si la operacion fue exitosa.
     */
    public boolean insertarVenta(Venta venta) {
        boolean resultado = true;
        PreparedStatement pr = null;
        String query = "INSERT INTO ControlVentas.Venta (fecha, id_empleado, id_producto, cantidad, total, nit_cliente, id_tienda) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            pr = Conexion.connection.prepareStatement(query);
            pr.setDate(1, venta.getFecha());
            pr.setInt(2, venta.getId_empleado());
            pr.setInt(3, venta.getId_producto());
            pr.setInt(4, venta.getCantidad());
            pr.setDouble(5, venta.getTotal());
            pr.setString(6, venta.getNit_cliente());
            pr.setInt(7, venta.getId_tienda());
            pr.executeUpdate();
        } catch (SQLException e) {
            resultado = false;
            JOptionPane.showMessageDialog(null, "Error al ingresar venta: " + e.getMessage());
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
     * Registra una venta de la aplicacion. Manda a ingresar las ventas a la base de datos.
     * Comprueba si un cliente desea utilizar su descuento.
     * @param productos Los productos que se compraron
     * @param cliente El cliente que compro los productos
     * @param empleado El empleado que registrará la venta
     * @param tienda La tienda en donde se realiza la venta
     */
    public void realizarVenta(ArrayList<Producto> productos, Cliente cliente, Empleado empleado, Tienda tienda) {
        double total = obtenerTotal(productos);
        boolean hayDescuento = false;
        if (cliente.getDescuento() > 0) {
            int opcion = JOptionPane.showConfirmDialog(null, "El cliente tiene un descuento del " + cliente.getDescuento() + "% ¿Desea el cliente utilizarlo?");
            if (opcion == JOptionPane.YES_OPTION) {
                double porcentaje = (double) cliente.getDescuento() / 100;
                double descuento = total * porcentaje;
                System.out.println(descuento);
                double nuevoTotal = total - descuento;
                JOptionPane.showMessageDialog(null, "El total de la compra es de: " + nuevoTotal);
                hayDescuento = true;
            }
        }

        for (Producto producto : productos) {
            long milis = System.currentTimeMillis();
            Date date = new Date(milis);
            Venta venta = new Venta();
            venta.setFecha(date);
            venta.setId_empleado(empleado.getId_empleado());
            venta.setId_producto(producto.getId_producto());
            venta.setCantidad(producto.getCantidad());
            if (hayDescuento == true) {
                double porcentaje = (double) cliente.getDescuento() / 100;
                double totalActual = producto.getCantidad() * producto.getPrecio();
                double descuento = totalActual * porcentaje;
                double nuevoTotal = totalActual - descuento;
                venta.setTotal(nuevoTotal);
            } else {
                venta.setTotal(producto.getCantidad() * producto.getPrecio());
            }
            venta.setNit_cliente(cliente.getNit_cliente());
            venta.setId_tienda(tienda.getId_tienda());
            insertarVenta(venta);
            descontarExistencias(venta);
        }
        JOptionPane.showMessageDialog(null, "Venta registrada correctamente");
        if (!cliente.getNit_cliente().equals("000000000")) {
            int descuentoGanado = 0;
            if (total >= 1000 && total < 5000) {
                descuentoGanado = 2;
            } else if (total >= 5000 && total < 10000) {
                descuentoGanado = 5;
            } else if (total >= 10000) {
                descuentoGanado = 10;
            }
            ClienteDAO clienteDao = new ClienteDAO();
            clienteDao.actualizarDescuento(descuentoGanado, cliente.getNit_cliente(), hayDescuento);
        }
    }

    /**
     * Descuenta las existencias vendidas de la base de datos.
     * @param venta La venta que se realizo
     */
    public void descontarExistencias(Venta venta) {
        ProductoDAO productoDao = new ProductoDAO();
        Producto producto = productoDao.listarProductosPorId(venta.getId_producto());
        int existencias = producto.getCantidad();
        int existenciasVenta = venta.getCantidad();
        int resultado = existencias - existenciasVenta;
        producto.setCantidad(resultado);
        productoDao.actualizarExistencias(producto);
    }

    /**
     * Obtiene el total de los productos vendidos
     * @param productos Los productos que se vendieron
     * @return El total de la venta
     */
    public double obtenerTotal(ArrayList<Producto> productos) {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getCantidad() * producto.getPrecio();
        }
        return total;
    }
}
