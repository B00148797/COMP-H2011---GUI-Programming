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


        jFrameGitHub.setJMenuBar(GitHubMenuBar());
        jFrameGitHub.setVisible(true);
        jFrameGitHub.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
