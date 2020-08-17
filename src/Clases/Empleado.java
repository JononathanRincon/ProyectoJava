/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @@author Yovany Forero
 */
public class Empleado {

    public Empleado() {
        
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    
    private String Identificacion;    
    private String nombre;
    private String apellido;
    private String telefono;
    private String Direccion;

    public Empleado(String Identificacion, String nombre, String apellido, String telefono, String barrio, 
            String Direccion,String fechaNacimiento, String correo) {
        this.Identificacion = Identificacion;
        this.Direccion = Direccion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.barrio = barrio;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
    }
    private String barrio;  
    private String fechaNacimiento;
    private String correo;

    
    
            
}
