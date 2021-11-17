import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class Lab7Part5 extends JFrame implements ActionListener {

    JMenuBar jMenuBar;
    JMenu jMenuGames;
    JMenuItem jMenuItemXO, jMenuItemSudoku;
    JDesktopPane jDesktopPane;
    Integer PlayerTurn = 0;

    public Lab7Part5(){
        setTitle("Lab7Part5");
        setSize(500, 500);

        jDesktopPane = new JDesktopPane();

        jMenuBar = new JMenuBar();
        jMenuGames = new JMenu("Select");

        jMenuItemXO = new JMenuItem("X’s and O’s");
        jMenuItemXO.addActionListener(this);
        jMenuItemSudoku = new JMenuItem("Sudoku");
        jMenuItemSudoku.addActionListener(this);
        jMenuGames.add(jMenuItemXO);
        jMenuGames.add(jMenuItemSudoku);

        jMenuBar.add(jMenuGames);

        add(jDesktopPane);
        setJMenuBar(jMenuBar);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab7Part5();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object ObjectActionEvent = actionEvent.getSource();
        if (ObjectActionEvent == jMenuItemXO){
            jDesktopPane.add(XO());
        }else if(ObjectActionEvent == jMenuItemSudoku){
            jDesktopPane.add(Sudoku());
        }
    }

    public JInternalFrame XO(){
        JInternalFrame jInternalFrame = new JInternalFrame("X’s and O’s");
        jInternalFrame.setSize(400, 400);
        jInternalFrame.setClosable(true);
        jInternalFrame.setLayout(new GridLayout(3, 3));

        for (int i = 0 ; i < 9 ; i++){
            JButton jButton = new JButton();
            jButton.setFont(new Font("Century Gothic", Font.BOLD, 40));
            jButton.addActionListener(actionEvent -> {
                jButton.setEnabled(false);
                if (PlayerTurn % 2 == 0){
                    jButton.setText("X");
                }else{
                    jButton.setText("O");
                }
                PlayerTurn++;
            });

            jInternalFrame.add(jButton);
        }
        jInternalFrame.setVisible(true);
        return jInternalFrame;
    }

    public JInternalFrame Sudoku(){
        JInternalFrame jInternalFrame = new JInternalFrame("Sudoku");
        jInternalFrame.setSize(400, 400);
        jInternalFrame.setClosable(true);
        jInternalFrame.setLayout(new GridLayout(3, 3));

        NumberFormat format = NumberFormat.getInstance();
        NumberFormatter formatter = new NumberFormatter(format);
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(0);
        formatter.setMaximum(9);
        formatter.setAllowsInvalid(false);

        for (int i = 0 ; i < 9 ; i++){

            JPanel jPanel = new JPanel();
            jPanel.setBorder(BorderFactory.createLineBorder(Color.black));
            jPanel.setLayout(new GridLayout(3, 3));
            for (int j = 0 ; j < 9 ; j++){
                JFormattedTextField jFormattedTextField = new JFormattedTextField(formatter);
                jFormattedTextField.setHorizontalAlignment(JTextField.CENTER);
                jFormattedTextField.setFont(new Font("Century Gothic", Font.BOLD, 20));
                jPanel.add(jFormattedTextField);
            }
            jInternalFrame.add(jPanel);
        }
        jInternalFrame.setVisible(true);
        return jInternalFrame;
    }
}