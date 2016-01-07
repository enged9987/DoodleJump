package Platform;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PanDisp extends JPanel implements ActionListener {

    Player player;
    Platform platform;
    HitDetection hitdetection;
    Dimension screenSize;
    public int nX, nY, nX1, nY1, nPlayerLength, nPlatformHeight, nPlatformWidth;
    int nGravity, nJump, nSHeight, nSWidth, nDirV, nDirH;
    Timer timer;

    PanDisp() {
        nX = 650;
        nY = 100;
        nX1 = 600;
        nY1 = 800;
        nGravity = 25;
        nJump = 0;
        nDirH = 0;
        nDirV = 0;
        screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        nSHeight = (int) screenSize.getHeight();
        nSWidth = (int) screenSize.getWidth();
        nPlayerLength = nSHeight / 8;
        nPlatformHeight = nSHeight / 25;
        nPlatformWidth = nSWidth / 7;
        player = new Player(nPlayerLength);
        platform = new Platform();
        super.setFocusable(true);
        super.requestFocusInWindow();
        timer = new Timer(1, this);
        timer.start();
        // key = new KeyInput();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                moveIt(evt);
            }
        });

        nDirV += nGravity;
        nDirV -= nJump;
        nY += nDirV;
        nX += nDirH;
        if (nDirV > 0 && HitDetection.HitDetection(nX, nY, nX1, nY1, nPlayerLength, nPlatformHeight, nPlatformWidth)) {
            nJump = 75;
        }
        if (nJump > 2) {
            nJump -= 2;
        }
        nDirH = 0;
        nDirV = 0;
        super.repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        platform.draw((Graphics2D) g, nX1, nY1, nPlatformWidth, nPlatformHeight, nSHeight, nSWidth);
        player.draw((Graphics2D) g, nX, nY);
    }

    public void moveIt(KeyEvent evt) {
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                nDirH = -50;
                break;
            case KeyEvent.VK_RIGHT:
                nDirH = 50;
                break;
        }

    }
}