package com.desarrollo.modelo;

import java.sql.*;

public class EmpleadoDAOImpl implements EmpleadoDAO {

    private static final String SQL_INSERT = "INSERT INTO EMPLEADOS (nombre, apellido, genero, direccion, cedula, celular, anios_experiencia, usuario, contrasenia) VALUES (?, ?, ?, ?, ?, ?, ?, ?, SHA1(?))";
    private static final String SQL_SELECT = "SELECT * FROM EMPLEADOS WHERE usuario=? AND contrasenia=SHA1(?) ";

    @Override
    public boolean select(EmpleadoDTO empleado) {
        try {
            //1. Crear objeto de conexión
            Connection conn = Conexion.getConnection();
            //2. Crear objeto que prepare la query
            PreparedStatement stmt = conn.prepareStatement(SQL_SELECT);
            //3. Agregar los valores en las interrogantes - Reemplazar interrogantes
            stmt.setString(1, empleado.getUsuario());
            stmt.setString(2, empleado.getContrasenia());
            //4. Ejecutar la query
            ResultSet rs = stmt.executeQuery();
            //rs almacena el registro o registros de la consulta (select)
            if (rs.next()) { //next verifica que el objeto rs tenga registros
                return true;
            }
            //5. Cerrar onjetos de conexión
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);

        }
        return false;
    }

    @Override
    public int insert(EmpleadoDTO empleado) {
        int registros = 0;
        try {
            //1. Crear objeto de conexión
            Connection conn = Conexion.getConnection();
            //2. Crear objeto que prepare la query
            PreparedStatement stmt = conn.prepareStatement(SQL_INSERT);
            //3. Agregar los valores en las interrogantes - Reemplazar interrogantes
            stmt.setString(1, empleado.getNombre());
            stmt.setString(2, empleado.getApellido());
            stmt.setString(3, empleado.getGenero());
            stmt.setString(4, empleado.getDireccion());
            stmt.setString(5, empleado.getCedula());
            stmt.setString(6, empleado.getCelular());
            stmt.setInt(7, empleado.getAniosExperiencia());
            stmt.setString(8, empleado.getUsuario());
            stmt.setString(9, empleado.getContrasenia());

            //4. Ejecutar query
            registros = stmt.executeUpdate();  //1-> se ejecuta correctamente

            //5. Cerrar objetos de conexión
            Conexion.close(stmt);
            Conexion.close(conn);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return registros;

    }

}
