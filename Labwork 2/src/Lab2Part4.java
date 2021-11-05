import javax.swing.*;

public class Lab2Part4 extends JFrame {

    JPanel holderPanel;
    JTextField jTextField;
    JTextArea jTextArea;
    JLabel jLabel;
    JButton jButton;

    public Lab2Part4(){
        setTitle("About my Pet");
        setSize(300, 300);

        holderPanel = new JPanel();

        jTextField = new JTextField("Felix the Cat");
        //jTextField.setBounds(0, 0, 300, 20);

        jTextArea = new JTextArea("Felix the Cat is a children's comedy cartoon character created in 1919 by Pat Sullivan and Otto Messmer during the silent film era. An anthropomorphic black cat with white eyes, a black body, and a giant grin, he is one of the most recognized cartoon characters in film history. Felix was the first animated character to attain a level of popularity sufficient to draw movie audiences.");
        jTextArea.setLineWrap(true);
        jTextArea.setColumns(20);

        jLabel = new JLabel("This is my pet");

        jButton = new JButton("Like");
        jButton.setIcon(new ImageIcon("images/Logo Like.png"));

        holderPanel.add(jTextField);
        holderPanel.add(jTextArea);
        holderPanel.add(jLabel);
        holderPanel.add(jButton);

        add(holderPanel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab2Part4();
    }
}