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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author CREYES
 */
public class TrianguloArea extends JFrame implements ActionListener {
    
    private JButton button;
    private JPanel panel;
    
    public static void main(String[] args){
        TrianguloArea marco = new TrianguloArea();
        marco.setSize(500 , 400);
        marco.crearGUI();
        marco.setVisible(true);
    }
    
    void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        button = new JButton("Haz clic");
        ventana.add(button);
        button.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        double da = 9.5, db = 21.5, angulo = 0.7, trianguloDouble, trianguloAngulo;
        int ia = 10, ib= 20, trianguloInt;
        
        trianguloInt    = this.areaTriangulo(ia, ib);
        trianguloDouble = this.areaTriangulo(da, db);
        trianguloAngulo = this.areaTriangulo(da, db, angulo);
        
        JOptionPane.showMessageDialog(null,
                "El area del triangulo int es: "    + trianguloInt    + "\n" +
                "El area del triangulo double es: " + trianguloDouble + "\n" +
                "El area del triangulo angulo es: " + trianguloAngulo);
         
        
    }

    private int areaTriangulo(int base, int altura) {
       return ( base * altura ) / 2;
    }

    private double areaTriangulo(double base, double altura) {
       return ( base * altura ) / 2;
    }

    private double areaTriangulo(double lado1, double lado2, double angulo) {
        return 0.5 * lado1 * lado2 * Math.sin(angulo);
    }

    
    
}
