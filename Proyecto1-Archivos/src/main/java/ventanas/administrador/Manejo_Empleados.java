package ventanas.administrador;

import datos.EmpleadoDAO;
import entidades.Empleado;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Manejo_Empleados extends javax.swing.JFrame {

    private Empleado empleado;
    private EmpleadoDAO empDao = new EmpleadoDAO();
    private Empleado empleadoSeleccionado;

    /**
     * Constructor de la clase Manejo_Empleados
     * @param empleado El empleado actual
     */
    public Manejo_Empleados(Empleado empleado) {
        initComponents();
        this.empleado = empleado;
        setResizable(false);
        setLocationRelativeTo(null);
        actualizarTabla(0);
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
        jLabel4 = new javax.swing.JLabel();
        botonId = new javax.swing.JButton();
        botonNombre = new javax.swing.JButton();
        botonRol = new javax.swing.JButton();
        botonTienda = new javax.swing.JButton();

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

        jLabel4.setText("Ordenar por: ");

        botonId.setText("Id");
        botonId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIdActionPerformed(evt);
            }
        });

        botonNombre.setText("Nombre");
        botonNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNombreActionPerformed(evt);
            }
        });

        botonRol.setText("Rol");
        botonRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRolActionPerformed(evt);
            }
        });

        botonTienda.setText("Tienda");
        botonTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTiendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(389, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonId, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(botonNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonRol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonTienda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(labelRol, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonRol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonTienda)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonBorrar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(botonModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Crea una ventana de datos de empleado
     * @param evt 
     */
    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        Datos_Empleado datos = new Datos_Empleado(null, false, this);
        datos.setVisible(true);
    }//GEN-LAST:event_botonAgregarActionPerformed

    /**
     * Obtiene el parametro de la caja de texto de busqueda
     * Obtiene la lista de empleados de la base de datos
     * Modifica la tabla
     * @param evt 
     */
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
        if (empleadoSeleccionado.getId_empleado() == empleado.getId_empleado()) {
            JOptionPane.showMessageDialog(null, "No te puedes modificar a ti mismo");
        } else {
            Datos_Empleado datos = new Datos_Empleado(empleadoSeleccionado, true, this);
            datos.setVisible(true);
            botonModificar.setEnabled(false);
            botonBorrar.setEnabled(false);
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    /**
     * Evento al hacer click en la tabla
     * Obtiene los datos del empleado seleccionado
     * @param evt 
     */
    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked
        int Fila = tabla1.getSelectedRow();
        String id = tabla1.getValueAt(Fila, 0).toString();
        empleadoSeleccionado = empDao.obtenerEmpleadoPorId(Integer.parseInt(id));
        botonModificar.setEnabled(true);
        botonBorrar.setEnabled(true);
    }//GEN-LAST:event_tabla1MouseClicked

    /**
     * Obtiene los datos para borrar un empleado de la base de datos
     * @param evt 
     */
    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        if (empleadoSeleccionado.getId_empleado() == empleado.getId_empleado()) {
            JOptionPane.showMessageDialog(null, "No te puedes borrar a ti mismo");
        } else {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Estas seguro de borrar al empleado: \n"
                    + "Nombre: " + empleadoSeleccionado.getNombre() + "\n"
                    + "Rol: " + empleadoSeleccionado.getRol()+ "\n"
                    + "DPI: " + empleadoSeleccionado.getDpi());
            if (opcion == JOptionPane.YES_OPTION) {
                boolean resultado = empDao.borrarEmpleado(empleadoSeleccionado);
                if (resultado == true) {
                    JOptionPane.showMessageDialog(null, "Empleado eliminado");
                    eliminarProductoSeleccionado();
                    actualizarTabla(0);
                }
            }
        }
    }//GEN-LAST:event_botonBorrarActionPerformed

    /**
     * Llama al metodo para actualizar la tabla
     * @param evt 
     */
    private void botonIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIdActionPerformed
        actualizarTabla(0);
    }//GEN-LAST:event_botonIdActionPerformed

    /**
     * Llama al metodo para actualizar la tabla
     * @param evt 
     */
    private void botonNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNombreActionPerformed
        actualizarTabla(1);
    }//GEN-LAST:event_botonNombreActionPerformed

    /**
     * Llama al metodo para actualizar la tabla
     * @param evt 
     */
    private void botonRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRolActionPerformed
        actualizarTabla(2);
    }//GEN-LAST:event_botonRolActionPerformed

    /**
     * Llama al metodo para actualizar la tabla
     * @param evt 
     */
    private void botonTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTiendaActionPerformed
        actualizarTabla(3);
    }//GEN-LAST:event_botonTiendaActionPerformed

    /**
     * Obtiene los datos de los empleados
     * Modifica la tabla
     * @param orden El orden en el que se ordenaran los datos
     */
    public void actualizarTabla(int orden) {
        ArrayList<Empleado> empleados = empDao.listarEmpleados(orden);

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

    /**
     * Elimina el producto seleccionado de la tabla
     */
    public void eliminarProductoSeleccionado() {
        empleadoSeleccionado = null;
        botonModificar.setEnabled(false);
        botonBorrar.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonBusqueda;
    private javax.swing.JButton botonId;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonNombre;
    private javax.swing.JButton botonRol;
    private javax.swing.JButton botonTienda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelRol;
    private javax.swing.JLabel labelUser;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField textoBuscar;
    // End of variables declaration//GEN-END:variables
}
