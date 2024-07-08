
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.GridLayout;
public class SwingTester {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JLabel controlPanel;

    public SwingTester(){
        prepareGUI();
    }
 public static void main(String[]args){
    SwingTester swingControlDemo=new SwingTester();
    swingControlDemo.showTableDemo();
 }
  private void prepareGUI(){
    mainFrame = new JFrame("Java Swing Examples");
    mainFrame.setSize(500,400);
    mainFrame.setLayout(new GridLayout(3,1));

    mainFrame.addWindowFocusListener(new WindowAdapter(){
    public void windowClosing(WindowEvent windowevent ){
        System.exit(0);
    }
    });
  headerLabel =new JLabel("",JLabel.CENTER);
  statusLabel =new JLabel("",JLabel.CENTER);
  statusLabel.setSize(350,100);

  controlPanel =new JPanel();
  controlPanel.setLayout(new FlowLayout());

  mainFrame.add(headerLabel);
  mainFrame.add(controlPanel);
  mainFrame.add(statusLabel);
  mainFrame.setVisible(true);
  }
  private void showTableDemo(){
    headerLabel.setText("Control in action:JTable");

    String[] columnNames={"Name","Salary"};
    Object[][]data={
        {"Elon  Musko",5000};
        {"Baiden Budo",7000}

    };
    JTable table =new JTable(data,columnNames);
    JScrollPane scrollPane=new JScrollPane(table);
    scrollPane.setSize(300,300);
    table.setFillsViewportHeight(true);
    controlPanel.add(scrollPane);
    mainFrame.setVisible(true);
  }
  




  
 
    
}
