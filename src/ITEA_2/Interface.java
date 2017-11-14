package ITEA_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Interface extends JFrame {
    private JLabel label;
    private JButton buttonRU;
    private JButton buttonDE;
    private JPanel panel;

    public Interface(){
        setSize(200,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        label = new JLabel("TEXT");

        panel = new JPanel();
        panel.setLayout(new GridLayout(1,2));

        buttonRU = new JButton("RU");
        buttonDE = new JButton("DE");

        panel.add(buttonRU);
        panel.add(buttonDE);

        add(label,BorderLayout.CENTER);
        add(panel,BorderLayout.SOUTH);

        buttonRU.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //label.setText(e.);
            }
        });

        buttonDE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //label.setText(e.);
            }
        });


    }
}
