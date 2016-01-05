package PlatformScratch;

import javax.swing.JFrame;
import java.awt.Dimension;// Dimension package for window size
public class FraMain extends JFrame {

    Dimension screenSize;
    int nHeight, nWidth;

    FraMain() {
        PanMain panMain = new PanMain();
        screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        nHeight = (int) screenSize.getHeight();
        nWidth = (int) screenSize.getWidth();
        setSize(nWidth, nHeight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panMain);
        setVisible(true);
    }
}
