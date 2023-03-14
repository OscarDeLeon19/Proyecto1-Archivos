/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas.inventario;

import datos.ProductoDAO;
import datos.TiendaDAO;
import entidades.Empleado;
import entidades.Producto;
import entidades.Tienda;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Inventario extends javax.swing.JFrame {

    private ProductoDAO productoDao = new ProductoDAO();
    private TiendaDAO tiendaDao = new TiendaDAO();
    private Empleado empleado;
    private Tienda tienda;
    private Producto productoSeleccionado;
    private ArrayList<Producto> productosIngreso = new ArrayList<>();
    Lista_Productos lista = new Lista_Productos(productosIngreso);

    public Inventario(Empleado empleado) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        this.empleado = empleado;
        tienda = tiendaDao.listarTiendaPorCodigo(empleado.getId_tienda());
        labelUser.setText(empleado.getNombre());
        labelRol.setText(empleado.getRol());
        labelTienda.setText(tienda.getNombre());
        actualizarTablaActual();
        actualizarTablaProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelTienda = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelRol = new javax.swing.JLabel();
        textoBuscar = new javax.swing.JTextField();
        botonBusqueda = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        textoCantidad = new javax.swing.JTextField();
        botonAumentar = new javax.swing.JButton();
        botonDisminuir = new javax.swing.JButton();
        botonAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        textoPrecio = new javax.swing.JTextField();
        textoFabricante = new javax.swing.JTextField();
        textoCodigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        botonListado = new javax.swing.JButton();
        botonTransferir = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Usuario: ");

        labelUser.setText("user");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Tienda");

        labelTienda.setText("tienda");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Rol:");

        labelRol.setText("rol");

        botonBusqueda.setText("Buscar");
        botonBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBusquedaActionPerformed(evt);
            }
        });

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Fabricante", "Codigo", "Precio", "Cantidad", "Tienda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Productos en otras sucursales");

        textoCantidad.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        textoCantidad.setEnabled(false);

        botonAumentar.setText("+");
        botonAumentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAumentarActionPerformed(evt);
            }
        });

        botonDisminuir.setText("-");
        botonDisminuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDisminuirActionPerformed(evt);
            }
        });

        botonAgregar.setText("Agregar a la lista");
        botonAgregar.setEnabled(false);
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Producto Seleccionado");

        jLabel6.setText("Nombre: ");

        textoNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textoNombre.setEnabled(false);

        textoPrecio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textoPrecio.setEnabled(false);

        textoFabricante.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textoFabricante.setEnabled(false);

        textoCodigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textoCodigo.setEnabled(false);

        jLabel7.setText("Fabricante:");

        jLabel8.setText("Codigo:");

        jLabel9.setText("Precio:");

        jLabel10.setText("Cantidad:");

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabla2);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Productos en Tienda");

        botonListado.setText("Listado de Productos");
        botonListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListadoActionPerformed(evt);
            }
        });

        botonTransferir.setText("Transferir Productos");
        botonTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTransferirActionPerformed(evt);
            }
        });

        botonBorrar.setText("Borrar Lista");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelUser))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTienda)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonBusqueda))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(labelRol, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addGap(29, 29, 29)
                                                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel9)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(textoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel8)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(textoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel7)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel5)
                                                            .addComponent(textoFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(28, 28, 28)
                                        .addComponent(textoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botonAumentar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botonDisminuir))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(botonAgregar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(botonListado))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(botonTransferir)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(botonBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
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
                    .addComponent(jLabel4)
                    .addComponent(labelTienda))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonBusqueda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(textoFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(textoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(textoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(botonAumentar)
                            .addComponent(botonDisminuir))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAgregar)
                            .addComponent(botonListado))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonTransferir)
                        .addComponent(botonBorrar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBusquedaActionPerformed
        String texto = textoBuscar.getText();
        ArrayList<Producto> productos = productoDao.listarProductosPorNombreInventario(empleado.getId_tienda(), texto);

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id_producto");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fabricante");
        modelo.addColumn("Codigo");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Tienda");

        for (Producto producto : productos) {
            String[] data = new String[7];
            data[0] = String.valueOf(producto.getId_producto());
            data[1] = producto.getNombre();
            data[2] = producto.getFabricante();
            data[3] = producto.getCodigo();
            data[4] = String.valueOf(producto.getPrecio());
            data[5] = String.valueOf(producto.getCantidad());
            data[6] = producto.getNombreTienda();
            modelo.addRow(data);
        }

        tabla1.setModel(modelo);
        tabla1.setEditingRow(2);
    }//GEN-LAST:event_botonBusquedaActionPerformed

    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked
        int Fila = tabla1.getSelectedRow();
        String id = tabla1.getValueAt(Fila, 0).toString();
        productoSeleccionado = productoDao.listarProductosPorId(Integer.parseInt(id));
        actualizarProductoSeleccionado();
    }//GEN-LAST:event_tabla1MouseClicked

    private void botonAumentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAumentarActionPerformed
        int cantidad = Integer.parseInt(textoCantidad.getText());
        cantidad++;
        if (cantidad > productoSeleccionado.getCantidad()) {
            JOptionPane.showMessageDialog(null, "No se puede vender una cantidad mayor a las existencias del producto");
        } else {
            textoCantidad.setText(String.valueOf(cantidad));
        }
    }//GEN-LAST:event_botonAumentarActionPerformed

    private void botonDisminuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDisminuirActionPerformed
        int cantidad = Integer.parseInt(textoCantidad.getText());
        cantidad--;
        if (cantidad < 1) {
            // Nada
        } else {
            textoCantidad.setText(String.valueOf(cantidad));
        }
    }//GEN-LAST:event_botonDisminuirActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        boolean comprobacion = false;
        for (Producto producto : productosIngreso) {
            if (productoSeleccionado.getId_producto() == producto.getId_producto()) {
                JOptionPane.showMessageDialog(null, "Este producto ya esta en la lista");
                comprobacion = true;
            }
        }

        if (comprobacion != true) {
            Producto producto = new Producto();
            producto.setId_producto(productoSeleccionado.getId_producto());
            producto.setNombre(productoSeleccionado.getNombre());
            producto.setFabricante(productoSeleccionado.getFabricante());
            producto.setCodigo(productoSeleccionado.getCodigo());
            producto.setPrecio(productoSeleccionado.getPrecio());
            producto.setCantidad(Integer.parseInt(textoCantidad.getText()));
            producto.setId_tienda(productoSeleccionado.getId_tienda());
            productosIngreso.add(producto);
            JOptionPane.showMessageDialog(null, "Producto Agregado a la lista");
        }
        limpiarDatos();
        lista.actualizarTablaProductos();
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListadoActionPerformed
        lista.abrir();
    }//GEN-LAST:event_botonListadoActionPerformed

    private void botonTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTransferirActionPerformed
        if (productosIngreso.size() > 0) {
            for (Producto producto : productosIngreso) {
                Producto existencia = productoDao.listarProductosPorCodigo(producto.getCodigo(), tienda.getId_tienda());
                if (existencia == null) {
                    Producto nuevoProducto = new Producto();
                    nuevoProducto.setNombre(producto.getNombre());
                    nuevoProducto.setFabricante(producto.getFabricante());
                    nuevoProducto.setCodigo(producto.getCodigo());
                    nuevoProducto.setPrecio(producto.getPrecio());
                    nuevoProducto.setCantidad(producto.getCantidad());
                    nuevoProducto.setId_tienda(tienda.getId_tienda());
                    productoDao.insertarProducto(nuevoProducto);
                    Producto pr = productoDao.listarProductosPorId(producto.getId_producto());
                    int existenciasActuales = pr.getCantidad();
                    int nuevasExistencias = producto.getCantidad();
                    int resta = existenciasActuales - nuevasExistencias;
                    pr.setCantidad(resta);
                    productoDao.actualizarExistencias(pr);                 
                    JOptionPane.showMessageDialog(null, "Transferencia de productos realizada correctamente");
                } else {
                    int existenciasActuales = existencia.getCantidad();
                    int nuevasExistencias = producto.getCantidad();
                    int sumatoria = existenciasActuales + nuevasExistencias;
                    existencia.setCantidad(sumatoria);
                    productoDao.actualizarExistencias(existencia);
                    Producto pr = productoDao.listarProductosPorId(producto.getId_producto());
                    int existenciasActuales2 = pr.getCantidad();
                    int resta = existenciasActuales2 - nuevasExistencias;
                    pr.setCantidad(resta);
                    productoDao.actualizarExistencias(pr);
                    JOptionPane.showMessageDialog(null, "Transferencia de productos realizada correctamente");
                }
            }
            actualizarTablaActual();
            actualizarTablaProductos();
            productosIngreso.clear();
            lista.actualizarTablaProductos();
        }
    }//GEN-LAST:event_botonTransferirActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        productosIngreso.clear();
        lista.actualizarTablaProductos();
    }//GEN-LAST:event_botonBorrarActionPerformed

    public void actualizarTablaProductos() {
        ArrayList<Producto> productos = productoDao.listarProductosDeOtraTienda(empleado.getId_tienda());

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id_producto");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fabricante");
        modelo.addColumn("Codigo");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Tienda");

        for (Producto producto : productos) {
            String[] data = new String[7];
            data[0] = String.valueOf(producto.getId_producto());
            data[1] = producto.getNombre();
            data[2] = producto.getFabricante();
            data[3] = producto.getCodigo();
            data[4] = String.valueOf(producto.getPrecio());
            data[5] = String.valueOf(producto.getCantidad());
            data[6] = producto.getNombreTienda();
            modelo.addRow(data);
        }

        tabla1.setModel(modelo);
    }

    public void actualizarTablaActual() {
        ArrayList<Producto> productos = productoDao.listarProductosPorTienda(empleado.getId_tienda(), true);

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

        tabla2.setModel(modelo);
    }

    private void actualizarProductoSeleccionado() {
        textoNombre.setText(productoSeleccionado.getNombre());
        textoFabricante.setText(productoSeleccionado.getFabricante());
        textoCodigo.setText(productoSeleccionado.getCodigo());
        textoPrecio.setText(String.valueOf(productoSeleccionado.getPrecio()));
        textoCantidad.setText("1");
        botonAumentar.setEnabled(true);
        botonDisminuir.setEnabled(true);
        botonAgregar.setEnabled(true);
    }

    public void limpiarDatos() {
        textoNombre.setText("");
        textoFabricante.setText("");
        textoCodigo.setText("");
        textoPrecio.setText("");
        textoCantidad.setText("");
        botonAumentar.setEnabled(false);
        botonDisminuir.setEnabled(false);
        botonAgregar.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonAumentar;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonBusqueda;
    private javax.swing.JButton botonDisminuir;
    private javax.swing.JButton botonListado;
    private javax.swing.JButton botonTransferir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelRol;
    private javax.swing.JLabel labelTienda;
    private javax.swing.JLabel labelUser;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tabla2;
    private javax.swing.JTextField textoBuscar;
    private javax.swing.JTextField textoCantidad;
    private javax.swing.JTextField textoCodigo;
    private javax.swing.JTextField textoFabricante;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoPrecio;
    // End of variables declaration//GEN-END:variables
}
