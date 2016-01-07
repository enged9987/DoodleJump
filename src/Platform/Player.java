package Platform;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Player extends JComponent {

    Image iBall, newimg, img, iOldBall;

    Player(int nLength) {
        iOldBall = new ImageIcon("ball.png").getImage();
        newimg = iOldBall.getScaledInstance(nLength, nLength, java.awt.Image.SCALE_SMOOTH);
        iBall = new ImageIcon(newimg).getImage();
    }

    public void draw(Graphics g, int nX, int nY) {
        setBackground(Color.black);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(iBall, nX, nY, null);
    }
}
