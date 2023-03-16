package ventanas.administrador;

import datos.EmpleadoDAO;
import entidades.Empleado;
import entidades.Producto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Manejo_Empleados extends javax.swing.JFrame {

    private Empleado empleado;
    private EmpleadoDAO empDao = new EmpleadoDAO();
    private Empleado empleadoSeleccionado;

    public Manejo_Empleados(Empleado empleado) {
        initComponents();
        this.empleado = empleado;
        setResizable(false);
        setLocationRelativeTo(null);
        actualizarTabla();
        labelUser.setText(empleado.getNombre());
        labelRol.setText(empleado.getRol());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        labelRol = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textoBuscar = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonBusqueda = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        botonBorrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Rol:");

        labelRol.setText("rol");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Empleados");

        botonAgregar.setText("Agregar Empleado");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonBusqueda.setText("Buscar");
        botonBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBusquedaActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar Empleado");
        botonModificar.setEnabled(false);
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Fabricante", "Codigo", "Precio", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla1);

        botonBorrar.setText("Borrar Empleado");
        botonBorrar.setEnabled(false);
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Usuario: ");

        labelUser.setText("user");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(labelRol, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelUser)
                    .addComponent(jLabel3)
                    .addComponent(labelRol))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBusqueda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        Datos_Empleado datos = new Datos_Empleado(null, false, this);
        datos.setVisible(true);
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBusquedaActionPerformed
        String texto = textoBuscar.getText();
        ArrayList<Empleado> empleados = empDao.listarEmpleadosPorNombre(texto);

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id_Empleado");
        modelo.addColumn("Nombre");
        modelo.addColumn("Telefono");
        modelo.addColumn("Rol");
        modelo.addColumn("DPI");
        modelo.addColumn("Tienda");

        for (Empleado empleado : empleados) {
            String[] data = new String[6];
            data[0] = String.valueOf(empleado.getId_empleado());
            data[1] = empleado.getNombre();
            data[2] = empleado.getTelefono();
            data[3] = empleado.getRol();
            data[4] = empleado.getDpi();
            data[5] = empleado.getNombre_tienda();
            modelo.addRow(data);
        }
        tabla1.setModel(modelo);
    }//GEN-LAST:event_botonBusquedaActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        Datos_Empleado datos = new Datos_Empleado(empleadoSeleccionado, true, this);
        datos.setVisible(true);
        botonModificar.setEnabled(false);
        botonBorrar.setEnabled(false);
    }//GEN-LAST:event_botonModificarActionPerformed

    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked
        int Fila = tabla1.getSelectedRow();
        String id = tabla1.getValueAt(Fila, 0).toString();
        empleadoSeleccionado = empDao.obtenerEmpleadoPorId(Integer.parseInt(id));
        botonModificar.setEnabled(true);
        botonBorrar.setEnabled(true);
    }//GEN-LAST:event_tabla1MouseClicked

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
//        int opcion = JOptionPane.showConfirmDialog(null, "¿Estas seguro de borrar el producto: \n"
//            + "Nombre: " + empleadoSeleccionado.getNombre() + "\n"
//            + "Fabricante: " + empleadoSeleccionado.getFabricante() + "\n"
//            + "Codigo: " + empleadoSeleccionado.getCodigo());
//        if(opcion == JOptionPane.YES_OPTION){
//            boolean resultado = productoDao.eliminarProducto(empleadoSeleccionado);
//            if(resultado == true){
//                JOptionPane.showMessageDialog(null, "Producto eliminado");
//                eliminarProductoSeleccionado();
//                actualizarTabla();
//            }
//        }
    }//GEN-LAST:event_botonBorrarActionPerformed

    public void actualizarTabla() {
        ArrayList<Empleado> empleados = empDao.listarEmpleados();

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id_Empleado");
        modelo.addColumn("Nombre");
        modelo.addColumn("Telefono");
        modelo.addColumn("Rol");
        modelo.addColumn("DPI");
        modelo.addColumn("Tienda");

        for (Empleado empleado : empleados) {
            String[] data = new String[6];
            data[0] = String.valueOf(empleado.getId_empleado());
            data[1] = empleado.getNombre();
            data[2] = empleado.getTelefono();
            data[3] = empleado.getRol();
            data[4] = empleado.getDpi();
            data[5] = empleado.getNombre_tienda();
            modelo.addRow(data);
        }
        tabla1.setModel(modelo);
    }

    public void eliminarProductoSeleccionado() {
        empleadoSeleccionado = null;
        botonModificar.setEnabled(false);
        botonBorrar.setEnabled(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonBusqueda;
    private javax.swing.JButton botonModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelRol;
    private javax.swing.JLabel labelUser;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField textoBuscar;
    // End of variables declaration//GEN-END:variables
}
