import javax.swing.*;

public class Lab3Part2 extends JFrame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Lab3Part2");

        jFrame.setSize(300, 300);

        jFrame.setLayout(new BoxLayout(jFrame.getContentPane(), BoxLayout.Y_AXIS));

        //Blanchardstown Rd N, Blanchardstown, Dublin, D15 YV78
        JLabel jLabelAddress = new JLabel("Address:");
        JTextField jTextFieldAddress = new JTextField("TU-Dublin Blanchardstown Rd N");

        JLabel jLabelPostal = new JLabel("Postal code:");
        JTextField jTextFieldPostal = new JTextField("D15 YV78");

        JLabel jLabelCity = new JLabel("City:");
        JTextField jTextFieldCity = new JTextField("Dublin");

        JLabel jLabelCountry = new JLabel("Country:");
        JTextField jTextFieldCountry = new JTextField("Irlande");

        jFrame.add(jLabelAddress);
        jFrame.add(jTextFieldAddress);
        jFrame.add(jLabelPostal);
        jFrame.add(jTextFieldPostal);
        jFrame.add(jLabelCity);
        jFrame.add(jTextFieldCity);
        jFrame.add(jLabelCountry);
        jFrame.add(jTextFieldCountry);

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
