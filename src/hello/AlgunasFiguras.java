
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
public class AlgunasFiguras extends JFrame implements ActionListener {
    private JButton button;
    private JPanel panel;
    
    public static void main(String[] args){
        AlgunasFiguras marco = new AlgunasFiguras();
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
        papel.drawRect(30, 30, 80, 40);
        papel.drawOval(130, 30, 50, 50);
        papel.drawOval(230, 30, 30, 50);
        papel.setColor(Color.lightGray);
        papel.fillRect(30, 100, 80, 40);
        papel.fillOval(130, 100, 50, 50);
        papel.fillOval(230, 100, 30, 50);
    }
    
}
