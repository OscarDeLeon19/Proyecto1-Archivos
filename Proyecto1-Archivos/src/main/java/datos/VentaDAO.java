package datos;

import entidades.Cliente;
import entidades.Empleado;
import entidades.Producto;
import entidades.Tienda;
import entidades.Venta;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VentaDAO {

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
            System.out.println(venta.toString());
        }
    }

    public double obtenerTotal(ArrayList<Producto> productos) {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getCantidad() * producto.getPrecio();
        }
        return total;
    }
}
