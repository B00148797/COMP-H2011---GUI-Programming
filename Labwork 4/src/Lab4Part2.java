import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab4Part2 extends JFrame implements ActionListener {

    JList<Color> colourSelector;
    Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.CYAN, Color.BLACK, Color.MAGENTA, Color.ORANGE, Color.PINK};
    JButton changeColour;
    JPanel jPanel;

    public Lab4Part2(){
        JFrame jFrame = new JFrame("Lab4Part2");
        jFrame.setSize(300, 300);

        jPanel = new JPanel();

        colourSelector = new JList<Color>(colors);

        changeColour = new JButton("Change Colour");
        changeColour.addActionListener(this);

        jPanel.add(colourSelector);
        jPanel.add(changeColour);

        jFrame.add(jPanel);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Lab4Part2 lab4Part2 = new Lab4Part2();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == changeColour){
            jPanel.setBackground(colourSelector.getSelectedValue());
        }
    }
}