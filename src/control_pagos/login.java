package control_pagos;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import operaciones.funciones;

public class login extends javax.swing.JFrame {

    private funciones fun;
    File fichero;
    File Directorio;
    String ruta;
    String palabra;
    FileReader archivo;
    BufferedReader leer;

    public login() {
        initComponents();
        this.setTitle("Inicio de sesión | Acceso al sistema");
        this.setIconImage(new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage());
        fun = new funciones();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        foto();
        btnIngresar.setEnabled(false);
        edtCiclo.setEditable(false);
        edtUser.setEditable(false);
        edtPass.setEditable(false);
        XD();
    }

    public void foto() {
        ImageIcon log = new ImageIcon(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/imgs/escudomon.png")));
        Icon ic = new ImageIcon(log.getImage().getScaledInstance(labelIco.getWidth(), labelIco.getHeight(), Image.SCALE_DEFAULT));
        labelIco.setIcon(ic);
        ImageIcon img = new ImageIcon(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/imgs/usuario.png")));
        Icon icono = new ImageIcon(img.getImage().getScaledInstance(labellogo.getWidth(), labellogo.getHeight(), Image.SCALE_DEFAULT));
        labellogo.setIcon(icono);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelIco = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        edtUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edtPass = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        labellogo = new javax.swing.JLabel();
        labelmsj = new javax.swing.JLabel();
        edtCiclo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBackground(new java.awt.Color(86, 7, 12));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setForeground(new java.awt.Color(51, 51, 0));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inicio de sesión");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(labelIco, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(labelIco, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(86, 7, 12));
        jLabel2.setText("Usuario");

        edtUser.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        edtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtUserActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(86, 7, 12));
        jLabel3.setText("Contraseña");

        edtPass.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        edtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPassActionPerformed(evt);
            }
        });
        edtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtPassKeyTyped(evt);
            }
        });

        btnIngresar.setBackground(new java.awt.Color(86, 7, 12));
        btnIngresar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        labelmsj.setForeground(new java.awt.Color(204, 0, 0));
        labelmsj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        edtCiclo.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        edtCiclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCicloActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(86, 7, 12));
        jLabel4.setText("Ciclo escolar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(labelmsj, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(labellogo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(edtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(edtCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labellogo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addComponent(edtCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelmsj, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtCicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCicloActionPerformed
        edtCiclo.transferFocus();
    }//GEN-LAST:event_edtCicloActionPerformed

    private void edtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtUserActionPerformed
        edtUser.transferFocus();
    }//GEN-LAST:event_edtUserActionPerformed

    private void edtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPassActionPerformed

    }//GEN-LAST:event_edtPassActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        login();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void edtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtPassKeyTyped
        char a = evt.getKeyChar();
        if (a == KeyEvent.VK_ENTER) {
            btnIngresar.doClick();
        }
    }//GEN-LAST:event_edtPassKeyTyped

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JTextField edtCiclo;
    private javax.swing.JPasswordField edtPass;
    private javax.swing.JTextField edtUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelIco;
    private javax.swing.JLabel labellogo;
    private javax.swing.JLabel labelmsj;
    // End of variables declaration//GEN-END:variables

    private boolean XD() {
        try {
            String Aux = "";
            String dir = "C:\\WINDOWS";
            Directorio = new File(dir);
            fichero = new File(Directorio + "\\" + "claveControl.tmp");
            if (fichero.exists()) {
                archivo = new FileReader(fichero);
                leer = new BufferedReader(archivo);
                while ((palabra = leer.readLine()) != null) {
                    System.out.println(palabra);
                    if (!palabra.equals("")) {
                        Aux = palabra;
                    }
                }
                if (Aux.equals("XDMD-ASED-ASED-2AS5-ASDE")) {
                    btnIngresar.setEnabled(true);
                    System.out.println("Clave Correcta");
                    edtCiclo.setEditable(true);
                    edtUser.setEditable(true);
                    edtPass.setEditable(true);
                }
                leer.close();
                archivo.close();
                System.out.println("Ya existe");
                return true;
            } else {
                labelmsj.setText("Su producto necesita ser registrado");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    private void login() {
        String ciclo = edtCiclo.getText().trim();
        String usuario = edtUser.getText().trim();
        if (!edtCiclo.getText().equals("") && !edtCiclo.getText().equals(" ") && !edtUser.getText().equals("") && !edtPass.getText().equals(" ")) {
            if (fun.ciclo(ciclo) == true) {
                if (fun.logeo(edtUser.getText(), edtPass.getText()) == true) {
                    new framePrincipal(ciclo, usuario).setVisible(true);
                    this.dispose();
                } else {
                    labelmsj.setText("El usuario y contraseña que ingreso no se encuentra registrado");
                }
            } else {
                labelmsj.setText("El ciclo escolar que ingresó no existen");
            }
        } else {
            labelmsj.setText("Es necesario llenar todos los campos");
        }
    }
}
