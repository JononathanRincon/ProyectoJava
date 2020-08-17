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
public class JefeTecnico extends Empleado{

    public JefeTecnico() {
        
    }

    public JefeTecnico(String Contrasena, String Identificacion, String nombre, String apellido, String telefono, String barrio, String Direccion, String fechaNacimiento, String correo) {
        super(Identificacion, nombre, apellido, telefono, barrio, Direccion, fechaNacimiento, correo);
        this.Contrasena = Contrasena;
    }

    public JefeTecnico(String Cargo, String Contrasena, String Identificacion, String nombre, String apellido, String telefono, String barrio, String Direccion, String fechaNacimiento, String correo) {
        super(Identificacion, nombre, apellido, telefono, barrio, Direccion, fechaNacimiento, correo);
        this.Cargo = Cargo;
        this.Contrasena = Contrasena;
    }

    
    
    private String Cargo;
    private String Contrasena;

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    
    

    
}
