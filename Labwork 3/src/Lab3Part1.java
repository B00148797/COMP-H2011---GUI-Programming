import javax.swing.*;

public class Lab3Part1 extends JFrame {

    JLabel jLabel;
    JTextField jTextField;
    JPasswordField jPasswordField;

    public Lab3Part1(){
        setTitle("Lab3Part1");
        setSize(300, 300);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        jLabel = new JLabel("Enter you Username and Password:");

        jTextField = new JTextField("Username");

        jPasswordField = new JPasswordField("Password");

        add(jLabel);
        add(jTextField);
        add(jPasswordField);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab3Part1();
    }
}