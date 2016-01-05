package Platform;

import javax.swing.*;
import java.awt.*;

public class PanMain extends JPanel {

    PanMain() {
        PanDisp panDisp = new PanDisp();
        setLayout(new BorderLayout());
        add(panDisp, BorderLayout.CENTER);
    }
}
