package ventanas.administrador;

import datos.ReporteDAO;
import entidades.Reporte;
import java.util.ArrayList;

public class Reportes extends javax.swing.JFrame {

    private ReporteDAO reporteDao = new ReporteDAO();
    
    public Reportes() {
        initComponents();       
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botonReporte1 = new javax.swing.JButton();
        botonReporte2 = new javax.swing.JButton();
        botonReporte3 = new javax.swing.JButton();
        botonReporte4 = new javax.swing.JButton();
        botonReporte5 = new javax.swing.JButton();
        botonReporte6 = new javax.swing.JButton();
        botonReporte7 = new javax.swing.JButton();
        botonReporte8 = new javax.swing.JButton();
        botonReporte9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Reportes");

        botonReporte1.setText("Top 10 productos mas vendidos");
        botonReporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporte1ActionPerformed(evt);
            }
        });

        botonReporte2.setText("Top 10 clietes que mas ganancias generan");
        botonReporte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporte2ActionPerformed(evt);
            }
        });

        botonReporte3.setText("Top 3 sucursales con mas ventas");
        botonReporte3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporte3ActionPerformed(evt);
            }
        });

        botonReporte4.setText("Top 3 sucursales con mas ingresos");
        botonReporte4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporte4ActionPerformed(evt);
            }
        });

        botonReporte5.setText("Top 3 empleados con más ventas");
        botonReporte5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporte5ActionPerformed(evt);
            }
        });

        botonReporte6.setText("Top 3 empleados con mas ingresos");
        botonReporte6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporte6ActionPerformed(evt);
            }
        });

        botonReporte7.setText("Top 10 productos con mas ingresos");
        botonReporte7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporte7ActionPerformed(evt);
            }
        });

        botonReporte8.setText("Top 5 productos más vendidos por sucursal");
        botonReporte8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporte8ActionPerformed(evt);
            }
        });

        botonReporte9.setText("Top 5 productos con más ingresos por sucursal");
        botonReporte9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporte9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonReporte1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonReporte2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonReporte3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonReporte4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonReporte5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonReporte6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonReporte7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonReporte8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonReporte9, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonReporte1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonReporte2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonReporte3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonReporte4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonReporte5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonReporte6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonReporte7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonReporte8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonReporte9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonReporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporte1ActionPerformed
        ArrayList<Reporte> reportes = reporteDao.verReporteCantidad(1);
        Tabla_Reportes tabla = new Tabla_Reportes();
        tabla.actualizarTablaReporte1(reportes);
        tabla.setVisible(true);
    }//GEN-LAST:event_botonReporte1ActionPerformed

    private void botonReporte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporte2ActionPerformed
        ArrayList<Reporte> reportes = reporteDao.verReporteSuma(1);
        Tabla_Reportes tabla = new Tabla_Reportes();
        tabla.actualizarTablaReporte2(reportes);
        tabla.setVisible(true);
    }//GEN-LAST:event_botonReporte2ActionPerformed

    private void botonReporte3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporte3ActionPerformed
        ArrayList<Reporte> reportes = reporteDao.verReporteCantidad(2);
        Tabla_Reportes tabla = new Tabla_Reportes();
        tabla.actualizarTablaReporte3(reportes);
        tabla.setVisible(true);
    }//GEN-LAST:event_botonReporte3ActionPerformed

    private void botonReporte4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporte4ActionPerformed
        ArrayList<Reporte> reportes = reporteDao.verReporteSuma(2);
        Tabla_Reportes tabla = new Tabla_Reportes();
        tabla.actualizarTablaReporte4(reportes);
        tabla.setVisible(true);
    }//GEN-LAST:event_botonReporte4ActionPerformed

    private void botonReporte5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporte5ActionPerformed
        ArrayList<Reporte> reportes = reporteDao.verReporteCantidad(3);
        Tabla_Reportes tabla = new Tabla_Reportes();
        tabla.actualizarTablaReporte5(reportes);
        tabla.setVisible(true);
    }//GEN-LAST:event_botonReporte5ActionPerformed

    private void botonReporte6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporte6ActionPerformed
        ArrayList<Reporte> reportes = reporteDao.verReporteSuma(3);
        Tabla_Reportes tabla = new Tabla_Reportes();
        tabla.actualizarTablaReporte6(reportes);
        tabla.setVisible(true);
    }//GEN-LAST:event_botonReporte6ActionPerformed

    private void botonReporte7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporte7ActionPerformed
        ArrayList<Reporte> reportes = reporteDao.verReporteSuma(4);
        Tabla_Reportes tabla = new Tabla_Reportes();
        tabla.actualizarTablaReporte7(reportes);
        tabla.setVisible(true);
    }//GEN-LAST:event_botonReporte7ActionPerformed

    private void botonReporte8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporte8ActionPerformed
        Tabla_Reportes_Tienda tabla = new Tabla_Reportes_Tienda();
        tabla.actualizarTablaReporte1();
        tabla.setVisible(true);
        
    }//GEN-LAST:event_botonReporte8ActionPerformed

    private void botonReporte9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporte9ActionPerformed
        Tabla_Reportes_Tienda tabla = new Tabla_Reportes_Tienda();
        tabla.actualizarTablaReporte2();
        tabla.setVisible(true);
    }//GEN-LAST:event_botonReporte9ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonReporte1;
    private javax.swing.JButton botonReporte2;
    private javax.swing.JButton botonReporte3;
    private javax.swing.JButton botonReporte4;
    private javax.swing.JButton botonReporte5;
    private javax.swing.JButton botonReporte6;
    private javax.swing.JButton botonReporte7;
    private javax.swing.JButton botonReporte8;
    private javax.swing.JButton botonReporte9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
