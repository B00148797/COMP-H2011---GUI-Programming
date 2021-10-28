import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab5Part2 extends JFrame implements ActionListener {

    JLabel jLabel;
    JMenuItem jMenuItemOrange, jMenuItemSFR, jMenuItemBouygues, jMenuItemFree;

    public Lab5Part2(){
        JFrame jFrame = new JFrame("Mobile networks");

        jFrame.setSize(300, 300);

        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenuFrenchOperator = new JMenu("French operator");

        jMenuItemOrange = new JMenuItem("Orange");
        jMenuItemOrange.addActionListener(this);
        jMenuFrenchOperator.add(jMenuItemOrange);

        jMenuItemSFR = new JMenuItem("SFR");
        jMenuItemSFR.addActionListener(this);
        jMenuFrenchOperator.add(jMenuItemSFR);

        jMenuItemBouygues = new JMenuItem("Bouygues Telecom");
        jMenuItemBouygues.addActionListener(this);
        jMenuFrenchOperator.add(jMenuItemBouygues);

        jMenuItemFree = new JMenuItem("Free");
        jMenuItemFree.addActionListener(this);
        jMenuFrenchOperator.add(jMenuItemFree);

        jMenuBar.add(jMenuFrenchOperator);

        jLabel = new JLabel("", SwingConstants.CENTER);
        jFrame.add(jLabel);

        jFrame.setJMenuBar(jMenuBar);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Lab5Part2 lab5Part2 = new Lab5Part2();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println(actionEvent.getActionCommand());
        switch (actionEvent.getActionCommand()){
            case "Orange":
                jLabel.setIcon(new ImageIcon(new ImageIcon("images/Orange.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));
                break;
            case "SFR":
                jLabel.setIcon(new ImageIcon(new ImageIcon("images/SFR.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));
                break;
            case "Bouygues Telecom":
                jLabel.setIcon(new ImageIcon(new ImageIcon("images/Bouygues Telecom.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));
                break;
            case "Free":
                jLabel.setIcon(new ImageIcon(new ImageIcon("images/Free.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));
                break;
            default:
                break;
        }
    }
}