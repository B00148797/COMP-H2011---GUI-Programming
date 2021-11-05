import javax.swing.*;
import java.awt.*;

public class Lab3Part3 extends JFrame {

    JList<String> stringJList;

    public Lab3Part3(){
        setTitle("Lab3Part3");
        setSize(300, 300);

        String[] chocolateBar = {"Nestle", "Kinder", "Ferrero", "Mars", "Snikers", "Milka", "KitKat", "Twix", "Bounty", "Balisto"};
        stringJList = new JList<>(chocolateBar);

        add(stringJList, BorderLayout.SOUTH);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab3Part3();
    }
}