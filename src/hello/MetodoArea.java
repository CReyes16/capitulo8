
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

public class MetodoArea extends JFrame implements ActionListener  {
    
    private JButton button;
    private JPanel panel;
   
    
    public static void main(String[] args){
        MetodoArea marco = new MetodoArea();
        marco.setSize(400 , 300);
        marco.crearGUI();
        marco.setVisible(true);
    }
    
    void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 200));
        panel.setBackground(Color.white);
        ventana.add(panel);
        
        button = new JButton("Haz clic");
        ventana.add(button);
        button.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
       int a;
       a = areaRectangulo(10,20);
       JOptionPane.showMessageDialog(null,"El area es: " + a);
                        
    }

    private int areaRectangulo(int longitud, int anchura) {
    
        int area;
        area = longitud * anchura;
        return area;
    }

    

   
    
}
