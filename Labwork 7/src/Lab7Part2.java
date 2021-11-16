import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab7Part2 extends JFrame implements ActionListener {

    JInternalFrame jInternalFrame;
    Integer widthJFrame = 600, heightJFrame = 600;
    Integer frameCount = 0;

    public Lab7Part2(){
        setTitle("Lab7Part1");
        setSize(widthJFrame, heightJFrame);
        setLayout(new GridLayout(5, 5));

        for (int i = 0 ; i < 5 ; i++){
            for (int j = 0 ; j < 5 ; j++){
                frameCount++;
                jInternalFrame = new JInternalFrame("Frame: " + frameCount);
                //jInternalFrame.setSize(widthJFrame/5, heightJFrame/5);
                jInternalFrame.setVisible(true);

                add(jInternalFrame);
            }
        }

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab7Part2();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}