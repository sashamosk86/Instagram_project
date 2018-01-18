package FromBook;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class TestClass extends JFrame{
    JPanel butonPanel;
    JPanel demoPanel;
    ButtonGroup buttonGroup;

    TestClass() {
        setTitle("Window");
        //setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        butonPanel = new JPanel();
        demoPanel = new JPanel();
        buttonGroup = new ButtonGroup();

        addButton("Lowered Bevel",BorderFactory.createLoweredBevelBorder());
        addButton("Raised Bevel",BorderFactory.createRaisedBevelBorder());
        addButton("Etched",BorderFactory.createEtchedBorder());
        addButton("Line",BorderFactory.createLineBorder(Color.BLUE));
        addButton("Matte",BorderFactory.createMatteBorder(20,5,5,5,Color.BLUE));
        addButton("Empty",BorderFactory.createEmptyBorder());

        Border etched = BorderFactory.createEtchedBorder();
        Border title = BorderFactory.createTitledBorder(etched,"Border types");
        butonPanel.setBorder(title);

        setLayout(new GridLayout(2,1));
        add(butonPanel);
        add(demoPanel);

        pack();
        setVisible(true);
    }

    private void addButton(String name, Border border) {
        JRadioButton button = new JRadioButton(name);
        buttonGroup.add(button);
        butonPanel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                demoPanel.setBorder(border);
            }
        });
    }


    public static void main(String[] args) throws IOException {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TestClass();
            }
        });
    }


}

