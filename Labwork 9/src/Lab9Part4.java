import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Lab9Part4 extends JFrame{

    public void paint(Graphics g)
    {
        super.paint(g);
        DrawBody(g);
        DrawHead(g);
        DrawText(g);
    }

    void DrawBody(Graphics g){
        g.setColor(new Color(0, 0, 0));
        g.fillRect(125, 200, 50, 200);
        g.fillRect(325, 200, 50, 200);

        g.setColor(new Color(148, 28, 39));
        g.fillOval(150, 150, 200, 200);

        g.fillRect(200, 325, 25, 100);
        g.fillRect(275, 325, 25, 100);

        g.setColor(new Color(125, 125, 125));
        g.fillRect(185, 325, 125, 25);

        g.fillOval(245, 245-30, 10, 10);
        g.fillOval(245, 245, 10, 10);
        g.fillOval(245, 245+30, 10, 10);
    }

    void DrawHead(Graphics g){
        File path = new File("images/");
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(path, "Head.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        g.drawImage(image, 208, 20, null);
    }

    void DrawText(Graphics g){
        g.setColor(new Color(0, 125, 0));
        g.drawString("Oh! Oh! Oh", 300, 150);
    }

    public Lab9Part4(){
        setTitle("Lab9Part4");
        setSize(500, 500);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Lab9Part4();
    }
}