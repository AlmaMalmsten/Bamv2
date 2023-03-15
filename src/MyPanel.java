import javax.swing.*;
import java.awt.*;
public class MyPanel extends JPanel  {
    private int width = 600;
    private int height = 200;

    MyPanel() {
        setPreferredSize(new Dimension(width, height));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        g.fillRect(10, 30, 500, 40);
        g.setColor(Color.black);
        g.fillRect(10, 90, 500, 40);
    }

}
