import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab7Part2 extends JFrame implements ActionListener {

    JInternalFrame jInternalFrame;
    JDesktopPane jDesktopPane;
    Integer widthJFrame = 600, heightJFrame = 600;
    Integer frameCount = 0;
    Integer positionX = 5, positionY = 5;

    public Lab7Part2(){
        setTitle("Lab7Part2");
        setSize(widthJFrame, heightJFrame);

        jDesktopPane = new JDesktopPane();

        for (int i = 0 ; i < 5 ; i++){
            for (int j = 0 ; j < 5 ; j++){
                positionX += 5;
                positionY += 5;
                frameCount++;
                jInternalFrame = new JInternalFrame("Frame: " + frameCount,true,true,true,true);
                jInternalFrame.setSize(200, 200);
                jInternalFrame.setLocation(positionX, positionY);
                jInternalFrame.setVisible(true);

                jDesktopPane.add(jInternalFrame);
            }
        }

        add(jDesktopPane);
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