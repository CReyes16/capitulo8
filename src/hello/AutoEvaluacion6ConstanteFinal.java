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
import javax.swing.JOptionPane;

/**
 *
 * @author CREYES
 */
public class AutoEvaluacion6ConstanteFinal extends JFrame implements ActionListener{
    
    private JButton botón;
    
    public static void main(String[] args){
        AutoEvaluacion6ConstanteFinal marco = new AutoEvaluacion6ConstanteFinal();
        marco.setSize(400, 300);
        marco.crearGUI();
        marco.setVisible(true);
        
    }
    
    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        botón = new JButton("Haga clic");
        ventana.add(botón);
        botón.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        final double CMPORPULG = 2.54;
        double in, cm;
        String inString;
        
        inString = JOptionPane.showInputDialog("Ingresa la pulgada a convertir en centimetro");
        in = Double.parseDouble(inString);
        
        cm = in * CMPORPULG;
        JOptionPane.showMessageDialog(null, in + " pulgadas es igual a: " + cm + " centimetos");
                       
    }

    
}
