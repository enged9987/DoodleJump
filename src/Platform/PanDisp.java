package Platform;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class PanDisp extends JPanel {

    Player player;
    Platform platform;
    Dimension screenSize;
    public int nX, nY, nX1, nY1;
    int nGravity, nSpeed, nHeight, nWidth;

    PanDisp() {
        nX = 650;
        nY = 100;
        nX1 = 600;
        nY1 = 800;
        nGravity = 10;
        nSpeed = 0;
        screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        nHeight = (int) screenSize.getHeight();
        nWidth = (int) screenSize.getWidth();
        player = new Player();
        platform = new Platform();
    }

    public void Gravity() {
        nY += nGravity;
        nY -= nSpeed;
        if (nY <= nY1) {
            nSpeed = 50;
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        platform.draw((Graphics2D) g, nX1, nY1);
        player.draw((Graphics2D) g, nX, nY);
    }
}
