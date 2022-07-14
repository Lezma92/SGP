package control_pagos;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import operaciones.funciones;

public class diagAlumnos extends javax.swing.JDialog {

    private funciones fun;
    private static String ciclo = "", usuario = "";

    public diagAlumnos(java.awt.Frame parent, boolean modal, String ciclo, String user) {
        super(parent, modal);
        initComponents();   
        this.setTitle("Gestión de alumnos | control de pagos");
        this.setIconImage(new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage());
        this.usuario = user;
        radActivos.setSelected(true);
        fun = new funciones();
        this.ciclo = ciclo;
        llenarTabla();
        tablaAlumnos.setRowHeight(30);
        tamaños();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();
        radActivos = new javax.swing.JRadioButton();
        radBajas = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(86, 7, 12));

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestión de alumnos");

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar Alumno");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 150, -1));

        jButton2.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jButton2.setText("Registrar alumno");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 150, -1));

        jButton3.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 150, -1));

        jButton6.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jButton6.setText("Dar de baja");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 150, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(412, 412, 412)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton4.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jButton4.setText("Ver detalles");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jButton5.setText("Realizar Pago");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtBuscar.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaAlumnos.setSelectionBackground(new java.awt.Color(153, 153, 255));
        jScrollPane1.setViewportView(tablaAlumnos);

        grupo.add(radActivos);
        radActivos.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        radActivos.setText("Activos");
        radActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radActivosActionPerformed(evt);
            }
        });

        grupo.add(radBajas);
        radBajas.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        radBajas.setText("Bajas");
        radBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBajasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1172, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(radActivos)
                .addGap(35, 35, 35)
                .addComponent(radBajas)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radActivos)
                    .addComponent(radBajas))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        altaAlumno al = new altaAlumno(null, true, ciclo, usuario);
        al.setVisible(true);
        boolean b = al.isShowing();
        while (b) {
            b = al.isShowing();
        }
        tablaAlumnos.setModel(fun.getAlumnos(this.ciclo, "Activo"));
        tamaños();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            int fila;
            String datos[] = new String[6];
            fila = tablaAlumnos.getSelectedRow();
            datos[0] = String.valueOf(tablaAlumnos.getValueAt(fila, 1));
            datos[1] = String.valueOf(tablaAlumnos.getValueAt(fila, 2));
            datos[2] = String.valueOf(tablaAlumnos.getValueAt(fila, 6));
            datos[3] = String.valueOf(tablaAlumnos.getValueAt(fila, 5));
            datos[4] = String.valueOf(tablaAlumnos.getValueAt(fila, 3));
            datos[5] = String.valueOf(tablaAlumnos.getValueAt(fila, 4));
            System.out.println("Nivel " + datos[0] + " Grado: " + datos[1]);
            updateAlum al = new updateAlum(null, true, ciclo);
            al.llenarCampos(datos);
            al.setVisible(true);
            boolean b = al.isShowing();
            while (b) {
                b = al.isShowing();
            }
            tablaAlumnos.setModel(fun.getAlumnos(this.ciclo, "Activo"));
            tamaños();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Es necesario seleccionar el alumno que desea modificar");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        masDetalles mas = new masDetalles(null, true, ciclo);
        try {
            int fila = tablaAlumnos.getSelectedRow(), cont = 0;
            String datos[] = new String[6];
            for (int i = 1; i <= 6; i++) {
                datos[cont] = String.valueOf(tablaAlumnos.getValueAt(fila, i));
                cont++;
            }
            mas.setComponen(datos);
            mas.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un alumno para ver más detalles");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        diagPagos pg = new diagPagos(null, true, ciclo, usuario);
        try {
            //3,4,5
            int fila = tablaAlumnos.getSelectedRow(), cont = 0;
            String a, b, c, n;
            a = String.valueOf(tablaAlumnos.getValueAt(fila, 5));
            b = String.valueOf(tablaAlumnos.getValueAt(fila, 3));
            c = String.valueOf(tablaAlumnos.getValueAt(fila, 4));
            System.out.println(a + " " + b + " " + c);
            n = a + " " + b;
            if (!c.equals("null")) {
                n = a + " " + b + " " + c;
            }
            pg.extranjeroXD(n);
            pg.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un alumno para ver más detalles");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        darBaja();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void radActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radActivosActionPerformed
        llenarTabla();
        tamaños();
    }//GEN-LAST:event_radActivosActionPerformed

    private void radBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBajasActionPerformed
        llenarTabla();
        tamaños();
    }//GEN-LAST:event_radBajasActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            EliminarAl();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        String nombre = txtBuscar.getText().trim();
        if (!nombre.equals("") && !nombre.equals(" ")) {
            tablaAlumnos.setModel(fun.buscarAlumno(ciclo, nombre));
            tamaños();
        } else {
            llenarTabla();
            tamaños();
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

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
            java.util.logging.Logger.getLogger(diagAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(diagAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(diagAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(diagAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                diagAlumnos dialog = new diagAlumnos(new javax.swing.JFrame(), true, ciclo, usuario);
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
    private javax.swing.JButton btnEliminar;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radActivos;
    private javax.swing.JRadioButton radBajas;
    private javax.swing.JTable tablaAlumnos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    private void llenarTabla() {
        if (radActivos.isSelected()) {
            tablaAlumnos.setModel(fun.getAlumnos(ciclo, "Activo"));
        } else if (radBajas.isSelected()) {
            tablaAlumnos.setModel(fun.getAlumnos(ciclo, "Baja"));
        }
    }

    private void tamaños() {
        TableColumn col1, col2, col3, col4, col5, col6, col7, col8;
        col1 = tablaAlumnos.getColumnModel().getColumn(0);
        col1.setMaxWidth(90);
        col2 = tablaAlumnos.getColumnModel().getColumn(1);
        col2.setMaxWidth(120);
        col3 = tablaAlumnos.getColumnModel().getColumn(2);
        col3.setMaxWidth(120);
        col4 = tablaAlumnos.getColumnModel().getColumn(3);
        col4.setMaxWidth(200);
        col5 = tablaAlumnos.getColumnModel().getColumn(4);
        col5.setMaxWidth(200);
        col6 = tablaAlumnos.getColumnModel().getColumn(5);
        col6.setMaxWidth(200);
        col7 = tablaAlumnos.getColumnModel().getColumn(6);
        col7.setMaxWidth(150);
        col8 = tablaAlumnos.getColumnModel().getColumn(7);
        col8.setMaxWidth(120);
    }

    private void EliminarAl() {
        try {
            int fila = tablaAlumnos.getSelectedRow();
            String nombre = String.valueOf(tablaAlumnos.getValueAt(fila, 5));
            String app = String.valueOf(tablaAlumnos.getValueAt(fila, 3));
            String apm = String.valueOf(tablaAlumnos.getValueAt(fila, 4));
            nombre = nombre + " " + app;
            System.out.println(nombre);
            if (!apm.equals("null")) {
                nombre = nombre + " " + apm;
            }
            int opc = JOptionPane.showConfirmDialog(null, "El alumno se removerá permanentemente,\n ¿desea continuar con la operación ?");
            if (opc == JOptionPane.YES_OPTION) {
                nvo n = new nvo(null, true);
                n.setVisible(true);
                if (n.getReturnStatus() == 1) {
                    if (fun.Deletealumno(nombre, ciclo) == true) {
                        JOptionPane.showMessageDialog(rootPane, "Los datos del alumno fueron removidos correctamente");
                        llenarTabla();
                        tamaños();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Fue imposible elimnar los registros del alumno");
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Favor de seleccionar registro que desea Eliminar");
        }
    }

    private void darBaja() {
        try {
            int fila = tablaAlumnos.getSelectedRow();
            String nombre = String.valueOf(tablaAlumnos.getValueAt(fila, 5));
            String app = String.valueOf(tablaAlumnos.getValueAt(fila, 3));
            String apm = String.valueOf(tablaAlumnos.getValueAt(fila, 4));
            nombre = nombre + " " + app;
            System.out.println(nombre);
            if (!apm.equals("null")) {
                nombre = nombre + " " + apm;
            }
            int opc = JOptionPane.showConfirmDialog(null, "¿Está seguro que quiere dar de baja al alumno seleccionado?");
            if (opc == JOptionPane.YES_OPTION) {
                if (fun.bajaAlumno(ciclo, nombre, "Baja") == true) {
                    JOptionPane.showMessageDialog(rootPane, "El alumno se dio de baja correctamente");
                    llenarTabla();
                    tamaños();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Hubo un error al intentar dar de baja al alumno");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Favor de seleccionar registro que desea dar de baja");
        }
    }
}
