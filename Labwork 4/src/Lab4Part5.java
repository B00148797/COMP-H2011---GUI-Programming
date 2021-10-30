import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab4Part5 extends JFrame implements ActionListener {

    float balance = 10;
    JPanel jPanel, jPanelButton;
    JLabel jLabelBalance;
    JButton jButtonTopUp, jButtonMakeCall, jButtonSendText;

    public Lab4Part5(){
        JFrame jFrame = new JFrame("Lab4Part5");
        jFrame.setSize(300, 300);
        jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());

        jPanelButton = new JPanel();

        jLabelBalance = new JLabel("Balance: 10€");

        jButtonTopUp = new JButton("Top-up");
        jButtonTopUp.addActionListener(this);
        jButtonMakeCall = new JButton("Make-call");
        jButtonMakeCall.addActionListener(this);
        jButtonSendText = new JButton("Send text");
        jButtonSendText.addActionListener(this);

        jPanel.add(jLabelBalance, BorderLayout.NORTH);
        jPanelButton.add(jButtonTopUp);
        jPanelButton.add(jButtonMakeCall);
        jPanelButton.add(jButtonSendText);
        jPanel.add(jPanelButton, BorderLayout.CENTER);

        jFrame.add(jPanel);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Lab4Part5 lab4Part5 = new Lab4Part5();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if (actionEvent.getSource().equals(jButtonTopUp)){
            balance += Pricing.TOP_UP.getPrice();
        }else if (actionEvent.getSource().equals(jButtonMakeCall)){
            balance -= Pricing.MAKE_CALL.getPrice();
        }
        else if (actionEvent.getSource().equals(jButtonSendText)){
            balance -= Pricing.SEND_TEXT.getPrice();
        }

        if (balance <= 0.5){
            jButtonMakeCall.setEnabled(false);
        }else if (balance <= 0){
            jButtonMakeCall.setEnabled(false);
            jButtonSendText.setEnabled(false);
        }else if (balance >= 1.0){
            jButtonMakeCall.setEnabled(true);
            jButtonSendText.setEnabled(true);
        }

        if (balance <= 0.5){
            jButtonMakeCall.setEnabled(false);
        }else if (balance >= 1.0){
            jButtonMakeCall.setEnabled(true);
            jButtonSendText.setEnabled(true);
        }

        if (balance <= 0 ){
            jButtonMakeCall.setEnabled(false);
            jButtonSendText.setEnabled(false);
        }

        jLabelBalance.setText("Balance: " + balance + "€");
    }
}