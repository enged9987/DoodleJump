package Platform;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PanMain extends JPanel {

    PanMain() {
        PanDisp panDisp = new PanDisp();
        setLayout(new BorderLayout());
        add(panDisp, BorderLayout.CENTER);
    }
}
