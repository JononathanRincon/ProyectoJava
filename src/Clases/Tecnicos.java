/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Yovany Forero
 */
public class Tecnicos extends Empleado{

    public Tecnicos(String Contrasena, String Identificacion, String nombre, String apellido, String telefono, String barrio, String Direccion, String fechaNacimiento, String correo) {
        super(Identificacion, nombre, apellido, telefono, barrio, Direccion, fechaNacimiento, correo);
        this.Contrasena = Contrasena;
    }
    private String Cargo;
    private String Contrasena;

    public Tecnicos(String Cargo, String Contrasena, String jefe1, String Identificacion, String nombre, String apellido, String telefono, String barrio, String Direccion, String fechaNacimiento, String correo) {
        super(Identificacion, nombre, apellido, telefono, barrio, Direccion, fechaNacimiento, correo);
        this.Cargo = Cargo;
        this.Contrasena = Contrasena;
        this.jefe1 = jefe1;
    }

    

    private String jefe1;

    public String getJefe1() {
        return jefe1;
    }

    public void setJefe1(String jefe1) {
        this.jefe1 = jefe1;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getContrasena() {
        return Contrasena;
    }
}
