package control_pagos;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import operaciones.funciones;

public class altaAlumno extends javax.swing.JDialog {

    private static String ciclo = "", inscri = "";
    private funciones fun;
    private float inscripcion = 0;
    String datos[] = new String[11];
    public static String usuario = "";

    public altaAlumno(java.awt.Frame parent, boolean modal, String ciclo, String user) {
        super(parent, modal);
        initComponents();
        this.setTitle("Registro de alumnos | control de pagos");
        this.setIconImage(new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage());
        this.usuario = user;
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
        cheRealizar = new javax.swing.JCheckBox();
        edtIns = new javax.swing.JTextField();
        labelIns = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        edtCoo = new javax.swing.JTextField();
        edtDes = new javax.swing.JTextField();
        labelIns1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        edtTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        msjErro = new javax.swing.JLabel();
        extem = new javax.swing.JCheckBox();

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

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de Alumno");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(146, 146, 146))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Nombre(s):");

        edtNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        edtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtNombreActionPerformed(evt);
            }
        });
        edtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtNombreKeyTyped(evt);
            }
        });

        edtApp.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        edtApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtAppActionPerformed(evt);
            }
        });
        edtApp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtAppKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Apellido paterno:");

        edtApm.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        edtApm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtApmActionPerformed(evt);
            }
        });
        edtApm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtApmKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Apellido materno:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Nivel:");

        comboNivel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        comboNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<seleccionar>", "Preescolar", "Primaria", "Secundaria" }));
        comboNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNivelActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("Colegiatura:");

        edtCol.setEditable(false);
        edtCol.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        edtNomTutor.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        edtNomTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtNomTutorActionPerformed(evt);
            }
        });
        edtNomTutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtNomTutorKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Nombre del tutor(a):");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setText("Teléfono:");

        edtTel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        edtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtTelActionPerformed(evt);
            }
        });
        edtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtTelKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setText("Grado:");

        comboGrado.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        comboGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<seleccionar>" }));
        comboGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGradoActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(86, 7, 12));
        btnRegistrar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        btnRegistrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnRegistrarKeyTyped(evt);
            }
        });

        cheRealizar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cheRealizar.setText("Realizar pagos");
        cheRealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheRealizarActionPerformed(evt);
            }
        });

        edtIns.setEditable(false);
        edtIns.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        edtIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtInsActionPerformed(evt);
            }
        });
        edtIns.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtInsKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtInsKeyTyped(evt);
            }
        });

        labelIns.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        labelIns.setText("Inscripción:");

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setText("Cooperación anual:");

        edtCoo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        edtCoo.setEnabled(false);
        edtCoo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtCooKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtCooKeyTyped(evt);
            }
        });

        edtDes.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        edtDes.setEnabled(false);
        edtDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtDesActionPerformed(evt);
            }
        });
        edtDes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtDesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtDesKeyTyped(evt);
            }
        });

        labelIns1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        labelIns1.setText("Descuento:");

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel12.setText("Total a pagar:");

        edtTotal.setEditable(false);
        edtTotal.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel11.setText("%");

        jLabel13.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel13.setText("$");

        jLabel14.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel14.setText("$");

        jLabel15.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel15.setText("$");

        msjErro.setForeground(new java.awt.Color(204, 0, 0));
        msjErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        extem.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        extem.setText("Registrar alumno Extemporaneo");
        extem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelIns)
                                    .addComponent(labelIns1)
                                    .addComponent(cheRealizar)
                                    .addComponent(edtIns, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(edtDes, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel11)))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(8, 8, 8)
                                        .addComponent(edtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(8, 8, 8)
                                        .addComponent(edtCoo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(msjErro, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(extem)))
                .addGap(10, 10, 10))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cheRealizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIns)
                    .addComponent(jLabel10))
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtCoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIns1)
                    .addComponent(jLabel12))
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(msjErro, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(extem)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        nivel();
    }//GEN-LAST:event_comboNivelActionPerformed

    private void comboGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGradoActionPerformed
        cooperacion();
    }//GEN-LAST:event_comboGradoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        registrar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void edtInsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtInsKeyReleased
        inscripcion();
    }//GEN-LAST:event_edtInsKeyReleased

    private void edtDesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtDesKeyReleased
        descuento();
    }//GEN-LAST:event_edtDesKeyReleased

    private void cheRealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheRealizarActionPerformed
        if (cheRealizar.isSelected()) {
            try {
                actDes(true);
                edtIns.setText(inscri);
                inscripcion = Float.parseFloat(inscri);
            } catch (Exception e) {
            }
        } else {
            inscripcion = 0;
            actDes(false);
        }
    }//GEN-LAST:event_cheRealizarActionPerformed

    private void edtCooKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtCooKeyReleased

    }//GEN-LAST:event_edtCooKeyReleased

    private void edtDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtDesActionPerformed
        edtDes.transferFocus();
    }//GEN-LAST:event_edtDesActionPerformed

    private void edtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtNombreActionPerformed
        edtNombre.transferFocus();
    }//GEN-LAST:event_edtNombreActionPerformed

    private void edtNomTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtNomTutorActionPerformed
        edtNomTutor.transferFocus();
    }//GEN-LAST:event_edtNomTutorActionPerformed

    private void edtAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtAppActionPerformed
        edtApp.transferFocus();
    }//GEN-LAST:event_edtAppActionPerformed

    private void edtApmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtApmActionPerformed
        edtApm.transferFocus();
    }//GEN-LAST:event_edtApmActionPerformed

    private void edtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtTelActionPerformed
        edtTel.transferFocus();
    }//GEN-LAST:event_edtTelActionPerformed

    private void edtInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtInsActionPerformed
        edtIns.transferFocus();
    }//GEN-LAST:event_edtInsActionPerformed

    private void btnRegistrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRegistrarKeyTyped
        char enter = evt.getKeyChar();
        if (enter == KeyEvent.VK_ENTER) {

        }
    }//GEN-LAST:event_btnRegistrarKeyTyped

    private void extemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extemActionPerformed
        if (extem.isSelected() == true) {
            try {
                String n = llenar();
                if (!datos[0].equals("")) {
                    if (datos.length > 0) {
                        meses m = new meses(null, true, ciclo, datos, n);
                        m.setVisible(true);
                        if (m.getStatus() == 1) {
                            JOptionPane.showMessageDialog(rootPane, "El alumno se registró correctamente");
                            this.dispose();
                        }
                    }
                }
            } catch (Exception e) {

            }

        }
    }//GEN-LAST:event_extemActionPerformed

    private void edtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtNombreKeyTyped
        typeKey(evt);
    }//GEN-LAST:event_edtNombreKeyTyped

    private void edtNomTutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtNomTutorKeyTyped
        typeKey(evt);
    }//GEN-LAST:event_edtNomTutorKeyTyped

    private void edtAppKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtAppKeyTyped
        typeKey(evt);
    }//GEN-LAST:event_edtAppKeyTyped

    private void edtApmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtApmKeyTyped
        typeKey(evt);
    }//GEN-LAST:event_edtApmKeyTyped

    private void edtTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtTelKeyTyped
        typeKeyNum(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_edtTelKeyTyped

    private void edtInsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtInsKeyTyped
        typeKeyNum(evt);// TODO add your handling code here:
    }//GEN-LAST:event_edtInsKeyTyped

    private void edtCooKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtCooKeyTyped
        typeKeyNum(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_edtCooKeyTyped

    private void edtDesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtDesKeyTyped
        typeKeyNum(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_edtDesKeyTyped

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
                altaAlumno dialog = new altaAlumno(new javax.swing.JFrame(), true, ciclo, usuario);
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
    private javax.swing.JCheckBox cheRealizar;
    private javax.swing.JComboBox<String> comboGrado;
    private javax.swing.JComboBox<String> comboNivel;
    private javax.swing.JTextField edtApm;
    private javax.swing.JTextField edtApp;
    private javax.swing.JTextField edtCol;
    private javax.swing.JTextField edtCoo;
    private javax.swing.JTextField edtDes;
    private javax.swing.JTextField edtIns;
    private javax.swing.JTextField edtNomTutor;
    private javax.swing.JTextField edtNombre;
    private javax.swing.JTextField edtTel;
    private javax.swing.JTextField edtTotal;
    private javax.swing.JCheckBox extem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JLabel labelIns;
    private javax.swing.JLabel labelIns1;
    private javax.swing.JLabel msjErro;
    // End of variables declaration//GEN-END:variables

    private void actDes(boolean t) {
        edtCoo.setEnabled(t);
        edtDes.setEnabled(t);
        edtIns.setText("");
        edtTotal.setText("");
        edtCoo.setText("");
        msjErro.setText("");
        edtDes.setText("");
    }

    private void cooperacion() {
        float co, ins, des;
        if (!edtCoo.getText().trim().equals("") && !edtCoo.getText().trim().equals(" ")) {
            try {
                co = Float.parseFloat(edtCoo.getText());
                if (!edtIns.getText().trim().equals("") && !edtIns.getText().trim().equals(" ") && !edtDes.getText().trim().equals("") && !edtDes.getText().trim().equals(" ")) {
                    des = Float.parseFloat(edtDes.getText());
                    ins = Float.parseFloat(edtIns.getText());
                    des = ins * des / 100;
                    co += ins - des;
                } else if (!edtIns.getText().equals("") && !edtIns.getText().equals(" ")) {
                    ins = Float.parseFloat(edtIns.getText());
                    co += ins;
                }
                edtTotal.setText(String.valueOf(co));

            } catch (NumberFormatException e) {

            }
        } else if (!edtDes.getText().equals("") && !edtDes.getText().equals(" ") && !edtIns.getText().equals("") && !edtIns.getText().equals(" ")) {
            Float t, total, coo;
            try {
                msjErro.setText("");
                t = Float.parseFloat(edtIns.getText());
                des = Float.parseFloat(edtDes.getText());
                total = des * t / 100;
                total = t - total;
                if (!edtCoo.getText().equals("") && !edtCoo.getText().equals(" ")) {
                    coo = Float.parseFloat(edtCoo.getText());
                    total += coo;
                }
                edtTotal.setText(String.valueOf(total));
            } catch (NumberFormatException e) {
                msjErro.setText("Favor de ingresar la cantidad en números");
                System.out.println("e = " + e.getMessage());
            }
        }
    }

    private void inscripcion() {
        Float ins, des;
        if (!edtIns.getText().equals("") && !edtIns.getText().equals(" ")) {
            try {
                msjErro.setText("");
                ins = Float.parseFloat(edtIns.getText());
                if (!edtDes.getText().equals("") && !edtDes.getText().equals("")) {
                    des = Float.parseFloat(edtDes.getText());
                    des = ins * des / 100;

                    ins -= des;

                }
                inscripcion = ins;
                edtTotal.setText(String.valueOf(ins));
            } catch (NumberFormatException e) {
                msjErro.setText("Favor de ingresar la cantidad en números");

            }
        } else if (!edtCoo.getText().equals("") && !edtCoo.getText().equals(" ")) {
            float co;
            try {
                msjErro.setText("");
                co = Float.parseFloat(edtCoo.getText());
                edtTotal.setText(String.valueOf(co));

            } catch (NumberFormatException e) {
                msjErro.setText("Favor de ingresar la cantidad en números");
            }
        } else {
            float co;
            if (!edtCoo.getText().trim().equals("") && !edtCoo.getText().trim().equals(" ")) {
                try {
                    msjErro.setText("");
                    co = Float.parseFloat(edtCoo.getText());
                    edtTotal.setText(String.valueOf(co));
                } catch (NumberFormatException e) {
                    msjErro.setText("Favor de ingresar la cantidad en números");
                }

            }
        }
    }

    private void descuento() {
        Float t, des, total, coo;
        if (!edtDes.getText().equals("") && !edtDes.getText().equals(" ") && !edtIns.getText().equals("") && !edtIns.getText().equals(" ")) {
            try {
                msjErro.setText("");
                t = Float.parseFloat(edtIns.getText());
                des = Float.parseFloat(edtDes.getText());
                total = des * t / 100;
                total = t - total;
                inscripcion = total;
                if (!edtCoo.getText().equals("") && !edtCoo.getText().equals(" ")) {
                    coo = Float.parseFloat(edtCoo.getText());
                    total += coo;
                }
                edtTotal.setText(String.valueOf(total));
            } catch (NumberFormatException e) {
                msjErro.setText("Favor de ingresar la cantidad en números");
            }
        } else {
            float co, ins;
            inscripcion = Float.parseFloat(inscri);
            if (!edtCoo.getText().equals("") && !edtCoo.getText().equals(" ")) {
                try {
                    co = Float.parseFloat(edtCoo.getText());
                    if (!edtIns.getText().equals("") && !edtIns.getText().equals(" ")) {
                        ins = Float.parseFloat(edtIns.getText());
                        co += ins;
                    }
                    edtTotal.setText(String.valueOf(co));

                } catch (NumberFormatException e) {
                    msjErro.setText("Favor de ingresar la cantidad en números");
                }
            } else if (!edtIns.getText().equals("") && !edtIns.getText().equals(" ")) {
                try {
                    msjErro.setText("");
                    ins = Float.parseFloat(edtIns.getText());
                    if (!edtDes.getText().equals("") && !edtDes.getText().equals("")) {
                        des = Float.parseFloat(edtDes.getText());
                        des = ins * des / 100;
                        ins -= des;
                    }
                    edtTotal.setText(String.valueOf(ins));
                } catch (NumberFormatException e) {
                    msjErro.setText("Favor de ingresar la cantidad en números");
                    System.out.println("e = " + e.getMessage());
                }
            }
        }
    }

    private void nivel() {
        if (comboNivel.getSelectedIndex() > 0) {
            String[] colegi = fun.getPagos(comboNivel.getSelectedItem().toString(), ciclo);
            if (comboNivel.getSelectedItem().toString().equals("Preescolar") || comboNivel.getSelectedItem().toString().equals("Secundaria")) {
                comboGrado.removeAllItems();
                comboGrado.addItem("<seleccionar>");
                for (int i = 1; i < 4; i++) {
                    comboGrado.addItem(String.valueOf(i));
                }
                edtCol.setText(colegi[0]);
                inscri = colegi[1];

            } else if (comboNivel.getSelectedItem().toString().equals("Primaria")) {
                comboGrado.removeAllItems();
                comboGrado.addItem("<seleccionar>");
                for (int i = 1; i < 7; i++) {
                    comboGrado.addItem(String.valueOf(i));
                }
                inscri = colegi[1];
                edtCol.setText(colegi[0]);
            }
        }
    }

    private String llenar() {
        int cont = 0;
        String nombre = "";
        boolean f = true;
        if (comboNivel.getSelectedIndex() > 0 && comboGrado.getSelectedIndex() > 0) {
            datos[0] = edtNombre.getText();
            datos[1] = edtApp.getText();
            datos[2] = edtApm.getText();
            datos[3] = edtNomTutor.getText();
            datos[4] = edtTel.getText();
            datos[5] = comboNivel.getSelectedItem().toString();
            datos[6] = comboGrado.getSelectedItem().toString();
            datos[7] = String.valueOf(inscripcion);
            datos[8] = edtCoo.getText();
            datos[9] = usuario;
            datos[10] = edtCol.getText();
            if (!edtApm.getText().trim().equals("")) {
                nombre = datos[0] + " " + datos[1] + " " + datos[2];
            } else {
                nombre = datos[0] + " " + datos[1];
            }
            if (edtCoo.getText().trim().equals("")) {
                datos[8] = "0";
            }
            if (datos[2].equals("") || datos[2].equals(" ")) {
                datos[2] = null;
            } else if (datos[7].equals("") || datos[7].equals(" ")) {
                datos[7] = null;
                f = false;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione el nivel y grado del alumno");
        }
        return nombre;
    }

    private void registrar() {
        if (comboNivel.getSelectedIndex() > 0 && comboGrado.getSelectedIndex() > 0) {
            datos[0] = edtNombre.getText();
            datos[1] = edtApp.getText();
            datos[2] = edtApm.getText();
            datos[3] = edtNomTutor.getText();
            datos[4] = edtTel.getText();
            datos[5] = comboNivel.getSelectedItem().toString();
            datos[6] = comboGrado.getSelectedItem().toString();
            datos[7] = edtTotal.getText();
            String nombre;
            if (!edtApm.getText().trim().equals("")) {
                nombre = datos[0] + " " + datos[1] + " " + datos[2];
            } else {
                nombre = datos[0] + " " + datos[1];
            }
            if (datos[2].equals("") || datos[2].equals(" ")) {
                datos[2] = null;
            } else if (datos[7].equals("") || datos[7].equals(" ")) {
                datos[7] = null;
            }
            if (fun.altaAlumnos(datos, ciclo) == true) {
                if (cheRealizar.isSelected()) {
                    if (!edtCoo.getText().trim().equals("") && !edtCoo.getText().trim().equals(" ") && !edtIns.getText().trim().equals("")) {
                        fun.cooperacion_inscripcion(ciclo, nombre, inscripcion, Float.parseFloat(edtCoo.getText()));
                    }else{
                        JOptionPane.showMessageDialog(rootPane,"");
                    }
                } else {
                    fun.cooperacion_inscripcion(ciclo, nombre, 0, 0);
                }

                JOptionPane.showMessageDialog(rootPane, "Alumno registrado correctamente");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error de registros");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione el nivel y grado del alumno");
        }

    }

    public void typeKey(KeyEvent ke) {
        char c = ke.getKeyChar();

        if (Character.isDigit(c)) {
            getToolkit().beep();

            ke.consume();
            msjErro.setText("Este campo solo acepta letras");

        } else {
            msjErro.setText("");
        }

    }

    public void typeKeyNum(KeyEvent ke) {
        char c = ke.getKeyChar();

        if (Character.isLetter(c)) {
            getToolkit().beep();

            ke.consume();
            msjErro.setText("Este campo solo acepta Números");

        } else {
            msjErro.setText("");
        }

    }
}
