package Interface;

import javax.swing.*;
import java.awt.*;

public class MainWindowNew extends JFrame {
    private JPanel mainPanel;
    private JPanel upPanel;
    private JPanel downPanel;

    private JPanel leftPanel;
    private JPanel centerPanel;
    private JPanel rightPanel;

    public MainWindowNew(){
        setSize(750,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2,1,5,1));
        add(mainPanel);

        upPanel = new JPanel();
        upPanel.setBorder(BorderFactory.createEtchedBorder());
        JButton upButton = new JButton("UP");
        upPanel.add(upButton);
        mainPanel.add(upPanel);

        downPanel = new JPanel();
        downPanel.setBorder(BorderFactory.createEtchedBorder());
        mainPanel.add(downPanel);


        leftPanel = new JPanel();
        leftPanel.setBorder(BorderFactory.createEtchedBorder());
        JButton okButton = new JButton("OK");
        leftPanel.add(okButton);
        downPanel.add(leftPanel);

        centerPanel = new JPanel();
        centerPanel.setBorder(BorderFactory.createEtchedBorder());
        JButton noButton = new JButton("NO");
        centerPanel.add(noButton);
        downPanel.add(centerPanel);

        rightPanel = new JPanel();
        rightPanel.setBorder(BorderFactory.createEtchedBorder());
        JButton maybeButton = new JButton("MAYBE");
        rightPanel.add(maybeButton);
        downPanel.add(rightPanel);


        setVisible(true);
    }
}
