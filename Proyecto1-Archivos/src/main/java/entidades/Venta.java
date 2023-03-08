package entidades;

import java.sql.Date;

public class Venta {

    private int id_venta;
    private Date fecha;
    private int id_empleado;
    private int id_producto;
    private int cantidad;
    private double total;
    private String nit_cliente;
    private int id_tienda;

    public Venta(int id_venta, Date fecha, int id_empleado, int id_producto, int cantidad, double total, String nit_cliente, int id_tienda) {
        this.id_venta = id_venta;
        this.fecha = fecha;
        this.id_empleado = id_empleado;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.total = total;
        this.nit_cliente = nit_cliente;
        this.id_tienda = id_tienda;
    }

    public Venta() {
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getNit_cliente() {
        return nit_cliente;
    }

    public void setNit_cliente(String nit_cliente) {
        this.nit_cliente = nit_cliente;
    }

    public int getId_tienda() {
        return id_tienda;
    }

    public void setId_tienda(int id_tienda) {
        this.id_tienda = id_tienda;
    }

    @Override
    public String toString() {
        return "Venta{" + "id_venta=" + id_venta + ", fecha=" + fecha + ", id_empleado=" + id_empleado + ", id_producto=" + id_producto + ", cantidad=" + cantidad + ", total=" + total + ", nit_cliente=" + nit_cliente + ", id_tienda=" + id_tienda + '}';
    }

}
