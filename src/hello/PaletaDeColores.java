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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author CREYES
 */
public class PaletaDeColores extends JFrame implements ActionListener {
    
    private JButton button;
    private JPanel panel;
    
    public static void main(String[] args){
        PaletaDeColores marco = new PaletaDeColores();
        marco.setSize(500 , 400);
        marco.crearGUI();
        marco.setVisible(true);
    }
    
    void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 300));
        panel.setBackground(Color.white);
        ventana.add(panel);
        
        button = new JButton("Haz clic");
        ventana.add(button);
        button.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Graphics papel = panel.getGraphics();
        //Casa
        papel.setColor(Color.red);
        papel.fillRect(10, 50, 30, 30);
        papel.setColor(Color.BLACK);
        papel.fillRect(50, 50, 30, 30);
        papel.setColor(Color.BLUE);
        papel.fillRect(90, 50, 30, 30);
        papel.setColor(Color.GREEN);
        papel.fillRect(130, 50, 30, 30);
        papel.setColor(Color.CYAN);
        papel.fillRect(170, 50, 30, 30);
        papel.setColor(Color.MAGENTA);
        papel.fillRect(210, 50, 30, 30);
        papel.setColor(Color.ORANGE);
        papel.fillRect(250, 50, 30, 30);
        papel.setColor(Color.YELLOW);
        papel.fillRect(290, 50, 30, 30);
        papel.setColor(Color.DARK_GRAY);
        papel.fillRect(10, 90, 30, 30);
        papel.setColor(Color.BLUE);
        papel.fillRect(50, 90, 30, 30);
        papel.setColor(Color.PINK);
        papel.fillRect(90, 90, 30, 30);
        papel.setColor(Color.YELLOW);
        papel.fillRect(130, 90, 30, 30);
        papel.setColor(Color.red);
        papel.fillRect(170, 90, 30, 30);
    }

   
    
}
