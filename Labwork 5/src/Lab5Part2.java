import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab5Part2 extends JFrame implements ActionListener {

    public Lab5Part2(){
        JFrame jFrame = new JFrame("Mobile networks");

        jFrame.setSize(300, 300);

        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenuFrenchOperator = new JMenu("French operator");

        JMenuItem jMenuItemOrange = new JMenuItem("Orange");
        jMenuItemOrange.addActionListener(this);
        jMenuFrenchOperator.add(jMenuItemOrange);

        JMenuItem jMenuItemSFR = new JMenuItem("SFR");
        jMenuItemSFR.addActionListener(this);
        jMenuFrenchOperator.add(jMenuItemSFR);

        JMenuItem jMenuItemBouygues = new JMenuItem("Bouygues Telecom");
        jMenuItemBouygues.addActionListener(this);
        jMenuFrenchOperator.add(jMenuItemBouygues);

        JMenuItem jMenuItemFree = new JMenuItem("Free");
        jMenuItemFree.addActionListener(this);
        jMenuFrenchOperator.add(jMenuItemFree);

        jMenuBar.add(jMenuFrenchOperator);

        jFrame.setJMenuBar(jMenuBar);

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Lab5Part2 myLab5Part2 = new Lab5Part2();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println(actionEvent.getActionCommand());
        switch (actionEvent.getActionCommand()){
            case "Orange":
                break;
            case "SRF":
                break;
            case "Bouygues Telecom":
                break;
            case "Free":
                break;
            default:
                break;
        }
    }
}