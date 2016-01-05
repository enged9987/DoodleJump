package Platform;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class Platform extends JComponent {

    Dimension screenSize;

    Platform() {
    }

    public void draw(Graphics2D g2D, int nX1, int nY1, int nLength, int nWidth, int nSHeight, int nSWidth) {
        g2D.setColor(Color.magenta);
        g2D.fillRect(0, 0, nSWidth, nSHeight);
        g2D.setColor(Color.blue);
        g2D.fillRect(nX1, nY1, nLength, nWidth);
    }
}
