package ventanas.administrador;

import entidades.Reporte;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Tabla_Reportes extends javax.swing.JFrame {

    public Tabla_Reportes() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public void actualizarTablaReporte1(ArrayList<Reporte> reportes) {
        labelTitulo.setText("Top 10 productos mas vendidos");
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Ventas Realizadas");
        modelo.addColumn("Id del Producto");
        modelo.addColumn("Nombre");

        for (Reporte reporte : reportes) {
            String[] data = new String[3];
            data[0] = String.valueOf(reporte.getCantidad());
            data[1] = reporte.getId();
            data[2] = reporte.getNombre();
            modelo.addRow(data);
        }
        tabla1.setModel(modelo);
        tabla1.getColumnModel().getColumn(0).setPreferredWidth(1);
        tabla1.getColumnModel().getColumn(1).setPreferredWidth(1);

        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tabla1.getColumnModel().getColumn(0).setCellRenderer(tcr);
        tabla1.getColumnModel().getColumn(1).setCellRenderer(tcr);
        tabla1.getColumnModel().getColumn(2).setCellRenderer(tcr);
    }

    public void actualizarTablaReporte2(ArrayList<Reporte> reportes) {
        labelTitulo.setText("Top 10 clientes que mas ganancias generan");
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Ganancias Generadas");
        modelo.addColumn("Nit del Cliente");
        modelo.addColumn("Nombre");

        for (Reporte reporte : reportes) {
            String[] data = new String[3];
            data[0] = "Q." + String.valueOf(reporte.getSuma());
            data[1] = reporte.getId();
            data[2] = reporte.getNombre();
            modelo.addRow(data);
        }
        tabla1.setModel(modelo);
        tabla1.getColumnModel().getColumn(0).setPreferredWidth(1);
        tabla1.getColumnModel().getColumn(1).setPreferredWidth(1);

        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tabla1.getColumnModel().getColumn(0).setCellRenderer(tcr);
        tabla1.getColumnModel().getColumn(1).setCellRenderer(tcr);
        tabla1.getColumnModel().getColumn(2).setCellRenderer(tcr);
    }

    public void actualizarTablaReporte3(ArrayList<Reporte> reportes) {
        labelTitulo.setText("Top 3 sucursales con mas ventas");
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Ventas Realizadas");
        modelo.addColumn("Id de la Tienda");
        modelo.addColumn("Nombre");

        for (Reporte reporte : reportes) {
            String[] data = new String[3];
            data[0] = String.valueOf(reporte.getCantidad());
            data[1] = reporte.getId();
            data[2] = reporte.getNombre();
            modelo.addRow(data);
        }
        tabla1.setModel(modelo);
        tabla1.getColumnModel().getColumn(0).setPreferredWidth(1);
        tabla1.getColumnModel().getColumn(1).setPreferredWidth(1);

        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tabla1.getColumnModel().getColumn(0).setCellRenderer(tcr);
        tabla1.getColumnModel().getColumn(1).setCellRenderer(tcr);
        tabla1.getColumnModel().getColumn(2).setCellRenderer(tcr);
    }

    public void actualizarTablaReporte4(ArrayList<Reporte> reportes) {
        labelTitulo.setText("Top 3 sucursales con mas ingresos");
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Ganancias Generadas");
        modelo.addColumn("Id de la tienda");
        modelo.addColumn("Nombre");

        for (Reporte reporte : reportes) {
            String[] data = new String[3];
            data[0] = "Q." + String.valueOf(reporte.getSuma());
            data[1] = reporte.getId();
            data[2] = reporte.getNombre();
            modelo.addRow(data);
        }
        tabla1.setModel(modelo);
        tabla1.getColumnModel().getColumn(0).setPreferredWidth(1);
        tabla1.getColumnModel().getColumn(1).setPreferredWidth(1);

        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tabla1.getColumnModel().getColumn(0).setCellRenderer(tcr);
        tabla1.getColumnModel().getColumn(1).setCellRenderer(tcr);
        tabla1.getColumnModel().getColumn(2).setCellRenderer(tcr);
    }

    public void actualizarTablaReporte5(ArrayList<Reporte> reportes) {
        labelTitulo.setText("Top 3 empleados con mas ventas");
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Ventas Realizadas");
        modelo.addColumn("Id del empleado");
        modelo.addColumn("Nombre");

        for (Reporte reporte : reportes) {
            String[] data = new String[3];
            data[0] = String.valueOf(reporte.getCantidad());
            data[1] = reporte.getId();
            data[2] = reporte.getNombre();
            modelo.addRow(data);
        }
        tabla1.setModel(modelo);
        tabla1.getColumnModel().getColumn(0).setPreferredWidth(1);
        tabla1.getColumnModel().getColumn(1).setPreferredWidth(1);

        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tabla1.getColumnModel().getColumn(0).setCellRenderer(tcr);
        tabla1.getColumnModel().getColumn(1).setCellRenderer(tcr);
        tabla1.getColumnModel().getColumn(2).setCellRenderer(tcr);
    }

    public void actualizarTablaReporte6(ArrayList<Reporte> reportes) {
        labelTitulo.setText("Top 3 empleados con mas ingresos");
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Ganancias Generadas");
        modelo.addColumn("Id del empleado");
        modelo.addColumn("Nombre");

        for (Reporte reporte : reportes) {
            String[] data = new String[3];
            data[0] = "Q." + String.valueOf(reporte.getSuma());
            data[1] = reporte.getId();
            data[2] = reporte.getNombre();
            modelo.addRow(data);
        }
        tabla1.setModel(modelo);
        tabla1.getColumnModel().getColumn(0).setPreferredWidth(1);
        tabla1.getColumnModel().getColumn(1).setPreferredWidth(1);

        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tabla1.getColumnModel().getColumn(0).setCellRenderer(tcr);
        tabla1.getColumnModel().getColumn(1).setCellRenderer(tcr);
        tabla1.getColumnModel().getColumn(2).setCellRenderer(tcr);
    }

    public void actualizarTablaReporte7(ArrayList<Reporte> reportes) {
        labelTitulo.setText("Top 10 productos con mas ingresos");
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Ganancias Generadas");
        modelo.addColumn("Id del producto");
        modelo.addColumn("Nombre");

        for (Reporte reporte : reportes) {
            String[] data = new String[3];
            data[0] = "Q." + String.valueOf(reporte.getSuma());
            data[1] = reporte.getId();
            data[2] = reporte.getNombre();
            modelo.addRow(data);
        }
        tabla1.setModel(modelo);
        tabla1.getColumnModel().getColumn(0).setPreferredWidth(1);
        tabla1.getColumnModel().getColumn(1).setPreferredWidth(1);

        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tabla1.getColumnModel().getColumn(0).setCellRenderer(tcr);
        tabla1.getColumnModel().getColumn(1).setCellRenderer(tcr);
        tabla1.getColumnModel().getColumn(2).setCellRenderer(tcr);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Titulo Reporte");
        labelTitulo.setToolTipText("");

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla1.setEnabled(false);
        jScrollPane1.setViewportView(tabla1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}
