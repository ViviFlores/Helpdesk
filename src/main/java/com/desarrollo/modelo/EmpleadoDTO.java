
package com.desarrollo.modelo;
//Persistencia de datos: en toda la aplicaci+on se trabajará con objetos
public class EmpleadoDTO { //clase Entidad
    
    //atributos
    private int id;
    private String nombre;
    private String apellido;
    private String genero;
    private String direccion;
    private String cedula;
    private String celular;
    private int aniosExperiencia;
    private String usuario;
    private String contrasenia;
    
    //sobrecarga de constructuros
    //INSERT - EMPLEADOS
    public EmpleadoDTO(String nombre, String apellido, String genero, String direccion, String cedula, String celular, int aniosExperiencia, String usuario, String contrasenia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.direccion = direccion;
        this.cedula = cedula;
        this.celular = celular;
        this.aniosExperiencia = aniosExperiencia;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }
    
    //SELECT - EMPLEADOS
    public EmpleadoDTO(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    
    
    
}
