import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Lab5Part5 extends JFrame implements ActionListener {

    JMenuBar jMenuBar;
    JMenu jMenuLeft, jMenuRight;
    JMenuItem jMenuItemWITHDRAW, jMenuItemDEPOSIT, jMenuItemTRANSFER, jMenuItemBALANCES, jMenuItemINFO, jMenuItemINVESTMENTS;
    JButton jButtonWITHDRAW, jButtonDEPOSIT, jButtonTRANSFER, jButtonBALANCES, jButtonINFO, jButtonINVESTMENTS;
    JLabel jLabelInfoScreen, jLabelTitle;

    public Lab5Part5(){
        setTitle("Lab5Part5");
        setSize(500, 500);

        jMenuBar = new JMenuBar();
        jMenuLeft = new JMenu("Left menu");
        jMenuRight = new JMenu("Right menu");

        KeyStroke ctrlA = KeyStroke.getKeyStroke(KeyEvent.VK_A, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask());
        KeyStroke ctrlZ = KeyStroke.getKeyStroke(KeyEvent.VK_Z, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask());
        KeyStroke ctrlE = KeyStroke.getKeyStroke(KeyEvent.VK_E, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask());

        KeyStroke ctrlR = KeyStroke.getKeyStroke(KeyEvent.VK_R, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask());
        KeyStroke ctrlT = KeyStroke.getKeyStroke(KeyEvent.VK_T, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask());
        KeyStroke ctrlY = KeyStroke.getKeyStroke(KeyEvent.VK_Y, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask());

        jMenuItemWITHDRAW = new JMenuItem("Withdraw");
        jMenuItemWITHDRAW.setAccelerator(ctrlA);
        jMenuItemWITHDRAW.addActionListener(this);

        jMenuItemDEPOSIT = new JMenuItem("Deposit");
        jMenuItemDEPOSIT.setAccelerator(ctrlZ);
        jMenuItemDEPOSIT.addActionListener(this);

        jMenuItemTRANSFER = new JMenuItem("Transfer");
        jMenuItemTRANSFER.setAccelerator(ctrlE);
        jMenuItemTRANSFER.addActionListener(this);

        jMenuItemBALANCES = new JMenuItem("Balance");
        jMenuItemBALANCES.setAccelerator(ctrlR);
        jMenuItemBALANCES.addActionListener(this);

        jMenuItemINFO = new JMenuItem("Info");
        jMenuItemINFO.setAccelerator(ctrlT);
        jMenuItemINFO.addActionListener(this);

        jMenuItemINVESTMENTS = new JMenuItem("Investments");
        jMenuItemINVESTMENTS.setAccelerator(ctrlY);
        jMenuItemINVESTMENTS.addActionListener(this);

        jMenuLeft.add(jMenuItemWITHDRAW);
        jMenuLeft.add(jMenuItemDEPOSIT);
        jMenuLeft.add(jMenuItemTRANSFER);
        jMenuRight.add(jMenuItemBALANCES);
        jMenuRight.add(jMenuItemINFO);
        jMenuRight.add(jMenuItemINVESTMENTS);

        jMenuBar.add(jMenuLeft);
        jMenuBar.add(jMenuRight);

        jLabelTitle = new JLabel("ATM - TU Dublin", SwingConstants.CENTER);
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

        setJMenuBar(jMenuBar);
        add(imageIcon, BorderLayout.CENTER);
        add(jLabelTitle, BorderLayout.NORTH);
        add(jLabelInfoScreen, BorderLayout.SOUTH);
        add(jPanelLeft, BorderLayout.WEST);
        add(jPanelRight, BorderLayout.EAST);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
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