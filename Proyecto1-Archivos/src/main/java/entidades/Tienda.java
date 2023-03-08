
package entidades;


public class Tienda {
    
    private int id_tienda;
    private String nombre;
    private String direccion;
    private String telefono;

    public Tienda(int id_tienda, String nombre, String direccion, String telefono) {
        this.id_tienda = id_tienda;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Tienda() {
    }

    public int getId_tienda() {
        return id_tienda;
    }

    public void setId_tienda(int id_tienda) {
        this.id_tienda = id_tienda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Tienda{" + "id_tienda=" + id_tienda + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
      
}
