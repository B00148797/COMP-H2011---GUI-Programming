import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Lab8Part3 extends JFrame implements MouseMotionListener {

    JLabel jLabel;
    JPanel jPanel;

    public Lab8Part3(){
        setTitle("Lab8Part3");
        setSize(500, 500);
        setLayout(new BorderLayout());

        jPanel = new JPanel();
        jLabel = new JLabel("You found me!", SwingConstants.CENTER);
        jLabel.setForeground(Color.WHITE);
        jLabel.addMouseMotionListener(this);

        jPanel.add(jLabel);
        add(jPanel, BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab8Part3();
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        JComponent jc = (JComponent)mouseEvent.getSource();
        jc.setLocation((jc.getX()+mouseEvent.getX()) - jc.getWidth()/2, (jc.getY()+mouseEvent.getY()) - jc.getHeight()/2);
        jc.setForeground(Color.RED);
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }
}