import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Lab4Part1 extends JFrame implements ActionListener {

    JButton jButton;
    JLabel jLabel;
    JPanel jPanel;

    public Lab4Part1(){
        JFrame jFrame = new JFrame("Lab4Part1");
        jFrame.setSize(300, 300);

        jPanel = new JPanel();

        jLabel = new JLabel("How are you?");

        jButton = new JButton("Translate to X");
        jButton.addActionListener(this);

        jPanel.add(jLabel);
        jPanel.add(jButton);

        jFrame.add(jPanel);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Lab4Part1 lab4Part1 = new Lab4Part1();
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == jButton){
            Integer randomNumber = getRandomNumber(0, 4);

            switch (randomNumber){
                case 0:
                    jLabel.setText("Comment ca va?");
                    break;
                case 1:
                    jLabel.setText("كيف حالك؟");
                    break;
                case 2:
                    jLabel.setText("Quid agis?");
                    break;
                case 3:
                    jLabel.setText("元気ですか？");
                    break;
                case 4:
                    jLabel.setText("Как дела?");
                    break;
            }
        }
    }
}