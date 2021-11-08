package Lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab6Part3 extends JFrame implements ActionListener {

    JButton jButton;
    JProgressBar jProgressBar;

    public Lab6Part3(){
        setTitle("Lab6Part3");
        setSize(300, 300);
        setLayout(new BorderLayout());

        jButton = new JButton("Increase the progress bar");
        jButton.addActionListener(this);

        jProgressBar = new JProgressBar();
        jProgressBar.setMinimum(0);
        jProgressBar.setMaximum(100);

        add(jButton, BorderLayout.SOUTH);
        add(jProgressBar, BorderLayout.NORTH);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab6Part3();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == jButton){
            jProgressBar.setValue(jProgressBar.getValue() + 1);
        }
    }
}