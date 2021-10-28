import javax.swing.*;
import java.awt.*;

public class Lab5Part1 extends JFrame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Lab5Part1");

        jFrame.setSize(300, 300);

        JMenuBar jMenuBar = new JMenuBar();

        JMenu jMenuCities = new JMenu("Cities");
        jMenuCities.add(new JMenuItem("Dublin"));
        jMenuCities.add(new JMenuItem("Belfast"));
        jMenuCities.add(new JMenuItem("Londonderry"));
        jMenuCities.add(new JMenuItem("Galeway"));
        jMenuCities.add(new JMenuItem("Bangor"));

        jMenuBar.add(jMenuCities);

        jFrame.setJMenuBar(jMenuBar);

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
