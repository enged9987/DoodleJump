package MainGame;

import java.awt.Dimension;
import java.awt.Graphics2D;

public class Platform3 {

    Dimension screenSize;
    int nHeight, nWidth;
    int nWidthR = 35, nLengthR = 300;
    int nX, nY;

    Platform3(int _nHeight, int _nWidth) {
        nHeight = _nHeight;
        nWidth = _nWidth;
        nY = ((nHeight / 5) * 2) - nWidthR;
        nX = (int) (Math.random() * (nWidth - nLengthR));
    }

    public void draw(Graphics2D g2D) {
        g2D.fillRect(nX, nY, nLengthR, nWidthR);
    }

    public void update() {
        nY++;
        if (nY == nHeight) {
            nY = 0;
            nX = (int) (Math.random() * (nWidth - nLengthR));
        }
    }
}