import javax.swing.*;
import java.awt.*;

public class Lab3Part5 extends JFrame {

    JLabel jLabelTitle, jLabelInfoScreen, imageIcon;
    JButton jButtonWITHDRAW, jButtonDEPOSIT, jButtonTRANSFER, jButtonBALANCES, jButtonINFO, jButtonINVESTMENTS;
    JPanel jPanelLeft, jPanelRight;

    public Lab3Part5(){
        setTitle("Lab3Part5");
        setSize(500, 500);

        jLabelTitle = new JLabel("ATM - TU Dublin", SwingConstants.CENTER);
        jLabelTitle.setFont(new Font("Raleway", Font.BOLD, 40));
        jLabelInfoScreen = new JLabel("Choose an action on the touchscreen :");

        //Pannel left
        jPanelLeft = new JPanel();
        jPanelLeft.setLayout(new BoxLayout(jPanelLeft, BoxLayout.Y_AXIS));

        jButtonWITHDRAW = new JButton("WITHDRAW", new ImageIcon("images/Logo Cercle.png"));
        jButtonDEPOSIT = new JButton("DEPOSIT", new ImageIcon("images/Logo Cercle.png"));
        jButtonTRANSFER = new JButton("TRANSFER", new ImageIcon("images/Logo Cercle.png"));

        jPanelLeft.add(jButtonWITHDRAW);
        jPanelLeft.add(jButtonDEPOSIT);
        jPanelLeft.add(jButtonTRANSFER);

        //Pannel right
        jPanelRight = new JPanel();
        jPanelRight.setLayout(new BoxLayout(jPanelRight, BoxLayout.Y_AXIS));

        jButtonBALANCES = new JButton("BALANCES", new ImageIcon("images/Logo Cercle.png"));
        jButtonINFO = new JButton("INFO", new ImageIcon("images/Logo Cercle.png"));
        jButtonINVESTMENTS = new JButton("INVESTMENTS", new ImageIcon("images/Logo Cercle.png"));

        jPanelRight.add(jButtonBALANCES);
        jPanelRight.add(jButtonINFO);
        jPanelRight.add(jButtonINVESTMENTS);

        imageIcon = new JLabel(new ImageIcon("images/Logo Euro.png"));

        add(imageIcon, BorderLayout.CENTER);
        add(jLabelTitle, BorderLayout.NORTH);
        add(jPanelLeft, BorderLayout.WEST);
        add(jPanelRight, BorderLayout.EAST);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab3Part5();
    }
}