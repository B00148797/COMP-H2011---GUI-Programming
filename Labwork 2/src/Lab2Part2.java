import javax.swing.*;

public class Lab2Part2 extends JFrame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Lab2Part2");

        jFrame.setSize(300, 300);

        JPanel holderPanel = new JPanel();

        JLabel labelNoImage = new JLabel("This is a label no image.");

        JLabel imageLabel = new JLabel("Label with image.");
        imageLabel.setIcon(new ImageIcon("images/Logo Google.png"));

        holderPanel.add(labelNoImage);
        holderPanel.add(imageLabel);

        jFrame.add(holderPanel);

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
