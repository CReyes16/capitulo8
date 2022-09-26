/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author CREYES
 */
public class AreaRectanguloCampo extends JFrame implements ActionListener{
    
    private JTextField txtBase, txtAltura, txtArea;
    private JLabel labelBase, labelAltura, labelArea;
    private JButton boton;
    
    
    public static void main(String[] args){
        AreaRectanguloCampo marco = new AreaRectanguloCampo();
        marco.setSize(500, 100);
        marco.crearGUI();
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
    }
    
    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        labelBase = new JLabel("Base: ");
        ventana.add(labelBase);
        
        txtBase = new JTextField(8);
        ventana.add(txtBase);
        
        labelAltura = new JLabel(" Altura: ");
        ventana.add(labelAltura);
        
        txtAltura = new JTextField(8);
        ventana.add(txtAltura);
        
        boton = new JButton(" = ");
        ventana.add(boton);
        boton.addActionListener(this);
        
        labelArea = new JLabel(" Area: ");
        ventana.add(labelArea);
        
        txtArea = new JTextField(8);
        ventana.add(txtArea);     
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
         
        int base, altura, area;
        base   = Integer.parseInt(txtBase.getText());
        altura = Integer.parseInt(txtAltura.getText());
        
        area = base * altura;
        
        txtArea.setText(Integer.toString(area));
    }

    
}
