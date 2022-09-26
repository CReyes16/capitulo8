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
public class DemoCasa2 extends JFrame implements ActionListener {
    
    private JButton button;
    private JPanel panel;
    
    public static void main(String[] args){
        DemoCasa2 marco = new DemoCasa2();
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
        
        int area = areaCasa(10,10);
        JOptionPane.showMessageDialog(null, "El area de la casa es de " + area);
    }

    private int areaCasa(int anchura, int altura) {
        return areaRectangulo(anchura, altura) + areaTriangulo(anchura, altura);
    }

    private int areaRectangulo(int longitud, int anchura) {
        int area;
        area = longitud * anchura;
        return area;
    }

    private int areaTriangulo(int base, int altura) {
       return (base * altura) / 2;
    }

   
   
    
}
