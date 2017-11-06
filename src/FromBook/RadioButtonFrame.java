package FromBook;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonFrame extends JFrame {

    private JLabel label;
    private ButtonGroup group;
    private JPanel panel;

    private static final int DEFAULT_SIZE = 36;

    public RadioButtonFrame(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        label = new JLabel("Qiuck brown fox here");
        label.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
        add(label,BorderLayout.CENTER);


        panel = new JPanel();
        group = new ButtonGroup();

        addButton("Small",16);
        addButton("Medium",22);
        addButton("Large",30);
        addButton("Extra Large",36);

        add(panel,BorderLayout.SOUTH);

        pack();
    }

    public void addButton(String name, int size){
        boolean selected = size == DEFAULT_SIZE;
        JRadioButton button = new JRadioButton(name,selected);
        group.add(button);
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setFont(new Font("Serif", Font.PLAIN, size));
            }
        });
    }
}
