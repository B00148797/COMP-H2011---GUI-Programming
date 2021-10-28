import javax.swing.*;

public class Lab3Part1 extends JFrame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Lab3Part1");

        jFrame.setSize(300, 300);

        jFrame.setLayout(new BoxLayout(jFrame.getContentPane(), BoxLayout.Y_AXIS));

        JLabel jLabel = new JLabel("Enter you Username and Password:");

        JTextField jTextField = new JTextField("Username");

        JPasswordField jPasswordField = new JPasswordField("Password");

        jFrame.add(jLabel);
        jFrame.add(jTextField);
        jFrame.add(jPasswordField);

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
