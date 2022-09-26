
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

public class AutoEvaluacion8 extends JFrame implements ActionListener  {
    
    private JButton button;
    private JPanel panel;
   
    
    public static void main(String[] args){
        AutoEvaluacion8 marco = new AutoEvaluacion8();
        marco.setSize(400 , 300);
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
        
        int a = 3;
        int b = 8;
        //hacerAlgo(a , b);
        this.hacerAlgo(a, b);
        JOptionPane.showMessageDialog(null,Integer.toString(a));
        
    }

    private void hacerAlgo(int x, int y) {
        int a = 0;
        a = x + y;
    }

    

    

   
    
}
