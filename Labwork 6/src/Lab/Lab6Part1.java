package Lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab6Part1 extends JFrame implements ActionListener {

    JPanel jPanel1, jPanel2;
    JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6;

    public Lab6Part1(){
        setTitle("Lab6Part1");
        setSize(300, 300);
        setLayout(new BorderLayout());

        jPanel1 = new JPanel();
        jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.Y_AXIS));
        jPanel2 = new JPanel();
        jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.X_AXIS));

        add(jPanel1, BorderLayout.EAST);
        add(jPanel2, BorderLayout.WEST);

        jLabel1 = new JLabel("jLabel1");
        jLabel1.setBackground(Color.RED);
        jLabel1.setOpaque(true);
        jLabel2 = new JLabel("jLabel2");
        jLabel2.setBackground(Color.BLUE);
        jLabel2.setOpaque(true);
        jLabel3 = new JLabel("jLabel3");
        jLabel3.setBackground(Color.CYAN);
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel1);
        jPanel1.add(jLabel2);
        jPanel1.add(jLabel3);

        jLabel4 = new JLabel("jLabel4");
        jLabel4.setBackground(Color.YELLOW);
        jLabel4.setOpaque(true);
        jLabel5 = new JLabel("jLabel5");
        jLabel5.setBackground(Color.ORANGE);
        jLabel5.setOpaque(true);
        jLabel6 = new JLabel("jLabel6");
        jLabel6.setBackground(Color.GREEN);
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel4);
        jPanel2.add(jLabel5);
        jPanel2.add(jLabel6);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab6Part1();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}