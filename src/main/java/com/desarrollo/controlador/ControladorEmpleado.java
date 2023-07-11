package com.desarrollo.controlador;

import com.desarrollo.modelo.*;

public class ControladorEmpleado {

    private EmpleadoDAO datos = new EmpleadoDAOImpl();

    public int insertarEmpleado(String nombre, String apellido, String genero, String direccion, String cedula, String celular, int aniosExperiencia, String usuario, String contrasenia) {
        int registros;
        //Generar objeto
        EmpleadoDTO empleado = new EmpleadoDTO(nombre, apellido, genero, direccion, cedula, celular, aniosExperiencia, usuario, contrasenia);
        registros = datos.insert(empleado);
        return registros;
    }

    public boolean iniciarSesionEmpleado(String usuario, String contrasenia) {
        boolean verificarRegistro;
        //Crear objeto
        EmpleadoDTO empleado = new EmpleadoDTO(usuario, contrasenia);
        //comunicar con el DAO
        verificarRegistro=datos.select(empleado);
        return verificarRegistro;
    }

}
