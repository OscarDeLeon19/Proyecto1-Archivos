package ventanas.administrador;

import datos.EmpleadoDAO;
import datos.TiendaDAO;
import entidades.Empleado;
import entidades.Tienda;
import java.security.SecureRandom;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Datos_Empleado extends javax.swing.JFrame {

    private Empleado empleado;
    private Manejo_Empleados manejo;
    private TiendaDAO tiendaDao = new TiendaDAO();
    private EmpleadoDAO empleadoDao = new EmpleadoDAO();
    private ArrayList<Tienda> tiendas = new ArrayList<>();

    public Datos_Empleado(Empleado empleado, boolean modificacion, Manejo_Empleados manejo) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        this.empleado = empleado;
        this.manejo = manejo;
        tiendas = tiendaDao.listarTiendas();
        listaTienda.removeAllItems();
        listaRol.removeAllItems();
        llenarListas();
        if (modificacion == true) {
            botonAgregar.setEnabled(false);
            botonModificar.setEnabled(true);
            actualizarCajasDeTexto();
        } else {
            botonAgregar.setEnabled(true);
            botonModificar.setEnabled(false);
        }

    }

    private void llenarListas() {
        for (Tienda tienda : tiendas) {
            listaTienda.addItem(tienda.getNombre());
        }
        listaRol.addItem("Vendedor");
        listaRol.addItem("Inventario");
        listaRol.addItem("Bodega");
        listaRol.addItem("Administrador");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoNombre = new javax.swing.JTextField();
        textoTelefono = new javax.swing.JTextField();
        textoDpi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        botonModificar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        listaRol = new javax.swing.JComboBox<>();
        listaTienda = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Datos del Empleado");

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre: ");

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        jLabel3.setText("Telefono:");

        jLabel4.setText("Rol:");

        jLabel5.setText("DPI:");

        jLabel6.setText("Tienda:");

        listaRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        listaTienda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(textoNombre))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(listaRol, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(textoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textoDpi, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(listaTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(listaRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textoDpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(listaTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        try {
            String nombre = textoNombre.getText();
            if (nombre.equals("")) {
                nombre = null;
            }
            String telefono = textoTelefono.getText();
            if (telefono.equals("")) {
                telefono = null;
            }
            String dpi = textoDpi.getText();
            if (dpi.equals("")) {
                dpi = null;
            }
            
            String rol = String.valueOf(listaRol.getSelectedItem());
            int numberTienda = listaTienda.getSelectedIndex();
            int tienda = tiendas.get(numberTienda).getId_tienda();
            String contraseña = generarContraseña(8);
            String usuario = generarUsuario();
            Empleado empleado = new Empleado(0, nombre, telefono, rol, dpi, tienda, usuario, contraseña);
            System.out.println(empleado.toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Los valores de precio y cantidad deben ser numericos");
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
//        try {
//            String nombre = textoNombre.getText();
//            if (nombre.equals("")) {
//                nombre = null;
//            }
//            String fabricante = textoTelefono.getText();
//            if (fabricante.equals("")) {
//                fabricante = null;
//            }
//            String codigo = textoCodigo.getText();
//            if (codigo.equals("")) {
//                codigo = null;
//            }
//            double precio = Double.parseDouble(textoDpi.getText());
//            int cantidad = Integer.parseInt(textoCantidad.getText());
//            Producto nuevoProducto = new Producto(producto.getId_producto(), nombre, fabricante, codigo, precio, cantidad, 4);
//            boolean resultado = prDao.actualizarProducto(nuevoProducto);
//            if (resultado == true) {
//                JOptionPane.showMessageDialog(null, "Producto actualizado correctamente");
//                bodega.actualizarTabla();
//                bodega.eliminarProductoSeleccionado();
//                dispose();
//            }
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(null, "Los valores de precio y cantidad deben ser numericos");
//        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void actualizarCajasDeTexto() {
        textoNombre.setText(empleado.getNombre());
        textoTelefono.setText(empleado.getTelefono());
        textoDpi.setText(empleado.getDpi());
        listaRol.setSelectedItem(empleado.getRol());
        Tienda tienda = tiendaDao.listarTiendaPorCodigo(empleado.getId_tienda());
        listaTienda.setSelectedItem(tienda.getNombre());
    }

    private String generarContraseña(int longitud) {
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }

        return sb.toString();
    }

    private String generarUsuario() {
        ArrayList<Empleado> empleados = empleadoDao.listarEmpleados();
        String usuario = "user" + (empleados.size() + 1);
        return usuario;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> listaRol;
    private javax.swing.JComboBox<String> listaTienda;
    private javax.swing.JTextField textoDpi;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoTelefono;
    // End of variables declaration//GEN-END:variables
}
