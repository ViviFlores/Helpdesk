package com.desarrollo.modelo;

import java.sql.*;  //importar todo 

public class Conexion {

    public static final String JDBC_URL = "jdbc:mysql://localhost:3306/tecnomega?useSSL=false&serverTimezone=UTC";
    public static final String JDBC_USER = "root";
    public static final String JDBC_PASSWORD = "admin";

    //método que retorna el objeto de conexión
    public static Connection getConnection() throws SQLException { //extendiendo la exception
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }

    //métodos que cierren los objetos de conexión
    public static void close(ResultSet rs) throws SQLException {
        rs.close();
    }

    public static void close(PreparedStatement stmt) throws SQLException {
        stmt.close();
    }
    
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }

}
