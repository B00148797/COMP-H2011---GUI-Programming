package Lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab6Part5 extends JFrame implements ActionListener {

    CardLayout cardLayout;
    JPanel jPanelMain, jPanel1, jPanel2, jPanel3, jPanel4;
    JButton jButtonNext1, jButtonNext2, jButtonNext3;
    JRadioButton jRadioButtonIceYes, jRadioButtonIceNo;
    JCheckBox jCheckBox1, jCheckBox2, jCheckBox3, jCheckBox4, jCheckBox5;
    ButtonGroup buttonGroup;
    JList<String> stringJListDrink, stringJListMenu;
    JComboBox<String> stringJComboBoxAccompaniement;

    JTextArea jTextAreaMenuClient;

    public Lab6Part5(){
        setTitle("Lab6Part5");
        setSize(500, 500);
        setLayout(new BorderLayout());

        jPanelMain = new JPanel();
        cardLayout = new CardLayout();
        jPanelMain.setLayout(cardLayout);

        jTextAreaMenuClient = new JTextArea();
        jTextAreaMenuClient.setLineWrap(true);

        jButtonNext1 = new JButton("Next");
        jButtonNext1.addActionListener(this);
        jButtonNext2 = new JButton("Next");
        jButtonNext2.addActionListener(this);
        jButtonNext3 = new JButton("Next");
        jButtonNext3.addActionListener(this);

        jPanel1 = new JPanel();
        jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.Y_AXIS));
        String[] menuBurger = {"Menu Steakhouse", "Menu Whopper", "Menu Big King", "Menu Long Chicken", "Menu BBQ Cheese & Bacon", "Menu Wrap Louisiane"};
        jPanel1.add(new JLabel("Choose your menu:", SwingConstants.CENTER));
        stringJListMenu = new JList<>(menuBurger);
        jPanel1.add(stringJListMenu);
        jPanel1.add(jButtonNext1);

        jPanel2 = new JPanel();
        jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.Y_AXIS));
        String[] chooseDrink = {"Coca-Cola", "Sprite", "Orangina", "Water", "Beer"};
        jPanel2.add(new JLabel("Choose your drink:", SwingConstants.CENTER));
        stringJListDrink = new JList<>(chooseDrink);
        jPanel2.add(stringJListDrink);
        jPanel2.add(new JLabel("Do you want ice cubes ?", SwingConstants.CENTER));
        buttonGroup = new ButtonGroup();
        jRadioButtonIceYes = new JRadioButton("Yes");
        jRadioButtonIceYes.setSelected(true);
        jRadioButtonIceNo = new JRadioButton("No");
        buttonGroup.add(jRadioButtonIceYes);
        buttonGroup.add(jRadioButtonIceNo);
        jPanel2.add(jRadioButtonIceYes);
        jPanel2.add(jRadioButtonIceNo);
        jPanel2.add(jButtonNext2);

        jPanel3 = new JPanel();
        jPanel3.setLayout(new BoxLayout(jPanel3, BoxLayout.Y_AXIS));
        String[] chooseAccompaniement = {"Fries", "Onion Rings", "King Fries Cheese & Bacon", "King Fries Cheese & Crispy Onions"};
        jPanel3.add(new JLabel("Choose your accompaniement:", SwingConstants.CENTER));
        stringJComboBoxAccompaniement = new JComboBox<>(chooseAccompaniement);
        jPanel3.add(stringJComboBoxAccompaniement);
        jPanel3.add(new JLabel("Choose your sauce:", SwingConstants.CENTER));
        jCheckBox1 = new JCheckBox("Ketchup");
        jCheckBox2 = new JCheckBox("Mayonnaise");
        jCheckBox3 = new JCheckBox("Spicy Andalouse");
        jCheckBox4 = new JCheckBox("Sauce Curry Mango");
        jCheckBox5 = new JCheckBox("Sauce Chili Cheese");
        jPanel3.add(jCheckBox1);
        jPanel3.add(jCheckBox2);
        jPanel3.add(jCheckBox3);
        jPanel3.add(jCheckBox4);
        jPanel3.add(jCheckBox5);
        jPanel3.add(jButtonNext3);


        jPanel4 = new JPanel();
        jPanel4.setLayout(new BoxLayout(jPanel4, BoxLayout.Y_AXIS));
        jPanel4.add(jTextAreaMenuClient);

        jPanelMain.add(jPanel1);
        jPanelMain.add(jPanel2);
        jPanelMain.add(jPanel3);
        jPanelMain.add(jPanel4);

        add(jPanelMain, BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab6Part5();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        cardLayout.next(jPanelMain);

        String iceBlock;
        if (jRadioButtonIceYes.isSelected()){
            iceBlock = " with ice cubes";
        }else{
            iceBlock = " without ice cubes";
        }

        String sauceSelected = "";
        if (jCheckBox1.isSelected()) sauceSelected += "[" + jCheckBox1.getText() + "]";
        if (jCheckBox2.isSelected()) sauceSelected += "[" + jCheckBox2.getText() + "]";
        if (jCheckBox3.isSelected()) sauceSelected += "[" + jCheckBox3.getText() + "]";
        if (jCheckBox4.isSelected()) sauceSelected += "[" + jCheckBox4.getText() + "]";
        if (jCheckBox5.isSelected()) sauceSelected += "[" + jCheckBox5.getText() + "]";

        jTextAreaMenuClient.setText("You have chosen the menu: " + "\n\t" + stringJListMenu.getSelectedValue() + "\n\n"
                + "You are going to drink a: " + "\n\t" + stringJListDrink.getSelectedValue() + iceBlock + "\n\n"
                + "As an accompaniment you will have: " + "\n\t" + stringJComboBoxAccompaniement.getItemAt(stringJComboBoxAccompaniement.getSelectedIndex()) + "\n\n"
                + "with the following sauce: " + "\n\t" + sauceSelected + "\n\n"
                + "We wish you a good appetite!"
        );
    }
}