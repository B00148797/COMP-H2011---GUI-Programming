import javax.swing.*;

public class Lab2Part4 extends JFrame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("About my Pet");

        jFrame.setSize(300, 300);

        JPanel holderPanel = new JPanel();

        JTextField jTextField = new JTextField("Felix the Cat");
        //jTextField.setBounds(0, 0, 300, 20);

        JTextArea jTextArea = new JTextArea("Felix the Cat is a children's comedy cartoon character created in 1919 by Pat Sullivan and Otto Messmer during the silent film era. An anthropomorphic black cat with white eyes, a black body, and a giant grin, he is one of the most recognized cartoon characters in film history. Felix was the first animated character to attain a level of popularity sufficient to draw movie audiences.");
        jTextArea.setLineWrap(true);
        jTextArea.setColumns(20);

        JLabel jLabel = new JLabel("This is my pet");

        JButton jButton = new JButton("Like");
        jButton.setIcon(new ImageIcon("images/Logo Like.png"));

        holderPanel.add(jTextField);
        holderPanel.add(jTextArea);
        holderPanel.add(jLabel);
        holderPanel.add(jButton);

        jFrame.add(holderPanel);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
