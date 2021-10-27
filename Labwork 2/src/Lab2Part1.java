import javax.swing.*;

//Create class and extends JFrame
public class Lab2Part1 extends JFrame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Lab2Part1");

        //Set size and visibility of the JFrame
        jFrame.setSize(300, 300);

        //Set resizable (NOT resizable)
        jFrame.setResizable(false);

        //Set location
        jFrame.setLocationRelativeTo(null);

        //Set the variable contentPane to reference content pane of JFrame
        JPanel contentPane = new JPanel();

        jFrame.add(contentPane);

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
