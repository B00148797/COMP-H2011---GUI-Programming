import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab7Part2 extends JFrame implements ActionListener {

    JInternalFrame jInternalFrame;
    JDesktopPane jDesktopPane;
    Integer widthJFrame = 600, heightJFrame = 600;
    Integer frameCount = 0;

    public Lab7Part2(){
        setTitle("Lab7Part1");
        setSize(widthJFrame, heightJFrame);

        jDesktopPane = new JDesktopPane();

        for (int i = 0 ; i < 5 ; i++){
            for (int j = 0 ; j < 5 ; j++){
                frameCount++;
                jInternalFrame = new JInternalFrame("Frame: " + frameCount,true,true,true,true);
                jInternalFrame.setSize(200, 200);
                jInternalFrame.setDesktopIcon(new JInternalFrame.JDesktopIcon(jInternalFrame));
                jInternalFrame.setLocation(frameCount*6, frameCount*6);
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