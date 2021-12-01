import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab9Part3 extends JFrame implements ActionListener {

    JMenuBar jMenuBar;
    JMenu jMenuChoices;
    JMenuItem jMenuItem1, jMenuItem2, jMenuItem3;

    public Lab9Part3(){
        setTitle("Lab9Part3");
        setSize(500, 500);

        jMenuBar = new JMenuBar();
        jMenuChoices = new JMenu("Choices");

        jMenuItem1 = new JMenuItem("Radioactivity");
        jMenuItem1.addActionListener(this);
        jMenuItem2 = new JMenuItem("Electronic");
        jMenuItem2.addActionListener(this);
        jMenuItem3 = new JMenuItem("Programming");
        jMenuItem3.addActionListener(this);

        jMenuChoices.add(jMenuItem1);
        jMenuChoices.add(jMenuItem2);
        jMenuChoices.add(jMenuItem3);

        jMenuBar.add(jMenuChoices);

        setJMenuBar(jMenuBar);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab9Part3();
    }

    public void openDialog(String choice, String message){
         JOptionPane.showMessageDialog(this,
                message,
                choice,
                JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object o = actionEvent.getSource();

        if (o == jMenuItem1){
            openDialog("Radioactivity", "Radioactivity is the process by which a nucleus of an unstable atom loses energy by emitting particles of ionizing radiation.");
        }else if(o == jMenuItem2){
            openDialog("Electronic", "The field of Electronics is a branch of electrical engineering that deals with the emission, behaviour and effects of electrons using electronic devices.");
        }else if(o == jMenuItem3){
            openDialog("Programming", "Programming is the process of creating a set of instructions that tell a computer how to perform a task. Programming can be done using a variety of computer programming languages, such as JavaScript, Python, and C++.");
        }
    }
}