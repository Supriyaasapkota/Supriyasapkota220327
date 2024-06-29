
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TwoSection {
    public TwoSection() {
        Frame frame = new Frame("Two section");
        frame.setLayout(new BorderLayout());
        Panel LeftPanel = new Panel();
        LeftPanel.setBackground(Color.GRAY);
        Panel RightPanel = new Panel();
        RightPanel.setBackground(Color.blue);
        frame.add(RightPanel, BorderLayout.EAST);
        RightPanel.setPreferredSize(new Dimension(200, 400));
        
        Button btnLeft = new Button("Left");
        LeftPanel.add(btnLeft);
        frame.add(LeftPanel, BorderLayout.WEST);

        Label label = new Label("Right");
        RightPanel.add(label);
        LeftPanel.setPreferredSize(new Dimension(200, 400));
        frame.add(LeftPanel, BorderLayout.CENTER);

        btnLeft.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("hello");
            }
        });
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new TwoSection();
        
    }
}
    

