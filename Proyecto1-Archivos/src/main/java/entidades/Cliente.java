package entidades;

public class Cliente {

    private String nit_cliente;
    private String nombre;
    private String correo;
    private String telefono;
    private String dpi;
    private int descuento;

    public Cliente(String nit_cliente, String nombre, String correo, String telefono, String dpi, int descuento) {
        this.nit_cliente = nit_cliente;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.dpi = dpi;
        this.descuento = descuento;
    }

    public Cliente() {
    }

    public String getNit_cliente() {
        return nit_cliente;
    }

    public void setNit_cliente(String nit_cliente) {
        this.nit_cliente = nit_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nit_cliente=" + nit_cliente + ", nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono + ", dpi=" + dpi + ", descuento=" + descuento + '}';
    }

}
