
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
public class FiguraT extends JFrame implements ActionListener {
    private JButton button;
    private JPanel panel;
    
    public static void main(String[] args){
        FiguraT marco = new FiguraT();
        marco.setSize(400 , 300);
        marco.crearGUI();
        marco.setVisible(true);
    }
    
    private void crearGUI() {
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
        Graphics papel = panel.getGraphics();
        papel.setColor(Color.lightGray);
        papel.fillRect(75, 50, 150, 20);
        papel.fillRect(140, 50, 20, 130);
        
    }
    
}
