
package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author obaqu
 */
public class Conexion {

    private final String BD = "Archivos";
    private final String USER = "root";
    private final String PASSWORD = "mysql";
    private final String URL = "jdbc:mysql://181.79.9.72:6447/" + BD;

    public Conexion() {
    }

    public Connection getConnection() {
        Connection con = null;
        try {
            // Cargar el driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(this.URL, this.USER, this.PASSWORD);
        } catch (Exception e) {
            throw new RuntimeException("Error en la conexión con la base de datos: " + e.getMessage(), e);
        }
        return con;
    }
}
