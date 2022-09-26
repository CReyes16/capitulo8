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
public class AutoEvaluacion5ConvertirIntDouble extends JFrame implements ActionListener{
    
    private JButton botón;
    
    public static void main(String[] args){
        AutoEvaluacion5ConvertirIntDouble marco = new AutoEvaluacion5ConvertirIntDouble();
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
        
        int i,j,k;
        double a , b ,c;
        int n = 3;
        double y = 2.7;
        
        i = (int)y;
        j = (int)( y + 0.6);
        k = (int)((double)n + 0.2);
        a = n;
        b = (int)n;
        c = (int)y;
        
        JOptionPane.showMessageDialog(null,"i es igual a: " + i + "\n" + 
                "j es igual a: " + j + "\n" + 
                "k es igual a: " + k + "\n" + 
                "a es igual a: " + a + "\n" +
                "b es igual a: " + b + "\n" + 
                "c es igual a: " + c );
                       
    }

    
}
