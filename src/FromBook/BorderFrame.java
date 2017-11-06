package FromBook;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderFrame extends JFrame {
    private JPanel buttonPanel;
    private JPanel demoPanel;
    private ButtonGroup group;

    public BorderFrame(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        group = new ButtonGroup();
        buttonPanel = new JPanel();
        demoPanel = new JPanel();

        addButton("Lowered bewel",BorderFactory.createLoweredBevelBorder());
        addButton("Raised bewel",BorderFactory.createRaisedBevelBorder());
        addButton("Etched",BorderFactory.createEtchedBorder());
        addButton("Line",BorderFactory.createLineBorder(Color.BLUE));
        addButton("Matte",BorderFactory.createMatteBorder(10,10,10,10,Color.BLUE));
        addButton("Empty",BorderFactory.createEmptyBorder());

        Border etched = BorderFactory.createEtchedBorder();
        Border title = BorderFactory.createTitledBorder(etched,"Border types:");
        buttonPanel.setBorder(title);

        setLayout(new GridLayout(2,1));
        add(buttonPanel);
        add(demoPanel);
        pack();
    }

    public void addButton(String name, Border border){
        JRadioButton button = new JRadioButton(name);
        group.add(button);
        buttonPanel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                demoPanel.setBorder(border);

            }
        });
    }
}
