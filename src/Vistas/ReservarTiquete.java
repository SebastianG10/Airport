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
public class ReservarTiquete extends javax.swing.JDialog {

    /**
     * Creates new form ReservarTiquete
     */
    AeropuertoControlador LaNubia;
    int documento;
    int cuentaBancaria;
    String tipo;
    int telefono;
    String aerolinea;
    int codigoVuelo;
    Date fecha;
    int dia;
    int mes;
    int año;
    int hora;
    int codigoDestino;
    String pais;
    String ciudad;

    public ReservarTiquete(java.awt.Frame parent, boolean modal, AeropuertoControlador LaNubia) {
        super(parent, modal);
        initComponents();
        this.LaNubia = LaNubia;
    }


    public int getDocumento() {
        return documento;
    }

    public int getCuentaBancaria() {
        return cuentaBancaria;
    }

    public String getTipo() {
        return tipo;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public int getCodigoVuelo() {
        return codigoVuelo;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }
    public Date getFecha(){
        return fecha;
    }

    public int getHora() {
        return hora;
    }

    public int getCodigoDestino() {
        return codigoDestino;
    }

    public String getPais() {
        return pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblReservarTiquete = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblDocumento = new javax.swing.JLabel();
        lblCuentaBancaria = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblAerolinea = new javax.swing.JLabel();
        lblCodigoVuelo = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblCodigoDestino = new javax.swing.JLabel();
        lblPais = new javax.swing.JLabel();
        lblCiudad = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        txtDocumento = new javax.swing.JTextField();
        txtCuentaBancaria = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtAerolinea = new javax.swing.JTextField();
        txtCodigoVuelo = new javax.swing.JTextField();
        txtDia = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        txtCodigoDestino = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        txtAño = new javax.swing.JTextField();
        lblDia = new javax.swing.JLabel();
        lblMes = new javax.swing.JLabel();
        lblAño = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblReservarTiquete.setText("Reservar Vuelo");

        lblDocumento.setText("Documento");

        lblCuentaBancaria.setText("Cuenta Bancaria");

        lblTipo.setText("Tipo");

        lblTelefono.setText("Telefono");

        lblAerolinea.setText("Aerolinea");

        lblCodigoVuelo.setText("Codigo del Vuelo");

        lblFecha.setText("Fecha");

        lblHora.setText("Hora");

        lblCodigoDestino.setText("Codigo del Destino");

        lblPais.setText("Pais");

        lblCiudad.setText("Ciudad");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        txtCodigoDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoDestinoActionPerformed(evt);
            }
        });

        txtAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAñoActionPerformed(evt);
            }
        });

        lblDia.setText("Día");

        lblMes.setText("Mes");

        lblAño.setText("Año");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPais)
                            .addComponent(lblCiudad))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPais, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(txtCiudad)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblCuentaBancaria)
                                .addComponent(lblCodigoVuelo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDocumento, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTipo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAerolinea, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblHora, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(lblFecha)
                            .addComponent(lblCodigoDestino))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtDocumento, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtCuentaBancaria, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtCodigoVuelo, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtCodigoDestino, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(lblDia)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(lblMes)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(txtHora)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblAño)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblReservarTiquete)
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblReservarTiquete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDocumento)
                            .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCuentaBancaria)
                            .addComponent(txtCuentaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipo)
                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefono)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAerolinea)
                            .addComponent(txtAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigoVuelo)
                            .addComponent(txtCodigoVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFecha)
                            .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDia)
                            .addComponent(lblMes)
                            .addComponent(lblAño))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHora)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigoDestino)
                            .addComponent(txtCodigoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPais)
                            .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCiudad)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAceptar)
                            .addComponent(btnLimpiar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAñoActionPerformed

    private void txtCodigoDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoDestinoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtDocumento.setText("");
        txtCuentaBancaria.setText("");
        txtTipo.setText("");
        txtTelefono.setText("");
        txtAerolinea.setText("");
        txtCodigoVuelo.setText("");
        txtDia.setText("");
        txtMes.setText("");
        txtAño.setText("");
        txtHora.setText("");
        txtCodigoDestino.setText("");
        txtPais.setText("");
        txtCiudad.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        documento = Integer.parseInt(txtDocumento.getText());
        cuentaBancaria = Integer.parseInt(txtCuentaBancaria.getText());
        tipo = txtTipo.getText();
        telefono = Integer.parseInt(txtTelefono.getText());
        aerolinea = txtAerolinea.getText();
        codigoVuelo = Integer.parseInt(txtCodigoVuelo.getText());
        dia = Integer.parseInt(txtDia.getText());
        mes = Integer.parseInt(txtMes.getText());
        año = Integer.parseInt(txtAño.getText());
        fecha=new Date(dia,mes,año);
        hora = Integer.parseInt(txtHora.getText());
        codigoDestino = Integer.parseInt(txtCodigoDestino.getText());
        pais = txtPais.getText();
        ciudad = txtCiudad.getText();
        try {
            LaNubia.reservarTiquete(documento, cuentaBancaria, tipo, telefono, aerolinea, codigoVuelo,fecha, hora, codigoDestino, pais, ciudad);
        } catch (MisExcepciones ex) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error "+ex);
        }
        setVisible(false);
    }//GEN-LAST:event_btnAceptarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAerolinea;
    private javax.swing.JLabel lblAño;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblCodigoDestino;
    private javax.swing.JLabel lblCodigoVuelo;
    private javax.swing.JLabel lblCuentaBancaria;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblReservarTiquete;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField txtAerolinea;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCodigoDestino;
    private javax.swing.JTextField txtCodigoVuelo;
    private javax.swing.JTextField txtCuentaBancaria;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
