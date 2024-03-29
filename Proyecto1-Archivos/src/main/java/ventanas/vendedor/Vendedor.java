package ventanas.vendedor;

import datos.ClienteDAO;
import datos.ProductoDAO;
import datos.TiendaDAO;
import datos.VentaDAO;
import entidades.Cliente;
import entidades.Empleado;
import entidades.Producto;
import entidades.Tienda;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Vendedor extends javax.swing.JFrame {

    private ProductoDAO productoDao = new ProductoDAO();
    private TiendaDAO tiendaDao = new TiendaDAO();
    private ClienteDAO clienteDao = new ClienteDAO();
    private Producto productoSeleccionado;
    private Empleado empleado;
    private Tienda tienda;
    private Cliente cliente = null;
    private ArrayList<Producto> productosVenta = new ArrayList<>();
    private Lista_Productos lista = new Lista_Productos(productosVenta);

    /**
     * Constructor de la clase Vendedor
     *
     * @param empleado Empleado actual
     */
    public Vendedor(Empleado empleado) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        this.empleado = empleado;
        tienda = tiendaDao.listarTiendaPorCodigo(empleado.getId_tienda());
        labelUser.setText(empleado.getNombre());
        labelRol.setText(empleado.getRol());
        labelTienda.setText(tienda.getNombre());
        botonAumentar.setEnabled(false);
        botonDisminuir.setEnabled(false);
        actualizarTablaProductos();

    }

    /**
     * Actualiza la tabla de productos listados en la tienda
     */
    public void actualizarTablaProductos() {
        ArrayList<Producto> productos = productoDao.listarProductosPorTienda(empleado.getId_tienda(), false, 0);

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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelRol = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelTienda = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
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
        textoCantidad = new javax.swing.JTextField();
        botonAumentar = new javax.swing.JButton();
        botonDisminuir = new javax.swing.JButton();
        botonAgregar = new javax.swing.JButton();
        botonListado = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        textoNitCliente = new javax.swing.JTextField();
        botonBuscarCliente = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        textoNombreCliente = new javax.swing.JTextField();
        textoTelefonoCliente = new javax.swing.JTextField();
        textoDpiCliente = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        textoDescuentoCliente = new javax.swing.JTextField();
        botonBorrarCliente = new javax.swing.JButton();
        botonRealizarVenta = new javax.swing.JButton();
        botonCancelarVenta = new javax.swing.JButton();
        botonActualizarCliente = new javax.swing.JButton();
        textoBuscar = new javax.swing.JTextField();
        botonBusqueda = new javax.swing.JButton();

        jLabel17.setText("jLabel17");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Vendedor");

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

        botonAgregar.setText("Agregar a la Venta");
        botonAgregar.setEnabled(false);
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonListado.setText("Listado de Productos");
        botonListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListadoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Cliente");

        jLabel12.setText("NIT:");

        botonBuscarCliente.setText("Buscar Cliente");
        botonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarClienteActionPerformed(evt);
            }
        });

        jLabel13.setText("Datos del cliente");

        jLabel14.setText("Nombre: ");

        jLabel15.setText("Telefono:");

        jLabel16.setText("DPI:");

        textoNombreCliente.setText("Consumidor Final");
        textoNombreCliente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textoNombreCliente.setEnabled(false);

        textoTelefonoCliente.setText("--");
        textoTelefonoCliente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textoTelefonoCliente.setEnabled(false);

        textoDpiCliente.setText("--");
        textoDpiCliente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textoDpiCliente.setEnabled(false);

        jLabel18.setText("Descuento: ");

        textoDescuentoCliente.setText("0");
        textoDescuentoCliente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textoDescuentoCliente.setEnabled(false);

        botonBorrarCliente.setText("Borrar Cliente");
        botonBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarClienteActionPerformed(evt);
            }
        });

        botonRealizarVenta.setText("Realizar Venta");
        botonRealizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRealizarVentaActionPerformed(evt);
            }
        });

        botonCancelarVenta.setText("Cancelar Venta");
        botonCancelarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarVentaActionPerformed(evt);
            }
        });

        botonActualizarCliente.setText("Actualizar Cliente");
        botonActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarClienteActionPerformed(evt);
            }
        });

        botonBusqueda.setText("Buscar");
        botonBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBusquedaActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelTienda)
                                .addGap(125, 125, 125)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelUser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(labelRol, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(29, 29, 29)
                                        .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(90, 90, 90)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textoNitCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
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
                                                    .addComponent(textoFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(117, 117, 117))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(botonBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(36, 36, 36))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(92, 92, 92)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addComponent(jLabel18))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(textoNombreCliente)
                                                    .addComponent(textoTelefonoCliente)
                                                    .addComponent(textoDpiCliente)
                                                    .addComponent(textoDescuentoCliente)
                                                    .addComponent(botonBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(botonActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel10)
                                        .addGap(28, 28, 28)
                                        .addComponent(textoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botonAumentar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botonDisminuir))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(botonRealizarVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botonAgregar))
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(botonCancelarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(botonListado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(323, 323, 323)))
                        .addContainerGap())))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(labelTienda))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonBusqueda)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(textoNitCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textoFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(textoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(botonAumentar)
                            .addComponent(botonDisminuir)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(textoNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(textoTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(textoDpiCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregar)
                    .addComponent(botonListado)
                    .addComponent(jLabel18)
                    .addComponent(textoDescuentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonActualizarCliente)
                    .addComponent(botonRealizarVenta)
                    .addComponent(botonCancelarVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonBorrarCliente)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Evente que surge al presionar la tabla Obtiene el valor del Id y realiza
     * la busqueda en la base de datos
     *
     * @param evt
     */
    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked
        int Fila = tabla1.getSelectedRow();
        String id = tabla1.getValueAt(Fila, 0).toString();
        productoSeleccionado = productoDao.listarProductosPorId(Integer.parseInt(id));
        actualizarProductoSeleccionado();
    }//GEN-LAST:event_tabla1MouseClicked

    /**
     * Aumenta la cantidad de productos que se compraran
     *
     * @param evt
     */
    private void botonAumentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAumentarActionPerformed
        int cantidad = Integer.parseInt(textoCantidad.getText());
        cantidad++;
        if (cantidad > productoSeleccionado.getCantidad()) {
            JOptionPane.showMessageDialog(null, "No se puede vender una cantidad mayor a las existencias del producto");
        } else {
            textoCantidad.setText(String.valueOf(cantidad));
        }
    }//GEN-LAST:event_botonAumentarActionPerformed

    /**
     * Disminuye la cantidad de productos que se quieren comprar
     *
     * @param evt
     */
    private void botonDisminuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDisminuirActionPerformed
        int cantidad = Integer.parseInt(textoCantidad.getText());
        cantidad--;
        if (cantidad < 1) {
            // Nada
        } else {
            textoCantidad.setText(String.valueOf(cantidad));
        }
    }//GEN-LAST:event_botonDisminuirActionPerformed

    /**
     * Agrega un producto a la lista de productos Comprueba que un producto no
     * se repita
     *
     * @param evt
     */
    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        boolean comprobacion = false;
        for (Producto producto : productosVenta) {
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
            productosVenta.add(producto);
            JOptionPane.showMessageDialog(null, "Producto Agregado a la lista");
        }
        limpiarDatos();
        lista.actualizar();
    }//GEN-LAST:event_botonAgregarActionPerformed

    /**
     * Abre la lista de productos
     *
     * @param evt
     */
    private void botonListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListadoActionPerformed
        lista.abrir();
    }//GEN-LAST:event_botonListadoActionPerformed

    /**
     * Busca un cliente en la base de datos
     *
     * @param evt
     */
    private void botonBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarClienteActionPerformed
        cliente = clienteDao.listarClientePorNit(textoNitCliente.getText());
        actualizarDatosCliente();

    }//GEN-LAST:event_botonBuscarClienteActionPerformed

    /**
     * Borra el los datos del cliente en la ventana
     *
     * @param evt
     */
    private void botonBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarClienteActionPerformed
        limpiarDatosCliente();
        cliente = null;
    }//GEN-LAST:event_botonBorrarClienteActionPerformed

    /**
     * Realiza una venta Obtiene el total y comprueba que haya un cliente
     * seleccionado Llama al metodo para realizar una venta
     *
     * @param evt
     */
    private void botonRealizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRealizarVentaActionPerformed
        if (productosVenta.size() > 0) {
            VentaDAO ventaDao = new VentaDAO();
            double total = ventaDao.obtenerTotal(productosVenta);
            if (cliente == null) {
                cliente = clienteDao.listarClientePorNit("000000000");
            }
            int opcion = JOptionPane.showConfirmDialog(null, "El total de la compra es de: " + total + ". Nombre del cliente: " + cliente.getNombre() + ". ¿Confirmar compra?");
            if (opcion == JOptionPane.YES_OPTION) {
                ventaDao.realizarVenta(productosVenta, cliente, empleado, tienda);
                productosVenta.clear();
                cliente = null;
                limpiarDatosCliente();
                actualizarTablaProductos();
            } else {
                cliente = null;
                limpiarDatosCliente();
            }
        }
    }//GEN-LAST:event_botonRealizarVentaActionPerformed

    /**
     * Cancela la venta y borra todos los productos de la lista.
     *
     * @param evt
     */
    private void botonCancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarVentaActionPerformed
        if (productosVenta.isEmpty() == false) {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas cancelar la venta?");
            if (opcion == JOptionPane.YES_OPTION) {
                productosVenta.clear();
            }
        }
    }//GEN-LAST:event_botonCancelarVentaActionPerformed

    /**
     * Abre la ventana para actualizar datos de un cliente
     *
     * @param evt
     */
    private void botonActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarClienteActionPerformed
        if (cliente != null) {
            JTextField textos[] = new JTextField[3];
            textos[0] = textoNombreCliente;
            textos[1] = textoTelefonoCliente;
            textos[2] = textoDpiCliente;
            Datos_Cliente datos = new Datos_Cliente(cliente.getNit_cliente(), true, textos);
            datos.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No hay un cliente en el sistema aun");
        }
    }//GEN-LAST:event_botonActualizarClienteActionPerformed

    /**
     * Realiza una busqueda filtrada en base al nombre del producto
     *
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
     * Borra los datos del cliente de la ventana
     */
    public void limpiarDatosCliente() {
        textoNombreCliente.setText("Consumidor Final");
        textoTelefonoCliente.setText("--");
        textoDpiCliente.setText("--");
        textoDescuentoCliente.setText("0");
    }

    /**
     * Actualiza los datos del cliente para mostrarlos en la ventana Si el
     * cliente no existe muestra la opcion de agregar
     */
    private void actualizarDatosCliente() {
        if (cliente != null) {
            if (cliente.getNit_cliente().equals("000000000") == false) {
                textoNitCliente.setText("");
                textoNombreCliente.setText(cliente.getNombre());
                textoTelefonoCliente.setText(cliente.getTelefono());
                textoDpiCliente.setText(cliente.getDpi());
                textoDescuentoCliente.setText(String.valueOf(cliente.getDescuento()));
            } else {
                cliente = null;
                limpiarDatosCliente();
            }
        } else {
            int opcion = JOptionPane.showConfirmDialog(null, "El cliente no se encuentra registrado en el sistema. ¿Deseas agregarlo?");
            if (opcion == JOptionPane.YES_OPTION) {
                JTextField textos[] = new JTextField[3];
                textos[0] = textoNombreCliente;
                textos[1] = textoTelefonoCliente;
                textos[2] = textoDpiCliente;
                Datos_Cliente datos = new Datos_Cliente(textoNitCliente.getText(), false, textos);
                datos.setVisible(true);
            }
        }
    }

    /**
     * Limpia los datos de la caja de productos
     */
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

    /**
     * Actualiza los el producto seleccionado de la tabla
     */
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizarCliente;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonAumentar;
    private javax.swing.JButton botonBorrarCliente;
    private javax.swing.JButton botonBuscarCliente;
    private javax.swing.JButton botonBusqueda;
    private javax.swing.JButton botonCancelarVenta;
    private javax.swing.JButton botonDisminuir;
    private javax.swing.JButton botonListado;
    private javax.swing.JButton botonRealizarVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelRol;
    private javax.swing.JLabel labelTienda;
    private javax.swing.JLabel labelUser;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField textoBuscar;
    private javax.swing.JTextField textoCantidad;
    private javax.swing.JTextField textoCodigo;
    private javax.swing.JTextField textoDescuentoCliente;
    private javax.swing.JTextField textoDpiCliente;
    private javax.swing.JTextField textoFabricante;
    private javax.swing.JTextField textoNitCliente;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoNombreCliente;
    private javax.swing.JTextField textoPrecio;
    private javax.swing.JTextField textoTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
