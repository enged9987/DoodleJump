package ResizableWindow;

import java.awt.Dimension;
import javax.swing.JFrame;

public class FraMain extends JFrame {

    public FraMain() {
        Dimension ScreenSize;
        int nScHeight, nScWidth;
        ScreenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        nScHeight = (int) ScreenSize.getHeight();
        nScWidth = (int) ScreenSize.getWidth();
        setTitle("Windows");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//DO_NOTHING_ON_CLOSE
        setSize(nScWidth, nScHeight); //1370, 730 for fullscreen for laptop
        this.setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
