 import javax.swing.*;
import java.awt.*;

public class DottedLinesExample extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        // Set the stroke to a dotted stroke
        Stroke dottedStroke = new BasicStroke(1.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 0, new float[]{3}, 0);
        g2d.setStroke(dottedStroke);

        // Draw three dotted lines with gaps in between
        int y = 50; // Initial y-coordinate for the lines

        for (int i = 0; i < 3; i++) {
            g2d.drawLine(50, y, 250, y);
            y += 30; // Increase y for the next line
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Dotted Lines Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);
            frame.setContentPane(new DottedLinesExample());
            frame.setVisible(true);
        });
    }
}

    

