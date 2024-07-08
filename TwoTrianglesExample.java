import javax.swing.*;
import java.awt.*;

public class TwoTrianglesExample extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        // Set rendering hints for smoother edges
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Define the points of the first triangle
        int[] xPoints1 = {100, 200, 150};
        int[] yPoints1 = {100, 100, 50};
        int nPoints1 = 3;

        // Draw the first triangle
        g2d.setColor(Color.blue);
        g2d.fillPolygon(xPoints1, yPoints1, nPoints1);

        // Define the points of the second triangle (facing the first one)
        int[] xPoints2 = {100, 200, 150};
        int[] yPoints2 = {150, 150, 200};
        int nPoints2 = 3;

        // Draw the second triangle
        g2d.setColor(Color.red);
        g2d.fillPolygon(xPoints2, yPoints2, nPoints2);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Two Triangles Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);
            frame.setContentPane(new TwoTrianglesExample());
            frame.setVisible(true);
        });
    }
}

