package PlatformswithPlayer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PanDisp extends JPanel implements ActionListener {

    Platforms platform1, platform2, platform3, platform4;
    Player player;
    Dimension screenSize;
    int nHeight, nWidth;
    public int nX, nY, nX1, nY1, nPlayerLength;
    int nWidthR = 35, nLengthR = 300, nGravity, nJump, nDirV, nDirH;
    Timer timer;

    PanDisp() {
        screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        nHeight = (int) screenSize.getHeight();
        nWidth = (int) screenSize.getWidth();
        platform1 = new Platforms(nHeight, nWidth);
        platform2 = new Platforms(nHeight, nWidth);
        platform3 = new Platforms(nHeight, nWidth);
        platform4 = new Platforms(nHeight, nWidth);
        nPlayerLength = nHeight / 8;
        player = new Player(nPlayerLength);
        nX = 650;
        nY = 100;
        nX1 = 600;
        nY1 = 800;
        nGravity = 25;
        nJump = 0;
        nDirH = 0;
        nDirV = 0;
        platform2.nY = (nHeight / 5) * 3;
        platform3.nY = (nHeight / 5) * 2;
        platform4.nY = (nHeight / 5);
        super.setFocusable(true);
        super.requestFocusInWindow();
        timer = new Timer(1, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        platform1.update();
        platform2.update();
        platform3.update();
        platform4.update();addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                moveIt(evt);
            }
        });
        if (HitDetection.HitDetection(nX, nY, platform1.nX, platform1.nY, nPlayerLength, nWidthR, nLengthR)
                || HitDetection.HitDetection(nX, nY, platform2.nX, platform2.nY, nPlayerLength, nWidthR, nLengthR)
                || HitDetection.HitDetection(nX, nY, platform3.nX, platform3.nY, nPlayerLength, nWidthR, nLengthR)
                || HitDetection.HitDetection(nX, nY, platform4.nX, platform4.nY, nPlayerLength, nWidthR, nLengthR)) {

            nJump = 75;
        }
        if (nJump > 2) {
            nJump -= 2;
        }
        nY += nGravity;
        nY -= nJump;
        nX += nDirH;

        super.repaint();

    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(0, 0, nWidth, nHeight);
        g.setColor(Color.DARK_GRAY);
        player.draw((Graphics2D) g, nX, nY, nHeight);
        platform1.draw((Graphics2D) g);
        platform2.draw((Graphics2D) g);
        platform3.draw((Graphics2D) g);
        platform4.draw((Graphics2D) g);
        //player.draw((Graphics2D) g, nX, nY);

        //Get a rectangle to display with background color
    }
    public void moveIt(KeyEvent evt) {
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                nDirH = -5;
                break;
            case KeyEvent.VK_RIGHT:
                nDirH = 5;
                break;
        }

    }
}
