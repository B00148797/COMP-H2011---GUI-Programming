import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab7Part3 extends JFrame implements ActionListener {

    JInternalFrame jInternalFrame;
    JDesktopPane jDesktopPane;
    JPanel jPanel;
    JButton jButton;

    public Lab7Part3() {
        setTitle("Lab7Part3");
        setSize(500, 500);

        jDesktopPane = new JDesktopPane();

        jInternalFrame = new JInternalFrame("My title sucks...", true, true, true, true);
        jInternalFrame.setSize(300, 300);
        jInternalFrame.setVisible(true);

        jButton = new JButton("Change title!");
        jButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButton.addActionListener(this);

        jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        jPanel.add(jButton);

        jInternalFrame.add(jPanel);

        jDesktopPane.add(jInternalFrame);

        add(jDesktopPane);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab7Part3();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String sentences = "The title changed by pushing the Internal Frame button";
        if (actionEvent.getSource() == jButton) {
            jInternalFrame.setTitle(sentences);
            setTitle(sentences);
        }
    }
}