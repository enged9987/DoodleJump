package MainGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PanDisp extends JPanel implements ActionListener {

    Platform1 platform1;
    Platform2 platform2;
    Platform3 platform3;
    Platform4 platform4;
    Dimension screenSize;
    int nHeight, nWidth;
    int nWidthR = 35, nLengthR = 300;
    Timer timer;

    PanDisp() {
        screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        nHeight = (int) screenSize.getHeight();
        nWidth = (int) screenSize.getWidth();
        platform1 = new Platform1(nHeight, nWidth);
        platform2 = new Platform2(nHeight, nWidth);
        platform3 = new Platform3(nHeight, nWidth);
        platform4 = new Platform4(nHeight, nWidth);
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
        platform4.update();
        super.repaint();

    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(0, 0, nWidth, nHeight);
        g.setColor(Color.DARK_GRAY);
        platform1.draw((Graphics2D) g);
        platform2.draw((Graphics2D) g);
        platform3.draw((Graphics2D) g);
        platform4.draw((Graphics2D) g);
        //Get a rectangle to display with background color
    }
}
