package control_pagos;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import operaciones.funciones;

public class updateAlum extends javax.swing.JDialog {

    private static String ciclo = "";
    private funciones fun;
    private String nom = "";

    public updateAlum(java.awt.Frame parent, boolean modal, String ciclo) {
        super(parent, modal);
        initComponents();
        this.setTitle("Actualizar datos del alumno | control de pagos");
        this.setIconImage(new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage());
        fun = new funciones();
        this.ciclo = ciclo;
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        edtNombre = new javax.swing.JTextField();
        edtApp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edtApm = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboNivel = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        edtCol = new javax.swing.JTextField();
        edtNomTutor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        edtTel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        comboGrado = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        msjErro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(86, 7, 12));

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modificación de datos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel2.setText("Nombre(s):");

        edtNombre.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N

        edtApp.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel3.setText("Apellido paterno:");

        edtApm.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel4.setText("Apellido materno:");

        jLabel5.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel5.setText("Nivel:");

        comboNivel.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        comboNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<seleccionar>", "Preescolar", "Primaria", "Secundaria" }));
        comboNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNivelActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel6.setText("Colegiatura:");

        edtCol.setEditable(false);
        edtCol.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N

        edtNomTutor.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel7.setText("Nombre del tutor(a):");

        jLabel8.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel8.setText("Teléfono:");

        edtTel.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel9.setText("Grado:");

        comboGrado.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        comboGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<seleccionar>" }));
        comboGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGradoActionPerformed(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnRegistrar.setText("Actualizar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        msjErro.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtNombre)
                    .addComponent(edtApp)
                    .addComponent(edtApm)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(comboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(68, 68, 68)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(edtNomTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(edtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(comboGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(edtCol, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(msjErro, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtApm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtNomTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msjErro, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void comboNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNivelActionPerformed
        if (comboNivel.getSelectedIndex() > 0) {
            String[] colegi = fun.getPagos(comboNivel.getSelectedItem().toString(), ciclo);
            if (comboNivel.getSelectedItem().toString().equals("Preescolar") || comboNivel.getSelectedItem().toString().equals("Secundaria")) {
                comboGrado.removeAllItems();
                comboGrado.addItem("<seleccionar>");
                for (int i = 1; i < 4; i++) {
                    comboGrado.addItem(String.valueOf(i));
                }
                edtCol.setText("$" + colegi[0]);
            } else if (comboNivel.getSelectedItem().toString().equals("Primaria")) {
                comboGrado.removeAllItems();
                comboGrado.addItem("<seleccionar>");
                for (int i = 1; i < 7; i++) {
                    comboGrado.addItem(String.valueOf(i));
                }
                edtCol.setText("$" + colegi[0]);
            }
        }

    }//GEN-LAST:event_comboNivelActionPerformed

    private void comboGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGradoActionPerformed

    }//GEN-LAST:event_comboGradoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String datos[] = new String[7];
        if (comboNivel.getSelectedIndex() > 0 && comboGrado.getSelectedIndex() > 0) {
            datos[0] = edtNombre.getText();
            datos[1] = edtApp.getText();
            datos[2] = edtApm.getText();
            datos[3] = edtNomTutor.getText();
            datos[4] = edtTel.getText();
            datos[5] = comboNivel.getSelectedItem().toString();
            datos[6] = comboGrado.getSelectedItem().toString();
            String nombre;
            if (!edtApm.getText().trim().equals("")) {
                nombre = datos[0] + " " + datos[1] + " " + datos[2];
            } else {
                nombre = datos[0] + " " + datos[1];

            }
            if (datos[2].equals("") || datos[2].equals(" ")) {
                datos[2] = null;
            } 
            if (fun.updateAlumno(datos, ciclo, nom) == true) {
                JOptionPane.showMessageDialog(rootPane, "Los datos se actualizarón correctamente");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error de actualización de datos, intentelo más tarde");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione el nivel y grado del alumno");
        }


    }//GEN-LAST:event_btnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(altaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(altaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(altaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(altaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                updateAlum dialog = new updateAlum(new javax.swing.JFrame(), true, ciclo);
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
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> comboGrado;
    private javax.swing.JComboBox<String> comboNivel;
    private javax.swing.JTextField edtApm;
    private javax.swing.JTextField edtApp;
    private javax.swing.JTextField edtCol;
    private javax.swing.JTextField edtNomTutor;
    private javax.swing.JTextField edtNombre;
    private javax.swing.JTextField edtTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel msjErro;
    // End of variables declaration//GEN-END:variables

    private void actDes(boolean t) {
        msjErro.setText("");
    }

    public void llenarCampos(String datos[]) {
        String nombre = "";
        edtNombre.setText(datos[3]);
        edtApp.setText(datos[4]);
        edtCol.setText(datos[2]);
        nombre = datos[3] + " " + datos[4];
        nom = nombre;
        if (!datos[5].equals("null") && !datos[5].equals("")) {
            edtApm.setText(datos[5]);
            nombre = datos[3] + " " + datos[4] + " " + datos[5];
            nom = nombre;
        }        
        comboNivel.setSelectedItem(datos[0]);
        comboGrado.setSelectedItem(datos[1]);
        String dat[] = fun.getTutor(ciclo, nombre);
        edtNomTutor.setText(dat[0]);
        edtTel.setText(dat[1]);

    }
}
