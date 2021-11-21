import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab8Part1 extends JFrame implements ActionListener {

    JLabel showFileName;
    JButton jButton;
    JPanel jPanel;
    JFileChooser jFileChooser;

    public Lab8Part1(){
        setTitle("Lab8Part1");
        setSize(500, 500);

        showFileName = new JLabel("No file is selected.");
        jButton = new JButton("Show File Name in Label");
        jButton.addActionListener(this);

        jFileChooser = new JFileChooser();

        jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        jPanel.add(showFileName);
        jPanel.add(jButton);

        add(jPanel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab8Part1();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == jButton){

            jFileChooser.showOpenDialog(getParent());
            showFileName.setText(jFileChooser.getSelectedFile().getName());
        }
    }
}