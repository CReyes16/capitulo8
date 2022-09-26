/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author CREYES
 */
public class ImagenDemo extends JFrame implements ActionListener{
    
    private JButton boton;
    private JPanel panel;
    private JTextField campoArchivo;
    private int posicionX = 0, posicionY = 0;
    
    public static void main(String[] args){
        ImagenDemo marco = new ImagenDemo();
        marco.setSize(600, 600);
        marco.crearGUI();
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
    }
    
    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
         
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(500,500));
        panel.setBackground(Color.WHITE);
        ventana.add(panel);
        
        campoArchivo = new JTextField(20);
        ventana.add(campoArchivo);
        
        boton = new JButton("Haga clic");
        ventana.add(boton);
        boton.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
       ImageIcon miImagen = new ImageIcon(campoArchivo.getText());
       Graphics papel = panel.getGraphics();
       miImagen.paintIcon(this, papel, posicionX, posicionY);
       
       posicionX = posicionX + 80;
       posicionY = posicionY + 80;
        
    }

    
}
