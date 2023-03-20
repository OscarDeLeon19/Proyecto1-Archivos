/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas.bodega;

import datos.ProductoDAO;
import datos.TiendaDAO;
import entidades.Empleado;
import entidades.Producto;
import entidades.Tienda;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Bodega extends javax.swing.JFrame {

    private ProductoDAO productoDao = new ProductoDAO();
    private TiendaDAO tiendaDao = new TiendaDAO();
    private Empleado empleado;
    private Producto productoSeleccionado;
    private Tienda tienda;

    /**
     * Constructor de la clase bodega
     * @param empleado El empleado del proyecto
     */
    public Bodega(Empleado empleado) {
        initComponents();
        this.empleado = empleado;
        setResizable(false);
        setLocationRelativeTo(null);
        actualizarTabla(0);
        tienda = tiendaDao.listarTiendaPorCodigo(empleado.getId_tienda());
        labelUser.setText(empleado.getNombre());
        labelRol.setText(empleado.getRol());
        labelTienda.setText(tienda.getNombre());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoBuscar = new javax.swing.JTextField();
        botonBusqueda = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelRol = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelTienda = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        botonId = new javax.swing.JButton();
        botonNombre = new javax.swing.JButton();
        botonFabricante = new javax.swing.JButton();
        botonPrecio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Bodega");

        botonBusqueda.setText("Buscar");
        botonBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBusquedaActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Usuario: ");

        labelUser.setText("user");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Rol:");

        labelRol.setText("rol");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Productos");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Tienda");

        labelTienda.setText("tienda");

        botonAgregar.setText("Agregar Producto");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar Producto");
        botonModificar.setEnabled(false);
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonBorrar.setText("Borrar Producto");
        botonBorrar.setEnabled(false);
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        jLabel5.setText("Ordenar por: ");

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

        botonFabricante.setText("Fabricante");
        botonFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFabricanteActionPerformed(evt);
            }
        });

        botonPrecio.setText("Precio");
        botonPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPrecioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(labelTienda)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(labelRol, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonFabricante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(botonNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(labelUser)
                            .addComponent(jLabel3)
                            .addComponent(labelRol))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(labelTienda))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botonBusqueda)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonFabricante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonPrecio)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Boton que obtiene el texto de la caja de texto y llama a hacer una busqueda en la base de datos
     * @param evt 
     */
    private void botonBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBusquedaActionPerformed
        String texto = textoBuscar.getText();
        ArrayList<Producto> productos = productoDao.listarProductosPorNombre(empleado.getId_tienda(), texto);

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id_producto");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fabricante");
        modelo.addColumn("Codigo");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");

        for (Producto producto : productos) {
            String[] data = new String[6];
            data[0] = String.valueOf(producto.getId_producto());
            data[1] = producto.getNombre();
            data[2] = producto.getFabricante();
            data[3] = producto.getCodigo();
            data[4] = String.valueOf(producto.getPrecio());
            data[5] = String.valueOf(producto.getCantidad());
            modelo.addRow(data);
        }

        tabla1.setModel(modelo);
        tabla1.setEditingRow(2);
    }//GEN-LAST:event_botonBusquedaActionPerformed

    /**
     * Evento al presionar la tabla
     * Obtiene el valor de la fila y asi obtiene el producto seleccionado de la base de datos
     * @param evt 
     */
    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked
        int Fila = tabla1.getSelectedRow();
        String id = tabla1.getValueAt(Fila, 0).toString();
        productoSeleccionado = productoDao.listarProductosPorId(Integer.parseInt(id));
        botonModificar.setEnabled(true);
        botonBorrar.setEnabled(true);
    }//GEN-LAST:event_tabla1MouseClicked

    /**
     * Crea una ventana de datos para agregar un producto
     * @param evt 
     */
    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        Datos_Producto datos = new Datos_Producto(null, false, this);
        datos.setVisible(true);
    }//GEN-LAST:event_botonAgregarActionPerformed

    /**
     * Crea una ventana para modificar productos
     * Habilita los botones de mostrar y modificar
     * @param evt 
     */
    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        Datos_Producto datos = new Datos_Producto(productoSeleccionado, true, this);
        datos.setVisible(true);
        botonModificar.setEnabled(false);
        botonBorrar.setEnabled(false);
        
    }//GEN-LAST:event_botonModificarActionPerformed

    /**
     * Comprueba si se quiere borrar un producto
     * Llama al metodo para borrar el producto
     * @param evt 
     */
    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Estas seguro de borrar el producto: \n"
                + "Nombre: " + productoSeleccionado.getNombre() + "\n"
                + "Fabricante: " + productoSeleccionado.getFabricante() + "\n"
                + "Codigo: " + productoSeleccionado.getCodigo());
        if(opcion == JOptionPane.YES_OPTION){
            boolean resultado = productoDao.eliminarProducto(productoSeleccionado);
            if(resultado == true){
                JOptionPane.showMessageDialog(null, "Producto eliminado");
                eliminarProductoSeleccionado();
                actualizarTabla(0);
            }
        }
    }//GEN-LAST:event_botonBorrarActionPerformed

    /**
     * Actualiza la tabla de productos en base a un parametro
     * @param evt 
     */
    private void botonIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIdActionPerformed
        actualizarTabla(0);
    }//GEN-LAST:event_botonIdActionPerformed

    /**
     * Actualiza la tabla de productos en base a un parametro
     * @param evt 
     */
    private void botonNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNombreActionPerformed
        actualizarTabla(1);
    }//GEN-LAST:event_botonNombreActionPerformed

    /**
     * Actualiza la tabla de productos en base a un parametro
     * @param evt 
     */
    private void botonFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFabricanteActionPerformed
        actualizarTabla(2);
    }//GEN-LAST:event_botonFabricanteActionPerformed

    /**
     * Actualiza la tabla de productos en base a un parametro
     * @param evt 
     */
    private void botonPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPrecioActionPerformed
       actualizarTabla(3);
    }//GEN-LAST:event_botonPrecioActionPerformed

    /**
     * Actualiza la tabla de productos en base a un parametro
     * @param evt 
     */
    public void actualizarTabla(int orden) {
        ArrayList<Producto> productos = productoDao.listarProductosPorTienda(empleado.getId_tienda(), true, orden);

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id_producto");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fabricante");
        modelo.addColumn("Codigo");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");

        for (Producto producto : productos) {
            String[] data = new String[6];
            data[0] = String.valueOf(producto.getId_producto());
            data[1] = producto.getNombre();
            data[2] = producto.getFabricante();
            data[3] = producto.getCodigo();
            data[4] = String.valueOf(producto.getPrecio());
            data[5] = String.valueOf(producto.getCantidad());
            modelo.addRow(data);
        }
        tabla1.setModel(modelo);
    }
    
    /**
     * Elimina la variable del producto seleccionado
     */
    public void eliminarProductoSeleccionado() {
        productoSeleccionado = null;
        botonModificar.setEnabled(false);
        botonBorrar.setEnabled(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonBusqueda;
    private javax.swing.JButton botonFabricante;
    private javax.swing.JButton botonId;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonNombre;
    private javax.swing.JButton botonPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelRol;
    private javax.swing.JLabel labelTienda;
    private javax.swing.JLabel labelUser;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField textoBuscar;
    // End of variables declaration//GEN-END:variables
}
