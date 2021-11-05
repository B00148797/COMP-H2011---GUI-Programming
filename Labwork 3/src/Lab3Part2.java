import javax.swing.*;

public class Lab3Part2 extends JFrame {

    JLabel jLabelAddress, jLabelPostal, jLabelCity, jLabelCountry;
    JTextField jTextFieldAddress, jTextFieldPostal, jTextFieldCity, jTextFieldCountry;

    public Lab3Part2(){
        setTitle("Lab3Part2");
        setSize(300, 300);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        //Blanchardstown Rd N, Blanchardstown, Dublin, D15 YV78
        jLabelAddress = new JLabel("Address:");
        jTextFieldAddress = new JTextField("TU-Dublin Blanchardstown Rd N");

        jLabelPostal = new JLabel("Postal code:");
        jTextFieldPostal = new JTextField("D15 YV78");

        jLabelCity = new JLabel("City:");
        jTextFieldCity = new JTextField("Dublin");

        jLabelCountry = new JLabel("Country:");
        jTextFieldCountry = new JTextField("Irlande");

        add(jLabelAddress);
        add(jTextFieldAddress);
        add(jLabelPostal);
        add(jTextFieldPostal);
        add(jLabelCity);
        add(jTextFieldCity);
        add(jLabelCountry);
        add(jTextFieldCountry);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab3Part2();
    }
}