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
 * @author Daniel
 */
public class ConsultarPrecios extends javax.swing.JDialog {

    /**
     * Creates new form ConsultarPrecios
     */
    AeropuertoControlador LaNubia;
    int codigoDestino;
    String clase;
    int dia;
    int mes;
    int año;

    public ConsultarPrecios(java.awt.Frame parent, boolean modal, AeropuertoControlador LaNubia) {
        super(parent, modal);
        initComponents();
        this.LaNubia = LaNubia;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblConsultarPrecios = new javax.swing.JLabel();
        lblCodigoDestino = new javax.swing.JLabel();
        lblClase = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblDia = new javax.swing.JLabel();
        lblMes = new javax.swing.JLabel();
        lblAño = new javax.swing.JLabel();
        txtCodigoDestino = new javax.swing.JTextField();
        txtClase = new javax.swing.JTextField();
        txtDia = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        txtAño = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblConsultarPrecios.setText("Consultar Precios");

        lblCodigoDestino.setText("Ingrese el codigo del destino:");

        lblClase.setText("Ingrese la clase:");

        lblFecha.setText("Fecha");

        lblDia.setText("Dia:");

        lblMes.setText("Mes:");

        lblAño.setText("Año:");

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(lblConsultarPrecios))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCodigoDestino)
                                    .addComponent(lblClase))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigoDestino)
                                    .addComponent(txtClase, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblFecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDia)
                                .addGap(41, 41, 41)
                                .addComponent(lblMes)
                                .addGap(35, 35, 35)
                                .addComponent(lblAño)))))
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(btnConsultar)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConsultarPrecios)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoDestino)
                    .addComponent(txtCodigoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClase)
                    .addComponent(txtClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(lblDia)
                    .addComponent(lblMes)
                    .addComponent(lblAño))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnConsultar)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        codigoDestino = Integer.parseInt(txtCodigoDestino.getText());
        clase = txtClase.getText();
        int dia = Integer.parseInt(txtDia.getText());
        int mes = Integer.parseInt(txtMes.getText());
        int año = Integer.parseInt(txtAño.getText());
        try {
            JOptionPane.showMessageDialog(null, LaNubia.consultarPrecios(clase, new Date(dia, mes, año), codigoDestino));
        } catch (MisExcepciones ex) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error "+ex);
        }
        setVisible(false);
    }//GEN-LAST:event_btnConsultarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JLabel lblAño;
    private javax.swing.JLabel lblClase;
    private javax.swing.JLabel lblCodigoDestino;
    private javax.swing.JLabel lblConsultarPrecios;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblMes;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtClase;
    private javax.swing.JTextField txtCodigoDestino;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtMes;
    // End of variables declaration//GEN-END:variables
}
