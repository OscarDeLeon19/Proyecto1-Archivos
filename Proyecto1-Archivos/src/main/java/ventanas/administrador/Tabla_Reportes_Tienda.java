package ventanas.administrador;

import datos.ReporteDAO;
import entidades.Reporte;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Tabla_Reportes_Tienda extends javax.swing.JFrame {

    ReporteDAO reporteDao = new ReporteDAO();

    public Tabla_Reportes_Tienda() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public void actualizarTablaReporte1() {
        ArrayList<Reporte> reportes1 = reporteDao.verReporteTienda(1);
        labelTitulo.setText("Top 10 productos mas vendidos por tienda");
        DefaultTableModel modelo1 = new DefaultTableModel();
        modelo1.addColumn("Ventas Realizadas");
        modelo1.addColumn("Id del Producto");
        modelo1.addColumn("Nombre del Producto");
        modelo1.addColumn("Id de la Tienda");
        modelo1.addColumn("Nombre de la Tienda");

        for (Reporte reporte : reportes1) {
            String[] data = new String[5];
            data[0] = String.valueOf(reporte.getCantidad());
            data[1] = reporte.getId();
            data[2] = reporte.getNombre();
            data[3] = String.valueOf(reporte.getId_tienda());
            data[4] = reporte.getNombreTienda();
            modelo1.addRow(data);
        }
        tabla1.setModel(modelo1);
        tabla1.getColumnModel().getColumn(0).setPreferredWidth(1);
        tabla1.getColumnModel().getColumn(1).setPreferredWidth(1);
        tabla1.getColumnModel().getColumn(3).setPreferredWidth(1);

        DefaultTableCellRenderer alineacion1 = new DefaultTableCellRenderer();
        alineacion1.setHorizontalAlignment(SwingConstants.CENTER);
        tabla1.getColumnModel().getColumn(0).setCellRenderer(alineacion1);
        tabla1.getColumnModel().getColumn(1).setCellRenderer(alineacion1);
        tabla1.getColumnModel().getColumn(2).setCellRenderer(alineacion1);
        tabla1.getColumnModel().getColumn(3).setCellRenderer(alineacion1);
        tabla1.getColumnModel().getColumn(4).setCellRenderer(alineacion1);

        // Tabla 2
        ArrayList<Reporte> reportes2 = reporteDao.verReporteTienda(2);
        DefaultTableModel modelo2 = new DefaultTableModel();
        modelo2.addColumn("Ventas Realizadas");
        modelo2.addColumn("Id del Producto");
        modelo2.addColumn("Nombre del Producto");
        modelo2.addColumn("Id de la Tienda");
        modelo2.addColumn("Nombre de la Tienda");

        for (Reporte reporte : reportes2) {
            String[] data = new String[5];
            data[0] = String.valueOf(reporte.getCantidad());
            data[1] = reporte.getId();
            data[2] = reporte.getNombre();
            data[3] = String.valueOf(reporte.getId_tienda());
            data[4] = reporte.getNombreTienda();
            modelo2.addRow(data);
        }
        tabla2.setModel(modelo2);
        tabla2.getColumnModel().getColumn(0).setPreferredWidth(1);
        tabla2.getColumnModel().getColumn(1).setPreferredWidth(1);
        tabla2.getColumnModel().getColumn(3).setPreferredWidth(1);

        DefaultTableCellRenderer alineacion2 = new DefaultTableCellRenderer();
        alineacion2.setHorizontalAlignment(SwingConstants.CENTER);
        tabla2.getColumnModel().getColumn(0).setCellRenderer(alineacion2);
        tabla2.getColumnModel().getColumn(1).setCellRenderer(alineacion2);
        tabla2.getColumnModel().getColumn(2).setCellRenderer(alineacion2);
        tabla2.getColumnModel().getColumn(3).setCellRenderer(alineacion2);
        tabla2.getColumnModel().getColumn(4).setCellRenderer(alineacion2);

        // Tabla 3
        ArrayList<Reporte> reportes3 = reporteDao.verReporteTienda(3);
        DefaultTableModel modelo3 = new DefaultTableModel();
        modelo3.addColumn("Ventas Realizadas");
        modelo3.addColumn("Id del Producto");
        modelo3.addColumn("Nombre del Producto");
        modelo3.addColumn("Id de la Tienda");
        modelo3.addColumn("Nombre de la Tienda");

        for (Reporte reporte : reportes3) {
            String[] data = new String[5];
            data[0] = String.valueOf(reporte.getCantidad());
            data[1] = reporte.getId();
            data[2] = reporte.getNombre();
            data[3] = String.valueOf(reporte.getId_tienda());
            data[4] = reporte.getNombreTienda();
            modelo3.addRow(data);
        }
        tabla3.setModel(modelo3);
        tabla3.getColumnModel().getColumn(0).setPreferredWidth(1);
        tabla3.getColumnModel().getColumn(1).setPreferredWidth(1);
        tabla3.getColumnModel().getColumn(3).setPreferredWidth(1);

        DefaultTableCellRenderer alineacion3 = new DefaultTableCellRenderer();
        alineacion3.setHorizontalAlignment(SwingConstants.CENTER);
        tabla3.getColumnModel().getColumn(0).setCellRenderer(alineacion3);
        tabla3.getColumnModel().getColumn(1).setCellRenderer(alineacion3);
        tabla3.getColumnModel().getColumn(2).setCellRenderer(alineacion3);
        tabla3.getColumnModel().getColumn(3).setCellRenderer(alineacion3);
        tabla3.getColumnModel().getColumn(4).setCellRenderer(alineacion3);

    }

    public void actualizarTablaReporte2() {
        ArrayList<Reporte> reportes1 = reporteDao.verReporteTiendaGanancias(1);
        labelTitulo.setText("Top 10 productos con mas ingresos por tienda");
        DefaultTableModel modelo1 = new DefaultTableModel();
        modelo1.addColumn("Ventas Realizadas");
        modelo1.addColumn("Id del Producto");
        modelo1.addColumn("Nombre del Producto");
        modelo1.addColumn("Id de la Tienda");
        modelo1.addColumn("Nombre de la Tienda");

        for (Reporte reporte : reportes1) {
            String[] data = new String[5];
            data[0] = String.valueOf(reporte.getSuma());
            data[1] = reporte.getId();
            data[2] = reporte.getNombre();
            data[3] = String.valueOf(reporte.getId_tienda());
            data[4] = reporte.getNombreTienda();
            modelo1.addRow(data);
        }
        tabla1.setModel(modelo1);
        tabla1.getColumnModel().getColumn(0).setPreferredWidth(1);
        tabla1.getColumnModel().getColumn(1).setPreferredWidth(1);
        tabla1.getColumnModel().getColumn(3).setPreferredWidth(1);

        DefaultTableCellRenderer alineacion1 = new DefaultTableCellRenderer();
        alineacion1.setHorizontalAlignment(SwingConstants.CENTER);
        tabla1.getColumnModel().getColumn(0).setCellRenderer(alineacion1);
        tabla1.getColumnModel().getColumn(1).setCellRenderer(alineacion1);
        tabla1.getColumnModel().getColumn(2).setCellRenderer(alineacion1);
        tabla1.getColumnModel().getColumn(3).setCellRenderer(alineacion1);
        tabla1.getColumnModel().getColumn(4).setCellRenderer(alineacion1);

        // Tabla 2
        ArrayList<Reporte> reportes2 = reporteDao.verReporteTiendaGanancias(2);
        DefaultTableModel modelo2 = new DefaultTableModel();
        modelo2.addColumn("Ventas Realizadas");
        modelo2.addColumn("Id del Producto");
        modelo2.addColumn("Nombre del Producto");
        modelo2.addColumn("Id de la Tienda");
        modelo2.addColumn("Nombre de la Tienda");

        for (Reporte reporte : reportes2) {
            String[] data = new String[5];
            data[0] = String.valueOf(reporte.getSuma());
            data[1] = reporte.getId();
            data[2] = reporte.getNombre();
            data[3] = String.valueOf(reporte.getId_tienda());
            data[4] = reporte.getNombreTienda();
            modelo2.addRow(data);
        }
        tabla2.setModel(modelo2);
        tabla2.getColumnModel().getColumn(0).setPreferredWidth(1);
        tabla2.getColumnModel().getColumn(1).setPreferredWidth(1);
        tabla2.getColumnModel().getColumn(3).setPreferredWidth(1);

        DefaultTableCellRenderer alineacion2 = new DefaultTableCellRenderer();
        alineacion2.setHorizontalAlignment(SwingConstants.CENTER);
        tabla2.getColumnModel().getColumn(0).setCellRenderer(alineacion2);
        tabla2.getColumnModel().getColumn(1).setCellRenderer(alineacion2);
        tabla2.getColumnModel().getColumn(2).setCellRenderer(alineacion2);
        tabla2.getColumnModel().getColumn(3).setCellRenderer(alineacion2);
        tabla2.getColumnModel().getColumn(4).setCellRenderer(alineacion2);

        // Tabla 3
        ArrayList<Reporte> reportes3 = reporteDao.verReporteTiendaGanancias(3);
        DefaultTableModel modelo3 = new DefaultTableModel();
        modelo3.addColumn("Ventas Realizadas");
        modelo3.addColumn("Id del Producto");
        modelo3.addColumn("Nombre del Producto");
        modelo3.addColumn("Id de la Tienda");
        modelo3.addColumn("Nombre de la Tienda");

        for (Reporte reporte : reportes3) {
            String[] data = new String[5];
            data[0] = String.valueOf(reporte.getSuma());
            data[1] = reporte.getId();
            data[2] = reporte.getNombre();
            data[3] = String.valueOf(reporte.getId_tienda());
            data[4] = reporte.getNombreTienda();
            modelo3.addRow(data);
        }
        tabla3.setModel(modelo3);
        tabla3.getColumnModel().getColumn(0).setPreferredWidth(1);
        tabla3.getColumnModel().getColumn(1).setPreferredWidth(1);
        tabla3.getColumnModel().getColumn(3).setPreferredWidth(1);

        DefaultTableCellRenderer alineacion3 = new DefaultTableCellRenderer();
        alineacion3.setHorizontalAlignment(SwingConstants.CENTER);
        tabla3.getColumnModel().getColumn(0).setCellRenderer(alineacion3);
        tabla3.getColumnModel().getColumn(1).setCellRenderer(alineacion3);
        tabla3.getColumnModel().getColumn(2).setCellRenderer(alineacion3);
        tabla3.getColumnModel().getColumn(3).setCellRenderer(alineacion3);
        tabla3.getColumnModel().getColumn(4).setCellRenderer(alineacion3);

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Titulo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Sucursal Central");

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Sucursal Norte");

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla2.setEnabled(false);
        jScrollPane2.setViewportView(tabla2);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Sucursal Sur");

        tabla3.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla3.setEnabled(false);
        jScrollPane3.setViewportView(tabla3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tabla2;
    private javax.swing.JTable tabla3;
    // End of variables declaration//GEN-END:variables
}
