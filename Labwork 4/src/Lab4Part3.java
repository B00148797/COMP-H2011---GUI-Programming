import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab4Part3 extends JFrame implements ActionListener {

    String[] movieList = {"Forrest Gump", "Le Parrain", "Le Roi Lion", "Pulp Fiction", "Gladiator"};
    JComboBox jComboBox;
    JLabel jLabel;
    JTextArea jTextArea;
    JPanel jPanel;

    public Lab4Part3(){
        JFrame jFrame = new JFrame("Lab4Part3");
        jFrame.setSize(300, 300);
        jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());

        jLabel = new JLabel("Please choose your favourite movie:");
        jPanel.add(jLabel, BorderLayout.NORTH);

        jTextArea = new JTextArea("Response will appear here");
        jPanel.add(jTextArea, BorderLayout.SOUTH);

        jComboBox = new JComboBox(movieList);
        jComboBox.addActionListener(this);
        jPanel.add(jComboBox, BorderLayout.CENTER);

        jFrame.add(jPanel);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Lab4Part3 lab4Part3 = new Lab4Part3();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        jTextArea.setText(jComboBox.getSelectedItem().toString());
    }
}