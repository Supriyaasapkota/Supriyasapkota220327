
    import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrafficLightPost extends JPanel {

    private boolean isRed = true;
    private boolean isYellow = false;
    private boolean isGreen = false;

    public TrafficLightPost() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(2000); // 2 seconds
                        isRed = false;
                        isYellow = true;
                        repaint();
                        Thread.sleep(1000); // 1 second
                        isYellow = false;
                        isGreen = true;
                        repaint();
                        Thread.sleep(2000); // 2 seconds
                        isGreen = false;
                        isRed = true;
                        repaint();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw post
        g2d.setColor(Color.GRAY);
        g2d.fillRect(100, 200, 20, 150);

        // Draw traffic light
        if (isRed) {
            g2d.setColor(Color.RED);
        } else {
            g2d.setColor(Color.BLACK);
        }
        g2d.fillOval(90, 150, 40, 40); // Red light

        if (isYellow) {
            g2d.setColor(Color.YELLOW);
        } else {
            g2d.setColor(Color.BLACK);
        }
        g2d.fillOval(90, 100, 40, 40); // Yellow light

        if (isGreen) {
            g2d.setColor(Color.GREEN);
        } else {
            g2d.setColor(Color.BLACK);
        }
        g2d.fillOval(90, 50, 40, 40); // Green light

        // Draw lights' borders
        Stroke stroke = new BasicStroke(2);
        g2d.setStroke(stroke);
        g2d.setColor(Color.BLACK);
        g2d.drawOval(90, 150, 40, 40); // Red light border
        g2d.drawOval(90, 100, 40, 40); // Yellow light border
        g2d.drawOval(90, 50, 40, 40); // Green light border
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Traffic Light Post");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new TrafficLightPost());
        frame.setSize(300, 400);
        frame.setVisible(true);
    }
}
    

