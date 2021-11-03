package Lab;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab6Part1 extends JFrame implements ActionListener {

    public Lab6Part1(){
        JFrame jFrame = new JFrame("Lab.Lab6Part1");
        jFrame.setSize(300, 300);





        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Lab6Part1 lab6Part1 = new Lab6Part1();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}