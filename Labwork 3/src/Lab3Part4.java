import javax.swing.*;
import java.awt.*;

public class Lab3Part4 extends JFrame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Lab3Part4");

        jFrame.setSize(300, 300);

        String[] clothingList = {"Trousers", "Dress", "Skirt", "Shirt"};
        JComboBox jComboBox1 = new JComboBox(clothingList);

        String[] countryList = {"Etats-Unis", "Chine", "Japon", "Allemagne", "France"};
        JComboBox jComboBox2 = new JComboBox(countryList);
        jComboBox2.setEditable(true);

        jFrame.add(jComboBox1, BorderLayout.NORTH);
        jFrame.add(jComboBox2, BorderLayout.SOUTH);

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
