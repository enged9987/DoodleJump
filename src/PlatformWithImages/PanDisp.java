

package PlatformWithImages;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PanDisp extends JPanel implements ActionListener {

    Platforms platforms;
    Dimension screenSize;
    int nHeight, nWidth;
    int nWidthR = 35, nLengthR = 300;
    Timer timer;

    PanDisp() {
        screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        nHeight = (int) screenSize.getHeight();
        nWidth = (int) screenSize.getWidth();
        platforms = new Platforms(nHeight, nWidth);
        super.setFocusable(true);
        super.requestFocusInWindow();
        timer = new Timer(1, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        platforms.update();

        super.repaint();

    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(0, 0, nWidth, nHeight);
        g.setColor(Color.DARK_GRAY);
        platforms.draw((Graphics2D) g);
        //Get a rectangle to display with background color
    }
}