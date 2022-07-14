package operaciones;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {

    private String bd = "nvo_control";
    private String url = "jdbc:mysql://localhost/" + bd;
    private String user = "root";
    private String pass = "";
    private Connection con = null;

    private void conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
        }
    }
    public Connection getConexion() {
        this.conectar();
        return con;
    }

}
