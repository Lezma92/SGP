package control_pagos;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import operaciones.funciones;

public final class diagPagos extends javax.swing.JDialog {

    private static String ciclo = "", usuario;
    private funciones fun;
    private SimpleDateFormat formato;
    private Date fecha;
    String nombre = "";
    private float colegiatura = 0;
    private boolean bandera = false;

    public diagPagos(java.awt.Frame parent, boolean modal, String ciclo, String usu) {
        super(parent, modal);
        initComponents();
        this.setTitle("Gestión de pagos | control de pagos");
        this.setIconImage(new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage());
        this.setLocationRelativeTo(null);
        fun = new funciones();
        this.ciclo = ciclo;
        this.usuario = usu;

        fechas();
        limpiarTexto("Colegiatura: $0", "Transporte: $0");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        panelAgos = new javax.swing.JPanel();
        agosto = new javax.swing.JLabel();
        colAgos = new javax.swing.JLabel();
        transAgos = new javax.swing.JLabel();
        pagAgos = new javax.swing.JLabel();
        fechaAgos = new javax.swing.JLabel();
        panelSep = new javax.swing.JPanel();
        septiembre = new javax.swing.JLabel();
        colSep = new javax.swing.JLabel();
        transSep = new javax.swing.JLabel();
        pagSep = new javax.swing.JLabel();
        fechaSep = new javax.swing.JLabel();
        panelOct = new javax.swing.JPanel();
        octubre = new javax.swing.JLabel();
        colOct = new javax.swing.JLabel();
        transOct = new javax.swing.JLabel();
        pagOct = new javax.swing.JLabel();
        fechaOct = new javax.swing.JLabel();
        panelNov = new javax.swing.JPanel();
        noviembre = new javax.swing.JLabel();
        colNov = new javax.swing.JLabel();
        transNov = new javax.swing.JLabel();
        pagNov = new javax.swing.JLabel();
        FechaNov = new javax.swing.JLabel();
        panelDic = new javax.swing.JPanel();
        diciembre = new javax.swing.JLabel();
        colDic = new javax.swing.JLabel();
        transDic = new javax.swing.JLabel();
        pagDic = new javax.swing.JLabel();
        fechaDic = new javax.swing.JLabel();
        panelEne = new javax.swing.JPanel();
        enero = new javax.swing.JLabel();
        colEnero = new javax.swing.JLabel();
        transEne = new javax.swing.JLabel();
        pagEne = new javax.swing.JLabel();
        fechaEne = new javax.swing.JLabel();
        panelFeb = new javax.swing.JPanel();
        febrero = new javax.swing.JLabel();
        colFeb = new javax.swing.JLabel();
        transFeb = new javax.swing.JLabel();
        pagFeb = new javax.swing.JLabel();
        fechaFeb = new javax.swing.JLabel();
        panelMar = new javax.swing.JPanel();
        marzo = new javax.swing.JLabel();
        colMar = new javax.swing.JLabel();
        transMar = new javax.swing.JLabel();
        pagMar = new javax.swing.JLabel();
        fechaMar = new javax.swing.JLabel();
        panelJulio = new javax.swing.JPanel();
        julio = new javax.swing.JLabel();
        colJulio = new javax.swing.JLabel();
        transJulio = new javax.swing.JLabel();
        pagJulio = new javax.swing.JLabel();
        fechaJulio = new javax.swing.JLabel();
        panelJun = new javax.swing.JPanel();
        junio = new javax.swing.JLabel();
        colJun = new javax.swing.JLabel();
        transJunio = new javax.swing.JLabel();
        pagJunio = new javax.swing.JLabel();
        fechaJunio = new javax.swing.JLabel();
        panelAbril = new javax.swing.JPanel();
        abril = new javax.swing.JLabel();
        colAbril = new javax.swing.JLabel();
        transAbril = new javax.swing.JLabel();
        pagAbril = new javax.swing.JLabel();
        fechaAbril = new javax.swing.JLabel();
        panelMay = new javax.swing.JPanel();
        mayo = new javax.swing.JLabel();
        colMay = new javax.swing.JLabel();
        transMay = new javax.swing.JLabel();
        pagMay = new javax.swing.JLabel();
        fechaMay = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        edtBuscar = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        edtNombreA = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        edtNivel = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        edtGrado = new javax.swing.JTextField();
        edtTutor = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        edtColegiatura = new javax.swing.JTextField();
        cheBeca = new javax.swing.JCheckBox();
        edtBeca = new javax.swing.JTextField();
        edtTransporte = new javax.swing.JTextField();
        cheTrans = new javax.swing.JCheckBox();
        cheRecar = new javax.swing.JCheckBox();
        edtRecargo = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        edtTotal = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        edtReci = new javax.swing.JTextField();
        btnAbonar = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        jLabel72 = new javax.swing.JLabel();
        edtTel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboMes = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        fechaRegistro = new com.toedter.calendar.JDateChooser();
        msg = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxTipoPago = new javax.swing.JComboBox<>();

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
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestión de pagos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(483, 483, 483)
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

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        panelAgos.setBackground(new java.awt.Color(153, 153, 255));
        panelAgos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        agosto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        agosto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agosto.setText("AGOSTO");

        colAgos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        transAgos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        pagAgos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        fechaAgos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelAgosLayout = new javax.swing.GroupLayout(panelAgos);
        panelAgos.setLayout(panelAgosLayout);
        panelAgosLayout.setHorizontalGroup(
            panelAgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agosto, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
            .addComponent(colAgos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(transAgos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pagAgos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fechaAgos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelAgosLayout.setVerticalGroup(
            panelAgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgosLayout.createSequentialGroup()
                .addComponent(agosto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colAgos, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transAgos, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagAgos, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaAgos, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelSep.setBackground(new java.awt.Color(153, 153, 255));
        panelSep.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        septiembre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        septiembre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        septiembre.setText("SEPTIEMBRE");

        colSep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        transSep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        pagSep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        fechaSep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelSepLayout = new javax.swing.GroupLayout(panelSep);
        panelSep.setLayout(panelSepLayout);
        panelSepLayout.setHorizontalGroup(
            panelSepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(septiembre, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
            .addComponent(colSep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(transSep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pagSep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fechaSep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelSepLayout.setVerticalGroup(
            panelSepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSepLayout.createSequentialGroup()
                .addComponent(septiembre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colSep, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transSep, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagSep, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaSep, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelOct.setBackground(new java.awt.Color(153, 153, 255));
        panelOct.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        octubre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        octubre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        octubre.setText("OCTUBRE");

        colOct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        transOct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        pagOct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        fechaOct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelOctLayout = new javax.swing.GroupLayout(panelOct);
        panelOct.setLayout(panelOctLayout);
        panelOctLayout.setHorizontalGroup(
            panelOctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(octubre, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
            .addComponent(colOct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(transOct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pagOct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fechaOct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelOctLayout.setVerticalGroup(
            panelOctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOctLayout.createSequentialGroup()
                .addComponent(octubre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colOct, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transOct, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagOct, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaOct, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelNov.setBackground(new java.awt.Color(153, 153, 255));
        panelNov.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        noviembre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        noviembre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noviembre.setText("NOVIEMBRE");

        colNov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        transNov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        pagNov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        FechaNov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelNovLayout = new javax.swing.GroupLayout(panelNov);
        panelNov.setLayout(panelNovLayout);
        panelNovLayout.setHorizontalGroup(
            panelNovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(noviembre, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
            .addComponent(colNov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(transNov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pagNov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(FechaNov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelNovLayout.setVerticalGroup(
            panelNovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNovLayout.createSequentialGroup()
                .addComponent(noviembre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colNov, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transNov, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagNov, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FechaNov, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelDic.setBackground(new java.awt.Color(153, 153, 255));
        panelDic.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        diciembre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        diciembre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        diciembre.setText("DICIEMBRE");

        colDic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        transDic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        pagDic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        fechaDic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelDicLayout = new javax.swing.GroupLayout(panelDic);
        panelDic.setLayout(panelDicLayout);
        panelDicLayout.setHorizontalGroup(
            panelDicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(diciembre, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
            .addComponent(colDic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(transDic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pagDic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fechaDic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelDicLayout.setVerticalGroup(
            panelDicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDicLayout.createSequentialGroup()
                .addComponent(diciembre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colDic, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transDic, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagDic, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaDic, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelEne.setBackground(new java.awt.Color(153, 153, 255));
        panelEne.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        enero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        enero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enero.setText("ENERO");

        colEnero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        transEne.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        pagEne.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        fechaEne.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelEneLayout = new javax.swing.GroupLayout(panelEne);
        panelEne.setLayout(panelEneLayout);
        panelEneLayout.setHorizontalGroup(
            panelEneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(enero, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
            .addComponent(colEnero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(transEne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pagEne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fechaEne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelEneLayout.setVerticalGroup(
            panelEneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEneLayout.createSequentialGroup()
                .addComponent(enero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colEnero, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transEne, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagEne, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaEne, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFeb.setBackground(new java.awt.Color(153, 153, 255));
        panelFeb.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        febrero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        febrero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        febrero.setText("FEBRERO");

        colFeb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        transFeb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        pagFeb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        fechaFeb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelFebLayout = new javax.swing.GroupLayout(panelFeb);
        panelFeb.setLayout(panelFebLayout);
        panelFebLayout.setHorizontalGroup(
            panelFebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(febrero, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
            .addComponent(colFeb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(transFeb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pagFeb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fechaFeb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelFebLayout.setVerticalGroup(
            panelFebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFebLayout.createSequentialGroup()
                .addComponent(febrero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colFeb, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transFeb, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagFeb, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaFeb, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelMar.setBackground(new java.awt.Color(153, 153, 255));
        panelMar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        marzo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        marzo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        marzo.setText("MARZO");

        colMar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        transMar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        pagMar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        fechaMar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelMarLayout = new javax.swing.GroupLayout(panelMar);
        panelMar.setLayout(panelMarLayout);
        panelMarLayout.setHorizontalGroup(
            panelMarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(marzo, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
            .addComponent(colMar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(transMar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pagMar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fechaMar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMarLayout.setVerticalGroup(
            panelMarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarLayout.createSequentialGroup()
                .addComponent(marzo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colMar, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transMar, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagMar, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaMar, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelJulio.setBackground(new java.awt.Color(153, 153, 255));
        panelJulio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        julio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        julio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        julio.setText("JULIO");

        colJulio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        transJulio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        pagJulio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        fechaJulio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelJulioLayout = new javax.swing.GroupLayout(panelJulio);
        panelJulio.setLayout(panelJulioLayout);
        panelJulioLayout.setHorizontalGroup(
            panelJulioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(julio, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
            .addComponent(colJulio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(transJulio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pagJulio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fechaJulio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelJulioLayout.setVerticalGroup(
            panelJulioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJulioLayout.createSequentialGroup()
                .addComponent(julio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colJulio, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transJulio, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagJulio, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaJulio, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelJun.setBackground(new java.awt.Color(153, 153, 255));
        panelJun.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        junio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        junio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        junio.setText("JUNIO");

        colJun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        transJunio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        pagJunio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        fechaJunio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelJunLayout = new javax.swing.GroupLayout(panelJun);
        panelJun.setLayout(panelJunLayout);
        panelJunLayout.setHorizontalGroup(
            panelJunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(junio, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
            .addComponent(colJun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(transJunio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pagJunio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fechaJunio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelJunLayout.setVerticalGroup(
            panelJunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJunLayout.createSequentialGroup()
                .addComponent(junio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colJun, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transJunio, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagJunio, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaJunio, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelAbril.setBackground(new java.awt.Color(153, 153, 255));
        panelAbril.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        abril.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        abril.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        abril.setText("ABRIL");

        colAbril.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        transAbril.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        pagAbril.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        fechaAbril.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelAbrilLayout = new javax.swing.GroupLayout(panelAbril);
        panelAbril.setLayout(panelAbrilLayout);
        panelAbrilLayout.setHorizontalGroup(
            panelAbrilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abril, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
            .addComponent(colAbril, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(transAbril, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pagAbril, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fechaAbril, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelAbrilLayout.setVerticalGroup(
            panelAbrilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAbrilLayout.createSequentialGroup()
                .addComponent(abril)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colAbril, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transAbril, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagAbril, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaAbril, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelMay.setBackground(new java.awt.Color(153, 153, 255));
        panelMay.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        mayo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mayo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mayo.setText("MAYO");

        colMay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        transMay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        pagMay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        fechaMay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelMayLayout = new javax.swing.GroupLayout(panelMay);
        panelMay.setLayout(panelMayLayout);
        panelMayLayout.setHorizontalGroup(
            panelMayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mayo, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
            .addComponent(colMay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(transMay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pagMay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fechaMay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMayLayout.setVerticalGroup(
            panelMayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMayLayout.createSequentialGroup()
                .addComponent(mayo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colMay, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transMay, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagMay, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaMay, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(panelAgos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelSep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelOct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelNov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(panelDic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelEne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelFeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelMar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(panelAbril, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelMay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelJun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelJulio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelNov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelOct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelAgos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelSep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelMar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelFeb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelDic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelEne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelJulio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelJun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelAbril, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelMay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBuscar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        edtBuscar.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        edtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtBuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(edtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel62.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        jLabel62.setText("Nombre completo:");

        edtNombreA.setEditable(false);
        edtNombreA.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N

        jLabel63.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        jLabel63.setText("Nivel:");

        edtNivel.setEditable(false);
        edtNivel.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N

        jLabel64.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        jLabel64.setText("Grado:");

        edtGrado.setEditable(false);
        edtGrado.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N

        edtTutor.setEditable(false);
        edtTutor.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N

        jLabel65.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        jLabel65.setText("Tutor:");

        jLabel66.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("Datos personales");

        jLabel68.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        jLabel68.setText("Colegiatura:");

        edtColegiatura.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N

        cheBeca.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        cheBeca.setText("Beca");
        cheBeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheBecaActionPerformed(evt);
            }
        });

        edtBeca.setEditable(false);
        edtBeca.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        edtBeca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtBecaKeyReleased(evt);
            }
        });

        edtTransporte.setEditable(false);
        edtTransporte.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        edtTransporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtTransporteKeyReleased(evt);
            }
        });

        cheTrans.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        cheTrans.setText("Transporte");
        cheTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheTransActionPerformed(evt);
            }
        });

        cheRecar.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        cheRecar.setText("Recargo");
        cheRecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheRecarActionPerformed(evt);
            }
        });

        edtRecargo.setEditable(false);
        edtRecargo.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        edtRecargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtRecargoKeyReleased(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        jLabel69.setText("Total a pagar:");

        edtTotal.setEditable(false);
        edtTotal.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N

        jLabel70.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        jLabel70.setText("Recibí");

        edtReci.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        edtReci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtReciKeyReleased(evt);
            }
        });

        btnAbonar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnAbonar.setText("Abonar");
        btnAbonar.setEnabled(false);
        btnAbonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbonarActionPerformed(evt);
            }
        });

        btnPagar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnPagar.setText("Pagar");
        btnPagar.setEnabled(false);
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        jLabel72.setText("Teléfono:");

        edtTel.setEditable(false);
        edtTel.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        jLabel2.setText("Mes:");

        comboMes.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        comboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<seleccionar>", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio" }));
        comboMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMesActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        jLabel3.setText("Fecha:");

        fechaRegistro.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N

        msg.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        msg.setForeground(new java.awt.Color(255, 51, 0));
        msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        jLabel4.setText("Tipo de pago:");

        cbxTipoPago.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        cbxTipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<seleccionar>", "Efectivo", "Transferencia bancaria" }));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(msg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel63)
                            .addComponent(edtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel64)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(edtGrado)
                                .addGap(83, 83, 83))))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel20Layout.createSequentialGroup()
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel20Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cheTrans)
                                            .addComponent(cheBeca, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cheRecar)
                                            .addComponent(jLabel70)
                                            .addComponent(jLabel69)))
                                    .addComponent(jLabel68))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(edtBeca, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edtColegiatura, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edtTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edtRecargo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edtReci, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel72, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(edtNombreA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtTutor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbonar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(edtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtNombreA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel63)
                            .addComponent(jLabel64))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(edtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel72)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2))
                    .addComponent(fechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(edtColegiatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtBeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cheBeca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cheTrans))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtRecargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cheRecar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(edtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(edtReci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbonar)
                    .addComponent(btnPagar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        XD();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void comboMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMesActionPerformed
        pagosMes();
    }//GEN-LAST:event_comboMesActionPerformed

    private void cheBecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheBecaActionPerformed
        try {
            if (cheBeca.isSelected()) {
                edtBeca.setText("");
                edtBeca.setEditable(true);

            } else {
                edtBeca.setText("");
                edtBeca.setEditable(false);
                colegiatura = Float.parseFloat(edtColegiatura.getText());
                edtTotal.setText(edtColegiatura.getText());
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cheBecaActionPerformed

    private void cheTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheTransActionPerformed
        if (cheTrans.isSelected()) {
            edtTransporte.setText("");
            edtTransporte.setEditable(true);
        } else {
            edtTransporte.setText("");
            edtTotal.setText(String.valueOf(colegiatura));
            edtTransporte.setEditable(false);
        }
    }//GEN-LAST:event_cheTransActionPerformed

    private void cheRecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheRecarActionPerformed
        if (cheRecar.isSelected()) {
            edtRecargo.setText("");
            edtRecargo.setEditable(true);

        } else {
            edtRecargo.setText("");
            edtRecargo.setEditable(false);
        }
    }//GEN-LAST:event_cheRecarActionPerformed

    private void edtReciKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtReciKeyReleased
        float r, t;
        try {
            r = Float.parseFloat(edtReci.getText());
            t = Float.parseFloat(edtTotal.getText());
            if (r > t) {
                msg.setText("No es posible realiazar el pago por que la cantidad recibida es mayor al total");
                btnAbonar.setEnabled(false);
                btnPagar.setEnabled(false);
            } else if (r == t) {
                msg.setText("");
                btnAbonar.setEnabled(false);
                btnPagar.setEnabled(true);
            } else if (r < t) {
                msg.setText("");
                btnPagar.setEnabled(false);
                btnAbonar.setEnabled(true);
            }
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_edtReciKeyReleased

    private void edtBecaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtBecaKeyReleased
        float col, beca, res;
        if (!edtBeca.getText().trim().equals("")) {
            if (cheBeca.isSelected()) {
                col = Float.parseFloat(edtColegiatura.getText());
                beca = Float.parseFloat(edtBeca.getText());
                res = col * beca / 100;
                res = col - res;
                colegiatura = res;
                edtTotal.setText(String.valueOf(res));
            } else {
                try {
                    colegiatura = Float.parseFloat(edtColegiatura.getText());
                    edtTotal.setText(edtColegiatura.getText());
                } catch (Exception e) {
                }

            }
        }

    }//GEN-LAST:event_edtBecaKeyReleased

    private void edtTransporteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtTransporteKeyReleased
        float suma = 0;
        if (!edtColegiatura.getText().trim().equals("Pagado")) {
            if (!edtTransporte.getText().trim().equals("")) {
                try {
                    suma = Float.parseFloat(edtTransporte.getText());
                    suma = suma + colegiatura;
                    edtTotal.setText(String.valueOf(suma));
                } catch (Exception e) {
                }
            } else {
                edtTotal.setText(String.valueOf(colegiatura));
            }
        } else {
            bandera = true;
            try {
                suma = Float.parseFloat(edtTransporte.getText().trim());
                edtTotal.setText(String.valueOf(suma));
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_edtTransporteKeyReleased

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        if (cbxTipoPago.getSelectedIndex() > 0) {
            pagar();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione el tipo de pago que se realizará");

        }
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnAbonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbonarActionPerformed
        if (cbxTipoPago.getSelectedIndex() > 0) {
            abonar();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione el tipo de pago que se realizará");

        }
    }//GEN-LAST:event_btnAbonarActionPerformed

    private void edtRecargoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtRecargoKeyReleased
        float recargo = 0, col = 0, transp = 0;
        if (!edtRecargo.getText().trim().equals("")) {
            recargo = Float.parseFloat(edtRecargo.getText());
            recargo += colegiatura;
            if (!edtTransporte.getText().trim().equals("")) {
                transp = Float.parseFloat(edtTransporte.getText());
                recargo += transp;
            }
            edtTotal.setText(String.valueOf(recargo));

        }
    }//GEN-LAST:event_edtRecargoKeyReleased

    private void edtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtBuscarKeyReleased
        char b = evt.getKeyChar();
        if (b == KeyEvent.VK_ENTER) {
            btnBuscar.doClick();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_edtBuscarKeyReleased

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
            java.util.logging.Logger.getLogger(diagPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(diagPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(diagPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(diagPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                diagPagos dialog = new diagPagos(new javax.swing.JFrame(), true, ciclo, usuario);
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
    private javax.swing.JLabel FechaNov;
    private javax.swing.JLabel abril;
    private javax.swing.JLabel agosto;
    private javax.swing.JButton btnAbonar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JComboBox<String> cbxTipoPago;
    private javax.swing.JCheckBox cheBeca;
    private javax.swing.JCheckBox cheRecar;
    private javax.swing.JCheckBox cheTrans;
    private javax.swing.JLabel colAbril;
    private javax.swing.JLabel colAgos;
    private javax.swing.JLabel colDic;
    private javax.swing.JLabel colEnero;
    private javax.swing.JLabel colFeb;
    private javax.swing.JLabel colJulio;
    private javax.swing.JLabel colJun;
    private javax.swing.JLabel colMar;
    private javax.swing.JLabel colMay;
    private javax.swing.JLabel colNov;
    private javax.swing.JLabel colOct;
    private javax.swing.JLabel colSep;
    private javax.swing.JComboBox<String> comboMes;
    private javax.swing.JLabel diciembre;
    private javax.swing.JTextField edtBeca;
    private javax.swing.JTextField edtBuscar;
    private javax.swing.JTextField edtColegiatura;
    private javax.swing.JTextField edtGrado;
    private javax.swing.JTextField edtNivel;
    private javax.swing.JTextField edtNombreA;
    private javax.swing.JTextField edtRecargo;
    private javax.swing.JTextField edtReci;
    private javax.swing.JTextField edtTel;
    private javax.swing.JTextField edtTotal;
    private javax.swing.JTextField edtTransporte;
    private javax.swing.JTextField edtTutor;
    private javax.swing.JLabel enero;
    private javax.swing.JLabel febrero;
    private javax.swing.JLabel fechaAbril;
    private javax.swing.JLabel fechaAgos;
    private javax.swing.JLabel fechaDic;
    private javax.swing.JLabel fechaEne;
    private javax.swing.JLabel fechaFeb;
    private javax.swing.JLabel fechaJulio;
    private javax.swing.JLabel fechaJunio;
    private javax.swing.JLabel fechaMar;
    private javax.swing.JLabel fechaMay;
    private javax.swing.JLabel fechaOct;
    private com.toedter.calendar.JDateChooser fechaRegistro;
    private javax.swing.JLabel fechaSep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel julio;
    private javax.swing.JLabel junio;
    private javax.swing.JLabel marzo;
    private javax.swing.JLabel mayo;
    private javax.swing.JLabel msg;
    private javax.swing.JLabel noviembre;
    private javax.swing.JLabel octubre;
    private javax.swing.JLabel pagAbril;
    private javax.swing.JLabel pagAgos;
    private javax.swing.JLabel pagDic;
    private javax.swing.JLabel pagEne;
    private javax.swing.JLabel pagFeb;
    private javax.swing.JLabel pagJulio;
    private javax.swing.JLabel pagJunio;
    private javax.swing.JLabel pagMar;
    private javax.swing.JLabel pagMay;
    private javax.swing.JLabel pagNov;
    private javax.swing.JLabel pagOct;
    private javax.swing.JLabel pagSep;
    private javax.swing.JPanel panelAbril;
    private javax.swing.JPanel panelAgos;
    private javax.swing.JPanel panelDic;
    private javax.swing.JPanel panelEne;
    private javax.swing.JPanel panelFeb;
    private javax.swing.JPanel panelJulio;
    private javax.swing.JPanel panelJun;
    private javax.swing.JPanel panelMar;
    private javax.swing.JPanel panelMay;
    private javax.swing.JPanel panelNov;
    private javax.swing.JPanel panelOct;
    private javax.swing.JPanel panelSep;
    private javax.swing.JLabel septiembre;
    private javax.swing.JLabel transAbril;
    private javax.swing.JLabel transAgos;
    private javax.swing.JLabel transDic;
    private javax.swing.JLabel transEne;
    private javax.swing.JLabel transFeb;
    private javax.swing.JLabel transJulio;
    private javax.swing.JLabel transJunio;
    private javax.swing.JLabel transMar;
    private javax.swing.JLabel transMay;
    private javax.swing.JLabel transNov;
    private javax.swing.JLabel transOct;
    private javax.swing.JLabel transSep;
    // End of variables declaration//GEN-END:variables

    private void pagar() {
        confirmarPago conf = new confirmarPago(null, true, usuario, ciclo);
        float conv = 0, transporte = 0, recargo = 0;
        try {
            conv = Float.parseFloat(edtReci.getText());
            if (!edtTransporte.getText().trim().equals("")) {
                transporte = Float.parseFloat(edtTransporte.getText());
                conv -= transporte;
            }
            if (!edtRecargo.getText().trim().equals("")) {
                recargo = Float.parseFloat(edtRecargo.getText());
                conv -= recargo;
            }
            fecha = fechaRegistro.getDate();
            String datos[] = new String[14];
            datos[0] = edtNombreA.getText();
            datos[1] = edtNivel.getText();
            datos[2] = edtGrado.getText();
            datos[3] = edtTutor.getText();
            datos[4] = edtTel.getText();
            datos[5] = edtReci.getText();
            datos[6] = comboMes.getSelectedItem().toString();
            datos[7] = usuario;
            datos[8] = String.valueOf(transporte);
            datos[9] = String.valueOf(conv);
            datos[10] = String.valueOf(colegiatura);
            datos[11] = edtBeca.getText();
            datos[12] = String.valueOf(recargo);
            datos[13] = cbxTipoPago.getSelectedItem().toString();
            conf.getDatos(datos, fecha, bandera);
            conf.setVisible(true);
            boolean b = conf.isShowing();
            while (b) {
                b = conf.isShowing();
            }
            if (conf.estado() == true) {
                limpiarTxt();
                cheTrans.setSelected(false);
                cheBeca.setSelected(false);
                cheRecar.setSelected(false);
                btnPagar.setEnabled(false);
                btnAbonar.setEnabled(false);
                cbxTipoPago.setSelectedIndex(0);
                XD();
                pagosMes();
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Favor de ingresar solo números");
        }
    }

    private void abonar() {
        confirmarPago conf = new confirmarPago(null, true, usuario, ciclo);
        float conv = 0, transporte = 0, recargo = 0;

        try {
            conv = Float.parseFloat(edtReci.getText());
            if (!edtTransporte.getText().trim().equals("")) {
                transporte = Float.parseFloat(edtTransporte.getText());
                conv -= transporte;
            }
            if (!edtRecargo.getText().trim().equals("")) {
                recargo = Float.parseFloat(edtRecargo.getText());
                conv -= recargo;
            }
            fecha = fechaRegistro.getDate();
            String datos[] = new String[14];
            datos[0] = edtNombreA.getText();
            datos[1] = edtNivel.getText();
            datos[2] = edtGrado.getText();
            datos[3] = edtTutor.getText();
            datos[4] = edtTel.getText();
            datos[5] = edtReci.getText();
            datos[6] = comboMes.getSelectedItem().toString();
            datos[7] = usuario;
            datos[8] = String.valueOf(transporte);
            datos[9] = String.valueOf(conv);
            datos[10] = String.valueOf(colegiatura);
            datos[11] = edtBeca.getText();
            datos[12] = String.valueOf(recargo);
            datos[13] = cbxTipoPago.getSelectedItem().toString();
            conf.getDatos(datos, fecha, bandera);

            conf.setVisible(true);
            boolean b = conf.isShowing();
            while (b) {
                b = conf.isShowing();
            }
            if (conf.estado() == true) {
                limpiarTxt();
                cheTrans.setSelected(false);
                cheBeca.setSelected(false);
                cheRecar.setSelected(false);
                btnPagar.setEnabled(false);
                btnAbonar.setEnabled(false);
                XD();
                pagosMes();
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Favor de ingresar solo números");
        }
    }

    public void fechas() {
        Date FechaActual = new Date();
        fechaRegistro.setDate(FechaActual);

    }

    private void setTexto(String texto) {
        colAgos.setText(texto);
        colSep.setText(texto);
        colOct.setText(texto);
        colNov.setText(texto);
        colDic.setText(texto);
        colEnero.setText(texto);
        colFeb.setText(texto);
        colMar.setText(texto);
        colAbril.setText(texto);
        colMay.setText(texto);
        colJun.setText(texto);
        colJulio.setText(texto);
    }

    private void XD() {
        if (!edtBuscar.getText().trim().equals("")) {
            comboMes.setSelectedIndex(0);
            limpiarTexto("Colegiatura: $0", "Transporte: $0");
            limpiarTxt();
            colores();
            String datos[] = fun.getDatosAlumno(edtBuscar.getText(), ciclo);

            if (datos[2] != null) {
                nombre = datos[0] + " " + datos[1] + " " + datos[2];
            } else {
                nombre = datos[0] + " " + datos[1];
            }
            try {
                edtNombreA.setText(nombre);
                edtNivel.setText(datos[3]);
                edtGrado.setText(datos[4]);
                edtTutor.setText(datos[5]);
                edtTel.setText(datos[6]);
                edtColegiatura.setText(datos[7]);
                edtTotal.setText(datos[7]);
                colegiatura = Float.parseFloat(datos[7]);
                setTexto("Colegiatura: " + datos[7]);
                llenar(ciclo, nombre);
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ingrese el nombre del alumno que desea buscar");
        }
    }

    private void llenar(String ciclo, String nombre) {

        String datos[][] = fun.getPagosAbonos(ciclo, nombre);
        int cont = 0;
        while (cont < datos.length) {
            for (int i = 0; i < datos.length; i++) {
                for (int j = 0; j < 4; j++) {
                    switch (datos[cont][0]) {
                        case "Agosto":
                            colAgos.setText("Colegiatura: " + datos[cont][1]);
                            fechaAgos.setText(datos[cont][2]);
                            if (datos[cont][3].equals("202020.00")) {
                                panelAgos.setBackground(new java.awt.Color(255, 255, 191));
                                pagAgos.setText("Exento");
                            } else if (datos[cont][1].equals(datos[cont][3])) {
                                pagAgos.setText("Pagado");
                                panelAgos.setBackground(Color.green);
                            } else {
                                pagAgos.setText("Abonó: " + datos[cont][3]);
                            }
                            transAgos.setText("Transporte: " + datos[cont][4]);

                            break;
                        case "Septiembre":
                            colSep.setText("Colegiatura: " + datos[cont][1]);
                            fechaSep.setText(datos[cont][2]);
                            transSep.setText("Transporte: " + datos[cont][4]);
                            if (datos[cont][3].equals("202020.00")) {
                                panelSep.setBackground(new java.awt.Color(255, 255, 191));
                                pagSep.setText("Exento");
                            } else if (datos[cont][1].equals(datos[cont][3])) {
                                pagSep.setText("Pagado");
                                panelSep.setBackground(Color.green);
                            } else {
                                pagSep.setText("Abonó: " + datos[cont][3]);
                            }
                            break;
                        case "Octubre":
                            colOct.setText("Colegiatura: " + datos[cont][1]);
                            fechaOct.setText(datos[cont][2]);
                            transOct.setText("Transporte: " + datos[cont][4]);
                            if (datos[cont][3].equals("202020.00")) {
                                panelOct.setBackground(new java.awt.Color(255, 255, 191));
                                pagOct.setText("Exento");
                            } else if (datos[cont][1].equals(datos[cont][3])) {
                                pagOct.setText("Pagado");
                                panelOct.setBackground(Color.green);
                            } else {
                                pagOct.setText("Abonó: " + datos[cont][3]);
                            }
                            break;
                        case "Noviembre":
                            colNov.setText("Colegiatura: " + datos[cont][1]);
                            FechaNov.setText(datos[cont][2]);
                            transNov.setText("Transporte: " + datos[cont][4]);
                            if (datos[cont][3].equals("202020.00")) {
                                panelNov.setBackground(new java.awt.Color(255, 255, 191));
                                pagNov.setText("Exento");
                            } else if (datos[cont][1].equals(datos[cont][3])) {
                                pagNov.setText("Pagado");
                                panelNov.setBackground(Color.green);
                            } else {
                                pagNov.setText("Abonó: " + datos[cont][3]);
                            }
                            break;
                        case "Diciembre":
                            colDic.setText("Colegiatura: " + datos[cont][1]);
                            fechaDic.setText(datos[cont][2]);
                            transDic.setText("Transporte: " + datos[cont][4]);
                            if (datos[cont][3].equals("202020.00")) {
                                panelDic.setBackground(new java.awt.Color(255, 255, 191));
                                pagDic.setText("Exento");
                            } else if (datos[cont][1].equals(datos[cont][3])) {
                                pagDic.setText("Pagado");
                                panelDic.setBackground(Color.green);
                            } else {
                                pagDic.setText("Abonó: " + datos[cont][3]);
                            }
                            break;
                        case "Enero":
                            colEnero.setText("Colegiatura: " + datos[cont][1]);
                            fechaEne.setText(datos[cont][2]);
                            transEne.setText("Transporte: " + datos[cont][4]);
                            if (datos[cont][3].equals("202020.00")) {
                                panelEne.setBackground(new java.awt.Color(255, 255, 191));
                                pagEne.setText("Exento");
                            } else if (datos[cont][1].equals(datos[cont][3])) {
                                pagEne.setText("Pagado");
                                panelEne.setBackground(Color.green);
                            } else {
                                pagEne.setText("Abonó: " + datos[cont][3]);
                            }
                            break;
                        case "Febrero":
                            colFeb.setText("Colegiatura: " + datos[cont][1]);
                            fechaFeb.setText(datos[cont][2]);
                            transFeb.setText("Transporte: " + datos[cont][4]);
                            if (datos[cont][3].equals("202020.00")) {
                                panelFeb.setBackground(new java.awt.Color(255, 255, 191));
                                pagFeb.setText("Exento");
                            } else if (datos[cont][1].equals(datos[cont][3])) {
                                pagFeb.setText("Pagado");
                                panelFeb.setBackground(Color.green);
                            } else {
                                pagFeb.setText("Abonó: " + datos[cont][3]);
                            }
                            break;
                        case "Marzo":
                            colMar.setText("Colegiatura: " + datos[cont][1]);
                            fechaMar.setText(datos[cont][2]);
                            transMar.setText("Transporte: " + datos[cont][4]);
                            if (datos[cont][3].equals("202020.00")) {
                                panelMar.setBackground(new java.awt.Color(255, 255, 191));
                                pagMar.setText("Exento");
                            } else if (datos[cont][1].equals(datos[cont][3])) {
                                pagMar.setText("Pagado");
                                panelMar.setBackground(Color.green);
                            } else {
                                pagMar.setText("Abonó: " + datos[cont][3]);
                            }
                            break;
                        case "Abril":
                            colAbril.setText("Colegiatura: " + datos[cont][1]);
                            fechaAbril.setText(datos[cont][2]);
                            transAbril.setText("Transporte: " + datos[cont][4]);
                            if (datos[cont][3].equals("202020.00")) {
                                panelAbril.setBackground(new java.awt.Color(255, 255, 191));
                                pagAbril.setText("Exento");
                            } else if (datos[cont][1].equals(datos[cont][3])) {
                                pagAbril.setText("Pagado");
                                panelAbril.setBackground(Color.green);
                            } else {
                                pagAbril.setText("Abonó: " + datos[cont][3]);
                            }
                            break;
                        case "Mayo":
                            colMay.setText("Colegiatura: " + datos[cont][1]);
                            fechaMay.setText(datos[cont][2]);
                            transMay.setText("Transporte: " + datos[cont][4]);
                            if (datos[cont][3].equals("202020.00")) {
                                panelMay.setBackground(new java.awt.Color(255, 255, 191));
                                pagMay.setText("Exento");
                            } else if (datos[cont][1].equals(datos[cont][3])) {
                                pagMay.setText("Pagado");
                                panelMay.setBackground(Color.green);
                            } else {
                                pagMay.setText("Abonó: " + datos[cont][3]);
                            }
                            break;
                        case "Junio":
                            colJun.setText("Colegiatura: " + datos[cont][1]);
                            fechaJunio.setText(datos[cont][2]);
                            transJunio.setText("Transporte: " + datos[cont][4]);
                            if (datos[cont][3].equals("202020.00")) {
                                panelJun.setBackground(new java.awt.Color(255, 255, 191));
                                pagJunio.setText("Exento");
                            } else if (datos[cont][1].equals(datos[cont][3])) {
                                pagJunio.setText("Pagado");
                                panelJun.setBackground(Color.green);
                            } else {
                                pagJunio.setText("Abonó: " + datos[cont][3]);
                            }
                            break;
                        case "Julio":
                            colJulio.setText("Colegiatura: " + datos[cont][1]);
                            fechaJulio.setText(datos[cont][2]);
                            transJulio.setText("Transporte: " + datos[cont][4]);
                            if (datos[cont][3].equals("202020.00")) {
                                panelJulio.setBackground(new java.awt.Color(255, 255, 191));
                                pagJulio.setText("Exento");
                            } else if (datos[cont][1].equals(datos[cont][3])) {
                                pagJulio.setText("Pagado");
                                panelJulio.setBackground(Color.green);
                            } else {
                                pagJulio.setText("Abonó: " + datos[cont][3]);
                            }
                            break;
                        default:
                            break;
                    }
                }
                cont++;
            }
        }
    }

    private void limpiarTexto(String col, String trans) {
        colAgos.setText(col);
        pagAgos.setText("");
        transAgos.setText(trans);
        fechaAgos.setText("");
        colSep.setText(col);
        pagSep.setText("");
        transSep.setText(trans);
        fechaSep.setText("");
        colOct.setText(col);
        pagOct.setText("");
        transOct.setText(trans);
        fechaOct.setText("");
        colNov.setText(col);
        pagNov.setText("");
        transNov.setText(trans);
        FechaNov.setText("");
        colDic.setText(col);
        pagDic.setText("");
        transDic.setText(trans);
        fechaDic.setText("");
        colEnero.setText(col);
        pagEne.setText("");
        transEne.setText(trans);
        fechaEne.setText("");
        colFeb.setText(col);
        pagFeb.setText("");
        transFeb.setText(trans);
        fechaFeb.setText("");
        colMar.setText(col);
        pagMar.setText("");
        transMar.setText(trans);
        fechaMar.setText("");
        colAbril.setText(col);
        pagAbril.setText("");
        transAbril.setText(trans);
        fechaAbril.setText("");
        colMay.setText(col);
        pagMay.setText("");
        transMay.setText(trans);
        fechaMay.setText("");
        colJun.setText(col);
        pagJunio.setText("");
        transJunio.setText(trans);
        fechaJunio.setText("");
        colJulio.setText(col);
        pagJulio.setText("");
        transJulio.setText(trans);
        fechaJulio.setText("");
    }

    private void colores() {
        panelAgos.setBackground(new java.awt.Color(153, 153, 255));
        panelSep.setBackground(new java.awt.Color(153, 153, 255));
        panelOct.setBackground(new java.awt.Color(153, 153, 255));
        panelNov.setBackground(new java.awt.Color(153, 153, 255));
        panelDic.setBackground(new java.awt.Color(153, 153, 255));
        panelEne.setBackground(new java.awt.Color(153, 153, 255));
        panelFeb.setBackground(new java.awt.Color(153, 153, 255));
        panelMar.setBackground(new java.awt.Color(153, 153, 255));
        panelAbril.setBackground(new java.awt.Color(153, 153, 255));
        panelMay.setBackground(new java.awt.Color(153, 153, 255));
        panelJun.setBackground(new java.awt.Color(153, 153, 255));
        panelJulio.setBackground(new java.awt.Color(153, 153, 255));
        cheBeca.setSelected(false);
        cheRecar.setSelected(false);
        cheTrans.setSelected(false);
        btnPagar.setEnabled(false);
        btnAbonar.setEnabled(false);

    }

    private void actChe(boolean b) {
        cheBeca.setEnabled(b);
        cheRecar.setEnabled(b);
    }

    private void limpiarTxt() {
        edtColegiatura.setEditable(false);
        edtTotal.setEditable(false);
        edtTransporte.setEditable(false);
        edtBeca.setEditable(false);
        edtRecargo.setEditable(false);
        edtColegiatura.setText("");
        edtTotal.setText("");
        edtTransporte.setText("");
        edtBeca.setText("");
        edtReci.setText("");
        edtRecargo.setText("");
    }

    private void pagosMes() {
        if (!edtBuscar.getText().trim().equals("")) {
            edtReci.setEnabled(true);
            actChe(true);
            cheTrans.setEnabled(true);
            limpiarTxt();
            bandera = false;
            float pago = fun.getPagoMes(ciclo, comboMes.getSelectedItem().toString(), edtBuscar.getText().trim());
            if (pago == 202020) {
                actChe(false);
                cheTrans.setEnabled(false);
                edtTransporte.setEditable(false);
                edtBeca.setEditable(false);
                edtRecargo.setEditable(false);
                edtColegiatura.setText("Exento");
            } else if (pago == 0) {
                edtColegiatura.setText(String.valueOf(colegiatura));
                edtTotal.setText(String.valueOf(colegiatura));
            } else if (pago == 101010) {
                edtColegiatura.setText("Pagado");
                actChe(false);
            } else {
                colegiatura = pago;
                edtColegiatura.setText(String.valueOf(pago));
                edtTotal.setText(String.valueOf(pago));
                bandera = true;
            }
        }
    }

    public void extranjeroXD(String nombre) {
        edtBuscar.setText(nombre);
        XD();
    }
}
