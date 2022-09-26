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
public class CapituloE55 extends JFrame implements ActionListener {
    
    private JButton button;
    private JPanel panel;
    
    public static void main(String[] args){
        CapituloE55 marco = new CapituloE55();
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
        dibujarCalle(papel,0,155,390,30);     
    }
    private void dibujarCalle(Graphics papel, int xCalle, int yCalle, int wCalle, int hCalle) {
        
        papel.fillRect(xCalle, yCalle, wCalle, hCalle);
        papel.setColor(Color.black);
        dibujarCasa(papel, 10, 50, 50, 50);
        dibujarCasa(papel, 90, 50, 50, 50);
        dibujarCasa(papel, 170, 50, 50, 50);
        dibujarCasa(papel, 250, 50, 50, 50);
        
    }



    private void dibujarCasa(Graphics areaDibujo, int techoSupX, int techoSupY, int anchura, int altura) {
       
        dibujarTriangulo(areaDibujo, techoSupX, techoSupY, anchura, altura);
        areaDibujo.drawRect(techoSupX, techoSupY + altura, anchura, altura);
    }

    private void dibujarTriangulo(Graphics areaDibujo, int lugarX, int lugarY, int anchura, int altura) {
        
        areaDibujo.drawLine(lugarX, lugarY, lugarX, lugarY + altura );
        areaDibujo.drawLine(lugarX, lugarY + altura, lugarX + anchura, lugarY + altura);
        areaDibujo.drawLine(lugarX, lugarY, lugarX + anchura, lugarY + altura);
    }

      
    
}
