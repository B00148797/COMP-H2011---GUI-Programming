import javax.swing.*;
import java.awt.*;

public class Lab3Part4 extends JFrame {

    JComboBox jComboBox1, jComboBox2;

    public Lab3Part4(){
        setTitle("Lab3Part4");
        setSize(300, 300);

        String[] clothingList = {"Trousers", "Dress", "Skirt", "Shirt"};
        jComboBox1 = new JComboBox(clothingList);

        String[] countryList = {"Etats-Unis", "Chine", "Japon", "Allemagne", "France"};
        jComboBox2 = new JComboBox(countryList);
        jComboBox2.setEditable(true);

        add(jComboBox1, BorderLayout.NORTH);
        add(jComboBox2, BorderLayout.SOUTH);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab3Part4();
    }
}