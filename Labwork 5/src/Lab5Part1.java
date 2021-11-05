import javax.swing.*;
import java.awt.*;

public class Lab5Part1 extends JFrame {

    JMenuBar jMenuBar;
    JMenu jMenuCities;

    public Lab5Part1(){
        setTitle("Lab5Part1");
        setSize(300, 300);

        jMenuBar = new JMenuBar();

        jMenuCities = new JMenu("Cities");
        jMenuCities.add(new JMenuItem("Dublin", new ImageIcon(new ImageIcon("images/Dublin.png").getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT))));
        jMenuCities.add(new JMenuItem("Belfast", new ImageIcon(new ImageIcon("images/Belfast.png").getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT))));
        jMenuCities.add(new JMenuItem("Londonderry", new ImageIcon(new ImageIcon("images/Londonderry.png").getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT))));
        jMenuCities.add(new JMenuItem("Galeway", new ImageIcon(new ImageIcon("images/Galeway.png").getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT))));
        jMenuCities.add(new JMenuItem("Cork", new ImageIcon(new ImageIcon("images/Cork.png").getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT))));

        jMenuBar.add(jMenuCities);

        setJMenuBar(jMenuBar);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab5Part1();
    }
}