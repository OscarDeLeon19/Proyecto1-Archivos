package ventanas.bodega;

import datos.ProductoDAO;
import entidades.Producto;
import javax.swing.JOptionPane;

public class Datos_Producto extends javax.swing.JFrame {

    private ProductoDAO prDao = new ProductoDAO();
    private Bodega bodega;

    private Producto producto;

    public Datos_Producto(Producto producto, boolean modificacion, Bodega bodega) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        this.producto = producto;
        this.bodega = bodega;
        if (modificacion == true) {
            botonAgregar.setEnabled(false);
            botonModificar.setEnabled(true);
            actualizarCajasDeTexto();
        } else {
            botonAgregar.setEnabled(true);
            botonModificar.setEnabled(false);
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
        jLabel6 = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        textoFabricante = new javax.swing.JTextField();
        textoCodigo = new javax.swing.JTextField();
        textoPrecio = new javax.swing.JTextField();
        textoCantidad = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Producto");

        jLabel1.setText("Datos del Producto");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Fabricante:");

        jLabel4.setText("Codigo:");

        jLabel5.setText("Precio:");

        jLabel6.setText("Cantidad:");

        textoCodigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(textoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(34, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(textoFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(textoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(textoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(botonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        try {
            String nombre = textoNombre.getText();
            if (nombre.equals("")) {
                nombre = null;
            }
            String fabricante = textoFabricante.getText();
            if (fabricante.equals("")) {
                fabricante = null;
            }
            String codigo = textoCodigo.getText();
            if (codigo.equals("")) {
                codigo = null;
            }
            double precio = Double.parseDouble(textoPrecio.getText());
            int cantidad = Integer.parseInt(textoCantidad.getText());
            Producto nuevoProducto = new Producto(0, nombre, fabricante, codigo, precio, cantidad, 4);
            if (comprobacion(codigo) == true) {
                boolean resultado = prDao.insertarProducto(nuevoProducto);
                if (resultado == true) {
                    bodega.actualizarTabla(0);
                    dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "El codigo del este producto ya esta asignado a otro");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Los valores de precio y cantidad deben ser numericos");
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        try {
            String nombre = textoNombre.getText();
            if (nombre.equals("")) {
                nombre = null;
            }
            String fabricante = textoFabricante.getText();
            if (fabricante.equals("")) {
                fabricante = null;
            }
            String codigo = textoCodigo.getText();
            if (codigo.equals("")) {
                codigo = null;
            }
            double precio = Double.parseDouble(textoPrecio.getText());
            int cantidad = Integer.parseInt(textoCantidad.getText());
            Producto nuevoProducto = new Producto(producto.getId_producto(), nombre, fabricante, codigo, precio, cantidad, 4);
            boolean resultado = prDao.actualizarProducto(nuevoProducto);
            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "Producto actualizado correctamente");
                bodega.actualizarTabla(0);
                bodega.eliminarProductoSeleccionado();
                dispose();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Los valores de precio y cantidad deben ser numericos");
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    public void actualizarCajasDeTexto() {
        textoNombre.setText(producto.getNombre());
        textoFabricante.setText(producto.getFabricante());
        textoCodigo.setText(producto.getCodigo());
        textoPrecio.setText(String.valueOf(producto.getPrecio()));
        textoCantidad.setText(String.valueOf(producto.getCantidad()));
        textoCodigo.setEnabled(false);
    }

    public boolean comprobacion(String codigo) {
        Producto pr = prDao.listarProductosPorCodigo(codigo, 4);
        return pr == null;
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
    private javax.swing.JTextField textoCantidad;
    private javax.swing.JTextField textoCodigo;
    private javax.swing.JTextField textoFabricante;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoPrecio;
    // End of variables declaration//GEN-END:variables
}
