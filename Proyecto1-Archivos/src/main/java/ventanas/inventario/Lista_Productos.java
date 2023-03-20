package ventanas.inventario;

import entidades.Producto;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Lista_Productos extends javax.swing.JFrame {

    private ArrayList<Producto> productos;
    private int fila = -1;
    
    /**
     * Constructor de la clase Lista_Productos
     * @param productos Los productos de la lista
     */
    public Lista_Productos(ArrayList<Producto> productos) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        this.productos = productos;
    }
    
    /**
     * Abre la ventana
     */
    public void abrir(){
        this.setVisible(true);
        actualizarTablaProductos();
    }
    
    /**
     * Actualiza la tabla de los productos
     */
    public void actualizarTablaProductos() {
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        botonBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Productos");

        jLabel1.setText("Lista de Productos a ingresar en tienda");

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id_Nombre", "Nombre", "Fabricante", "Codigo", "Precio", "Cantidad"
            }
        ));
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla1);

        botonBorrar.setText("Borrar Producto");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(botonBorrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonBorrar)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Selecciona un producto de la tabla
     * @param evt 
     */
    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked
        fila = tabla1.getSelectedRow();
    }//GEN-LAST:event_tabla1MouseClicked

    /**
     * Borra un producto de la lista
     * @param evt 
     */
    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        if (fila != -1) {
            productos.remove(fila);
        }
        actualizarTablaProductos();
        fila = -1;
    }//GEN-LAST:event_botonBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}
