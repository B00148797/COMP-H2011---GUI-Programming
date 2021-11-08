package Lab;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab6Part4 extends JFrame implements ChangeListener {

    JSlider jSliderVolume, jSliderBalance;
    JPanel jPanelVolume, jPanelBalance, jPanelMain;
    JLabel jLabelVolume, jLabelBalance;

    public Lab6Part4(){
        setTitle("Lab6Part4");
        setSize(300, 300);
        setLayout(new BorderLayout());

        jPanelMain = new JPanel();
        jPanelMain.setLayout(new BoxLayout(jPanelMain, BoxLayout.X_AXIS));

        jPanelVolume = new JPanel();
        jPanelVolume.setLayout(new BoxLayout(jPanelVolume, BoxLayout.Y_AXIS));
        jPanelBalance = new JPanel();
        jPanelBalance.setLayout(new BoxLayout(jPanelBalance, BoxLayout.Y_AXIS));

        jLabelVolume = new JLabel("Volume: 20");
        jLabelBalance = new JLabel("Balance: 0");

        jSliderVolume = new JSlider(SwingConstants.VERTICAL,0,50, 20);
        jSliderVolume.addChangeListener(this);
        jPanelVolume.add(jSliderVolume);
        jPanelVolume.add(jLabelVolume);
        jSliderVolume.setAlignmentX(Component.CENTER_ALIGNMENT);
        jLabelVolume.setAlignmentX(Component.CENTER_ALIGNMENT);

        jSliderBalance = new JSlider(SwingConstants.VERTICAL,-10,10, 0);
        jSliderBalance.addChangeListener(this);
        jPanelBalance.add(jSliderBalance);
        jPanelBalance.add(jLabelBalance);
        jSliderBalance.setAlignmentX(Component.CENTER_ALIGNMENT);
        jLabelBalance.setAlignmentX(Component.CENTER_ALIGNMENT);


        jPanelMain.add(jPanelVolume);
        jPanelMain.add(jPanelBalance);

        add(jPanelMain, BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab6Part4();
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        Object o = changeEvent.getSource();
        if (o == jSliderVolume){
            jLabelVolume.setText("Volume: " + jSliderVolume.getValue());
        }else if (o == jSliderBalance){
            jLabelBalance.setText("Balance: " + jSliderBalance.getValue());
        }
    }
}