import javax.swing.*;
import java.awt.*;

public class Lab3Par5_v2 extends JFrame{

    JPanel jPanelTop, jPanelRight, jPanelLeft, jPanelBottom, jPanelCenter;
    Button buttonAccept, buttonCancel, buttonHelp;
    JLabel jLabelImage, jLabel;

    public Lab3Par5_v2(){
        setTitle("ATM Machine");
        setSize(500, 500);
        setLocationRelativeTo(null);

        jPanelTop = new JPanel(new BorderLayout());
        jPanelTop.add(new Button("Add cash"), BorderLayout.EAST);
        jPanelTop.add(new Button("Return cash"), BorderLayout.WEST);

        jPanelRight = new JPanel();
        jPanelRight.setLayout(new BoxLayout(jPanelRight, BoxLayout.Y_AXIS));
        jPanelRight.add(new Button("10€"));
        jPanelRight.add(new Button("20€"));
        jPanelRight.add(new Button("50€"));

        jPanelLeft = new JPanel();
        jPanelLeft.setLayout(new BoxLayout(jPanelLeft, BoxLayout.Y_AXIS));
        jPanelLeft.add(new Button("100€"));
        jPanelLeft.add(new Button("200€"));
        jPanelLeft.add(new Button("500€"));

        jPanelBottom = new JPanel();
        jPanelBottom.setLayout(new BoxLayout(jPanelBottom, BoxLayout.X_AXIS));
        buttonAccept = new Button("Accept");
        buttonAccept.setBackground(Color.GREEN);
        jPanelBottom.add(buttonAccept);
        buttonCancel = new Button("Cancel");
        buttonCancel.setBackground(Color.RED);
        jPanelBottom.add(buttonCancel);
        buttonHelp = new Button("Help");
        buttonHelp.setBackground(Color.BLUE);
        jPanelBottom.add(buttonHelp);

        jPanelCenter = new JPanel();
        jPanelCenter.setLayout(new BoxLayout(jPanelCenter, BoxLayout.Y_AXIS));
        jLabelImage = new JLabel(new ImageIcon("images/logo aib.png"), SwingConstants.CENTER);
        jLabelImage.setAlignmentX(Component.CENTER_ALIGNMENT);
        jPanelCenter.add(jLabelImage);
        jLabel = new JLabel("Please select option", SwingConstants.CENTER);
        jLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        jPanelCenter.add(jLabel);

        add(jPanelCenter, BorderLayout.CENTER);
        add(jPanelTop, BorderLayout.NORTH);
        add(jPanelRight, BorderLayout.WEST);
        add(jPanelLeft, BorderLayout.EAST);
        add(jPanelBottom, BorderLayout.SOUTH);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab3Par5_v2();
    }
}