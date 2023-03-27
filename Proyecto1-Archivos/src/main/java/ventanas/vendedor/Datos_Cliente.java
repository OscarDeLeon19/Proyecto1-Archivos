
package ventanas.vendedor;

import datos.ClienteDAO;
import entidades.Cliente;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Datos_Cliente extends javax.swing.JFrame {

    private ClienteDAO clienteDao = new ClienteDAO();
    private JTextField textos[];

    /**
     * Constructor de la clase Datos_Cliente
     * @param nit El nit del cliente actual
     * @param actualizacion Si se actualizaran datos o se borraran
     * @param textos Cajas de texto con datos del cliente
     */
    public Datos_Cliente(String nit, boolean actualizacion, JTextField textos[]) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        textoNit.setText(nit);
        this.textos = textos;
        if (actualizacion == false) {
            botonActualizarCliente.setEnabled(false);
            botonRegistrarCliente.setEnabled(true);
            textoNit.setEnabled(true);
        } else {
            botonActualizarCliente.setEnabled(true);
            botonRegistrarCliente.setEnabled(false);
            obtenerDatosCliente();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textoNit = new javax.swing.JTextField();
        textoCorreo = new javax.swing.JTextField();
        textoTelefono = new javax.swing.JTextField();
        textoDpi = new javax.swing.JTextField();
        botonRegistrarCliente = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        botonActualizarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Datos del Cliente");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Datos del Cliente");

        jLabel2.setText("Nit:");

        jLabel3.setText("Correo:");

        jLabel4.setText("Telefono:");

        jLabel5.setText("DPI:");

        textoNit.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textoNit.setEnabled(false);

        botonRegistrarCliente.setText("Registrar Cliente");
        botonRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarClienteActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre: ");

        botonActualizarCliente.setText("Actualizar Cliente");
        botonActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(textoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textoNit, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textoDpi, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(botonRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonActualizarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textoNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoDpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonRegistrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(botonActualizarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Obtiene los datos del cliente y los agrega a las cajas de texto
     */
    public void obtenerDatosCliente() {
        try {
            String nit = textoNit.getText();
            Cliente cliente = clienteDao.listarClientePorNit(nit);
            textoNombre.setText(cliente.getNombre());
            textoCorreo.setText(cliente.getCorreo());
            textoTelefono.setText(cliente.getTelefono());
            textoDpi.setText(cliente.getDpi());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontro el cliente en el sistema. " + e);
        }
    }

    /**
     * Obtiene los datos de la caja de texto y los llama al metodo para agregar un cliente
     * @param evt 
     */
    private void botonRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarClienteActionPerformed
        String nit = textoNit.getText();
        if (nit.equals("")) {
            nit = null;
        }
        String nombre = textoNombre.getText();
        if (nombre.equals("")) {
            nombre = null;
        }
        String correo = textoCorreo.getText();
        if (correo.equals("")) {
            correo = null;
        }
        String telefono = textoTelefono.getText();
        if (telefono.equals("")) {
            telefono = null;
        }
        String dpi = textoDpi.getText();
        if (dpi.equals("")) {
            dpi = null;
        }

        Cliente cliente = new Cliente(nit, nombre, correo, telefono, dpi, 0);
        boolean resultado = clienteDao.insertarCliente(cliente);
        if (resultado == true) {
            dispose();
        }
    }//GEN-LAST:event_botonRegistrarClienteActionPerformed

    /**
     * Obtiene los datos de las cajas de texto y llama al metodo para modificar un cliente en la base de datos
     * @param evt 
     */
    private void botonActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarClienteActionPerformed
        String nit = textoNit.getText();
        if (nit.equals("")) {
            nit = null;
        }
        String nombre = textoNombre.getText();
        if (nombre.equals("")) {
            nombre = null;
        }
        String correo = textoCorreo.getText();
        if (correo.equals("")) {
            correo = null;
        }
        String telefono = textoTelefono.getText();
        if (telefono.equals("")) {
            telefono = null;
        }
        String dpi = textoDpi.getText();
        if (dpi.equals("")) {
            dpi = null;
        }

        Cliente cliente = new Cliente(nit, nombre, correo, telefono, dpi, 0);
        boolean resultado = clienteDao.actualizarCliente(cliente);
        if (resultado == true) {
            textos[0].setText(cliente.getNombre());
            textos[1].setText(cliente.getTelefono());
            textos[2].setText(cliente.getDpi());
            dispose();
        }
    }//GEN-LAST:event_botonActualizarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizarCliente;
    private javax.swing.JButton botonRegistrarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField textoCorreo;
    private javax.swing.JTextField textoDpi;
    private javax.swing.JTextField textoNit;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoTelefono;
    // End of variables declaration//GEN-END:variables
}
