import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawSmiley extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200);

        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30); // left eye
        g.fillOval(135, 65, 30, 30); // right eye

        g.fillOval(50, 110, 120, 60); // mouth
        
        g.setColor(Color.YELLOW);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);

        // Draw nose
        g.setColor(Color.BLACK);
        g.fillOval(95, 100, 30, 30);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(250, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new DrawSmiley());
        frame.setVisible(true);
    }
}
