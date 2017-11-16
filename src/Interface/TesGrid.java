package Interface;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class TesGrid extends JFrame{

    private JPanel mainPanel;
    private JPanel upPanel;
    private JPanel downPanel;
    private JPanel leftPanel;
    private JPanel lLPanel;
    private JPanel lRPanel;
    private JPanel rightPanel;
    private JLabel label;
    private JScrollPane scrollPane;

    private JSplitPane splitPane1;
    private JSplitPane splitPane2;
    private JSplitPane splitPane3;

    public TesGrid(){
        setSize(1000,850);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(1,1));
        add(mainPanel);

        upPanel = new JPanel();
        upPanel.setBorder(BorderFactory.createEtchedBorder());
        downPanel = new JPanel();
        downPanel.setLayout(new GridLayout(1,1));
        leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(1,1));
        lLPanel = new JPanel();
        lRPanel = new JPanel();
        leftPanel.add(lLPanel);
        leftPanel.add(lRPanel);
        ImageIcon icon = new ImageIcon("E:/Photo/MOTO/МТ/Новая папка/1.jpg");
        label = new JLabel(icon);
        scrollPane = new JScrollPane(label);

        rightPanel = new JPanel();
        Border etched = BorderFactory.createEtchedBorder();
        Border title = BorderFactory.createTitledBorder(etched,"Friends");
        rightPanel.setBorder(title);



        splitPane1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT,upPanel,downPanel);
        splitPane1.setResizeWeight(0.2);
        mainPanel.add(splitPane1);

        splitPane2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,leftPanel, rightPanel);
        splitPane2.setResizeWeight(0.75);
        downPanel.add(splitPane2);

        splitPane3 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,lLPanel, lRPanel);
        splitPane3.setResizeWeight(0.7);
        leftPanel.add(splitPane3);






        setVisible(true);
    }
}
