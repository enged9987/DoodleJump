package Platform;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Player extends JComponent {

    Image iBall, newimg, img, iOldBall;

    Player() {
        iOldBall = new ImageIcon("ball.png").getImage();
        newimg = iOldBall.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
        iBall = new ImageIcon(newimg).getImage();
        /*Dimension d = new Dimension();
         d.width = (iBall.getWidth(null)) / 6;
         d.height = (iBall.getHeight(null)) / 6;
         setPreferredSize(d);*/
    }

    public void draw(Graphics g,int nX,int nY) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(iBall, nX, nY, null);
    }
}
/*
 * Image img = myIcon2.getImage();
Image newimg = img.getScaledInstance(230, 310,  java.awt.Image.SCALE_SMOOTH);
newIcon = new ImageIcon(newimg);
 */