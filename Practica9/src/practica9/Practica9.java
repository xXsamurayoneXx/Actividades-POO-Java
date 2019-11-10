package practica9;

import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import javafx.event.ActionEvent;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Practica9 extends javax.swing.JFrame {

    //Variables para conectar la base de datos
    public static void main(String[] args) {
        Practica9 ventana = new Practica9("Practica 9");
        
    }
    public static final String URL = "jdbc:mysql://127.0.0.1:3306/MySQL"; //Direccion, puerto y nombre de la Base de Datos
    public static final String USERNAME = "root"; //Usuario de Acceso a MySQL
    public static final String PASSWORD = "kiseijuu123"; //Password del usuario
    PreparedStatement ps;
    ResultSet rs;
    
    //Declaracion de variables
    JButton Limpiar;
    JButton Aceptar;
    JButton Modifica;
    JButton Elimina;
    JLabel Nombre;
    JLabel Apellido;
    JLabel Mail;
    JLabel Telefono;
    JLabel Direccion;
    final JTextField texto1;
    JTextField texto2;
    JTextField texto3;
    JTextField texto4;
    JTextField texto5;
    private ActionListener ActionEvent;
    //Organizacion de Jlabel        
    public Practica9 (String titulo){
        
        JFrame ventanaM = new JFrame(titulo);
        texto1 = new JTextField(10);
        texto2 = new JTextField(10);
        texto3 = new JTextField(10);
        texto4 = new JTextField(10);
        texto5 = new JTextField(10);
        Nombre = new JLabel("Nombre:");
        Apellido = new JLabel("Apellido:");
        Mail = new JLabel("Mail:");
        Telefono = new JLabel("Telefono:");
        Direccion = new JLabel("Direccion:");
        Aceptar = new JButton("Aceptar");
        Limpiar = new JButton("Limpiar");
        Modifica = new JButton("Modifica");
        Elimina = new JButton("Elimina");
                
        ventanaM.setLayout(null);
        ventanaM.setLocationRelativeTo(null);
        ventanaM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finaliza el programa cuando se da click en la X
        ventanaM.setSize(300, 350);//configurando tamaño de la ventana
        ventanaM.setVisible(true);//configurando visualización de la ventana 
       
        Nombre.setBounds(10,20,150,25);
        Apellido.setBounds(10,60,150,25);
        Mail.setBounds(10,100,150,25);
        Telefono.setBounds(10,140,150,25);
        Direccion.setBounds(10,180,150,25);
        texto1.setBounds(100,20,150,25);
        texto2.setBounds(100,60,150,25);
        texto3.setBounds(100,100,150,25);
        texto4.setBounds(100,140,150,25);
        texto5.setBounds(100,180,150,25);
        Modifica.setBounds(30,220,100,25);
        Elimina.setBounds(150,220,100,25);
        Limpiar.setBounds(30,260,100,25);
        Aceptar.setBounds(150,260,100,25);
        ventanaM.add(Nombre);     
        ventanaM.add(texto1);
        ventanaM.add(Apellido);
        ventanaM.add(texto2);
        ventanaM.add(Mail);
        ventanaM.add(texto3);
        ventanaM.add(Telefono);
        ventanaM.add(texto4);
        ventanaM.add(Direccion);
        ventanaM.add(texto5);
        ventanaM.add(Limpiar);
        ventanaM.add(Aceptar);
        ventanaM.add(Modifica);
        ventanaM.add(Elimina);
        
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        
        Modifica.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificaActionPerformed(evt);
            }
        });
        
        Elimina.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminaActionPerformed(evt);
            }
        });
    } 
    //Action Listeners
    private void limpiar(){
        
        texto1.setText(null);
        texto2.setText(null);
        texto3.setText(null);
        texto4.setText(null);
        texto5.setText(null);
        
    }
    private void AceptarActionPerformed(java.awt.event.ActionEvent evt){
        Connection con = null;
        
        try{
            
            con = getConection();
            ps = con.prepareStatement("INSERT INTO registros (Nombre, Apellido, Telefono, E-mail, Direccion) VALUES(?,?,?,?,?) WHERE id=?");
            ps.setString(1, texto1.getText());
            ps.setString(2, texto2.getText());
            ps.setString(3, texto3.getText());
            ps.setString(4, texto4.getText());
            ps.setString(5, texto5.getText());
            
            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Dato guardado");
                limpiar();
            } else {
                 JOptionPane.showMessageDialog(null, "Error al guardar");
                 limpiar();
            }
            
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
        
    }
    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        limpiar();
    } 
    private void ModificaActionPerformed(java.awt.event.ActionEvent evt) { 
        Connection con = null;
        
        try{
            
            con = getConection();
            ps = con.prepareStatement("UPDATE registros SET Nombre=?, Apellido=?, Telefono=?, E-mail=? , Direccion=? WHERE id=?");
            ps.setString(1, texto1.getText());
            ps.setString(2, texto2.getText());
            ps.setString(3, texto3.getText());
            ps.setString(4, texto4.getText());
            ps.setString(5, texto5.getText());
            
            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Dato Modificado");
                limpiar();
            } else {
                 JOptionPane.showMessageDialog(null, "Error al Modificar");
                 limpiar();
            }
            
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
    } 
    private void EliminaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        Connection con = null;
        
        try{
            
            con = getConection();
            ps = con.prepareStatement("DELETE FROM registros");
            ps.setInt(1, Integer.parseInt(texto1.getText()));
            
            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Dato eliminado");
                limpiar();
            } else {
                 JOptionPane.showMessageDialog(null, "Error al dato");
                 limpiar();
            }
            
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
        limpiar();
    } 
    //Coneccion a base de datos
    public static Connection getConection() {
        Connection con = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexion exitosa");

        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
     
}
