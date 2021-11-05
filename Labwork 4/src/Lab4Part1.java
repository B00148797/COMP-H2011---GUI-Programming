import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab4Part1 extends JFrame implements ActionListener {

    JButton jButton;
    JLabel jLabel;
    JPanel jPanel;

    public Lab4Part1(){
        setTitle("Lab4Part1");
        setSize(300, 300);

        jPanel = new JPanel();

        jLabel = new JLabel("How are you?");

        jButton = new JButton("Translate to X");
        jButton.addActionListener(this);

        jPanel.add(jLabel);
        jPanel.add(jButton);

        add(jPanel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab4Part1();
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
                    jLabel.setText("Comment ça va?");
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