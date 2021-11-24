import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab8Part2 extends JFrame implements ActionListener {

    JPanel mainPanel, jPanelLeft, jPanelRight, jPanel3;
    JButton jButtonLeft, jButtonRight;

    public Lab8Part2(){
        setTitle("Lab8Part2");
        setSize(500, 500);
        setLayout(new BorderLayout());

        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout());

        jPanelLeft = new JPanel();
        jPanelLeft.setBackground(Color.RED);
        jPanelRight = new JPanel();
        jPanelRight.setBackground(Color.BLUE);

        mainPanel.add(jPanelLeft);
        mainPanel.add(jPanelRight);

        jPanel3 = new JPanel();
        jPanel3.setBackground(Color.WHITE);
        jPanel3.setLayout(new BoxLayout(jPanel3, BoxLayout.X_AXIS));

        jButtonLeft = new JButton("Change Color of Left Panel");
        jButtonLeft.addActionListener(this);
        jButtonRight = new JButton("Change Color of Right Panel");
        jButtonRight.addActionListener(this);
        jPanel3.add(jButtonLeft);
        jPanel3.add(jButtonRight);

        add(mainPanel, BorderLayout.CENTER);
        add(jPanel3, BorderLayout.NORTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab8Part2();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Color color = JColorChooser.showDialog(this,"Select a color", Color.BLACK);
        if (actionEvent.getSource() == jButtonLeft){
            jPanelLeft.setBackground(color);
        }else if(actionEvent.getSource() == jButtonRight){
            jPanelRight.setBackground(color);
        }
    }
}