
package entidades;


public class Producto {
    
    private int id_producto;
    private String nombre;
    private String fabricante;
    private String codigo;
    private double precio;
    private int cantidad;
    private int id_tienda;
    private String nombreTienda;

    public Producto(int id_producto, String nombre, String fabricante, String codigo, double precio, int cantidad, int id_tienda) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.id_tienda = id_tienda;
    }

    public Producto() {
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId_tienda() {
        return id_tienda;
    }

    public void setId_tienda(int id_tienda) {
        this.id_tienda = id_tienda;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }
    
    @Override
    public String toString() {
        return "Producto{" + "id_producto=" + id_producto + ", nombre=" + nombre + ", fabricante=" + fabricante + ", codigo=" + codigo + ", precio=" + precio + ", cantidad=" + cantidad + ", id_tienda=" + id_tienda + '}';
    }
    
}
