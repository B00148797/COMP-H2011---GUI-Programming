import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab7Part4 extends JFrame implements ActionListener {

    JDesktopPane jDesktopPane;
    JInternalFrame jInternalFrame;
    JMenuBar jMenuBar;
    JMenu jMenuApp;
    JMenuItem jMenuItemFont, jMenuItemImage;

    public Lab7Part4(){
        setTitle("Lab7Part4");
        setSize(500, 500);

        jDesktopPane = new JDesktopPane();

        jMenuBar = new JMenuBar();
        jMenuApp = new JMenu("Apps");
        jMenuItemFont = new JMenuItem("Font App");
        jMenuItemFont.addActionListener(this);
        jMenuItemImage = new JMenuItem("Image App");
        jMenuItemImage.addActionListener(this);

        jMenuApp.add(jMenuItemFont);
        jMenuApp.add(jMenuItemImage);
        jMenuBar.add(jMenuApp);

        add(jDesktopPane);
        setJMenuBar(jMenuBar);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab7Part4();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == jMenuItemFont){
            jInternalFrame = new JInternalFrame("Font", false, true, true, true);
            jInternalFrame.setSize(100, 100);

            JPanel jPanel = new JPanel();
            jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));

            JLabel jLabel1 = new JLabel("Yesterday outside, today I'm inside", SwingConstants.CENTER);
            jLabel1.setFont(new Font("Raleway", Font.BOLD, 20));
            jPanel.add(jLabel1);

            JLabel jLabel2 = new JLabel("Slicked back hair, I take the little dance step", SwingConstants.CENTER);
            jLabel2.setFont(new Font("Lobster", Font.ITALIC, 20));
            jPanel.add(jLabel2);

            jInternalFrame.add(jPanel);
            jInternalFrame.setVisible(true);
            jDesktopPane.add(jInternalFrame);

        }else if(actionEvent.getSource() == jMenuItemImage){
            jInternalFrame = new JInternalFrame("Font", false, true, true, true);
            jInternalFrame.setSize(100, 100);

            JLabel jLabel = new JLabel(new ImageIcon("images/Terrariums.png"));
            jLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

            jInternalFrame.add(jLabel);
            jInternalFrame.setVisible(true);
            jDesktopPane.add(jInternalFrame);
        }
    }
}