import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab8Part4 extends JFrame implements ActionListener, MouseListener, MouseMotionListener {

    JPanel jPanelMain, jPanel1, jPanel2, jPanel3, jPanel4;
    JLabel imageLabel, locationLabel, infoLabel;

    public Lab8Part4(){
        setTitle("Lab8Part4");
        setSize(500, 500);
        setLayout(new BorderLayout());

        jPanelMain = new JPanel();
        jPanelMain.setLayout(new BoxLayout(jPanelMain, BoxLayout.Y_AXIS));

        jPanel1 = new JPanel();
        jPanel1.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanel1.addMouseListener(this);
        imageLabel = new JLabel();
        imageLabel.setAlignmentX(SwingConstants.CENTER);
        jPanel1.add(imageLabel);


        jPanel2 = new JPanel();
        jPanel2.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanel2.addMouseListener(this);


        jPanel3 = new JPanel();
        jPanel3.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanel3.addMouseMotionListener(this);
        locationLabel = new JLabel("X: ?, Y: ?");
        locationLabel.setAlignmentX(SwingConstants.CENTER);
        jPanel3.add(locationLabel);


        jPanel4 = new JPanel();
        jPanel4.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanel4.addMouseListener(this);
        infoLabel = new JLabel("Slán Abhaile!, luch!!!");
        infoLabel.setAlignmentX(SwingConstants.CENTER);
        infoLabel.setVisible(true);
        jPanel4.add(infoLabel);

        jPanelMain.add(jPanel1);
        jPanelMain.add(jPanel2);
        jPanelMain.add(jPanel3);
        jPanelMain.add(jPanel4);
        add(jPanelMain);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab8Part4();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getSource() == jPanel1){
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showOpenDialog(getParent());
            String pathImage = jFileChooser.getSelectedFile().getAbsolutePath();
            System.out.println(pathImage);
            ImageIcon imageIcon = new ImageIcon(pathImage);
            imageLabel.setIcon(imageIcon);
        }else if(mouseEvent.getSource() == jPanel2){
            Color color = JColorChooser.showDialog(this,"Select a color", Color.BLACK);
            jPanel2.setBackground(color);
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        if (mouseEvent.getSource() == jPanel4){
            infoLabel.setVisible(false);
        }
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        if (mouseEvent.getSource() == jPanel4){
            infoLabel.setVisible(true);
        }
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        if (mouseEvent.getSource() == jPanel3){
            locationLabel.setText("X: " + mouseEvent.getX() +", Y: " + mouseEvent.getY() + "");
        }
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }
}