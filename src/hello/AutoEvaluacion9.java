
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

public class AutoEvaluacion9 extends JFrame implements ActionListener  {
    
    private JButton button;
    private JPanel panel;
   
    
    public static void main(String[] args){
        AutoEvaluacion9 marco = new AutoEvaluacion9();
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
        
        int n = 3;
        int r,r2,r3,r4,r5,r6,r7,r8;
        
        
        r = doble(n);
        r2 = doble(n + 1);
        r3 = doble(n) + 1;
        r4 = doble(3 + 2 * n);
        r5 = doble(doble(n));
        r6 = doble(doble(n + 1));
        r7 = doble(doble(n) + 1);
        r8 = doble(doble(doble(n)));
            
        JOptionPane.showMessageDialog(null,
                "Primer resultado: "  + r  + "\n" +
                "Segundo resultado: " + r2 + "\n" + 
                "Tercer resultado: "  + r3 + "\n" + 
                "Cuarto resultado: "  + r4 + "\n" +
                "Quinto resultado: "  + r5 + "\n" + 
                "Sexto resultado: "   + r6 + "\n" +
                "Septimo resultado: " + r7 + "\n" +
                "Octavo resultado: "  + r8 + "\n" );
        
    
    
    
    
    
    
    }

    private int doble(int n) {
       
        return 2 * n;
    }

    

    

    

   
    
}
