/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controladores.AeropuertoControlador;
import Modelos.MisExcepciones;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian
 */
public class ModificarPromocion extends javax.swing.JDialog {

    /**
     * Creates new form ModificarPromocion
     */
    AeropuertoControlador LaNubia;

    String concepto;
    int codigo;
    Date fechaInicio;
    Date fechaFin;
    int diaI;
    int mesI;
    int añoI;
    int diaF;
    int mesF;
    int añoF;

    public ModificarPromocion(java.awt.Frame parent, boolean modal, AeropuertoControlador LaNubia) {
        super(parent, modal);
        initComponents();
        this.LaNubia = LaNubia;
    }

    public String getConcepto() {
        return concepto;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public int getCodigo() {
        return codigo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblModificarPromocion = new javax.swing.JLabel();
        lblConcepto = new javax.swing.JLabel();
        lblFechaInicio = new javax.swing.JLabel();
        lblFechaFin = new javax.swing.JLabel();
        txtDiaInicio = new javax.swing.JTextField();
        txtDiaFin = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtMesInicio = new javax.swing.JTextField();
        txtAñoInicio = new javax.swing.JTextField();
        lblDiaInicio = new javax.swing.JLabel();
        lblAñoInicio = new javax.swing.JLabel();
        lblMesInicio = new javax.swing.JLabel();
        lblDiaFin = new javax.swing.JLabel();
        lblMesFin = new javax.swing.JLabel();
        lblAñoFin = new javax.swing.JLabel();
        txtMesFin = new javax.swing.JTextField();
        txtAñoFin = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConcepto = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblModificarPromocion.setText("Modificar Promocion");

        lblConcepto.setText("Nuevo Concepto");

        lblFechaInicio.setText("Nueva Fecha de Inicio");

        lblFechaFin.setText("Nueva Fecha de Fin");

        txtDiaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaInicioActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lblDiaInicio.setText("Dia");

        lblAñoInicio.setText("Año");

        lblMesInicio.setText("Mes");

        lblDiaFin.setText("Dia");

        lblMesFin.setText("Mes");

        lblAñoFin.setText("Año");

        txtConcepto.setColumns(20);
        txtConcepto.setRows(5);
        jScrollPane1.setViewportView(txtConcepto);

        jLabel1.setText("Ingrese el Codigo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFechaInicio)
                            .addComponent(lblFechaFin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDiaFin)
                            .addComponent(lblDiaInicio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDiaInicio)
                            .addComponent(txtDiaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMesInicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMesFin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMesFin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAñoFin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAñoFin))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAñoInicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAñoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAceptar)
                        .addGap(86, 86, 86))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConcepto)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblModificarPromocion)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblModificarPromocion)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConcepto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFechaInicio)
                        .addComponent(txtDiaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDiaInicio)
                        .addComponent(lblMesInicio))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAñoInicio)
                        .addComponent(txtAñoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaFin)
                    .addComponent(lblDiaFin)
                    .addComponent(lblAñoFin)
                    .addComponent(lblMesFin)
                    .addComponent(txtDiaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMesFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAñoFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnAceptar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDiaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaInicioActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        concepto = txtConcepto.getText();
        codigo = Integer.parseInt(txtCodigo.getText());
        diaI = Integer.parseInt(txtDiaInicio.getText());
        mesI = Integer.parseInt(txtMesInicio.getText());
        añoI = Integer.parseInt(txtAñoInicio.getText());
        fechaInicio = new Date(diaI, mesI, añoI);
        diaF = Integer.parseInt(txtDiaFin.getText());
        mesF = Integer.parseInt(txtMesFin.getText());
        añoF = Integer.parseInt(txtAñoFin.getText());
        fechaFin = new Date(diaF, mesF, añoF);
        try {
            LaNubia.modificarPromociones(concepto, codigo, fechaInicio, fechaFin);
        } catch (MisExcepciones ex) {
           JOptionPane.showMessageDialog(this, "Ocurrió un error "+ex);
        }
        setVisible(false);

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtConcepto.setText("");
        txtDiaInicio.setText("");
        txtMesInicio.setText("");
        txtAñoInicio.setText("");
        txtDiaFin.setText("");
        txtMesFin.setText("");
        txtAñoFin.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAñoFin;
    private javax.swing.JLabel lblAñoInicio;
    private javax.swing.JLabel lblConcepto;
    private javax.swing.JLabel lblDiaFin;
    private javax.swing.JLabel lblDiaInicio;
    private javax.swing.JLabel lblFechaFin;
    private javax.swing.JLabel lblFechaInicio;
    private javax.swing.JLabel lblMesFin;
    private javax.swing.JLabel lblMesInicio;
    private javax.swing.JLabel lblModificarPromocion;
    private javax.swing.JTextField txtAñoFin;
    private javax.swing.JTextField txtAñoInicio;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtConcepto;
    private javax.swing.JTextField txtDiaFin;
    private javax.swing.JTextField txtDiaInicio;
    private javax.swing.JTextField txtMesFin;
    private javax.swing.JTextField txtMesInicio;
    // End of variables declaration//GEN-END:variables
}