
package entidades;


public class Reporte {

    private int cantidad;
    private String id;
    private String nombre;
    private int id_tienda;
    private String nombreTienda;

    public Reporte(int cantidad, String id, String nombre) {
        this.cantidad = cantidad;
        this.id = id;
        this.nombre = nombre;
    }

    public Reporte(int cantidad, String id, String nombre, int id_tienda, String nombreTienda) {
        this.cantidad = cantidad;
        this.id = id;
        this.nombre = nombre;
        this.id_tienda = id_tienda;
        this.nombreTienda = nombreTienda;
    }

    public Reporte() {
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return "Reporte{" + "cantidad=" + cantidad + ", id=" + id + ", nombre=" + nombre + ", id_tienda=" + id_tienda + ", nombreTienda=" + nombreTienda + '}';
    }
       
}
