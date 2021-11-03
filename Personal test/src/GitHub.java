import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GitHub extends JFrame implements ActionListener {

    public GitHub(){
        JFrame jFrameGitHub = new JFrame("GitHub");
        jFrameGitHub.setSize(800, 500);
        jFrameGitHub.setLocationRelativeTo(null);
        jFrameGitHub.setIconImage(new ImageIcon("images/logo.png").getImage());

        //Add menu bar
        jFrameGitHub.setJMenuBar(GitHubMenuBar());

        //Add top panel
        jFrameGitHub.add(GitHubPanelTop());

        jFrameGitHub.setVisible(true);
        jFrameGitHub.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JPanel GitHubPanelTop(){
        JPanel jPanel = new JPanel();

        String[] retositoryList = {"GUI Programming", "Interative Multimedia", "Rich Web Application", "OOAD Project"};
        JComboBox<String> jComboBoxRepository = new JComboBox<String>(retositoryList);
        jPanel.add(jComboBoxRepository);

        String[] branchList = {"Main", "Root", "Testing", "Trash"};
        JComboBox<String> jComboBoxBranch = new JComboBox<String>(branchList);
        jPanel.add(jComboBoxBranch);

        JButton jButton = new JButton("Fetch origin");
        jButton.setIcon(new ImageIcon("images/load.png"));
        jPanel.add(jButton);

        return jPanel;
    }

    public JMenuBar GitHubMenuBar(){
        JMenuBar jMenuBar = new JMenuBar();

        JMenu jMenuFile = new JMenu("File");
        jMenuFile.add(new JMenuItem("New repository..."));
        jMenuFile.addSeparator();
        jMenuFile.add(new JMenuItem("Add local repository"));
        jMenuFile.add(new JMenuItem("Clone repository"));
        jMenuFile.addSeparator();
        jMenuFile.add(new JMenuItem("Options..."));
        jMenuFile.addSeparator();
        jMenuFile.add(new JMenuItem("Exit"));

        JMenu jMenuEdit = new JMenu("Edit");
        jMenuEdit.add(new JMenuItem("Undo"));
        jMenuEdit.add(new JMenuItem("Redo"));
        jMenuEdit.addSeparator();
        jMenuEdit.add(new JMenuItem("Cut"));
        jMenuEdit.add(new JMenuItem("Copy"));
        jMenuEdit.add(new JMenuItem("Paste"));
        jMenuEdit.add(new JMenuItem("Select all"));
        jMenuEdit.addSeparator();
        jMenuEdit.add(new JMenuItem("Find"));


        JMenu jMenuView = new JMenu("View");

        JMenu jMenuRepository = new JMenu("Repository");

        JMenu jMenuBranch = new JMenu("Branch");

        JMenu jMenuHelp = new JMenu("Help");

        jMenuBar.add(jMenuFile);
        jMenuBar.add(jMenuEdit);
        jMenuBar.add(jMenuView);
        jMenuBar.add(jMenuRepository);
        jMenuBar.add(jMenuBranch);
        jMenuBar.add(jMenuHelp);
        return jMenuBar;
    }

    public static void main(String[] args) {
        new GitHub();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
