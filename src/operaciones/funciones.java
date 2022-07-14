package operaciones;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class funciones {

    private final conexion x = new conexion();
    private final Connection con = x.getConexion();
    private PreparedStatement ppt;
    private ResultSet rs;
    private DefaultTableModel modelo;
    Date f;
    private Calendar Mes = Calendar.getInstance();

    public boolean logeo(String user, String pass) {
        String userbd = "", passbd = "";
        String sql = "select usu,pass from usuarios where usu = '" + user + "' and pass = '" + pass + "'";
        try {
            ppt = con.prepareCall(sql);
            rs = ppt.executeQuery();
            while (rs.next()) {
                userbd = rs.getString(1);
                passbd = rs.getString(2);
            }
            if (userbd.equals(user) && passbd.equals(pass)) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("operaciones.funciones.logeo()" + e.getMessage());
        }
        return false;
    }

    public boolean ciclo(String ciclo) {

        String sql = "select ciclo from ciclo_escolar where ciclo = '" + ciclo + "'", ci = "";
        try {
            ppt = con.prepareCall(sql);
            rs = ppt.executeQuery();
            while (rs.next()) {
                ci = rs.getString(1);
            }
            if (ci.equals(ciclo)) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return false;
    }

    public String[] getPagos(String nivel, String ciclo) {
        String sql = "select colegiatura,inscripcion from pagos where nivel = '" + nivel + "' and id_ciclo_escolar = " + idCiclo(ciclo) + ";";
        String c[] = new String[2];
        try {
            ppt = con.prepareCall(sql);
            rs = ppt.executeQuery();
            while (rs.next()) {
                c[0] = rs.getString(1);
                c[1] = rs.getString(2);
            }
        } catch (Exception e) {
            System.out.println("Error funciones.getColegiatura" + e.getMessage());
        }
        return c;
    }

    public int idCiclo(String ciclo) {
        int id = 0;
        String sql = "select id from ciclo_escolar where ciclo = '" + ciclo + "'";
        try {
            ppt = con.prepareCall(sql);
            rs = ppt.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("funciones.idCiclo()" + e.getMessage());
        }
        return id;
    }

    public boolean altaAlumnos(String datos[], String ciclo) {
        String sql = "insert into alumnos values(null,?,?,?,?,?,?,?,?,?);";

        int id = idCiclo(ciclo);
        int idPag = idPago(id, datos[5]);
        try {
            ppt = con.prepareCall(sql);
            ppt.setInt(1, id);
            ppt.setInt(2, idPag);
            ppt.setString(3, datos[0]);
            ppt.setString(4, datos[1]);
            ppt.setString(5, datos[2]);
            ppt.setString(6, datos[3]);
            ppt.setString(7, datos[4]);
            ppt.setString(8, datos[6]);
            ppt.setString(9, "Activo");
            int res = ppt.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error funciones.altaAlumnos()" + e.getMessage());
        }
        return false;
    }

    public boolean updateAlumno(String datos[], String ciclo, String nombre) {
        String sql = "UPDATE alumnos SET id_ciclo_escolar= ?,id_pago= ?,nombre= ?,ape_pat= ?,ape_mat= ?,tutor=?,telefono=?,grado=? WHERE id = ?";
        int idAlu = idAlumno(nombre), idCi = idCiclo(ciclo), idP = idPago(idCi, datos[5]);
        try {
            ppt = con.prepareCall(sql);
            ppt.setInt(1, idCi);
            ppt.setInt(2, idP);
            ppt.setString(3, datos[0]);
            ppt.setString(4, datos[1]);
            ppt.setString(5, datos[2]);
            ppt.setString(6, datos[3]);
            ppt.setString(7, datos[4]);
            ppt.setString(8, datos[6]);
            ppt.setInt(9, idAlu);
            System.out.println(ppt);
            int as = ppt.executeUpdate();
            if (as > 0) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("operaciones.funciones.updateAlumno()" + e.getMessage());
        }
        return false;
    }

    int idAlumno(String nombre) {
        String sql = "select a.id from alumnos as a where concat(a.nombre,\" \",a.ape_pat,\" \",a.ape_mat) = '" + nombre + "' or  concat(a.nombre,\" \",a.ape_pat) ='" + nombre + "' ;";
        int id = 0;
        try {
            ppt = con.prepareCall(sql);
            rs = ppt.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("operaciones.funciones.idAlumno()" + e.getMessage());
        }
        return id;
    }

    public boolean Deletealumno(String nombre, String ciclo) {
        int id = idAlumno(nombre);
        int idc = idCiclo(ciclo);
        String dCpgr = "DELETE FROM colegiatura_pagar WHERE id_alumno =" + id + " and id_ciclo_escolar = " + idc + ";";
        String dCpgs = "DELETE FROM  colegiatura_pagos WHERE id_alumno =" + id + " and id_ciclo_escolar = " + idc + ";";
        String dCpa = "DELETE FROM cooperacion_anual WHERE id_alumno =" + id + " and id_ciclo_escolar = " + idc + ";";
        String dIp = "DELETE FROM inscripcion_pagar WHERE id_alumno =" + id + " and id_ciclo_escolar = " + idc + ";";
        String al = "DELETE FROM alumnos WHERE id =" + id + " and id_ciclo_escolar = " + idc + ";";

        try {
            ppt = con.prepareCall(dCpgr);
            int a = ppt.executeUpdate();
            System.out.println("A =" + a);

            ppt = con.prepareCall(dCpgs);
            int b = ppt.executeUpdate();
            System.out.println("B = " + b);

            ppt = con.prepareCall(dCpa);
            int c = ppt.executeUpdate();
            System.out.println("C =" + c);

            ppt = con.prepareCall(dIp);
            int d = ppt.executeUpdate();
            System.out.println("D =" + d);

            ppt = con.prepareCall(al);
            int e = ppt.executeUpdate();
            System.out.println("E =" + e);

            return true;

        } catch (Exception e) {
        }
        return false;
    }

    /**
     *
     * @param ciclo recibe el ciclo escolar actual
     * @param nombre recibe el nombre del alumno
     * @param inscripcion recibe el monto de inscripcion del alumno
     * @param cooperacion recibe el monto de cooperacion del alumno
     *
     * @return retorna true si la inserccion se hizo correctamente
     */
    public boolean cooperacion_inscripcion(String ciclo, String nombre, float inscripcion, float cooperacion) {
        String sql = "insert into inscripcion_cooperacion values(null,?,?,?,?,?)";
        int idAlu = idAlumno(nombre), idCi = idCiclo(ciclo);
        if (idAlu > 0) {
            try {
                ppt = con.prepareCall(sql);
                ppt.setInt(1, idAlu);
                ppt.setInt(2, idCi);
                ppt.setInt(3, (Mes.get(Calendar.MONTH) + 1));
                ppt.setFloat(4, inscripcion);
                ppt.setFloat(5, cooperacion);
                int a = ppt.executeUpdate();
                if (a > 0) {
                    return true;
                }
            } catch (Exception e) {
            }
        }
        return false;
    }

    private int idPago(int id, String nivel) {
        String sql = "select id from pagos where id_ciclo_escolar = " + id + " and nivel = '" + nivel + "'";
        int idcol = 0;
        try {
            ppt = con.prepareCall(sql);
            rs = ppt.executeQuery();
            while (rs.next()) {
                idcol = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("Error: funciones.idColegiatura()");
        }
        return idcol;
    }

    public DefaultTableModel getAlumnos(String ciclo, String estado) {
        String titulos[] = {"ID", "Nivel", "Grado", "Apellido paterno", "Apellido materno", "Nombre(s)", "Colegiatura ($)", "Estado"};
        modelo = new DefaultTableModel(null, titulos);
        String sql = "select p.nivel,a.grado,a.ape_pat,a.ape_mat,a.nombre,p.colegiatura,a.estado from alumnos AS a,pagos AS p,ciclo_escolar AS ce "
                + "WHERE a.id_ciclo_escolar=p.id_ciclo_escolar and a.id_ciclo_escolar = " + idCiclo(ciclo) + " and p.id = a.id_pago and a.estado = '" + estado + "' GROUP BY a.id ORDER BY p.nivel,a.grado,a.ape_pat ASC";
        String filas[] = new String[8];
        int cont = 1;
        try {
            ppt = con.prepareCall(sql);
            rs = ppt.executeQuery();
            while (rs.next()) {
                filas[0] = String.valueOf(cont);
                filas[1] = rs.getString(1);
                filas[2] = rs.getString(2);
                filas[3] = rs.getString(3);
                filas[4] = rs.getString(4);
                filas[5] = rs.getString(5);
                filas[6] = rs.getString(6);
                filas[7] = rs.getString(7);
                modelo.addRow(filas);
                cont++;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error:funciones.getAlumnos()");
        }
        return modelo;
    }

    public String[] getDatosAlumno(String cadena, String ciclo) {
        String[] datos = new String[8];
        int id = idCiclo(ciclo);
        String sql = "call getAlumno('" + cadena + "'," + id + ");";
        try {
            ppt = con.prepareCall(sql);
            rs = ppt.executeQuery();
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return datos;
    }

    public boolean realizarPago(String ciclo, String datos[]) {
        // `id_ciclo_escolar`, `id_alumno`, `id_mes`, `id_usuario`, `fecha`, `recibido`
        String sql = "insert into colegiatura_pagos values (null,?,?,?,?,?,?,?,?,?);";

        int id = 0;
        int idAl[];
        id = idCiclo(ciclo);
        idAl = getIdAlumno(datos[0], datos[2], datos[1], id, Integer.parseInt(datos[4]));
        try {
            ppt = con.prepareCall(sql);
            ppt.setInt(1, id);
            ppt.setInt(2, idAl[0]);
            ppt.setInt(3, idAl[1]);
            ppt.setInt(4, idAl[2]);
            ppt.setString(5, datos[3]);
            ppt.setFloat(6, Float.parseFloat(datos[5]));
            ppt.setFloat(7, Float.parseFloat(datos[9]));
            ppt.setFloat(8, Float.parseFloat(datos[6]));
            ppt.setString(9, datos[10]);
            int g = ppt.executeUpdate();
            if (g > 0) {
                if (colegiaturaPagar(idAl[0], id, idAl[1], Float.parseFloat(datos[7]), datos[8]) == true) {
                    return true;
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean realizarAbono(String ciclo, String datos[]) {
        // `id_ciclo_escolar`, `id_alumno`, `id_mes`, `id_usuario`, `fecha`, `recibido`
        String sql = "insert into colegiatura_pagos values (null,?,?,?,?,?,?,?,?,?);";

        int id = 0;
        int idAl[];
        id = idCiclo(ciclo);
        idAl = getIdAlumno(datos[0], datos[2], datos[1], id, Integer.parseInt(datos[4]));
        try {
            ppt = con.prepareCall(sql);
            ppt.setInt(1, id);
            ppt.setInt(2, idAl[0]);
            ppt.setInt(3, idAl[1]);
            ppt.setInt(4, idAl[2]);
            ppt.setString(5, datos[3]);
            ppt.setFloat(6, Float.parseFloat(datos[5]));
            ppt.setFloat(7, Float.parseFloat(datos[9]));
            ppt.setFloat(8, Float.parseFloat(datos[6]));
            ppt.setString(9, datos[10]);
            int g = ppt.executeUpdate();
            if (g > 0) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean colegiaturaPagar(int idA, int idCi, int idMes, float colegiatura, String desc) {
        String sql = "insert into colegiatura_pagar values(null,?,?,?,?,?);";
        try {
            ppt = con.prepareCall(sql);
            ppt.setInt(1, idA);
            ppt.setInt(2, idCi);
            ppt.setInt(3, idMes);
            ppt.setFloat(4, colegiatura);
            ppt.setString(5, desc);
            int co = ppt.executeUpdate();
            if (co > 0) {
                return true;
            }

        } catch (Exception e) {
            System.out.println("operaciones.funciones.colegiaturaPagar()" + e.getMessage());
        }
        return false;
    }

    private int[] getIdAlumno(String nombre, String usuario, String mes, int ciclo, int grado) {
        //call getIdAlumno("Misael lezma mesino","Administrador","Agosto",1,3)
        int ids[] = new int[3];
        String n = "call getIdAlumno('" + nombre + "','" + usuario + "','" + mes + "'," + ciclo + "," + grado + ")";
        try {
            ppt = con.prepareCall(n);
            rs = ppt.executeQuery();
            while (rs.next()) {
                ids[0] = rs.getInt(1);
                ids[1] = rs.getInt(2);
                ids[2] = rs.getInt(3);
            }
        } catch (Exception e) {
            System.out.println("operaciones.funciones.getIdAlumno()" + e.getMessage());
        }
        return ids;
    }

    public String[][] getPagosAbonos(String ciclo, String nombre) {
        int cont = 0;
        int idC = idCiclo(ciclo);
        ArrayList<String> lista = numFilas(idC, nombre);
        String datos[][] = new String[lista.size()][5];

        try {
            String sql = "call getPagosMeses('" + nombre + "'," + idC + ")";
            if (lista.size() > 0) {
                ppt = con.prepareCall(sql);
                rs = ppt.executeQuery();
                if (rs.next()) {
                    rs = ppt.executeQuery();
                    while (rs.next()) {
                        for (int i = 0; i < lista.size(); i++) {
                            datos[cont][0] = rs.getString(1);//mes
                            datos[cont][1] = rs.getString(2);//colegiatura a pagar
                            datos[cont][2] = rs.getString(3);//fecha
                            datos[cont][3] = rs.getString(4);//cantidad abonada
                            datos[cont][4] = rs.getString(5);//recibe el transporte del alumno buscado

                        }
                        cont++;
                    }
                }
            }
            for (int i = 0; i < datos.length; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.println(datos[i][j]);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return datos;
    }

    ArrayList<String> numFilas(int idc, String nombre) {
        ArrayList<String> lista = new ArrayList<String>();
        int id = 0;
        String sql = "call getPagosMeses('" + nombre + "'," + idc + ")";
        try {
            ppt = con.prepareCall(sql);
            rs = ppt.executeQuery();
            while (rs.next()) {
                lista.add(rs.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    public float getPagoMes(String ciclo, String mes, String nombre) {
        int id = idCiclo(ciclo);
        float ret = 0;
        String sql = "call getPagoMes(" + id + ",'" + mes + "','" + nombre + "');";
        try {
            ppt = con.prepareCall(sql);
            rs = ppt.executeQuery();
            if (rs.next()) {
                rs = ppt.executeQuery();
                while (rs.next()) {
                    ret = rs.getFloat(2);
                    if (ret == 202020.0) {
                        return 202020;
                    } else if (ret == 0) {
                        return 101010;
                    } else {
                        return ret;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("operaciones.funciones.getPagoMes()" + e.getMessage());
        }
        return 0;
    }

    public String[] getTutor(String ciclo, String nombre) {
        int id = idCiclo(ciclo);
        String ret[] = new String[2];
        String sql = "call getTutor(" + id + ",'" + nombre + "')";
        try {
            ppt = con.prepareCall(sql);
            rs = ppt.executeQuery();
            while (rs.next()) {
                ret[0] = rs.getString(1);
                ret[1] = rs.getString(2);
            }
        } catch (Exception e) {
            System.out.println("operaciones.funciones.getTutor()" + e.getMessage());
        }
        return ret;
    }

    public String[] getDetalles(String nombre, String ciclo) {
        String datos[] = new String[4];
        String sql = "call getDetalles('" + nombre + "'," + idCiclo(ciclo) + ");";
        try {
            ppt = con.prepareCall(sql);
            rs = ppt.executeQuery();
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return datos;
    }

    public DefaultTableModel getHistorialPagos(String ciclo, String nombre) {
        String sql = "call getHistorialPagos(" + idCiclo(ciclo) + ",'" + nombre + "')";
        String datos[] = new String[9];
        String[] titulos = {"ID", "Meses", "Descuento/Beca", "Colegiatura/Pagar", "Recargo", "Abono", "Transporte", "Fecha de pago", "Total pagado"};
        modelo = new DefaultTableModel(null, titulos);
        try {
            int cont = 1;
            ppt = con.prepareCall(sql);
            rs = ppt.executeQuery();
            while (rs.next()) {
                datos[0] = String.valueOf(cont);
                datos[1] = rs.getString(1);
                datos[2] = rs.getString(2);
                datos[3] = rs.getString(3);
                datos[4] = rs.getString(4);
                datos[5] = rs.getString(5);
                datos[6] = rs.getString(6);
                datos[7] = rs.getString(7);
                datos[8] = rs.getString(8);
                modelo.addRow(datos);
                cont++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelo;
    }

    public DefaultTableModel getHistorialMes(String ciclo, String nombre, String mes) {
        String sql = "call getHistorialMes(" + idCiclo(ciclo) + ",'" + nombre + "','" + mes + "')";
        String datos[] = new String[9];
        String[] titulos = {"ID", "Meses", "Descuento/Beca", "Colegiatura/Pagar", "Recargo", "Abono", "Transporte", "Fecha de pago", "Total pagado"};
        modelo = new DefaultTableModel(null, titulos);
        try {
            int cont = 1;
            ppt = con.prepareCall(sql);
            rs = ppt.executeQuery();
            while (rs.next()) {
                datos[0] = String.valueOf(cont);
                datos[1] = rs.getString(1);
                datos[2] = rs.getString(2);
                datos[3] = rs.getString(3);
                datos[4] = rs.getString(4);
                datos[5] = rs.getString(5);
                datos[6] = rs.getString(6);
                datos[7] = rs.getString(7);
                datos[8] = rs.getString(8);
                modelo.addRow(datos);
                cont++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelo;
    }

    public DefaultTableModel reporteGenFec(String ciclo, String fechaini, String fechaFin, int n) {
        String titulos[] = {"Nombre(s)", "Apellido paterno", "Apellido materno", "Nivel", "Grado", "Mes", "Descuento %", "Colegiatura", "Recargo", "Recibido", "Transporte", "Fecha", "Total"};
        modelo = new DefaultTableModel(null, titulos);
        String sql = "";
        String datos[] = new String[13];
        if (n == 1) {
            sql = "call reporteGeneral(" + idCiclo(ciclo) + ");";
        } else if (n == 2) {
            System.out.println(sql);
            sql = "call reporteFechas(" + idCiclo(ciclo) + ",'" + fechaini + "','" + fechaFin + "');";
        }
        try {
            modelo.getDataVector().clear();
            ppt = con.prepareCall(sql);
            rs = ppt.executeQuery();
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                datos[10] = rs.getString(11);
                datos[11] = rs.getString(12);
                datos[12] = rs.getString(13);
                modelo.addRow(datos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return modelo;
    }

    public DefaultTableModel reporteNivel(String ciclo, String nivel) {
        String titulos[] = {"Nombre(s)", "Apellido paterno", "Apellido materno", "Grado", "Mes", "Descuento %", "Colegiatura", "Recargo", "Recibido", "Transporte", "Fecha", "Total"};
        modelo = new DefaultTableModel(null, titulos);
        String datos[] = new String[12];
        String sql = "call reporteNivel(" + idCiclo(ciclo) + ",'" + nivel + "');";
        try {
            modelo.getDataVector().clear();
            ppt = con.prepareCall(sql);
            rs = ppt.executeQuery();
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                datos[10] = rs.getString(11);
                datos[11] = rs.getString(12);
                modelo.addRow(datos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return modelo;
    }

    public DefaultTableModel reporteIngresos(String ciclo) {
        String titulos[] = {"Mes", "Inscripción", "Cooperación", "Colegiatura", "Recargo", "Transporte", "Total"};
        modelo = new DefaultTableModel(null, titulos);
        String datos[] = new String[7];
        String sql = "call reporteIngresos(" + idCiclo(ciclo) + ");";
        try {
            modelo.getDataVector().clear();
            ppt = con.prepareCall(sql);
            rs = ppt.executeQuery();
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                modelo.addRow(datos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelo;
    }

    public DefaultTableModel reporteDeuda(String ciclo, String mes, int m) {
        String titulos[] = {"Apellido Paterno", "Apellido Materno","Nombre(s)","Tutor","Teléfono","Nivel", "Grado", "Mes", "Adeuda"};
        modelo = new DefaultTableModel(null, titulos);
        String sql = "";
        if (m == 0 && !mes.equals("")) {
            sql = "Call reporteDeuda(" + idCiclo(ciclo) + "," + getIdMes(mes) + ");";
        } else {
            sql = "Call reporteDeuda(" + idCiclo(ciclo) + "," + m + ");";
        }
        String datos[] = new String[9];
        try {
            modelo.getDataVector().clear();
            ppt = con.prepareCall(sql);
            rs = ppt.executeQuery();
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                if (!datos[8].equals("0.00")) {
                    modelo.addRow(datos);
                }
            }
        } catch (Exception e) {
            System.out.println("operaciones.funciones.reporteDeuda()" + e.getMessage());
        }
        return modelo;
    }

    int getIdMes(String mes) {
        String sql = "select id from meses where mes = '" + mes + "';";
        int id = 0;
        try {
            ppt = con.prepareCall(sql);
            rs = ppt.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
            System.out.println(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return id;
    }

    public void extemporaneo(ArrayList<String> meses, String ciclo, String nombre, String datos[]) {
        f = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = formato.format(f);
        int idCi = idCiclo(ciclo);
        int cont = 0;
        String xd[] = new String[5];
        xd[0] = nombre;
        xd[1] = datos[9];
        while (cont < meses.size()) {
            int da[] = getIdAlumno(nombre, datos[9], meses.get(cont), idCi, Integer.parseInt(datos[6]));
            colegiaturaPagar(da[0], idCi, da[1], Float.parseFloat(datos[10]), "N/A");
            registExtemAlum(idCi, da[0], da[1], da[2], fecha, 202020, 0, 0);
            System.out.println("En registro" + meses.get(cont));
            cont++;
        }

    }

    private boolean registExtemAlum(int idC, int idAlum, int idMes, int idUsu, String Fecha, float cantidadRe, float recargo, float transp) {
        String sql = "insert into colegiatura_pagos values (null,?,?,?,?,?,?,?,?,?);";
        try {
            ppt = con.prepareCall(sql);
            ppt.setInt(1, idC);
            ppt.setInt(2, idAlum);
            ppt.setInt(3, idMes);
            ppt.setInt(4, idUsu);
            ppt.setString(5, Fecha);
            ppt.setFloat(6, cantidadRe);
            ppt.setFloat(7, recargo);
            ppt.setFloat(8, transp);
            ppt.setString(9, "Indefinido");
            int xd = ppt.executeUpdate();
            if (xd > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public DefaultTableModel getUsuario() {
        String titulos[] = {"Nombre de usuario", "Nombre(s)", "Apellido paterno", "Apellido materno"};
        modelo = new DefaultTableModel(null, titulos);
        String sql = "select usu,nombre,App,Apm from usuarios;";
        String datos[] = new String[4];
        try {
            modelo.getDataVector().clear();
            ppt = con.prepareCall(sql);
            rs = ppt.executeQuery();
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                modelo.addRow(datos);
            }
        } catch (Exception e) {

        }
        return modelo;
    }

    public boolean bajaAlumno(String ciclo, String nombre, String stdo) {
        String sql = "UPDATE alumnos SET estado = ? WHERE id_ciclo_escolar = " + idCiclo(ciclo) + ""
                + " and concat(nombre,\" \",ape_pat,\" \",ape_mat) = '" + nombre + "' or concat(nombre,\" \",ape_pat) = '" + nombre + "' ";
        try {
            ppt = con.prepareCall(sql);
            ppt.setString(1, stdo);
            System.out.println(ppt);
            int as = ppt.executeUpdate();

            if (as > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public DefaultTableModel buscarAlumno(String ciclo, String nombre) {
        String titulos[] = {"ID", "Nivel", "Grado", "Apellido paterno", "Apellido materno", "Nombre(s)", "Colegiatura ($)", "Estado"};
        modelo = new DefaultTableModel(null, titulos);
        String sql = "CALL buscarAl(" + idCiclo(ciclo) + ", '" + nombre + "')";
        String tabla[] = new String[8];
        try {
            int cont = 1;
            ppt = con.prepareCall(sql);
            rs = ppt.executeQuery();
            while (rs.next()) {
                tabla[0] = String.valueOf(cont);
                tabla[1] = rs.getString(1);
                tabla[2] = rs.getString(2);
                tabla[3] = rs.getString(3);
                tabla[4] = rs.getString(4);
                tabla[5] = rs.getString(5);
                tabla[6] = rs.getString(6);
                tabla[7] = rs.getString(7);
                modelo.addRow(tabla);
                cont++;

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
        return modelo;
    }

    public boolean newUser(String datos[]) {
        String sql = "insert into usuarios values(null,?,?,?,?,?);";
        try {
            ppt = con.prepareCall(sql);
            ppt.setString(1, datos[0]);
            ppt.setString(2, datos[1]);
            ppt.setString(3, datos[2]);
            ppt.setString(4, datos[3]);
            ppt.setString(5, datos[4]);
            int x = ppt.executeUpdate();
            if (x > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteUser(String nombre, String App, String Apm) {
        String sql = "DELETE FROM usuarios WHERE nombre = ? and App = ? and Apm = ?;";
        try {
            ppt = con.prepareCall(sql);
            ppt.setString(1, nombre);
            ppt.setString(2, App);
            ppt.setString(3, Apm);
            System.out.println(ppt);
            int as = ppt.executeUpdate();
            if (as > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean newCicloEscolar(String ciclo_escolar) {
        String sql = "INSERT INTO ciclo_escolar VALUES(null,?)";
        try {
            ppt = con.prepareCall(sql);
            ppt.setString(1, ciclo_escolar);
            int n = ppt.executeUpdate();
            if (n > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<String> llenarLista() {
        String sql = "SELECT ciclo FROM ciclo_escolar";
        ArrayList<String> lista = new ArrayList<String>();
        try {
            ppt = con.prepareCall(sql);
            rs = ppt.executeQuery();
            while (rs.next()) {
                lista.add(rs.getString(1));
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public ArrayList<Integer> getActivos(String status, String ciclo) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int cont = 1;
        for (int i = 0; i < 3; i++) {
            String sql = "SELECT COUNT(al.id) FROM alumnos as al WHERE al.estado  = '" + status + "' and al.id_pago =" + cont + "  and id_ciclo_escolar = " + idCiclo(ciclo) + ";";
            System.out.println(sql);
            try {
                ppt = con.prepareCall(sql);
                rs = ppt.executeQuery();
                while (rs.next()) {
                    a.add(rs.getInt(1));
                }
                cont++;
            } catch (Exception e) {
            }
        }
        return a;
    }

    public boolean deleteCiclo(String ciclo) {
        String sql = "DELETE FROM ciclo_escolar WHERE ciclo = ?";
        try {
            ppt = con.prepareCall(sql);
            ppt.setString(1, ciclo);
            int a = ppt.executeUpdate();
            if (a > 0) {
                return true;
            }
        } catch (Exception e) {

        }
        return false;
    }

    public ArrayList<Integer> cargarInscripcion(String ciclo) {
        String sql = "SELECT pg.inscripcion FROM pagos as pg WHERE pg.id_ciclo_escolar = " + idCiclo(ciclo) + ";";
        ArrayList<Integer> lista = new ArrayList<>();
        try {
            ppt = con.prepareCall(sql);
            rs = ppt.executeQuery();
            while (rs.next()) {
                lista.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<Integer> cargarColegiatura(String ciclo) {
        String sql = "SELECT pg.colegiatura FROM pagos as pg WHERE pg.id_ciclo_escolar = " + idCiclo(ciclo) + ";";
        System.out.println(sql);
        ArrayList<Integer> lista = new ArrayList<>();
        try {
            ppt = con.prepareCall(sql);
            rs = ppt.executeQuery();
            while (rs.next()) {
                lista.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public boolean registrarPre(String datos[][], String ciclo) {
        //INSERT INTO `pagos`(`id_ciclo_escolar`, `inscripcion`, `colegiatura`, `nivel`)
        String sql = "INSERT INTO pagos VALUES (NULL, ?, ?, ?, ?)";
        int idc = idCiclo(ciclo), cont = 0;

        for (int i = 0; i < 3; i++) {
            try {
                ppt = con.prepareCall(sql);
                ppt.setInt(1, idc);
                ppt.setFloat(2, Float.parseFloat(datos[i][0]));
                ppt.setFloat(3, Float.parseFloat(datos[i][1]));
                ppt.setString(4, datos[i][2]);
                ppt.executeUpdate();
                System.out.println(ppt);
                cont++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (cont == datos.length) {
            return true;
        }

        return false;
    }

    public boolean Nvo(String datos[]) {
        //INSERT INTO `pagos`(`id_ciclo_escolar`, `inscripcion`, `colegiatura`, `nivel`)        
        float insc = 0, col = 0;
        String sentencia = "INSERT INTO pagos VALUES (NULL, ?, ?, ?, ?)";
        int idc = idCiclo(datos[0]);
        System.out.println(idc);
//        for (int i = 0; i < datos.length; i++) {
//            int cont = Integer.parseInt(datos[i]);
//
//            System.out.print(Float.parseFloat(String.valueOf(cont)));
//        }
        try {
            ppt = con.prepareCall(sentencia);
            System.out.println(ppt);
            ppt.setInt(1, idc);
            ppt.setString(2, datos[1]);
            ppt.setString(3, datos[2]);
            ppt.setString(4, datos[3]);
            ppt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updatePrecio(String ciclo, String tipo, String datos[][]) {
        int id = idCiclo(ciclo), cont = 0;
        String sql = "UPDATE pagos SET " + tipo + " = ? WHERE id_ciclo_escolar = ? and nivel = ?";
        try {
            for (int i = 0; i < 3; i++) {
                ppt = con.prepareCall(sql);
                ppt.setString(1, datos[i][0]);
                ppt.setInt(2, id);
                ppt.setString(3, datos[i][1]);
                ppt.executeUpdate();
                cont++;
            }
            if (cont == datos.length) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public DefaultTableModel getTiket(String ciclo, String fecha) {
        String titulos[] = {"ID", "Nombre", "Nivel", "Grado", "Tutor", "Mes", "Tipo de pago", "Recibido", "Transporte", "Recargo"};
        modelo = new DefaultTableModel(null, titulos);
        int cont = 1;
        String filas[] = new String[10];
        String sql = "call historialTiket(" + idCiclo(ciclo) + "," + fecha + ")";
        try {
            ppt = con.prepareCall(sql);
            rs = ppt.executeQuery();
            while (rs.next()) {
                filas[0] = String.valueOf(cont);
                filas[1] = rs.getString(1);
                filas[2] = rs.getString(2);
                filas[3] = String.valueOf(rs.getInt(3));
                filas[4] = rs.getString(4);
                filas[5] = rs.getString(5);
                filas[6] = rs.getString(6);
                filas[7] = String.valueOf(rs.getFloat(7));
                filas[8] = String.valueOf(rs.getFloat(8));
                filas[9] = String.valueOf(rs.getFloat(9));
                modelo.addRow(filas);
                cont++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelo;
    }

    public boolean updateInscCoo(String nombre, String ciclo, String cantidades[]) {
        int id = idAlumno(nombre), idc = idCiclo(ciclo);
        String sql1 = "UPDATE inscripcion_cooperacion SET id_mes = ?,inscripcion=?,cooperacion = ? WHERE id_alumno = " + id + " and id_ciclo_escolar = " + idc;
        try {
            ppt = con.prepareCall(sql1);
            ppt.setInt(1, (Mes.get(Calendar.MONTH) + 1));
            ppt.setFloat(2, Float.parseFloat(cantidades[0]));
            ppt.setFloat(3, Float.parseFloat(cantidades[1]));
            int b = ppt.executeUpdate();
            if (b > 0) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public DefaultTableModel reporteInscripcion(String ciclo, int re) {
        String sql = "";
        if (re == 0) {
            sql = "CALL getInscripcion(" + (Mes.get(Calendar.MONTH) + 1) + "," + idCiclo(ciclo) + ")";
        } else if (re == 1) {
            sql = "CALL getCooperacion(" + (Mes.get(Calendar.MONTH) + 1) + "," + idCiclo(ciclo) + ")";
        }
        String titulos[] = {"Apellido Paterno", "Apellido Materno", "Nombre", "Tutor", "Num., Teléfono", "Debe"};
        String filas[] = new String[6];
        modelo = new DefaultTableModel(null, titulos);
        try {
            modelo.getDataVector().clear();
            ppt = con.prepareCall(sql);
            System.out.println(ppt);
            rs = ppt.executeQuery();
            while (rs.next()) {
                filas[0] = rs.getString(1);
                filas[1] = rs.getString(2);
                filas[2] = rs.getString(3);
                filas[3] = rs.getString(4);
                filas[4] = rs.getString(5);
                if (re == 0) {
                    filas[5] = rs.getString(6);
                } else if (re == 1) {
                    filas[5] = "S/R";
                }
                modelo.addRow(filas);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelo;
    }
}
