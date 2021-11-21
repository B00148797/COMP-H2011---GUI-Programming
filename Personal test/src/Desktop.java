import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Desktop extends JFrame implements ActionListener, MouseListener {

    JDesktopPane jDesktopPane;
    JInternalFrame jInternalFrame;
    JLabel jLabelCorbeille, jLabelNote;

    public Desktop(){
        setTitle("Desktop");
        setSize(500,500);

        jDesktopPane = new JDesktopPane();
        jDesktopPane.setLayout(new GridLayout(8, 8));

        jLabelCorbeille = new JLabel(new ImageIcon("images/Corbeille.png"), SwingConstants.LEFT);
        jLabelCorbeille.addMouseListener(this);
        jDesktopPane.add(jLabelCorbeille);

        jLabelNote = new JLabel(new ImageIcon("images/Note.png"), SwingConstants.LEFT);
        jLabelNote.addMouseListener(this);
        jDesktopPane.add(jLabelNote);

        add(jDesktopPane);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Desktop();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}