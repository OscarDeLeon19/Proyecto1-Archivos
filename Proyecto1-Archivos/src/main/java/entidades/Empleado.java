
package entidades;

public class Empleado {
    
    private int id_empleado;
    private String nombre;
    private String telefono;
    private String rol;
    private String dpi;
    private String id_tienda;
    private String password;

    public Empleado(int id_empleado, String nombre, String telefono, String rol, String dpi, String id_tienda, String password) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.telefono = telefono;
        this.rol = rol;
        this.dpi = dpi;
        this.id_tienda = id_tienda;
        this.password = password;
    }

    public Empleado() {
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getId_tienda() {
        return id_tienda;
    }

    public void setId_tienda(String id_tienda) {
        this.id_tienda = id_tienda;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id_empleado=" + id_empleado + ", nombre=" + nombre + ", telefono=" + telefono + ", rol=" + rol + ", dpi=" + dpi + ", id_tienda=" + id_tienda + ", password=" + password + '}';
    }
    
}
