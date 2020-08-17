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
public class Tickets {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Tickets(Integer Id, String ServicioRealizado) {
        this.id = Id;
        this.ServicioRealizado = ServicioRealizado;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getFechaInstalacion() {
        return FechaInstalacion;
    }

    public void setFechaInstalacion(String FechaInstalacion) {
        this.FechaInstalacion = FechaInstalacion;
    }

    public String getHoraInstalacion() {
        return HoraInstalacion;
    }

    public void setHoraInstalacion(String HoraInstalacion) {
        this.HoraInstalacion = HoraInstalacion;
    }

    public String getIdentificacionEmple() {
        return IdentificacionEmple;
    }

    public void setIdentificacionEmple(String IdentificacionEmple) {
        this.IdentificacionEmple = IdentificacionEmple;
    }

    public String getServicioRealizado() {
        return ServicioRealizado;
    }

    public void setServicioRealizado(String ServicioRealizado) {
        this.ServicioRealizado = ServicioRealizado;
    }

    public String getTipoServicio() {
        return TipoServicio;
    }

    public void setTipoServicio(String TipoServicio) {
        this.TipoServicio = TipoServicio;
    }

    

    

    public Tickets(String Codigo, String FechaInstalacion, String HoraInstalacion, String IdentificacionEmple, String ServicioRealizado, String TipoServicio) {
        this.Codigo = Codigo;
        this.FechaInstalacion = FechaInstalacion;
        this.HoraInstalacion = HoraInstalacion;
        this.IdentificacionEmple = IdentificacionEmple;
        this.ServicioRealizado = ServicioRealizado;
        this.TipoServicio = TipoServicio;
    }

    private String Codigo;

    private String FechaInstalacion;
    private String HoraInstalacion;
    private String IdentificacionEmple;
    
    private String ServicioRealizado;
    
    private String TipoServicio;

    
    
    
}
