package control_pagos;

import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

import operaciones.conexion;
import operaciones.funciones;

public class fraReporte extends javax.swing.JFrame {

    private static String ciclo = "", usu = "";
    private funciones fun = new funciones();
    SimpleDateFormat formato;
    private Calendar Mes = Calendar.getInstance();
    boolean statu = false;
    private float ins, coop, col, rec, trans;

    public fraReporte(String ciclo, String usu) {
        initComponents();
        this.setTitle("Generación de reporte | control de pagos");
        this.setIconImage(new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage());
        this.ciclo = ciclo;
        this.usu = usu;
        this.setExtendedState(MAXIMIZED_BOTH);
        radGeneral.setSelected(true);
        esperarCierre();
        tablaGeneral.setRowHeight(28);
        tablaNombres.setRowHeight(28);
        tablaFechas.setRowHeight(28);
        tablaDeuda.setRowHeight(28);
        tablaIngresos.setRowHeight(29);
        tablaGeneral.setModel(fun.reporteGenFec(this.ciclo, "", "", 1));
        tablaIngresos.setModel(fun.reporteIngresos(this.ciclo));
        tablaDeuda.setModel(fun.reporteDeuda(ciclo, "", (Mes.get(Calendar.MONTH) + 1)));
        sumarGeneral();
        sumarIngresos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tabPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        radGeneral = new javax.swing.JRadioButton();
        radPreescolar = new javax.swing.JRadioButton();
        radPrimaria = new javax.swing.JRadioButton();
        radSecundaria = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaGeneral = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtTotalG = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        edtNombre = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaNombres = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        txtTotalNom = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        fechaInicial = new com.toedter.calendar.JDateChooser();
        fechaFinal = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaFechas = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtTotalFech = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaIngresos = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtTotalIngresos = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        comboMes = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        comboAdeudos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaDeuda = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabPane.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        tabPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPaneMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabPaneMouseReleased(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        grupo.add(radGeneral);
        radGeneral.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        radGeneral.setText("General");
        radGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radGeneralActionPerformed(evt);
            }
        });

        grupo.add(radPreescolar);
        radPreescolar.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        radPreescolar.setText("Preescolar");
        radPreescolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radPreescolarActionPerformed(evt);
            }
        });

        grupo.add(radPrimaria);
        radPrimaria.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        radPrimaria.setText("Primaria");
        radPrimaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radPrimariaActionPerformed(evt);
            }
        });

        grupo.add(radSecundaria);
        radSecundaria.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        radSecundaria.setText("Secundaria");
        radSecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radSecundariaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(radGeneral)
                .addGap(20, 20, 20)
                .addComponent(radPreescolar)
                .addGap(20, 20, 20)
                .addComponent(radPrimaria)
                .addGap(20, 20, 20)
                .addComponent(radSecundaria)
                .addContainerGap(700, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radGeneral)
                    .addComponent(radPreescolar)
                    .addComponent(radPrimaria)
                    .addComponent(radSecundaria))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaGeneral.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaGeneral);

        jButton1.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jButton1.setText("Imprimir Reporte");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel6.setText("Total:");

        txtTotalG.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1229, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(530, 530, 530)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotalG, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTotalG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabPane.addTab("General", jPanel2);

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnBuscar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        edtNombre.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        edtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtNombreKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        tablaNombres.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaNombres);

        jButton2.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jButton2.setText("Imprimir reporte");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtTotalNom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Total:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(532, 532, 532)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 407, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalNom, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTotalNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabPane.addTab("Nombre", jPanel10);

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        jLabel2.setText("Desde:");

        jLabel3.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        jLabel3.setText("Hasta:");

        jButton3.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        fechaInicial.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(fechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(fechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(512, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        tablaFechas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablaFechas);

        jButton4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton4.setText("Imprimir reporte");

        jLabel8.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel8.setText("Total:");

        txtTotalFech.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        txtTotalFech.setText("jTextField1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(532, 532, 532)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotalFech, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtTotalFech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tabPane.addTab("Por fecha", jPanel4);

        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1225, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );

        tablaIngresos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tablaIngresos);

        jButton5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton5.setText("Imprimir reporte");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel9.setText("Total:");

        txtTotalIngresos.setEditable(false);
        txtTotalIngresos.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(381, 381, 381)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addComponent(jScrollPane4)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtTotalIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        tabPane.addTab("Ingresos", jPanel11);

        comboMes.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        comboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<seleccionar>", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio" }));
        comboMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMesActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel4.setText("Adeudos de:");

        comboAdeudos.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        comboAdeudos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colegiatura", "Inscripciones", "Cooperación anual" }));
        comboAdeudos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAdeudosActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel5.setText("Mes:");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboAdeudos, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(84, 84, 84)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(785, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboAdeudos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        tablaDeuda.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tablaDeuda);

        jButton7.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jButton7.setText("Generar Reporte");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1247, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(497, 497, 497)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabPane.addTab("Adeudos", jPanel12);

        jPanel5.setBackground(new java.awt.Color(86, 7, 12));

        jPanel6.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Generación de reportes");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/informeb.png"))); // NOI18N

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/Volver.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel10)
                .addGap(297, 297, 297)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10))))
                .addGap(11, 11, 11)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPane)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radGeneralActionPerformed
        tablaGeneral.setModel(fun.reporteGenFec(this.ciclo, "", "", 1));
        sumarGeneral();
    }//GEN-LAST:event_radGeneralActionPerformed

    private void radPreescolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radPreescolarActionPerformed
        tablaGeneral.setModel(fun.reporteNivel(ciclo, radPreescolar.getText()));
        sumarGeneral();
    }//GEN-LAST:event_radPreescolarActionPerformed

    private void radPrimariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radPrimariaActionPerformed
        tablaGeneral.setModel(fun.reporteNivel(ciclo, radPrimaria.getText()));
        sumarGeneral();
    }//GEN-LAST:event_radPrimariaActionPerformed

    private void radSecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radSecundariaActionPerformed
        tablaGeneral.setModel(fun.reporteNivel(ciclo, radSecundaria.getText()));
        sumarGeneral();
    }//GEN-LAST:event_radSecundariaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Map variable = new HashMap();
            String nomRepo = "reporteNivel.jasper";
            if (radGeneral.isSelected() == true) {
                nomRepo = "reporteGral.jasper";
                variable.put("c", fun.idCiclo(ciclo));
            } else if (radPreescolar.isSelected()) {
                variable.put("ciclo", fun.idCiclo(ciclo));
                variable.put("nivel", "Preescolar");
            } else if (radPrimaria.isSelected()) {
                variable.put("ciclo", fun.idCiclo(ciclo));
                variable.put("nivel", "Primaria");
            } else if (radSecundaria.isSelected()) {
                variable.put("ciclo", fun.idCiclo(ciclo));
                variable.put("nivel", "Secundaria");
            }

            String ubicacion = System.getProperty("user.dir") + "/" + nomRepo;
            reportes(ubicacion, variable);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (!edtNombre.getText().trim().equals("")) {
            tablaNombres.setModel(fun.getHistorialPagos(ciclo, edtNombre.getText().trim()));
            sumarNom();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ingrese el nombre del alumno que desea buscar");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tabPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPaneMouseClicked
        sumarIngresos();
        sumarGeneral();
    }//GEN-LAST:event_tabPaneMouseClicked

    private void edtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtNombreKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            btnBuscar.doClick();
        }
    }//GEN-LAST:event_edtNombreKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            formato = new SimpleDateFormat("yyyy-MM-dd");
            String fechaIni = formato.format(fechaInicial.getDate());
            String fechaFin = formato.format(fechaFinal.getDate());
            tablaFechas.setModel(fun.reporteGenFec(ciclo, fechaIni, fechaFin, 2));
            sumarFecha();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Favor de ingresar las fecha de inicio y final de la busqueda");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void comboMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMesActionPerformed
        if (comboMes.getSelectedIndex() > 0) {
            if (comboAdeudos.getSelectedIndex() == 0) {
                tablaDeuda.setModel(fun.reporteDeuda(ciclo, comboMes.getSelectedItem().toString(), 0));
            } else if (comboAdeudos.getSelectedIndex() == 1) {

            }
        }
    }//GEN-LAST:event_comboMesActionPerformed

    private void comboAdeudosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAdeudosActionPerformed
        if (comboAdeudos.getSelectedIndex() == 0) {
            tablaDeuda.setModel(fun.reporteDeuda(ciclo, "", (Mes.get(Calendar.MONTH) + 1)));
        } else if (comboAdeudos.getSelectedIndex() == 1) {
            tablaDeuda.setModel(fun.reporteInscripcion(ciclo, 0));
        } else if (comboAdeudos.getSelectedIndex() == 2) {
            tablaDeuda.setModel(fun.reporteInscripcion(ciclo, 1));
        }
    }//GEN-LAST:event_comboAdeudosActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        tablaIngresos.setModel(fun.reporteIngresos(ciclo));
        sumarIngresos();
        Map variable = new HashMap();
        variable.put("ciclo", fun.idCiclo(ciclo));
        String ubicacion = System.getProperty("user.dir") + "/reporteIngresos.jasper";
        reportes(ubicacion, variable);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void tabPaneMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPaneMouseReleased
        sumarIngresos();        // TODO add your handling code here:
    }//GEN-LAST:event_tabPaneMouseReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!edtNombre.getText().trim().equals("")) {
            Map variable = new HashMap();
            variable.put("ciclo", fun.idCiclo(ciclo));
            variable.put("nombre", edtNombre.getText());
            String ubicacion = System.getProperty("user.dir") + "/reporteNom.jasper";
            reportes(ubicacion, variable);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ingrese el nombre del alumno");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new framePrincipal(ciclo, usu).setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(fraReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fraReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fraReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fraReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fraReporte(ciclo, usu).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> comboAdeudos;
    private javax.swing.JComboBox<String> comboMes;
    private javax.swing.JTextField edtNombre;
    private com.toedter.calendar.JDateChooser fechaFinal;
    private com.toedter.calendar.JDateChooser fechaInicial;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JRadioButton radGeneral;
    private javax.swing.JRadioButton radPreescolar;
    private javax.swing.JRadioButton radPrimaria;
    private javax.swing.JRadioButton radSecundaria;
    private javax.swing.JTabbedPane tabPane;
    private javax.swing.JTable tablaDeuda;
    private javax.swing.JTable tablaFechas;
    private javax.swing.JTable tablaGeneral;
    private javax.swing.JTable tablaIngresos;
    private javax.swing.JTable tablaNombres;
    private javax.swing.JTextField txtTotalFech;
    private javax.swing.JTextField txtTotalG;
    private javax.swing.JTextField txtTotalIngresos;
    private javax.swing.JTextField txtTotalNom;
    // End of variables declaration//GEN-END:variables

    public void sumarGeneral() {
        float num1 = 0, Aux = 0;
        int c = 11;
        if (radGeneral.isSelected()) {
            c = 12;
        }
        try {
            String var = "";
            int tamaño = tablaGeneral.getRowCount();
            for (int i = 0; i < tamaño; i++) {
                var = String.valueOf(tablaGeneral.getValueAt(i, c));
                num1 = Float.parseFloat(var);
                if (Aux != 0) {
                    Aux += num1;
                } else {
                    Aux = num1;
                }
            }
            System.out.println(Aux);
            txtTotalG.setText(String.valueOf(Aux));
        } catch (Exception e) {
        }
    }

    public void sumarNom() {
        float num1 = 0, Aux = 0;
        try {
            String var = "";
            int tamaño = tablaNombres.getRowCount();
            for (int i = 0; i < tamaño; i++) {
                var = String.valueOf(tablaNombres.getValueAt(i, 8));
                num1 = Float.parseFloat(var);
                if (Aux != 0) {
                    Aux += num1;
                } else {
                    Aux = num1;
                }
            }
            System.out.println(Aux);
            txtTotalNom.setText(String.valueOf(Aux));
        } catch (Exception e) {
        }
    }

    public void sumarFecha() {
        float num1 = 0, Aux = 0;
        try {
            String var = "";
            int tamaño = tablaFechas.getRowCount();
            for (int i = 0; i < tamaño; i++) {
                var = String.valueOf(tablaFechas.getValueAt(i, 12));
                num1 = Float.parseFloat(var);
                if (Aux != 0) {
                    Aux += num1;
                } else {
                    Aux = num1;
                }
            }
            System.out.println(Aux);
            txtTotalFech.setText(String.valueOf(Aux));
        } catch (Exception e) {
        }
    }

    public void sumarIngresos() {
        if (tabPane.getSelectedIndex() == 3) {
            float num1 = 0, Aux = 0, Auxin = 0, Auxco = 0, Auxcol = 0, Auxrec = 0, Auxtra = 0;
            try {
                String var = "", a, b, c, d, e;
                int tamaño = tablaIngresos.getRowCount();
                for (int i = 0; i < tamaño; i++) {
                    a = String.valueOf(tablaIngresos.getValueAt(i, 1));
                    b = String.valueOf(tablaIngresos.getValueAt(i, 2));
                    c = String.valueOf(tablaIngresos.getValueAt(i, 3));
                    d = String.valueOf(tablaIngresos.getValueAt(i, 4));
                    e = String.valueOf(tablaIngresos.getValueAt(i, 5));
                    var = String.valueOf(tablaIngresos.getValueAt(i, 6));
                    num1 = Float.parseFloat(var);
                    Auxin = Float.parseFloat(a);
                    Auxco = Float.parseFloat(b);
                    Auxcol = Float.parseFloat(c);
                    Auxrec = Float.parseFloat(d);
                    Auxtra = Float.parseFloat(e);

                    if (Aux != 0) {
                        ins += Auxin;
                        Aux += num1;
                        coop += Auxco;
                        col += Auxcol;
                        rec += Auxrec;
                        trans += Auxtra;
                    } else {
                        Aux = num1;
                        ins = Auxin;
                        coop = Auxco;
                        col = Auxcol;
                        rec = Auxrec;
                        trans = Auxtra;
                    }
                }
                System.out.println("inscripcion = " + ins);
                System.out.println("cooperacion = " + coop);
                System.out.println("colegiatura = " + col);
                System.out.println("recargo = " + rec);
                System.out.println("transporte = " + trans);

                System.out.println(Aux);
                txtTotalIngresos.setText(String.valueOf(Aux));
            } catch (Exception e) {
            }
        }
    }

    /**
     *
     * esperarCierre() ---------Hilos de espera a cierre de
     * frame----------------------
     */
    private void esperarCierre() {
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close();
            }
        });
    }

    /**
     * su función es mostrar un mensaje de confirmacion de cierre de la vista .
     */
    private void close() {
        if (statu != true) {
            new framePrincipal(ciclo, usu).setVisible(true);
            this.dispose();
            statu = true;
        }
    }

    private void reportes(String ubicacion, Map variable) {
        try {
            System.out.println(ubicacion);
            JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile(ubicacion);
            JasperPrint imprimir = JasperFillManager.fillReport(reporte, variable, new conexion().getConexion());
            JasperViewer ver = new JasperViewer(imprimir, false);
            ver.setTitle(ciclo);
            ver.setVisible(true);
        } catch (Exception e) {

        }
    }
}
