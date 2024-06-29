
import java.awt.Frame;
import java.awt.Graphics;

public class SwingGraphics extends Frame {
    SwingGraphics() {
        setSize(500, 500);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("String Graphics Class", 10, 10);
        g.drawRect(10, 90, 90, 90);
        g.fillRect(10, 190, 90, 90);

        g.drawLine(10, 300, 300, 300);
        g.drawLine(10, 310, 300, 310);
        g.drawLine(10, 320, 300, 320);

        g.drawLine(310, 300, 350, 300);
        g.drawLine(10, 330, 10, 350);
        g.drawLine(30, 330, 30, 350);

        g.drawRoundRect(10, 360, 100, 100, 25, 25);

    }

    public static void main(String[] args) {
        new SwingGraphics();

    }

}
    
    

