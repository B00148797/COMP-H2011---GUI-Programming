import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab7Part1 extends JFrame implements ActionListener {

    JInternalFrame jInternalFrame;
    JDesktopPane jDesktopPane;
    JPanel jPanel1, jPanel2;

    public Lab7Part1(){
        setTitle("Lab7Part1");
        setSize(500, 500);

        jInternalFrame = new JInternalFrame("JInternalFrame");
        jInternalFrame.setSize(500, 500);
        jInternalFrame.setVisible(true);

        jDesktopPane = new JDesktopPane();

        jPanel1 = new JPanel();
        jPanel1.setBackground(Color.RED);

        jPanel2 = new JPanel();
        jPanel2.setBackground(Color.BLUE);

        jDesktopPane.add(jPanel1);
        jDesktopPane.add(jPanel2);

        jInternalFrame.add(jDesktopPane);

        add(jInternalFrame);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jPanel1.setSize(jDesktopPane.getWidth(), jDesktopPane.getHeight()/2);
        jPanel2.setLocation(0, jDesktopPane.getHeight()/2);
        jPanel2.setSize(jDesktopPane.getWidth(), jDesktopPane.getHeight()/2);
    }

    public static void main(String[] args) {
        new Lab7Part1();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}