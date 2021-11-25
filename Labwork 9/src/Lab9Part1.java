import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab9Part1 extends JFrame implements ActionListener {

    JButton jButton;

    public Lab9Part1(){
        setTitle("Lab9Part1");
        setSize(500, 500);

        jButton = new JButton("Show Message Dialog");
        jButton.addActionListener(this);

        add(jButton);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab9Part1();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String myName = "Thomas";
        JOptionPane.showMessageDialog(this,
                "This is " + myName + " and this is my first message dialog",
                myName,
                JOptionPane.INFORMATION_MESSAGE);
    }
}