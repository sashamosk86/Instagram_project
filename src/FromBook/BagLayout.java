package FromBook;

import javax.swing.*;
import java.awt.*;

public class BagLayout extends JFrame {

    private JPanel panel;

    public BagLayout(){
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panel = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        panel.setLayout(layout);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.weightx = 100;
        constraints.weighty = 100;

        add(panel);
    }
}
