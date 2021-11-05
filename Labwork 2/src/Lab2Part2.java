import javax.swing.*;

public class Lab2Part2 extends JFrame {

    JLabel labelNoImage, imageLabel;
    JPanel holderPanel;

    public Lab2Part2(){
        setTitle("Lab2Part2");
        setSize(300, 300);

        holderPanel = new JPanel();

        labelNoImage = new JLabel("This is a label no image.");

        imageLabel = new JLabel("Label with image.");
        imageLabel.setIcon(new ImageIcon("images/Logo Google.png"));

        holderPanel.add(labelNoImage);
        holderPanel.add(imageLabel);

        add(holderPanel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab2Part2();
    }
}