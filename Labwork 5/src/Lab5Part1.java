import javax.swing.*;
import java.awt.*;

public class Lab5Part1 extends JFrame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Lab5Part1");

        jFrame.setSize(300, 300);

        JMenuBar jMenuBar = new JMenuBar();

        JMenu jMenuCities = new JMenu("Cities");
        jMenuCities.add(new JMenuItem("Dublin", new ImageIcon(new ImageIcon("images/Dublin.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT))));
        jMenuCities.add(new JMenuItem("Belfast", new ImageIcon(new ImageIcon("images/Belfast.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT))));
        jMenuCities.add(new JMenuItem("Londonderry", new ImageIcon(new ImageIcon("images/Londonderry.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT))));
        jMenuCities.add(new JMenuItem("Galeway", new ImageIcon(new ImageIcon("images/Galeway.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT))));
        jMenuCities.add(new JMenuItem("Cork", new ImageIcon(new ImageIcon("images/Cork.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT))));

        jMenuBar.add(jMenuCities);

        jFrame.setJMenuBar(jMenuBar);

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}