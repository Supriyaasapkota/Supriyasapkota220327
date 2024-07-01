import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.GeneralPath;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TwoTriangle extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw triangle 1
        GeneralPath triangle1 = new GeneralPath();
        triangle1.moveTo(100, 100);
        triangle1.lineTo(150, 150);
        triangle1.lineTo(50, 150);
        triangle1.closePath();
        g2d.fill(triangle1);

        // Draw triangle 2
        GeneralPath triangle2 = new GeneralPath();
        triangle2.moveTo(200, 100);
        triangle2.lineTo(250, 150);
        triangle2.lineTo(150, 150);
        triangle2.closePath();
        g2d.fill(triangle2);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Two Triangles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new TwoTriangle());
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
    

