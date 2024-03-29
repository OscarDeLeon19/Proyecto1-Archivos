package ventanas;

import ventanas.vendedor.Vendedor;
import datos.EmpleadoDAO;
import entidades.Empleado;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import ventanas.administrador.Menu;
import ventanas.bodega.Bodega;
import ventanas.inventario.Inventario;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textoId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textoContraseña = new javax.swing.JPasswordField();
        botonEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Electronic Homes");

        jLabel1.setText("Sistema de Electronic-Homes");

        jLabel2.setText("Username:");

        jLabel3.setText("Contraseña:");

        botonEntrar.setText("Entrar");
        botonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(128, 128, 128))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoId)
                            .addComponent(textoContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(botonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Obtiene el username y contraseña del usuario
     * En base a su rol, se abre una diferente ventana
     * @param evt El evento del boton
     */
    private void botonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEntrarActionPerformed
        try {
            String username = textoId.getText();
            String contraseña = String.valueOf(textoContraseña.getPassword());
            EmpleadoDAO empDao = new EmpleadoDAO();
            Empleado empleado = empDao.obtenerEmpleadoLogin(username, contraseña);
            if (empleado != null) {
                if(empleado.getRol().equals("Vendedor")){
                    Vendedor vendedor = new Vendedor(empleado);
                    vendedor.setVisible(true);
                    dispose();
                } else if (empleado.getRol().equals("Inventario")){
                    Inventario inventario = new Inventario(empleado);
                    inventario.setVisible(true);
                    dispose();
                } else if (empleado.getRol().equals("Bodega")){
                    Bodega bodega = new Bodega(empleado);
                    bodega.setVisible(true);
                    dispose();
                } else if (empleado.getRol().equals("Administrador")){
                    Menu menu = new Menu(empleado);
                    menu.setVisible(true);
                    dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al hacer la busqueda: " + ex.getMessage());
        }
    }//GEN-LAST:event_botonEntrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField textoContraseña;
    private javax.swing.JTextField textoId;
    // End of variables declaration//GEN-END:variables
}
