import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Lab5Part4 extends JFrame implements ActionListener {

    JLabel jLabel;
    JTextArea jTextArea;
    JMenuItem jMenuItemLocalNews, jMenuItemInternationalNews, jMenuItemWeather;

    public Lab5Part4(){
        setTitle("Lab5Part3");
        setSize(300, 300);

        JMenuBar jMenuBar = new JMenuBar();

        JMenu jMenuNews = new JMenu("News");

        KeyStroke ctrlA = KeyStroke.getKeyStroke(KeyEvent.VK_A, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask());
        KeyStroke ctrlZ = KeyStroke.getKeyStroke(KeyEvent.VK_Z, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask());
        KeyStroke ctrlE = KeyStroke.getKeyStroke(KeyEvent.VK_E, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask());

        jMenuItemLocalNews = new JMenuItem("Local News");
        jMenuItemLocalNews.setAccelerator(ctrlA);
        jMenuItemLocalNews.addActionListener(this);

        jMenuItemInternationalNews = new JMenuItem("International News");
        jMenuItemInternationalNews.setAccelerator(ctrlZ);
        jMenuItemInternationalNews.addActionListener(this);

        jMenuItemWeather = new JMenuItem("Weather");
        jMenuItemWeather.setAccelerator(ctrlE);
        jMenuItemWeather.addActionListener(this);

        jMenuNews.add(jMenuItemLocalNews);
        jMenuNews.add(jMenuItemInternationalNews);
        jMenuNews.add(jMenuItemWeather);

        jMenuBar.add(jMenuNews);

        jLabel = new JLabel("Select a sub menu", SwingConstants.CENTER);

        jTextArea = new JTextArea(null, "", 5,20);
        jTextArea.setLineWrap(true);
        jTextArea.setEditable(false);
        jTextArea.setAutoscrolls(true);

        JPanel jPanel = new JPanel();
        jPanel.add(jLabel);
        jPanel.add(jTextArea);

        add(jPanel);
        setJMenuBar(jMenuBar);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab5Part4();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object o = actionEvent.getSource();
        if (o == jMenuItemLocalNews){
            jLabel.setIcon(new ImageIcon("images/News.png"));
            jTextArea.setText("As always it is raining in Dublin. Erasmus students are wet");
        }else if(o == jMenuItemInternationalNews){
            jLabel.setIcon(new ImageIcon("images/InternationalNews.png"));
            jTextArea.setText("Special international flash, the president American has made a new haircut");
        } else if(o == jMenuItemWeather){
            jLabel.setIcon(new ImageIcon("images/Weather.png"));
            jTextArea.setText("Today the weather will be fine with a temperature ranging from 20 ° to 23 ° for the maximum");
        }
    }
}