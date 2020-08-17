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
public class Clientes {

    public Integer getCodigo() {
        return Codigo;
    }

    public void setCodigo(Integer Codigo) {
        this.Codigo = Codigo;
    }

    
    private String Identificacion;
    private String NombreCliente;
    private String Direccion;
    private String NombreBarrio;

    private String Telefono;

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNombreBarrio() {
        return NombreBarrio;
    }

    public void setNombreBarrio(String NombreBarrio) {
        this.NombreBarrio = NombreBarrio;
    }
    private Integer Codigo;

    public Clientes(String Identificacion, String NombreCliente, String Direccion, String NombreBarrio, String Telefono, Integer Codigo) {
        this.Identificacion = Identificacion;
        this.NombreCliente = NombreCliente;
        this.Direccion = Direccion;
        this.NombreBarrio = NombreBarrio;
        this.Telefono = Telefono;
        this.Codigo = Codigo;
    }
}
