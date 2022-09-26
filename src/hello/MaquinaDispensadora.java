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
public class MaquinaDispensadora extends JFrame implements ActionListener{
    
    private JButton botón;
    
    public static void main(String[] args){
        MaquinaDispensadora marco = new MaquinaDispensadora();
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
      
      int cost, inserted, change, remainingChange;
        int coins50, coins20, coins10, coins5, coins2;
        inserted = Integer.parseInt(JOptionPane.showInputDialog("Insert amount..."));
        cost = Integer.parseInt(JOptionPane.showInputDialog("Enter cost of item..."));
        change = inserted - cost;

        coins50 = change / 50;
        JOptionPane.showMessageDialog(null, "Number of 50 cent coins is: "  + coins50);
        remainingChange = change % 50;

        coins20 = remainingChange / 20;
        JOptionPane.showMessageDialog(null, "Number of 20 cent coins is: "  + coins20);
        remainingChange = remainingChange % 20;

        coins10 = remainingChange / 10;
        JOptionPane.showMessageDialog(null, "Number of 10 cent coins is: "  + coins10);
        remainingChange = remainingChange % 10;

        coins5 = remainingChange / 5;
        JOptionPane.showMessageDialog(null, "Number of 5 cent coins is: "  + coins5);
        remainingChange = remainingChange % 5;

        coins2 = remainingChange / 2;
        JOptionPane.showMessageDialog(null, "Number of 2 cent coins is: "  + coins2);
        remainingChange = remainingChange % 2;

        JOptionPane.showMessageDialog(null, "Number of 1 cent coins is: "  + remainingChange);

     
              
    }

    
}
