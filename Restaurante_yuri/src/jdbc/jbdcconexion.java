 package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement; //  PreparedStatement
import java.sql.ResultSet;         //  ResultSet
import java.sql.SQLException;

public class jbdcconexion {

    private static final String URL = "jdbc:mysql://hopper.proxy.rlwy.net:47287/railway";
    private static final String USER = "root";
    private static final String PASSWORD = "RxwRirmjWzyZhuWQyMbGmozjpdLsshBH";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
        System.out.println("Conexión a la base de datos establecida.");
        return con;
    }

    public static void closeConnection(Connection con) {
        if (con != null) {
            try {
                con.close();
                System.out.println("Conexión a la base de datos cerrada.");
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    // PreparedStatement
    public static void closeConnection(PreparedStatement pst) {
        if (pst != null) {
            try {
                pst.close();
                System.out.println("PreparedStatement cerrado.");
            } catch (SQLException e) {
                System.err.println("Error al cerrar PreparedStatement: " + e.getMessage());
            }
        }
    }

    //ResultSet
    public static void closeConnection(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
                System.out.println("ResultSet cerrado.");
            } catch (SQLException e) {
                System.err.println("Error al cerrar ResultSet: " + e.getMessage());
            }
        }
    }
}

