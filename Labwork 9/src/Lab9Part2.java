import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab9Part2 extends JFrame implements ActionListener {

    JButton jButton, jButtonChoose;
    JComboBox jComboBox;
    JLabel jLabelImage;

    public Lab9Part2(){
        setTitle("Lab9Part2");
        setSize(500, 500);

        jButton = new JButton("Launch a JDialog");
        jButton.addActionListener(this);
        add(jButton);

        jButtonChoose = new JButton("Choose...");
        jButtonChoose.addActionListener(this);

        String activity[] = {"Swim", "Sleep", "Eat", "Drink"};
        jComboBox = new JComboBox<String>(activity);

        jLabelImage = new JLabel();

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab9Part2();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == jButton){
            JDialog jDialog = new JDialog(this, "Choose your favorite activity");
            jDialog.setSize(300, 200);
            JPanel jPanel = new JPanel();
            jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
            jPanel.add(jComboBox);
            jPanel.add(jButtonChoose);
            jDialog.add(jPanel);

            jDialog.setVisible(true);

        }else if(actionEvent.getSource() == jButtonChoose){
            JDialog jDialog = new JDialog(this, "You are choose: ");
            jDialog.setSize(300, 200);
            jLabelImage.setText(jComboBox.getSelectedItem().toString());
            jDialog.add(jLabelImage);

            jDialog.setVisible(true);
        }

    }
}