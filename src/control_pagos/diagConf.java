package control_pagos;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import mensajes.msjConfirmar;
import operaciones.funciones;

public class diagConf extends javax.swing.JDialog {

    private static String ciclo = "";
    private funciones fun = new funciones();
    private boolean x, d, nuevo;

    public diagConf(java.awt.Frame parent, boolean modal, String ciclo) {
        super(parent, modal);
        initComponents();
        this.setTitle("Configuraciones | control de pagos");
        this.setIconImage(new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage());
        this.setLocationRelativeTo(null);
        this.ciclo = ciclo;
        actDes(false);
        actDesTxt(false);
        actDesCi(false);
        limpiarCi(false);
        llenarLis();
        tablaUsuarios.setRowHeight(26);
        tablaUsuarios.setModel(fun.getUsuario());
        statusActivos(this.ciclo);
        cargarPrec();
        statusBajas(this.ciclo);
        btnGuardarCam.setEnabled(false);
    }

    public void llenarLis() {
        DefaultListModel<String> modelo = new DefaultListModel<String>();
        int tama = fun.llenarLista().size();
        for (int i = 0; i < tama; i++) {
            modelo.addElement(fun.llenarLista().get(i));
        }
        ciclosLis.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        tabPanel = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApm = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        pass1 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        pass2 = new javax.swing.JPasswordField();
        msjError = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        btnAgregarCi = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ciclosLis = new javax.swing.JList<>();
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        presAlta = new javax.swing.JLabel();
        priAltas = new javax.swing.JLabel();
        secAltas = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        preBajas = new javax.swing.JLabel();
        priBajas = new javax.swing.JLabel();
        secBajas = new javax.swing.JLabel();
        btnEliminarCi = new javax.swing.JButton();
        btnNuevoCi = new javax.swing.JButton();
        fin = new javax.swing.JTextField();
        error = new javax.swing.JLabel();
        inicio = new javax.swing.JTextField();
        btnActualizarCi = new javax.swing.JButton();
        btnCancelarCi = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        costoPree = new javax.swing.JTextField();
        costoPrim = new javax.swing.JTextField();
        costoSec = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnGuardarCam = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cPrees = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        cPrima = new javax.swing.JTextField();
        cSecu = new javax.swing.JTextField();
        btnModifC = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        iPrima = new javax.swing.JTextField();
        iPrees = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        iSecu = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        btnIModificar = new javax.swing.JButton();

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
            .addGap(0, 22, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Configuración general");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(507, 507, 507))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabPanel.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre de usuario", "Nombre(s)", "Apellido Paterno", "Apellido Materno"
            }
        ));
        jScrollPane1.setViewportView(tablaUsuarios);

        btnModificar.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        btnModificar.setText("Modificar usuario");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnNuevo.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        btnNuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnNuevoKeyTyped(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("*Nota: El usuario \"Administrador\" no puede ser eliminado");

        btnAgregar.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        btnAgregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnAgregarKeyTyped(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel3.setText("Nombre de usuario:");

        txtUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel4.setText("Nombre(s):");

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel5.setText("Apellido Paterno:");

        txtApp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel6.setText("Apellido Materno:");

        txtApm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setText("X");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel7.setText("Contraseña:");

        pass1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pass1KeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel9.setText("Confirmar contraseña:");

        pass2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pass2KeyReleased(evt);
            }
        });

        msjError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        msjError.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtApp, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtApm, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pass2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(pass1, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 164, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(msjError, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(msjError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel2))
        );

        tabPanel.addTab("Usuarios", jPanel5);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Ciclo-Escolar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 0, 18))); // NOI18N

        btnAgregarCi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAgregarCi.setText("Agregar");
        btnAgregarCi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCiActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Año inicio");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel11.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Año Fin");

        jLabel8.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel8.setText("-");

        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel12.setText("Ciclos Escolares Registrados");

        ciclosLis.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        ciclosLis.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "2017-2018" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ciclosLis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ciclosLisMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ciclosLisMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(ciclosLis);

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estadística de Ciclo-Escolar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 0, 18))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel13.setText("Alumnos registrados");

        jPanel13.setBackground(new java.awt.Color(204, 204, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Altas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 0, 18))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel14.setText("Preescolar:");

        jLabel15.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel15.setText("Primaria:");

        jLabel16.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel16.setText("Secundaria:");

        presAlta.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        presAlta.setText(".");

        priAltas.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        priAltas.setText(".");

        secAltas.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        secAltas.setText(".");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(secAltas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(priAltas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(presAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(44, Short.MAX_VALUE))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(presAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(priAltas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(secAltas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(204, 204, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bajas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 0, 18))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel23.setText("Preescolar:");

        jLabel24.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel24.setText("Primaria:");

        jLabel25.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel25.setText("Secundaria:");

        preBajas.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        preBajas.setText(".");

        priBajas.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        priBajas.setText(".");

        secBajas.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        secBajas.setText(".");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(secBajas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(priBajas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(preBajas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(44, Short.MAX_VALUE))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(preBajas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(priBajas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(secBajas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(204, 204, 204))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(57, 57, 57)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        btnEliminarCi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminarCi.setText("Eliminar");
        btnEliminarCi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarCi, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarCi)
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnNuevoCi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNuevoCi.setText("Nuevo");
        btnNuevoCi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoCiActionPerformed(evt);
            }
        });

        fin.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        fin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                finKeyTyped(evt);
            }
        });

        error.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        error.setForeground(new java.awt.Color(255, 0, 0));
        error.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                errorComponentRemoved(evt);
            }
        });

        inicio.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        inicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inicioKeyTyped(evt);
            }
        });

        btnActualizarCi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnActualizarCi.setText("Actualizar");

        btnCancelarCi.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnCancelarCi.setText("X");
        btnCancelarCi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCiActionPerformed(evt);
            }
        });

        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(btnNuevoCi)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregarCi)
                                .addGap(18, 18, 18)
                                .addComponent(btnActualizarCi))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                        .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelarCi)))
                        .addGap(26, 26, 26)))
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(49, 49, 49))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(inicio))
                                    .addComponent(fin)))))
                    .addComponent(btnCancelarCi))
                .addGap(35, 35, 35)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarCi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoCi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarCi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabPanel.addTab("Ciclo escolar", jPanel6);

        jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel17.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel17.setText("Modificación de colegiaturas");

        jLabel18.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel18.setText("Preescolar:");

        jLabel19.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel19.setText("Primaria:");

        jLabel20.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel20.setText("Secundaria:");

        costoPree.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        costoPree.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                costoPreeKeyTyped(evt);
            }
        });

        costoPrim.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N

        costoSec.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel21.setText("$");

        jLabel22.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel22.setText("$");

        jLabel26.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel26.setText("$");

        btnGuardarCam.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnGuardarCam.setText("Guardar cambios");
        btnGuardarCam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCamActionPerformed(evt);
            }
        });

        cancelar.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        cancelar.setText("X");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel32.setText("___________________________________________________________________");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelar))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel20))
                                        .addGap(62, 62, 62)
                                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(costoSec, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(costoPrim, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(costoPree, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addGap(125, 125, 125)
                                        .addComponent(btnGuardarCam, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cancelar))
                .addGap(27, 27, 27)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costoPree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel18))
                .addGap(31, 31, 31)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costoPrim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel19))
                .addGap(30, 30, 30)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costoSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel20))
                .addGap(38, 38, 38)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarCam, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel27.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel27.setText("Costos Actuales");

        jLabel28.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabel28.setText("Preescolar");

        jLabel29.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabel29.setText("Primaria");

        jLabel30.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabel30.setText("Secundaria");

        cPrees.setEditable(false);
        cPrees.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N

        jLabel31.setText("______________________________________________________________________________________________________________");

        cPrima.setEditable(false);
        cPrima.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N

        cSecu.setEditable(false);
        cSecu.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N

        btnModifC.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnModifC.setText("Modificar colegiatura");
        btnModifC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifCActionPerformed(evt);
            }
        });

        jLabel33.setText("______________________________________________________________________________________________________________");

        jLabel34.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel34.setText("Colegiatura:");

        jLabel35.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel35.setText("Inscripción:");

        jLabel37.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabel37.setText("Preescolar");

        jLabel38.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabel38.setText("Primaria");

        iPrima.setEditable(false);
        iPrima.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N

        iPrees.setEditable(false);
        iPrees.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N

        jLabel39.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabel39.setText("Secundaria");

        iSecu.setEditable(false);
        iSecu.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N

        jLabel40.setText("______________________________________________________________________________________________________________");

        btnIModificar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnIModificar.setText("Modificar inscripcion");
        btnIModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addComponent(cPrees, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(99, 99, 99)
                                    .addComponent(cPrima, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(79, 79, 79)
                                    .addComponent(cSecu, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabel28)
                                    .addGap(171, 171, 171)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(141, 141, 141)
                                    .addComponent(jLabel30)))
                            .addGap(32, 32, 32))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btnModifC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIModificar)
                .addGap(84, 84, 84))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(jLabel27))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addComponent(iPrees, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(99, 99, 99)
                                        .addComponent(iPrima, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addComponent(iSecu, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel37)
                                        .addGap(171, 171, 171)
                                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(141, 141, 141)
                                        .addComponent(jLabel39)))
                                .addGap(22, 22, 22))
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel35)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel27)
                .addGap(12, 12, 12)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addGap(8, 8, 8)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cPrees, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cPrima, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cSecu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39))
                .addGap(8, 8, 8)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(iPrees, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModifC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iPrima, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iSecu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(87, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 63, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabPanel.addTab("Colegiatura", jPanel7);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(tabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPanel)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

    private void btnNuevoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnNuevoKeyTyped

    }//GEN-LAST:event_btnNuevoKeyTyped

    private void btnAgregarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAgregarKeyTyped

    }//GEN-LAST:event_btnAgregarKeyTyped

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        btnNuevo.setEnabled(false);
        btnAgregar.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
        actDesTxt(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            int fila = tablaUsuarios.getSelectedRow();
            if (!String.valueOf(tablaUsuarios.getValueAt(fila, 0)).equals("Administrador")) {
                btnNuevo.setEnabled(false);
                btnActualizar.setEnabled(true);
                btnModificar.setEnabled(false);
                txtUser.setText(String.valueOf(tablaUsuarios.getValueAt(fila, 0)));
                txtNombre.setText(String.valueOf(tablaUsuarios.getValueAt(fila, 1)));
                txtApp.setText(String.valueOf(tablaUsuarios.getValueAt(fila, 2)));
                txtApm.setText(String.valueOf(tablaUsuarios.getValueAt(fila, 3)));
                actDesTxt(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Es necesario tener acceso Super Root para hacer esta operación\n para más información: 7443851880 o 7581046715");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Es necesario seleccionar un usuario de la tabla");
        }


    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        actDes(false);
        limpiarTxt();
        actDesTxt(false);        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            //String pass = JOptionPane.showInputDialog(rootPane, "para registrar un nuevo usuario es necesario\n ingresar la contraseña del Administrador", "Aviso", WIDTH);
            nvo msj = new nvo(null, true);
            msj.setVisible(true);
            if (msj.getReturnStatus() == 1) {
                if (x == true && d == true) {
                    String datos[] = new String[5];
                    datos[0] = txtUser.getText().trim();
                    datos[1] = pass1.getText().trim();
                    datos[2] = txtNombre.getText().trim();
                    datos[3] = txtApp.getText().trim();
                    datos[4] = txtApm.getText().trim();
                    int c = 0;
                    for (int i = 0; i < datos.length; i++) {
                        if (!datos[i].equals("")) {
                            c++;
                        }
                    }
                    if (c == datos.length) {
                        if (fun.newUser(datos)) {
                            JOptionPane.showMessageDialog(rootPane, "El usuario se registro correctamente");
                            actDes(false);
                            actDesTxt(false);
                            limpiarTxt();
                            tablaUsuarios.setRowHeight(26);
                            tablaUsuarios.setModel(fun.getUsuario());
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Fue imposible registrar al usuario");
                        }
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Es necesario llenar todos los campos");

                    }
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void pass1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pass1KeyReleased
        String pass = new String(pass1.getPassword());
        String passw = new String(pass2.getPassword());
        if (!passw.equals("")) {
            if (!pass.equals(passw)) {
                d = false;
                x = false;
                msjError.setText("Las contraseñas no coinciden");
            } else {
                d = true;
                x = true;
                msjError.setText("");
            }
        }
    }//GEN-LAST:event_pass1KeyReleased

    private void pass2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pass2KeyReleased
        String pass = new String(pass1.getPassword());
        String passw = new String(pass2.getPassword());
        if (!pass.equals("")) {
            if (!passw.equals(pass)) {
                x = false;
                d = false;
                msjError.setText("Las contraseñas no coinciden");
            } else {
                x = true;
                d = true;
                msjError.setText("");
            }
        }
    }//GEN-LAST:event_pass2KeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            int fila = tablaUsuarios.getSelectedRow();
            //String pass = JOptionPane.showInputDialog(rootPane, "para registrar un nuevo usuario es necesario\n ingresar la contraseña del Administrador", "Aviso", WIDTH);
            if (!String.valueOf(tablaUsuarios.getValueAt(fila, 0)).equals("Administrador")) {
                nvo msj = new nvo(null, true);
                msj.setVisible(true);
                if (msj.getReturnStatus() == 1) {
                    if (fun.deleteUser(String.valueOf(tablaUsuarios.getValueAt(fila, 1)), String.valueOf(tablaUsuarios.getValueAt(fila, 2)), String.valueOf(tablaUsuarios.getValueAt(fila, 3)))) {
                        JOptionPane.showMessageDialog(rootPane, "Usuario eliminado correctamente");
                        tablaUsuarios.setRowHeight(26);
                        tablaUsuarios.setModel(fun.getUsuario());
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Fue imposible eliminar el usuario");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Es necesario tener acceso Super Root para hacer esta operación\n para más información: 7443851880 o 7581046715");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione el usuario que desea eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void finKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_finKeyTyped
        int limite = 4;
        if (fin.getText().length() == limite) {
            fin.transferFocus();
            evt.consume();
        }
        keyTyped(evt);
    }//GEN-LAST:event_finKeyTyped

    private void inicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inicioKeyTyped
        int limite = 4;
        if (inicio.getText().length() == limite) {
            evt.consume();
            inicio.transferFocus();
        }
        keyTyped(evt);
    }//GEN-LAST:event_inicioKeyTyped

    private void errorComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_errorComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_errorComponentRemoved

    private void btnNuevoCiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoCiActionPerformed
        btnNuevoCi.setEnabled(false);
        btnAgregarCi.setEnabled(true);
        btnActualizarCi.setEnabled(false);
        btnEliminarCi.setEnabled(false);
        limpiarCi(true);
    }//GEN-LAST:event_btnNuevoCiActionPerformed

    private void btnCancelarCiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCiActionPerformed
        limpiarCi(false);
        actDesCi(false);        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarCiActionPerformed

    private void btnAgregarCiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCiActionPerformed
        agregarCiclo();
    }//GEN-LAST:event_btnAgregarCiActionPerformed

    private void ciclosLisMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ciclosLisMouseReleased


    }//GEN-LAST:event_ciclosLisMouseReleased

    private void ciclosLisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ciclosLisMousePressed
        statusActivos(ciclosLis.getSelectedValue());
        statusBajas(ciclosLis.getSelectedValue());
    }//GEN-LAST:event_ciclosLisMousePressed

    private void btnEliminarCiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCiActionPerformed
        nvo n = new nvo(null, true);
        n.setVisible(true);
        try {
            if (n.getReturnStatus() == 1) {
                if (fun.deleteCiclo(ciclosLis.getSelectedValue())) {
                    JOptionPane.showMessageDialog(rootPane, "Ciclo escolar eliminado correctamente¡");
                    llenarLis();
                    statusActivos(this.ciclo);
                    statusBajas(this.ciclo);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione el ciclo-escolar a eliminar");
        }
    }//GEN-LAST:event_btnEliminarCiActionPerformed

    private void costoPreeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costoPreeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_costoPreeKeyTyped

    private void btnModifCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifCActionPerformed
        nuevo = true;
        costoPree.setText(cPrees.getText());
        costoPrim.setText(cPrima.getText());
        costoSec.setText(cSecu.getText());
        btnModifC.setEnabled(false);
        btnIModificar.setEnabled(false);
        btnGuardarCam.setEnabled(true);
    }//GEN-LAST:event_btnModifCActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        btnGuardarCam.setEnabled(false);
        btnModifC.setEnabled(true);
        btnIModificar.setEnabled(true);
        costoPree.setText("");
        costoPrim.setText("");
        costoSec.setText("");
    }//GEN-LAST:event_cancelarActionPerformed

    private void btnGuardarCamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCamActionPerformed
        if (nuevo == true) {
            actuali("colegiatura");
        } else if (nuevo == false) {
            actuali("inscripcion");
        }
    }//GEN-LAST:event_btnGuardarCamActionPerformed

    private void btnIModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIModificarActionPerformed
        nuevo = false;
        costoPree.setText(iPrees.getText());
        costoPrim.setText(iPrima.getText());
        costoSec.setText(iSecu.getText());
        btnModifC.setEnabled(false);
        btnIModificar.setEnabled(false);
        btnGuardarCam.setEnabled(true);
    }//GEN-LAST:event_btnIModificarActionPerformed

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
            java.util.logging.Logger.getLogger(diagConf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(diagConf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(diagConf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(diagConf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                diagConf dialog = new diagConf(new javax.swing.JFrame(), true, ciclo);
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
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnActualizarCi;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarCi;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarCi;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarCi;
    private javax.swing.JButton btnGuardarCam;
    private javax.swing.JButton btnIModificar;
    private javax.swing.JButton btnModifC;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevoCi;
    private javax.swing.JTextField cPrees;
    private javax.swing.JTextField cPrima;
    private javax.swing.JTextField cSecu;
    private javax.swing.JButton cancelar;
    private javax.swing.JList<String> ciclosLis;
    private javax.swing.JTextField costoPree;
    private javax.swing.JTextField costoPrim;
    private javax.swing.JTextField costoSec;
    private javax.swing.JLabel error;
    private javax.swing.JTextField fin;
    private javax.swing.JTextField iPrees;
    private javax.swing.JTextField iPrima;
    private javax.swing.JTextField iSecu;
    private javax.swing.JTextField inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel msjError;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JLabel preBajas;
    private javax.swing.JLabel presAlta;
    private javax.swing.JLabel priAltas;
    private javax.swing.JLabel priBajas;
    private javax.swing.JLabel secAltas;
    private javax.swing.JLabel secBajas;
    private javax.swing.JTabbedPane tabPanel;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField txtApm;
    private javax.swing.JTextField txtApp;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private void statusActivos(String ci) {
        try {
            ArrayList<Integer> list = fun.getActivos("Activo", ci);
            presAlta.setText(String.valueOf(list.get(0)));
            priAltas.setText(String.valueOf(list.get(1)));
            secAltas.setText(String.valueOf(list.get(2)));
        } catch (Exception e) {
        }
    }

    private void statusBajas(String ci) {
        try {
            ArrayList<Integer> list = fun.getActivos("Baja", ci);
            preBajas.setText(String.valueOf(list.get(0)));
            priBajas.setText(String.valueOf(list.get(1)));
            secBajas.setText(String.valueOf(list.get(2)));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void cargarPrec() {
        try {
            ArrayList<Integer> list = fun.cargarColegiatura(this.ciclo);
            ArrayList<Integer> lis = fun.cargarInscripcion(this.ciclo);
            cPrees.setText(String.valueOf(list.get(0)));
            cPrima.setText(String.valueOf(list.get(1)));
            cSecu.setText(String.valueOf(list.get(2)));
            iPrees.setText(String.valueOf(lis.get(0)));
            iPrima.setText(String.valueOf(lis.get(1)));
            iSecu.setText(String.valueOf(lis.get(2)));
        } catch (Exception e) {
        }

    }

    private void actuali(String tipo) {
        String cantidad[][] = new String[3][2];
        try {
            boolean x = false, d = false;
            //String pass = JOptionPane.showInputDialog(rootPane, "para registrar un nuevo usuario es necesario\n ingresar la contraseña del Administrador", "Aviso", WIDTH);

            cantidad[0][0] = costoPree.getText().trim();
            cantidad[0][1] = "Preescolar";
            cantidad[1][0] = costoPrim.getText().trim();
            cantidad[1][1] = "Primaria";
            cantidad[2][0] = costoSec.getText().trim();
            cantidad[2][1] = "Secundaria";
            if (!costoPree.getText().trim().equals("") && !costoPrim.getText().trim().equals("") && !costoSec.getText().trim().equals("")) {
                x = true;
                d = true;
            }
            if (x == true && d == true) {
                nvo msj = new nvo(null, true);
                msj.setVisible(true);
                boolean ven = msj.isShowing();
                while (ven) {
                    ven = msj.isShowing();
                }
                if (msj.getReturnStatus() == 1) {
                    if (fun.updatePrecio(ciclo, tipo, cantidad)) {
                        JOptionPane.showMessageDialog(rootPane, "Costos actualizados correctamente");
                        btnGuardarCam.setEnabled(false);
                        btnModifC.setEnabled(true);
                        btnIModificar.setEnabled(true);
                        costoPree.setText("");
                        costoPrim.setText("");
                        costoSec.setText("");
                        cargarPrec();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Error al actualizar los datos");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Es necesario ingresar los costos");
            }

        } catch (Exception e) {

        }
    }

    private void agregarCiclo() {
        String ini = inicio.getText().trim();
        String fn = fin.getText().trim();
        if (!ini.equals("") && !fn.equals("")) {
            String cicE = ini + "-" + fn;
            agregarPrecios agr = new agregarPrecios(null, true, cicE);
            agr.setVisible(true);
            if (agr.getStatusD() == 1) {
                llenarLis();
                limpiarCi(false);
                actDesCi(false);
            }

        }
    }

    private void actDes(boolean st) {
        btnNuevo.setEnabled(!st);
        btnAgregar.setEnabled(st);
        btnModificar.setEnabled(!st);
        btnActualizar.setEnabled(st);
        btnEliminar.setEnabled(!st);

    }

    private void actDesCi(boolean st) {
        btnNuevoCi.setEnabled(!st);
        btnAgregarCi.setEnabled(st);
        btnActualizarCi.setEnabled(st);
        btnEliminarCi.setEnabled(!st);

    }

    private void limpiarCi(boolean f) {
        inicio.setText("");
        inicio.setEditable(f);
        fin.setText("");
        fin.setEditable(f);
    }

    private void actDesTxt(boolean st) {
        txtUser.setEditable(st);
        txtNombre.setEditable(st);
        txtApp.setEditable(st);
        txtApm.setEditable(st);
        pass1.setEditable(st);
        pass2.setEditable(st);

    }

    private void limpiarTxt() {
        txtUser.setText("");
        txtNombre.setText("");
        txtApp.setText("");
        txtApm.setText("");
        pass1.setText("");
        pass2.setText("");
    }

    public void keyTyped(KeyEvent ke) {
        char c = ke.getKeyChar();

        if (Character.isLetter(c)) {
            getToolkit().beep();

            ke.consume();

            error.setText("Ingresa Solo Numeros");

        } else {
            error.setText("");
        }

    }
}
