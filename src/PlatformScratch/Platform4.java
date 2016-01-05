package PlatformScratch;

import java.awt.Dimension;
import java.awt.Graphics2D;

public class Platform4 {

    Dimension screenSize;
    int nHeight, nWidth;
    int nWidthR = 35, nLengthR = 300;
    int nX, nY;

    Platform4(int _nHeight, int _nWidth) {
        nHeight = _nHeight;
        nWidth = _nWidth;
        nX = (int) (Math.random() * (nWidth - nLengthR));
        nY = (nHeight / 5) - nWidthR;
    }

    public void draw(Graphics2D g2D) {
        g2D.fillRect(nX, nY, nLengthR, nWidthR);
    }

    public void update() {
        nY++;
        if (nY == nHeight) {
            nY = 0;
        }
    }
}
