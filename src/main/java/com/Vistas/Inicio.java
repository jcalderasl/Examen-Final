/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Vistas;

import java.awt.Image;
import javax.swing.*;

/**
 *
 * @author Edwar Alejandro
 */
public class Inicio extends javax.swing.JFrame {

    
    
    public Inicio() {
        initComponents();
        setLocationRelativeTo(this);
        SetImageLabel(label_imagen, rutaLogo);
    }

   String rutaLogo="src/main/java/com/Img/logo.png";
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        label_imagen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tx_DPI = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Jc_fechaNacimiento = new org.netbeans.modules.form.InvalidComponent();
        bt_Buscar = new javax.swing.JButton();
        bt_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(4, 28, 67));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(44, 128, 191), new java.awt.Color(44, 128, 191), new java.awt.Color(44, 128, 191), new java.awt.Color(44, 128, 191)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_imagen.setText("jLabel1");
        jPanel3.add(label_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, 220));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 370, 240));

        jPanel2.setBackground(new java.awt.Color(251, 136, 40));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("FECHA NACIMIENTO");
        jLabel1.setToolTipText("");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 280, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 300, 40));

        tx_DPI.setBackground(new java.awt.Color(255, 255, 255));
        tx_DPI.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tx_DPI.setForeground(new java.awt.Color(0, 0, 0));
        tx_DPI.setText("jTextField1");
        tx_DPI.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tx_DPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_DPIActionPerformed(evt);
            }
        });
        jPanel1.add(tx_DPI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 350, 30));

        jPanel4.setBackground(new java.awt.Color(251, 136, 40));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 27)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("DPI");
        jLabel2.setToolTipText("");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 70, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 120, 40));

        Jc_fechaNacimiento.null;
        jPanel1.add(Jc_fechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 350, 30));

        bt_Buscar.setBackground(new java.awt.Color(51, 255, 0));
        bt_Buscar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        bt_Buscar.setForeground(new java.awt.Color(0, 0, 0));
        bt_Buscar.setText("BUSCAR");
        jPanel1.add(bt_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 160, 40));

        bt_limpiar.setBackground(new java.awt.Color(255, 255, 0));
        bt_limpiar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        bt_limpiar.setForeground(new java.awt.Color(0, 0, 0));
        bt_limpiar.setText("LIMPIAR");
        jPanel1.add(bt_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 160, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tx_DPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_DPIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_DPIActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    private void SetImageLabel(JLabel label, String path){
        ImageIcon image = new ImageIcon(path);
        Icon icon = new ImageIcon(
        image.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icon);
        this.repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.netbeans.modules.form.InvalidComponent Jc_fechaNacimiento;
    private javax.swing.JButton bt_Buscar;
    private javax.swing.JButton bt_limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel label_imagen;
    private javax.swing.JTextField tx_DPI;
    // End of variables declaration//GEN-END:variables

    
    
    
}
