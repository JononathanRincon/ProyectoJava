/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Administrador;
import Clases.Clientes;
import Clases.JefeTecnico;
import Clases.Recepcionista;
import Clases.Tecnicos;
import baseDatos.ConexionBd;
import baseDatos.FuncionesBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yovany Forero
 */
public class administrador extends javax.swing.JFrame {

    /**
     * Creates new form administrador
     */
    private static final login validar = new login();
    
    private static final ConexionBd Con = new ConexionBd();
    private static final FuncionesBD FunBD = new FuncionesBD();
    private Connection con = null;
    private ArrayList<Administrador> adminis;
    private ArrayList<Clientes> client;
    private ArrayList<JefeTecnico> JefeTec;
    private ArrayList<Tecnicos> Tecni;
    private ArrayList<Recepcionista> recepcionista;
    public administrador() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Panel1 = new javax.swing.JPanel();
        CbxConsulIdentificacion = new javax.swing.JComboBox();
        TxtIdentificacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsultas = new javax.swing.JTable();
        BtnConsultar1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TbReportes = new javax.swing.JTable();
        DateFechaInicial = new com.toedter.calendar.JDateChooser();
        DateFechaFinal = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        BtnConsultar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1399, 517));
        setResizable(false);

        CbxConsulIdentificacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CbxConsulIdentificacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Seleccionar-", "Jefe Tecnico", "Recepsionista", "Tecnicos" }));

        TxtIdentificacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cargo");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Identificacion");

        BtnConsultar.setText("Consultar");
        BtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarActionPerformed(evt);
            }
        });

        tablaConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaConsultas);

        BtnConsultar1.setText("volver");
        BtnConsultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CbxConsulIdentificacion, 0, 232, Short.MAX_VALUE)
                            .addComponent(TxtIdentificacion))
                        .addGap(18, 18, 18)
                        .addComponent(BtnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnConsultar1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CbxConsulIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnConsultar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );

        jTabbedPane1.addTab("Consular Empleados", Panel1);

        jPanel4.setPreferredSize(new java.awt.Dimension(1394, 470));

        jScrollPane2.setViewportView(TbReportes);

        DateFechaInicial.setDateFormatString("yyyy/MM/d");
        DateFechaInicial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        DateFechaFinal.setDateFormatString("yyyy/MM/d");
        DateFechaFinal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Fecha Inicial");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Fecha Final");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Reporte");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        BtnConsultar2.setText("volver");
        BtnConsultar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(628, 628, 628)
                        .addComponent(jLabel8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(DateFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BtnConsultar2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(DateFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(DateFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(BtnConsultar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Reportes", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1367, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void mostrarTablaConsultarJefe(String Identificacion) throws SQLException {
      
        DefaultTableModel modelo2 = new DefaultTableModel();
        modelo2.addColumn("Identificacion");
        modelo2.addColumn("Nombre");
        modelo2.addColumn("Apellido");
        modelo2.addColumn("Telefono");
        modelo2.addColumn("Direccion");
        modelo2.addColumn("Barrio");
        modelo2.addColumn("Correo");
        modelo2.addColumn("Fecha Nacimiento");
        modelo2.addColumn("Contraseña");
        this.tablaConsultas.setModel(modelo2);
            //if (CbxConsulIdentificacion.getSelectedItem().equals("Recepsionista")) {
                JefeTec = FunBD.ConsultarJefe(Identificacion);
                while (modelo2.getRowCount()>0) {
                    modelo2.removeRow(0);                
                }
                int numCol= modelo2.getColumnCount();
            
                for (JefeTecnico Recep : JefeTec) {
                    Object[] fila = new Object[numCol];
                    fila[0] = Recep.getIdentificacion();
                    fila[1] = Recep.getNombre();
                    fila[2] = Recep.getApellido();
                    fila[3] = Recep.getTelefono();
                    fila[4] = Recep.getDireccion();
                    fila[5] = Recep.getBarrio();
                    fila[6] = Recep.getCorreo();
                    fila[7] = Recep.getFechaNacimiento();
                    fila[8] = Recep.getContrasena();
                    modelo2.addRow(fila);
                    this.tablaConsultas.setModel(modelo2);
                }
        
    }
private void consultarRecepcionista(String Identificacion) throws SQLException{
        DefaultTableModel modelo2 = new DefaultTableModel();
        modelo2.addColumn("Identificacion");
        modelo2.addColumn("Nombre");
        modelo2.addColumn("Apellido");
        modelo2.addColumn("Telefono");
        modelo2.addColumn("Direccion");
        modelo2.addColumn("Barrio");
        modelo2.addColumn("Correo");
        modelo2.addColumn("Fecha Nacimiento");
        modelo2.addColumn("Contraseña");
        this.tablaConsultas.setModel(modelo2);
            //if (CbxConsulIdentificacion.getSelectedItem().equals("Recepsionista")) {
                recepcionista = FunBD.consulrecepcionista(Identificacion);
                while (modelo2.getRowCount()>0) {
                    modelo2.removeRow(0);                
                }
                int numCol= modelo2.getColumnCount();
            
                for (Recepcionista Recep : recepcionista) {
                    Object[] fila = new Object[numCol];
                    fila[0] = Recep.getIdentificacion();
                    fila[1] = Recep.getNombre();
                    fila[2] = Recep.getApellido();
                    fila[3] = Recep.getTelefono();
                    fila[4] = Recep.getDireccion();
                    fila[5] = Recep.getBarrio();
                    fila[6] = Recep.getCorreo();
                    fila[7] = Recep.getFechaNacimiento();
                    fila[8] = Recep.getContrasena();
                    modelo2.addRow(fila);
                    this.tablaConsultas.setModel(modelo2);
                }  
    }
    private void BtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarActionPerformed
        if (CbxConsulIdentificacion.getSelectedItem().equals("Jefe Tecnico")) {
            String identificacio = TxtIdentificacion.getText();
            try {
                mostrarTablaConsultarJefe(identificacio);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "la identificacion no existe");
            }
        }
        if (CbxConsulIdentificacion.getSelectedItem().equals("Recepsionista")) {
            String identificacio = TxtIdentificacion.getText();
            try {
                consultarRecepcionista(identificacio);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "la identificacion no existe");
            }
        }
        if (CbxConsulIdentificacion.getSelectedItem().equals("Tecnicos")) {
            String identificacio = TxtIdentificacion.getText();
            try {
                consultarTecnico(identificacio);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "la identificacion no existe");
            }
        }
    }//GEN-LAST:event_BtnConsultarActionPerformed
    private void consultarTecnico(String Identificacion) throws SQLException{
        DefaultTableModel modelo2 = new DefaultTableModel();
        modelo2.addColumn("Identificacion");
        modelo2.addColumn("Nombre");
        modelo2.addColumn("Apellido");
        modelo2.addColumn("Telefono");
        modelo2.addColumn("Direccion");
        modelo2.addColumn("Barrio");
        modelo2.addColumn("Correo");
        modelo2.addColumn("Fecha Nacimiento");
        modelo2.addColumn("Contraseña");
        this.tablaConsultas.setModel(modelo2);
            //if (CbxConsulIdentificacion.getSelectedItem().equals("Recepsionista")) {
                Tecni = FunBD.onsultarTecnicos(Identificacion);
                while (modelo2.getRowCount()>0) {
                    modelo2.removeRow(0);                
                }
                int numCol= modelo2.getColumnCount();
            
                for (Tecnicos Recep : Tecni) {
                    Object[] fila = new Object[numCol];
                    fila[0] = Recep.getIdentificacion();
                    fila[1] = Recep.getNombre();
                    fila[2] = Recep.getApellido();
                    fila[3] = Recep.getTelefono();
                    fila[4] = Recep.getDireccion();
                    fila[5] = Recep.getBarrio();
                    fila[6] = Recep.getCorreo();
                    fila[7] = Recep.getFechaNacimiento();
                    fila[8] = Recep.getContrasena();
                    modelo2.addRow(fila);
                    this.tablaConsultas.setModel(modelo2);
                }              
        }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel Modelo6 = new DefaultTableModel();
        Modelo6.addColumn("Codigo");
        Modelo6.addColumn("Fecha Instalacion");
        Modelo6.addColumn("Horario de visita");
        Modelo6.addColumn("Tipo Servicio");
        Modelo6.addColumn("Servicio Realizado");
        Modelo6.addColumn("Nombre Tecnico");
        Modelo6.addColumn("Nombre Del Usuario");
        this.TbReportes.setModel(Modelo6);
        String dia1 = Integer.toString(DateFechaInicial.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes1 = Integer.toString(DateFechaInicial.getCalendar().get(Calendar.MONTH));
        String ano1 = Integer.toString(DateFechaInicial.getCalendar().get(Calendar.YEAR));
        String dia2 = Integer.toString(DateFechaFinal.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes2 = Integer.toString(DateFechaFinal.getCalendar().get(Calendar.MONTH));
        String ano2 = Integer.toString(DateFechaFinal.getCalendar().get(Calendar.YEAR));
        String  date1 = ano1+"-"+mes1+"-"+dia1;
        String  date2 = ano2+"-"+mes2+"-"+dia2;

        try {

            String sql = "select "
                    + "e.codigo, "
                    + "e.fechaInstalacion,"
                    + "e.horario,"
                    + "e.TipoServicio,"
                    + "e.servicioRealizado,"
                    + "t.nombre,"
                    + "u.NombreCliente "
                    + "FROM tickets e "
                    + "INNER JOIN usuarios u ON e.id = u.idTicket "
                    + "INNER JOIN tecnico t on t.identificacion = e.identificacionEmpleado "
                    + "WHERE e.fechaInstalacion BETWEEN '"+date1+"' AND '"+date2+"' "
                    + "ORDER BY e.fechaInstalacion, e.horario ";
            con = Con.conectar();

            PreparedStatement ppt = con.prepareStatement(sql);
            String fila[] = new String[7];
            ResultSet rs = ppt.executeQuery();
            while (rs.next()) {
                fila[0] = rs.getString(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getString(5);
                fila[5] = rs.getString(6);
                fila[6] = rs.getString(7);
                Modelo6.addRow(fila);
                this.TbReportes.setModel(Modelo6);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void BtnConsultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultar1ActionPerformed
        Principal log = new Principal();
        log.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_BtnConsultar1ActionPerformed

    private void BtnConsultar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultar2ActionPerformed
        Principal log = new Principal();
        log.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_BtnConsultar2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConsultar;
    private javax.swing.JButton BtnConsultar1;
    private javax.swing.JButton BtnConsultar2;
    private javax.swing.JComboBox CbxConsulIdentificacion;
    private com.toedter.calendar.JDateChooser DateFechaFinal;
    private com.toedter.calendar.JDateChooser DateFechaInicial;
    private javax.swing.JPanel Panel1;
    private javax.swing.JTable TbReportes;
    private javax.swing.JTextField TxtIdentificacion;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaConsultas;
    // End of variables declaration//GEN-END:variables
}
