import javax.swing.*;

public class Lab2Part3 extends JFrame {

    JButton jButtonOpen, jButtonSave;
    JPanel buttonPanel;

    public Lab2Part3(){
        setTitle("Lab2Part3");

        setSize(300, 300);

        buttonPanel = new JPanel();

        jButtonOpen = new JButton("Open");
        jButtonOpen.setIcon(new ImageIcon("images/Logo Open.png"));

        jButtonSave = new JButton("Save");
        jButtonSave.setIcon(new ImageIcon("images/Logo Save.png"));

        buttonPanel.add(jButtonOpen);
        buttonPanel.add(jButtonSave);

        add(buttonPanel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab2Part3();
    }
}
