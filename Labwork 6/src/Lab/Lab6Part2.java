package Lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab6Part2 extends JFrame implements ActionListener {

    CardLayout cardLayout;
    JPanel jPanelMain, jPanel1, jPanel2, jPanel3;
    JButton jButtonNext1, jButtonNext2, jButtonNext3;

    public Lab6Part2(){
        setTitle("Lab6Part2");
        setSize(300, 300);
        setLayout(new BorderLayout());

        jPanelMain = new JPanel();
        cardLayout = new CardLayout();
        jPanelMain.setLayout(cardLayout);

        jButtonNext1 = new JButton("Next");
        jButtonNext1.addActionListener(this);
        jButtonNext2 = new JButton("Next");
        jButtonNext2.addActionListener(this);
        jButtonNext3 = new JButton("Next");
        jButtonNext3.addActionListener(this);

        jPanel1 = new JPanel();
        jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.Y_AXIS));
        jPanel1.add(new JLabel(new ImageIcon("images/Acasia.png")));
        jPanel1.add(jButtonNext1);

        jPanel2 = new JPanel();
        jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.Y_AXIS));
        jPanel2.add(new JLabel(new ImageIcon("images/Caduques.png")));
        jPanel2.add(jButtonNext2);

        jPanel3 = new JPanel();
        jPanel3.setLayout(new BoxLayout(jPanel3, BoxLayout.Y_AXIS));
        jPanel3.add(new JLabel(new ImageIcon("images/Saule.png")));
        jPanel3.add(jButtonNext3);

        jPanelMain.add(jPanel1);
        jPanelMain.add(jPanel2);
        jPanelMain.add(jPanel3);

        add(jPanelMain);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab6Part2();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object o = actionEvent.getSource();
        if (o == jButtonNext1 || o == jButtonNext2 || o == jButtonNext3){
            cardLayout.next(jPanelMain);
        }
    }
}