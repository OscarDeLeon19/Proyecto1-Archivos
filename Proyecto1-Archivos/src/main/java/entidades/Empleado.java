package entidades;

public class Empleado {

    private int id_empleado;
    private String nombre;
    private String telefono;
    private String rol;
    private String dpi;
    private int id_tienda;
    private String username;
    private String password;
    private String nombre_tienda;

    public Empleado(int id_empleado, String nombre, String telefono, String rol, String dpi, int id_tienda, String username, String password) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.telefono = telefono;
        this.rol = rol;
        this.dpi = dpi;
        this.id_tienda = id_tienda;
        this.username = username;
        this.password = password;
    }

    public Empleado() {
    }

    public String getNombre_tienda() {
        return nombre_tienda;
    }

    public void setNombre_tienda(String nombre_tienda) {
        this.nombre_tienda = nombre_tienda;
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

    public int getId_tienda() {
        return id_tienda;
    }

    public void setId_tienda(int id_tienda) {
        this.id_tienda = id_tienda;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
