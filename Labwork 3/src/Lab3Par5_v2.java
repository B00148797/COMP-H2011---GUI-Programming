import javax.swing.*;
import java.awt.*;

public class Lab3Par5_v2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("ATM Machine");
        jFrame.setSize(500, 500);
        jFrame.setLocationRelativeTo(null);

        JPanel jPanelTop = new JPanel(new BorderLayout());
        jPanelTop.add(new Button("Ajouter argents"), BorderLayout.EAST);
        jPanelTop.add(new Button("Retirer argents"), BorderLayout.WEST);

        JPanel jPanelRight = new JPanel();
        jPanelRight.setLayout(new BoxLayout(jPanelRight, BoxLayout.Y_AXIS));
        jPanelRight.add(new Button("10€"));
        jPanelRight.add(new Button("20€"));
        jPanelRight.add(new Button("50€"));

        JPanel jPanelLeft = new JPanel();
        jPanelLeft.setLayout(new BoxLayout(jPanelLeft, BoxLayout.Y_AXIS));
        jPanelLeft.add(new Button("100€"));
        jPanelLeft.add(new Button("200€"));
        jPanelLeft.add(new Button("500€"));

        JPanel jPanelBottom = new JPanel();
        jPanelBottom.setLayout(new BoxLayout(jPanelBottom, BoxLayout.X_AXIS));
        Button buttonAccept = new Button("Accept");
        buttonAccept.setBackground(Color.GREEN);
        jPanelBottom.add(buttonAccept);
        Button buttonCancel = new Button("Cancel");
        buttonCancel.setBackground(Color.RED);
        jPanelBottom.add(buttonCancel);
        Button buttonHelp = new Button("Help");
        buttonHelp.setBackground(Color.BLUE);
        jPanelBottom.add(buttonHelp);

        JPanel jPanelCenter = new JPanel();
        jPanelCenter.setLayout(new BoxLayout(jPanelCenter, BoxLayout.Y_AXIS));
        JLabel jLabelImage = new JLabel(new ImageIcon("images/logo aib.png"), SwingConstants.CENTER);
        jLabelImage.setAlignmentX(Component.CENTER_ALIGNMENT);
        jPanelCenter.add(jLabelImage);
        JLabel jLabel = new JLabel("Please select option", SwingConstants.CENTER);
        jLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        jPanelCenter.add(jLabel);

        jFrame.add(jPanelCenter, BorderLayout.CENTER);
        jFrame.add(jPanelTop, BorderLayout.NORTH);
        jFrame.add(jPanelRight, BorderLayout.WEST);
        jFrame.add(jPanelLeft, BorderLayout.EAST);
        jFrame.add(jPanelBottom, BorderLayout.SOUTH);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
