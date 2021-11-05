import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Lab4Part4 extends JFrame implements ActionListener, WindowListener {

    JPanel jPanel;
    JLabel jLabel;

    public Lab4Part4(){
        setTitle("Lab4Part4");
        setSize(300, 300);
        jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());

        jLabel = new JLabel("Events appear here");
        jPanel.add(jLabel, BorderLayout.NORTH);

        addWindowListener(this);

        add(jPanel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab4Part4();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {

    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {

    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {

    }

    @Override
    public void windowIconified(WindowEvent windowEvent) {

    }

    @Override
    public void windowDeiconified(WindowEvent windowEvent) {
        jLabel.setText("You minimized the window and then reopened");
    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {

    }

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {

    }
}