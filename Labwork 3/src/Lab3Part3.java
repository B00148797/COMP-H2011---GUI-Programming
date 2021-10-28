import javax.swing.*;
import java.awt.*;

public class Lab3Part3 extends JFrame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Lab3Part3");

        jFrame.setSize(300, 300);

        String[] chocolateBar = {"Nestle", "Kinder", "Ferrero", "Mars", "Snikers", "Milka", "KitKat", "Twix", "Bounty", "Balisto"};
        JList<String> stringJList = new JList<>(chocolateBar);

        jFrame.add(stringJList, BorderLayout.SOUTH);

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}