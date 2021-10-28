import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab5Part5 extends JFrame implements ActionListener {

    JMenuItem jMenuItemWITHDRAW, jMenuItemDEPOSIT, jMenuItemTRANSFER, jMenuItemBALANCES, jMenuItemINFO, jMenuItemINVESTMENTS;
    JButton jButtonWITHDRAW, jButtonDEPOSIT, jButtonTRANSFER, jButtonBALANCES, jButtonINFO, jButtonINVESTMENTS;
    JLabel jLabelInfoScreen;

    public Lab5Part5(){
        JFrame jFrame = new JFrame("Lab5Part5");

        jFrame.setSize(500, 500);

        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenuLeft = new JMenu("Left menu");
        JMenu jMenuRight = new JMenu("Right menu");

        jMenuItemWITHDRAW = new JMenuItem("Withdraw");
        jMenuItemWITHDRAW.addActionListener(this);
        jMenuItemDEPOSIT = new JMenuItem("Deposit");
        jMenuItemDEPOSIT.addActionListener(this);
        jMenuItemTRANSFER = new JMenuItem("Transfer");
        jMenuItemTRANSFER.addActionListener(this);
        jMenuItemBALANCES = new JMenuItem("Balance");
        jMenuItemBALANCES.addActionListener(this);
        jMenuItemINFO = new JMenuItem("Info");
        jMenuItemINFO.addActionListener(this);
        jMenuItemINVESTMENTS = new JMenuItem("Investments");
        jMenuItemINVESTMENTS.addActionListener(this);

        jMenuLeft.add(jMenuItemWITHDRAW);
        jMenuLeft.add(jMenuItemDEPOSIT);
        jMenuLeft.add(jMenuItemTRANSFER);
        jMenuRight.add(jMenuItemBALANCES);
        jMenuRight.add(jMenuItemINFO);
        jMenuRight.add(jMenuItemINVESTMENTS);

        jMenuBar.add(jMenuLeft);
        jMenuBar.add(jMenuRight);

        JLabel jLabelTitle = new JLabel("ATM - TU Dublin", SwingConstants.CENTER);
        jLabelTitle.setFont(new Font("Raleway", Font.BOLD, 40));
        jLabelInfoScreen = new JLabel("? Choose an action on the touchscreen ?", SwingConstants.CENTER);

        //Pannel left
        JPanel jPanelLeft = new JPanel();
        jPanelLeft.setLayout(new BoxLayout(jPanelLeft, BoxLayout.Y_AXIS));

        jButtonWITHDRAW = new JButton("WITHDRAW", new ImageIcon("images/Logo Cercle.png"));
        jButtonWITHDRAW.setHorizontalTextPosition(SwingConstants.LEFT);
        jButtonWITHDRAW.addActionListener(this);
        jButtonDEPOSIT = new JButton("DEPOSIT", new ImageIcon("images/Logo Cercle.png"));
        jButtonDEPOSIT.setHorizontalTextPosition(SwingConstants.LEFT);
        jButtonDEPOSIT.addActionListener(this);
        jButtonTRANSFER = new JButton("TRANSFER", new ImageIcon("images/Logo Cercle.png"));
        jButtonTRANSFER.setHorizontalTextPosition(SwingConstants.LEFT);
        jButtonTRANSFER.addActionListener(this);

        jPanelLeft.add(jButtonWITHDRAW);
        jPanelLeft.add(jButtonDEPOSIT);
        jPanelLeft.add(jButtonTRANSFER);

        //Pannel right
        JPanel jPanelRight = new JPanel();
        jPanelRight.setLayout(new BoxLayout(jPanelRight, BoxLayout.Y_AXIS));

        jButtonBALANCES = new JButton("BALANCES", new ImageIcon("images/Logo Cercle.png"));
        jButtonBALANCES.addActionListener(this);
        jButtonINFO = new JButton("INFO", new ImageIcon("images/Logo Cercle.png"));
        jButtonINFO.addActionListener(this);
        jButtonINVESTMENTS = new JButton("INVESTMENTS", new ImageIcon("images/Logo Cercle.png"));
        jButtonINVESTMENTS.addActionListener(this);

        jPanelRight.add(jButtonBALANCES);
        jPanelRight.add(jButtonINFO);
        jPanelRight.add(jButtonINVESTMENTS);

        JLabel imageIcon = new JLabel(new ImageIcon("images/Logo Euro.png"));

        jFrame.setJMenuBar(jMenuBar);
        jFrame.add(imageIcon, BorderLayout.CENTER);
        jFrame.add(jLabelTitle, BorderLayout.NORTH);
        jFrame.add(jLabelInfoScreen, BorderLayout.SOUTH);
        jFrame.add(jPanelLeft, BorderLayout.WEST);
        jFrame.add(jPanelRight, BorderLayout.EAST);

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Lab5Part5 lab5Part5 = new Lab5Part5();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object o = actionEvent.getSource();
        String defaultString = "? Choose an action on the touchscreen ?";
        System.out.println(actionEvent.getActionCommand());

        if (o == jMenuItemWITHDRAW || o == jButtonWITHDRAW){
            jLabelInfoScreen.setText(defaultString + " Options selector: Withdraw");
        }else if(o == jMenuItemDEPOSIT || o == jButtonDEPOSIT){
            jLabelInfoScreen.setText(defaultString + " Options selector: Deposit");
        }else if(o == jMenuItemTRANSFER || o == jButtonTRANSFER){
            jLabelInfoScreen.setText(defaultString + " Options selector: Transfer");
        }else if(o == jMenuItemBALANCES || o == jButtonBALANCES){
            jLabelInfoScreen.setText(defaultString + " Options selector: Balence");
        }else if(o == jMenuItemINFO || o == jButtonINFO){
            jLabelInfoScreen.setText(defaultString + " Options selector: Info");
        }else if(o == jMenuItemINVESTMENTS || o == jButtonINVESTMENTS){
            jLabelInfoScreen.setText(defaultString + " Options selector: Investments");
        }
    }
}