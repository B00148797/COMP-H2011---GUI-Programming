import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab7Part1 extends JFrame implements ActionListener {

    JInternalFrame jInternalFrame;
    JPanel jPanel1, jPanel2, jPanel3;

    public Lab7Part1(){
        setTitle("Lab7Part1");
        setSize(500, 500);

        jInternalFrame = new JInternalFrame("Lab7Part1 - A");
        jInternalFrame.setSize(500, 500);
        jInternalFrame.setVisible(true);

        jPanel3 = new JPanel();
        jPanel3.setLayout(new BoxLayout(jPanel3, BoxLayout.Y_AXIS));

        jPanel1 = new JPanel();
        jPanel1.setBackground(Color.RED);
        jPanel1.setSize(jInternalFrame.getWidth(), jInternalFrame.getHeight()/2);

        jPanel2 = new JPanel();
        jPanel2.setBackground(Color.BLUE);
        jPanel2.setSize(jInternalFrame.getWidth(), jInternalFrame.getHeight()/2);

        jPanel3.add(jPanel1);
        jPanel3.add(jPanel2);

        jInternalFrame.add(jPanel3);

        add(jInternalFrame);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab7Part1();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}