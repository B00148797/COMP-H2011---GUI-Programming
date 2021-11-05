import javax.swing.*;

//Create class and extends JFrame
public class Lab2Part1 extends JFrame {

    JPanel contentPane;

    public Lab2Part1(){
        setTitle("Lab2Part1");

        //Set size and visibility of the JFrame
        setSize(300, 300);

        //Set resizable (NOT resizable)
        setResizable(false);

        //Set location
        setLocationRelativeTo(null);

        //Set the variable contentPane to reference content pane of JFrame
        contentPane = new JPanel();

        add(contentPane);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab2Part1();
    }
}
