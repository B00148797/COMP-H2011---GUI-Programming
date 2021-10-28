import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab5Part3 extends JFrame implements ActionListener {

    JCheckBoxMenuItem jCheckBoxMenuItem1;
    JCheckBoxMenuItem jCheckBoxMenuItem2;
    JLabel jLabel1, jLabel2;

    public Lab5Part3(){
        JFrame jFrame = new JFrame("Lab5Part3");
        jFrame.setSize(300, 300);

        JMenuBar jMenuBar = new JMenuBar();

        JMenu jMenu = new JMenu("JCheckBoxMenuItem");

        jCheckBoxMenuItem1 = new JCheckBoxMenuItem("JCheckBox Off");
        jCheckBoxMenuItem1.addActionListener(this);
        jCheckBoxMenuItem2 = new JCheckBoxMenuItem("JCheckBox Off");
        jCheckBoxMenuItem2.addActionListener(this);
        jMenu.add(jCheckBoxMenuItem1);
        jMenu.add(jCheckBoxMenuItem2);

        jMenuBar.add(jMenu);

        jLabel1 = new JLabel("", SwingConstants.CENTER);
        jLabel2 = new JLabel("", SwingConstants.CENTER);
        jFrame.add(jLabel1, BorderLayout.NORTH);
        jFrame.add(jLabel2, BorderLayout.SOUTH);

        jFrame.setJMenuBar(jMenuBar);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Lab5Part3 lab5Part3 = new Lab5Part3();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println(actionEvent.getActionCommand());
        System.out.println(actionEvent.getSource());

        if (actionEvent.getSource() == jCheckBoxMenuItem1){
            if (actionEvent.getActionCommand() == "JCheckBox Off"){
                jCheckBoxMenuItem1.setText("JCheckBox On");
            }
            else if(actionEvent.getActionCommand() == "JCheckBox On"){
                jCheckBoxMenuItem1.setText("JCheckBox Off");
            }
            jLabel1.setText("jCheckBoxMenuItem1: " + jCheckBoxMenuItem1.getText());
        }

        if (actionEvent.getSource() == jCheckBoxMenuItem2){
            if (actionEvent.getActionCommand() == "JCheckBox Off"){
                jCheckBoxMenuItem2.setText("JCheckBox On");
            }
            else if(actionEvent.getActionCommand() == "JCheckBox On"){
                jCheckBoxMenuItem2.setText("JCheckBox Off");
            }
            jLabel2.setText("jCheckBoxMenuItem2: " + jCheckBoxMenuItem2.getText());
        }
    }
}