package control_pagos;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import mensajes.msjConfirmar;
import operaciones.funciones;

public class agregarPrecios extends javax.swing.JDialog {

    static String ciclo = "";
    public int status = 0;
    funciones fun = new funciones();

    public agregarPrecios(java.awt.Frame parent, boolean modal, String ciclo) {
        super(parent, modal);
        initComponents();
        this.setTitle("Asignación de precios | control de pagos");
        this.setIconImage(new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage());
        this.setLocationRelativeTo(null);
        this.ciclo = ciclo;
    }

    public int getStatusD() {
        return status;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        cPree = new javax.swing.JTextField();
        cPrim = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        cSec = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        iPree = new javax.swing.JTextField();
        iPrim = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        iSec = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        msjError = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "COLEGIATURA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 0, 12))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel21.setText("$");

        cPree.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        cPree.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cPreeKeyTyped(evt);
            }
        });

        cPrim.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        cPrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPrimActionPerformed(evt);
            }
        });
        cPrim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cPrimKeyTyped(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel22.setText("$");

        jLabel26.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel26.setText("$");

        cSec.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        cSec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cSecKeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel18.setText("Preescolar:");

        jLabel19.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel19.setText("Primaria:");

        jLabel20.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel20.setText("Secundaria:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cPree, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel26)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cSec, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel22)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cPrim, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cPree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cPrim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel20))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jButton1.setText("Guardar precios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "INSCRIPCIÓN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 0, 12))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel23.setText("$");

        iPree.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        iPree.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                iPreeKeyTyped(evt);
            }
        });

        iPrim.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        iPrim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                iPrimKeyTyped(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel24.setText("$");

        jLabel27.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel27.setText("$");

        iSec.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        iSec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                iSecKeyTyped(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel25.setText("Preescolar:");

        jLabel28.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel28.setText("Primaria:");

        jLabel29.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel29.setText("Secundaria:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iPree, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel27)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(iSec, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel24)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(iPrim, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iPree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iPrim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel29))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        msjError.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        msjError.setForeground(new java.awt.Color(204, 0, 0));
        msjError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar precios de colegiatura e inscripción");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(msjError, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msjError, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cPreeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cPreeKeyTyped
        typeKey(evt);
    }//GEN-LAST:event_cPreeKeyTyped

    private void iPreeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iPreeKeyTyped
        typeKey(evt);
    }//GEN-LAST:event_iPreeKeyTyped

    private void cPrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPrimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cPrimActionPerformed

    private void cPrimKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cPrimKeyTyped
        typeKey(evt);
    }//GEN-LAST:event_cPrimKeyTyped

    private void cSecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cSecKeyTyped
        typeKey(evt);
    }//GEN-LAST:event_cSecKeyTyped

    private void iPrimKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iPrimKeyTyped
        typeKey(evt);
    }//GEN-LAST:event_iPrimKeyTyped

    private void iSecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iSecKeyTyped
        typeKey(evt);
    }//GEN-LAST:event_iSecKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        guardar();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(agregarPrecios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregarPrecios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregarPrecios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregarPrecios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                agregarPrecios dialog = new agregarPrecios(new javax.swing.JFrame(), true, ciclo);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cPree;
    private javax.swing.JTextField cPrim;
    private javax.swing.JTextField cSec;
    private javax.swing.JTextField iPree;
    private javax.swing.JTextField iPrim;
    private javax.swing.JTextField iSec;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel msjError;
    // End of variables declaration//GEN-END:variables
    private void guardar() {
        nvo n = new nvo(null, true);
        n.setVisible(true);
        try {
            String cantidad[][] = new String[3][3];
            boolean x = false, d = false;
            //msjConfirmar msj = new msjConfirmar(null, true);

            //String pass = JOptionPane.showInputDialog(rootPane, "para registrar un nuevo usuario es necesario\n ingresar la contraseña del Administrador", "Aviso", WIDTH);
            if (!cPree.getText().trim().equals("") && !cPrim.getText().trim().equals("") && !cSec.getText().trim().equals("")) {
                x = true;
                if (!iPree.getText().trim().equals("") && !iPrim.getText().trim().equals("") && !iSec.getText().trim().equals("")) {
                    d = true;
                }
            }
            cantidad[0][0] = cPree.getText().trim();
            cantidad[0][1] = iPree.getText().trim();
            cantidad[0][2] = "Preescolar";
            cantidad[1][0] = cPrim.getText().trim();
            cantidad[1][1] = iPrim.getText().trim();
            cantidad[1][2] = "Primaria";
            cantidad[2][0] = cSec.getText().trim();
            cantidad[2][1] = iSec.getText().trim();
            cantidad[2][2] = "Secundaria";
            if (x == true && d == true) {
                if (n.getReturnStatus() == 1) {
                    if (fun.newCicloEscolar(ciclo)) {
                        if (fun.registrarPre(cantidad, ciclo)) {
                            JOptionPane.showMessageDialog(rootPane, "Ciclo escolar registrado con exito");
                            status = 1;
                            this.dispose();
                        }

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Error al intentar crear ciclo-escolar");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Es necesario ingresar los costos del nuevo ciclo escolar");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void typeKey(KeyEvent ke) {
        char c = ke.getKeyChar();

        if (Character.isLetter(c)) {
            getToolkit().beep();

            ke.consume();
            msjError.setText("Este campo solo acepta Números");

        } else {
            msjError.setText("");
        }

    }
}
