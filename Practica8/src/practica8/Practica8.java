package practica8;

import javax.swing.*;
import java.awt.event.*;
import javafx.event.ActionEvent;


public class Practica8 extends javax.swing.JFrame {
 public static void main(String []args){
        
        Practica8 ventana = new Practica8("Practica 8"); 
    }
    
      //Declaracion de variables
    JButton Limpiar;
    JButton Aceptar;
    JButton Atras;
    JButton Adelante;
    JButton cancelar;
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
            
    public Practica8 (String titulo){
        
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
        Atras = new JButton("Atras");
        Adelante = new JButton("Adelante");
                
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
        Atras.setBounds(30,220,100,25);
        Adelante.setBounds(150,220,100,25);
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
        ventanaM.add(Atras);
        ventanaM.add(Adelante);
        
    }    
    
}