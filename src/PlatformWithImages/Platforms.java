package PlatformWithImages;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

public class Platforms {
    Image img;
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension screenSize;
    int nHeight, nWidth;
    int nLengthR = 300;
    int nX, nY;    

    Platforms(int _nHeight, int _nWidth) {
        nHeight = _nHeight;
        nWidth = _nWidth;
        nX = (int) (Math.random() * (nWidth - nLengthR));
        nY = (nHeight / 5) * 4;
    }

    public void draw(Graphics2D g2D) {
        //g2D.fillRect(nX, nY, nLengthR, nWidthR);
        img = tk.getImage("Rectangle.png");
        g2D.drawImage(img, nX, nY, null);
    }

    public void update() {
        nY++;
        if (nY == nHeight) {
            nY = 0;
            nX = (int) (Math.random() * (nWidth - nLengthR));
        }
    }
}