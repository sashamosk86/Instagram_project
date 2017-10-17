package Interface;

import javax.swing.*;
import java.awt.*;

public class SizedFrame extends JFrame{
    public SizedFrame() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSzie = kit.getScreenSize();
        int width = screenSzie.width;
        int height = screenSzie.height;

        setSize(400, 250);
        setLocationByPlatform(true);
    }
}
