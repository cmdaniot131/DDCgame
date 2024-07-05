package Main;
import javax.swing.*;

public class Main {

    JFrame mainFrame;
    ImageIcon icon;


    public Main() {

        mainFrame = new JFrame("Journey's End");
        icon = new ImageIcon("./icon/temporaryFrieren.png");
        mainFrame.setIconImage(icon.getImage());
        mainFrame.setUndecorated(true);
        mainFrame.setLayout(null);
        mainFrame.setSize(1920,1080);
        mainFrame.setLocation(0,0);
        mainFrame.setResizable(false);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);

    }

    public static void main(String[] args) {
        Main startMain = new Main();
    }
}