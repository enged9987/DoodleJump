package Platform;

import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class Platform extends JComponent {

    Dimension screenSize;

    Platform() {

    }

    public void draw(Graphics2D g2D, int nX1, int nY1) {
        g2D.fillRect(nX1, nY1,300,35);
    }
}
