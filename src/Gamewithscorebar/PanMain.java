package Gamewithscorebar;

import javax.swing.*;
import java.awt.*;

public class PanMain extends JPanel {

    PanDisp panDisp = new PanDisp();

    public PanMain() {
        setLayout(new BorderLayout());
        //add(panLabelScore, BorderLayout.SOUTH);
        add(panDisp, BorderLayout.CENTER);
    }
}
