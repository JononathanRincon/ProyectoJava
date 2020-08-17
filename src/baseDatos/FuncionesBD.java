/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import Clases.Administrador;
import Clases.Clientes;
import Clases.JefeTecnico;
import Clases.Recepcionista;
import Clases.Tecnicos;
import Clases.Tickets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.input.KeyCode.I;
import javax.swing.JOptionPane;

/**
 *
 * @author Yovany Forero
 */
public class FuncionesBD {
    Connection con = null;
    ConexionBd conBD = new ConexionBd();
    
    public void insercionAdmin (Administrador administrador) throws SQLException{
        try {
            con = conBD.conectar();
            PreparedStatement Prepared = con.prepareStatement("INSERT INTO administrador "
                + "(identificacion, nombre, apellido, telefono, direccion, barrio, correo, fecha_nacimiento, contrasena)"+
                "Values (?,?,?,?,?,?,?,?,?)");
            Prepared.setString(1, administrador.getIdentificacion());
            Prepared.setString(2, administrador.getNombre());
            Prepared.setString(3, administrador.getApellido());
            Prepared.setString(4, administrador.getTelefono());
            Prepared.setString(5, administrador.getDireccion());
            Prepared.setString(6, administrador.getBarrio());
            Prepared.setString(7, administrador.getCorreo());
            Prepared.setString(8, administrador.getFechaNacimiento());
            Prepared.setString(9, administrador.getContrasena());
        
            Prepared.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha guardado exitosamente");
            Prepared.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"error a "+ e);
        }
    }
    public void insercionJefe (JefeTecnico JefeTec) throws SQLException{
        try {
            con = conBD.conectar();
            PreparedStatement Prepared = con.prepareStatement("INSERT INTO jefetecnico "
                + "(identificacion, nombre, apellido, telefono, direccion, barrio, correo, fecha_nacimiento, contrasena, jefe)"+
                "Values (?,?,?,?,?,?,?,?,?,?)");
            Prepared.setString(1, JefeTec.getIdentificacion());
            Prepared.setString(2, JefeTec.getNombre());
            Prepared.setString(3, JefeTec.getApellido());
            Prepared.setString(4, JefeTec.getTelefono());
            Prepared.setString(5, JefeTec.getDireccion());
            Prepared.setString(6, JefeTec.getBarrio());
            Prepared.setString(7, JefeTec.getCorreo());
            Prepared.setString(8, JefeTec.getFechaNacimiento());
            Prepared.setString(9, JefeTec.getContrasena());
            Prepared.setString(10, JefeTec.getCargo());
        
            Prepared.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha guardado exitosamente");
            conBD.CerrrConexion();
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null,"error a "+ e);
        }
    }
    public void insercionRecep (Recepcionista recepci) throws SQLException{
        try {
            con = conBD.conectar();
            PreparedStatement Prepared = con.prepareStatement("INSERT INTO recepcionista "
                + "(identificacion, nombre, apellido, telefono, direccion, barrio, correo, fecha_nacimiento, contrasena, jefe)"+
                "Values (?,?,?,?,?,?,?,?,?,?)");
            Prepared.setString(1, recepci.getIdentificacion());
            Prepared.setString(2, recepci.getNombre());
            Prepared.setString(3, recepci.getApellido());
            Prepared.setString(4, recepci.getTelefono());
            Prepared.setString(5, recepci.getDireccion());
            Prepared.setString(6, recepci.getBarrio());
            Prepared.setString(7, recepci.getCorreo());
            Prepared.setString(8, recepci.getFechaNacimiento());
            Prepared.setString(9, recepci.getContrasena());
            Prepared.setString(10, recepci.getCargo());
        
            Prepared.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha guardado exitosamente");
            Prepared.close();
        } catch (SQLException e) {
           // JOptionPane.showMessageDialog(null,"error a "+ e);
        }
    }
    public void inserciontECNICO (Tecnicos tecni) throws SQLException{
        try {
            con = conBD.conectar();
            PreparedStatement Prepared = con.prepareStatement("INSERT INTO tecnico "
                + "(identificacion, nombre, apellido, telefono, direccion, barrio, correo, fecha_nacimiento, contrasena, jefe, jefe1)"+
                "Values (?,?,?,?,?,?,?,?,?,?,?)");
            Prepared.setString(1, tecni.getIdentificacion());
            Prepared.setString(2, tecni.getNombre());
            Prepared.setString(3, tecni.getApellido());
            Prepared.setString(4, tecni.getTelefono());
            Prepared.setString(5, tecni.getDireccion());
            Prepared.setString(6, tecni.getBarrio());
            Prepared.setString(7, tecni.getCorreo());
            Prepared.setString(8, tecni.getFechaNacimiento());
            Prepared.setString(9, tecni.getContrasena());
            Prepared.setString(10, tecni.getCargo());
            Prepared.setString(11, tecni.getJefe1());
        
            Prepared.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha guardado exitosamente");
            Prepared.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"error a "+ e);
        }
    }

    public ArrayList<JefeTecnico> ConsultarJefe(String Identificacion) throws SQLException {
        ArrayList<JefeTecnico> ConsEmp = new ArrayList<JefeTecnico>();
        con = conBD.conectar();
        PreparedStatement ps = null;
        if (Identificacion.equals("")) {
            ps = con.prepareStatement("SELECT * FROM jefetecnico");
        }
        else{
            ps = con.prepareStatement("SELECT * FROM jefetecnico WHERE identificacion = '"+ Identificacion+"';");
        }
        
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                JefeTecnico jt = new JefeTecnico(rs.getString("contrasena"),
                        rs.getString("identificacion"), rs.getString("nombre"),
                        rs.getString("apellido"), rs.getString("telefono"),
                        rs.getString("barrio"), rs.getString("direccion"),
                        rs.getString("fecha_nacimiento"), rs.getString("correo"));
                ConsEmp.add(jt);
            }
        }
        return ConsEmp;
    }

    public ArrayList<Recepcionista> consulrecepcionista(String Identificacion) throws SQLException {
        ArrayList<Recepcionista> ConsEmp = new ArrayList<Recepcionista>();
        con = conBD.conectar();
        PreparedStatement ps = null;
        if (Identificacion.equals("")) {
            ps = con.prepareStatement("SELECT * FROM recepcionista");
        }
        else{
            ps = con.prepareStatement("SELECT * FROM recepcionista WHERE identificacion = '"+ Identificacion+"';");
        }
        
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {            
            Recepcionista jt = new Recepcionista(rs.getString("contrasena"), rs.getString("identificacion"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("telefono"), rs.getString("barrio"), rs.getString("direccion"), rs.getString("fecha_nacimiento"), rs.getString("correo"));
            ConsEmp.add(jt);
        }
        rs.close();
        return ConsEmp;
    }

    public ArrayList<Tecnicos> onsultarTecnicos(String Identificacion) throws SQLException {
        ArrayList<Tecnicos> ConsEmp = new ArrayList<Tecnicos>();
        con = conBD.conectar();
        PreparedStatement ps = null;
        if (Identificacion.equals("")) {
            ps = con.prepareStatement("SELECT * FROM tecnico");
        }
        else{
            ps = con.prepareStatement("SELECT * FROM tecnico WHERE identificacion = '"+ Identificacion+"';");
        }
        
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {            
            Tecnicos jt = new Tecnicos(rs.getString("contrasena"), rs.getString("identificacion"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("telefono"), rs.getString("barrio"), rs.getString("direccion"), rs.getString("fecha_nacimiento"), rs.getString("correo"));
            ConsEmp.add(jt);
        }
        rs.close();
        return ConsEmp;
    }

    
    public ArrayList<JefeTecnico> ConsultarJefe() throws SQLException {
        ArrayList<JefeTecnico> ConsEmp = new ArrayList<JefeTecnico>();
        con = conBD.conectar();
        PreparedStatement ps = null;
        
            ps = con.prepareStatement("SELECT * FROM jefetecnico");
            
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {            
            JefeTecnico jt = new JefeTecnico(rs.getString("contrasena"), rs.getString("identificacion"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("telefono"), rs.getString("barrio"), rs.getString("direccion"), rs.getString("fecha_nacimiento"), rs.getString("correo"));
            ConsEmp.add(jt);
        }
        rs.close();
        return ConsEmp;
    }

    public ArrayList<Recepcionista> consulrecepcionista() throws SQLException {
        ArrayList<Recepcionista> ConsEmp = new ArrayList<Recepcionista>();
        con = conBD.conectar();
        PreparedStatement ps = null;
        
            ps = con.prepareStatement("SELECT * FROM recepcionista");
        
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {            
            Recepcionista jt = new Recepcionista(rs.getString("contrasena"), rs.getString("identificacion"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("telefono"), rs.getString("barrio"), rs.getString("direccion"), rs.getString("fecha_nacimiento"), rs.getString("correo"));
            ConsEmp.add(jt);
        }
        rs.close();
        return ConsEmp;
    }

    public ArrayList<Tecnicos> ConsultarTecnicos() throws SQLException {
        ArrayList<Tecnicos> ConsEmp = new ArrayList<Tecnicos>();
        con = conBD.conectar();
        PreparedStatement ps = null;
        //if (Identificacion.equals("")) {
            ps = con.prepareStatement("SELECT * FROM tecnico");
                
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {            
            Tecnicos jt = new Tecnicos(rs.getString("contrasena"), rs.getString("identificacion"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("telefono"), rs.getString("barrio"), rs.getString("direccion"), rs.getString("fecha_nacimiento"), rs.getString("correo"));
            ConsEmp.add(jt);
        }
        rs.close();
        return ConsEmp;
    }

    public void ActualizarJefeTec(JefeTecnico empl) {
        try {
            con = conBD.conectar();
            PreparedStatement Ppt = con.prepareStatement("UPDATE jefetecnico SET "
                    + "nombre = ?, apellido = ?, telefono = ?, direccion = ?, barrio = ?, correo = ?, fecha_nacimiento = ?,"
                    + "contrasena = ? WHERE identificacion = ?;");
            Ppt.setString(1, empl.getNombre());
            Ppt.setString(2, empl.getApellido());
            Ppt.setString(3, empl.getTelefono());
            Ppt.setString(4, empl.getDireccion());
            Ppt.setString(5, empl.getBarrio());
            Ppt.setString(6, empl.getCorreo());
            Ppt.setString(7, empl.getFechaNacimiento());
            Ppt.setString(8, empl.getContrasena());
            Ppt.setString(9,empl.getIdentificacion());
            
            Ppt.executeUpdate();
            Ppt.close();
            JOptionPane.showMessageDialog(null,"Datos actualizados ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error en la actualizacion: "+ ex);
        }
    }

    public void Actualizartecnico(Tecnicos empl) {
        try {
            con = conBD.conectar();
            PreparedStatement Ppt = con.prepareStatement("UPDATE tecnico SET "
                    + "nombre = ?, apellido = ?, telefono = ?, direccion = ?, barrio = ?, correo = ?, fecha_nacimiento = ?,"
                    + "contrasena = ? WHERE identificacion = ?;");
            Ppt.setString(1, empl.getNombre());
            Ppt.setString(2, empl.getApellido());
            Ppt.setString(3, empl.getTelefono());
            Ppt.setString(4, empl.getDireccion());
            Ppt.setString(5, empl.getBarrio());
            Ppt.setString(6, empl.getCorreo());
            Ppt.setString(7, empl.getFechaNacimiento());
            Ppt.setString(8, empl.getContrasena());
            Ppt.setString(9,empl.getIdentificacion());
            
            Ppt.executeUpdate();
            Ppt.close();
            JOptionPane.showMessageDialog(null,"Datos actualizados ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error en la actualizacion: "+ ex);
        }
    }

    public void ActualizarRecepcionista(Recepcionista empl) {
        try {
            con = conBD.conectar();
            PreparedStatement Ppt = con.prepareStatement("UPDATE recepcionista SET "
                    + "nombre = ?, apellido = ?, telefono = ?, direccion = ?, barrio = ?, correo = ?, fecha_nacimiento = ?,"
                    + "contrasena = ? WHERE identificacion = ?;");
            Ppt.setString(1, empl.getNombre());
            Ppt.setString(2, empl.getApellido());
            Ppt.setString(3, empl.getTelefono());
            Ppt.setString(4, empl.getDireccion());
            Ppt.setString(5, empl.getBarrio());
            Ppt.setString(6, empl.getCorreo());
            Ppt.setString(7, empl.getFechaNacimiento());
            Ppt.setString(8, empl.getContrasena());
            Ppt.setString(9,empl.getIdentificacion());
            
            Ppt.executeUpdate();
            Ppt.close();
            JOptionPane.showMessageDialog(null,"Datos actualizados ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error en la actualizacion: "+ ex);
        }
    }

    public void InsercionTickets(Tickets tis) {
        try {
            con = conBD.conectar();
            PreparedStatement Prepared = con.prepareStatement("INSERT INTO tickets "
                + "(id, codigo, fechaInstalacion, horario, TipoServicio, servicioRealizado, identificacionEmpleado)"+
                "Values (?,?,?,?,?,?,?)");
            Prepared.setString(1, null);
            Prepared.setString(2, tis.getCodigo());
            Prepared.setString(3, tis.getFechaInstalacion());
            Prepared.setString(4, tis.getHoraInstalacion());
            Prepared.setString(5, tis.getTipoServicio());
            Prepared.setString(6, tis.getServicioRealizado());
            Prepared.setString(7, tis.getIdentificacionEmple());
                    
            Prepared.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha guardado exitosamente");
            Prepared.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"error a "+ e);
        }
    }

    public void InsercionCliente(Clientes cli) {
        try {
            con = conBD.conectar();
            PreparedStatement Prepared = con.prepareStatement("INSERT INTO usuarios "
                + "(NombreCliente, identificacionCliente, Direccion, Telefono, nombreBarrio, idTicket)"+
                "Values (?,?,?,?,?,?)");
            Prepared.setString(1, cli.getNombreCliente());
            Prepared.setString(2, cli.getIdentificacion());
            Prepared.setString(3, cli.getDireccion());
            Prepared.setString(4, cli.getTelefono());
            Prepared.setString(5, cli.getNombreBarrio());
            Prepared.setInt(6, cli.getCodigo());
                    
            Prepared.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha guardado exitosamente el usuario");
            Prepared.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"error a "+ e);
        }
    }

    public void ActualizarTickets(Tickets tis) {
        try {
            con = conBD.conectar();
            PreparedStatement Ppt = con.prepareStatement("UPDATE tickets SET servicioRealizado  = ? "
                    + "WHERE id = ?;");
            Ppt.setString(1, tis.getServicioRealizado());
            Ppt.setInt(2, tis.getId());
            
            
            Ppt.executeUpdate();
            Ppt.close();
            JOptionPane.showMessageDialog(null,"Datos actualizados ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error en la actualizacion: "+ ex);
        }
    }    

    
}
