package Platform;

import java.awt.Dimension;
import javax.swing.JFrame;

public class FraMain extends JFrame {

    public FraMain() {
        Dimension dScreenSize;
        int nScHeight, nScWidth;
        dScreenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        nScHeight = (int) dScreenSize.getHeight();
        nScWidth = (int) dScreenSize.getWidth();
        PanMain panMain = new PanMain();
        setTitle("Doodle Jump");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//DO_NOTHING_ON_CLOSE
        setSize(nScWidth, nScHeight); //1370, 730 for fullscreen for laptop
        this.setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
        add(panMain);
    }
}