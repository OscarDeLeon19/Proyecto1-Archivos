package ventanas.administrador;

import datos.EmpleadoDAO;
import datos.TiendaDAO;
import entidades.Empleado;
import entidades.Tienda;
import java.security.SecureRandom;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Datos_Empleado extends javax.swing.JFrame {

    private Empleado empleado;
    private Manejo_Empleados manejo;
    private TiendaDAO tiendaDao = new TiendaDAO();
    private EmpleadoDAO empleadoDao = new EmpleadoDAO();
    private ArrayList<Tienda> tiendas = new ArrayList<>();

    /**
     * Constructor de la clase empleado
     * @param empleado El empleado actual 
     * @param modificacion Si se va a modificar algun empleado
     * @param manejo La ventana de manejo
     */
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

    /**
     * Segun la lista de tiendas, se agregan valores a los Jcombobox
     */
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
        jLabel7 = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
        listaRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaRolActionPerformed(evt);
            }
        });

        listaTienda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaTiendaActionPerformed(evt);
            }
        });

        jLabel7.setText("Usuario: ");

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
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(listaRol, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(textoTelefono)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                    .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textoDpi)
                                        .addComponent(listaTienda, 0, 186, Short.MAX_VALUE)
                                        .addComponent(textoUsuario))
                                    .addGap(9, 9, 9))))))
                .addContainerGap(22, Short.MAX_VALUE))
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
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Obtiene los parametros de las  cajas de texto y crea un nuevo empleado para la base de datos
     * @param evt 
     */
    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed

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
        
        String usuario = textoUsuario.getText();
        if(usuario.equals("")){
            usuario = null;
        }
        String rol = String.valueOf(listaRol.getSelectedItem());
        int numberTienda = listaTienda.getSelectedIndex();
        int tienda = tiendas.get(numberTienda).getId_tienda();
        String contraseña = generarContraseña(6);
        Empleado nuevoEmpleado = new Empleado(0, nombre, telefono, rol, dpi, tienda, usuario, contraseña);
        boolean resultado = empleadoDao.insertarEmpleado(nuevoEmpleado);
        if (resultado == true) {
            JOptionPane.showMessageDialog(null, "Username: " + nuevoEmpleado.getUsername() + "\nPassword: " + nuevoEmpleado.getPassword());
            dispose();
            manejo.actualizarTabla(0);
        }

    }//GEN-LAST:event_botonAgregarActionPerformed

    /**
     * Obtiene los valores de las cajas de texto
     * Llama a la modificacion de un empleado
     * @param evt 
     */
    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed

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

        String usuario = textoUsuario.getText();
        if(usuario.equals("")){
            usuario = null;
        }
        
        String rol = String.valueOf(listaRol.getSelectedItem());
        int numberTienda = listaTienda.getSelectedIndex();
        int tienda = tiendas.get(numberTienda).getId_tienda();
        Empleado nuevoEmpleado = new Empleado(this.empleado.getId_empleado(), nombre, telefono, rol, dpi, tienda, usuario, "");
        boolean resultado = empleadoDao.actualizarEmpleado(nuevoEmpleado);
        if (resultado == true) {
            JOptionPane.showMessageDialog(null, "Empleado modificado correctamente");
            dispose();
            manejo.actualizarTabla(0);
            manejo.eliminarProductoSeleccionado();
        } else {
            JOptionPane.showMessageDialog(null, "Vuelve a ingresar los datos");
        }

    }//GEN-LAST:event_botonModificarActionPerformed

    /**
     * Evento para cambiar los valores del JComboBox en funcion de un parametro seleccionado
     * @param evt 
     */
    private void listaRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaRolActionPerformed
        if (String.valueOf(listaRol.getSelectedItem()).equals("Bodega")) {
            listaTienda.setSelectedIndex(3);
            listaTienda.setEnabled(false);
        } else if (String.valueOf(listaRol.getSelectedItem()).equals("Administrador")) {
            listaTienda.setSelectedIndex(0);
            listaTienda.setEnabled(false);
        } else {
            if (listaTienda.getItemCount() > 0) {
                listaTienda.setEnabled(true);
                listaTienda.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_listaRolActionPerformed

    /**
     * Evento para cambiar los valores del JComboBox en funcion de un parametro seleccionado
     * @param evt 
     */
    private void listaTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaTiendaActionPerformed
        if (String.valueOf(listaTienda.getSelectedItem()).equals("Bodega")) {
            listaRol.setSelectedItem("Bodega");
        }
    }//GEN-LAST:event_listaTiendaActionPerformed

    /**
     * Actualiza las cajas de texto con la informacion del empleado
     */
    private void actualizarCajasDeTexto() {
        textoNombre.setText(empleado.getNombre());
        textoTelefono.setText(empleado.getTelefono());
        textoDpi.setText(empleado.getDpi());
        textoUsuario.setText(empleado.getUsername());
        listaRol.setSelectedItem(empleado.getRol());
        Tienda tienda = tiendaDao.listarTiendaPorCodigo(empleado.getId_tienda());
        listaTienda.setSelectedItem(tienda.getNombre());
    }

    /**
     * Metodo para crear una contraseña con diferentes caracteres
     * @param longitud la longitud de la contraseña
     * @return La contraseña generada
     */
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> listaRol;
    private javax.swing.JComboBox<String> listaTienda;
    private javax.swing.JTextField textoDpi;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoTelefono;
    private javax.swing.JTextField textoUsuario;
    // End of variables declaration//GEN-END:variables
}
