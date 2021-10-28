import javax.swing.*;
import java.awt.*;

public class Lab3Part5 extends JFrame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Lab3Part5");

        jFrame.setSize(500, 500);

        JLabel jLabelTitle = new JLabel("ATM - TU Dublin", SwingConstants.CENTER);
        jLabelTitle.setFont(new Font("Raleway", Font.BOLD, 40));
        JLabel jLabelInfoScreen = new JLabel("Choose an action on the touchscreen :");

        //Pannel left
        JPanel jPanelLeft = new JPanel();
        jPanelLeft.setLayout(new BoxLayout(jPanelLeft, BoxLayout.Y_AXIS));

        JButton jButtonWITHDRAW = new JButton("WITHDRAW", new ImageIcon("images/Logo Cercle.png"));
        JButton jButtonDEPOSIT = new JButton("DEPOSIT", new ImageIcon("images/Logo Cercle.png"));
        JButton jButtonTRANSFER = new JButton("TRANSFER", new ImageIcon("images/Logo Cercle.png"));

        jPanelLeft.add(jButtonWITHDRAW);
        jPanelLeft.add(jButtonDEPOSIT);
        jPanelLeft.add(jButtonTRANSFER);

        //Pannel right
        JPanel jPanelRight = new JPanel();
        jPanelRight.setLayout(new BoxLayout(jPanelRight, BoxLayout.Y_AXIS));

        JButton jButtonBALANCES = new JButton("BALANCES", new ImageIcon("images/Logo Cercle.png"));
        JButton jButtonINFO = new JButton("INFO", new ImageIcon("images/Logo Cercle.png"));
        JButton jButtonINVESTMENTS = new JButton("INVESTMENTS", new ImageIcon("images/Logo Cercle.png"));

        jPanelRight.add(jButtonBALANCES);
        jPanelRight.add(jButtonINFO);
        jPanelRight.add(jButtonINVESTMENTS);

        JLabel imageIcon = new JLabel(new ImageIcon("images/Logo Euro.png"));

        jFrame.add(imageIcon, BorderLayout.CENTER);
        jFrame.add(jLabelTitle, BorderLayout.NORTH);
        jFrame.add(jPanelLeft, BorderLayout.WEST);
        jFrame.add(jPanelRight, BorderLayout.EAST);

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
