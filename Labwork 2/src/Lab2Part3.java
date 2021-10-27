import javax.swing.*;

public class Lab2Part3 extends JFrame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Lab2Part3");

        jFrame.setSize(300, 300);

        JPanel buttonPanel = new JPanel();

        JButton jButtonOpen = new JButton("Open");
        jButtonOpen.setIcon(new ImageIcon("images/Logo Open.png"));

        JButton jButtonSave = new JButton("Save");
        jButtonSave.setIcon(new ImageIcon("images/Logo Save.png"));

        buttonPanel.add(jButtonOpen);
        buttonPanel.add(jButtonSave);

        jFrame.add(buttonPanel);

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
