package FromBook;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Toggle extends JFrame implements ActionListener{

    private JLabel jlab;

    public Toggle(){
        setSize(300,200);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JRadioButton jrb1 = new JRadioButton("1");
        jrb1.addActionListener(this);
        add(jrb1);

        JRadioButton jrb2 = new JRadioButton("2");
        jrb2.addActionListener(this);
        add(jrb2);

        JRadioButton jrb3 = new JRadioButton("3");
        jrb3.addActionListener(this);
        add(jrb3);

        JRadioButton jrb4 = new JRadioButton("4");
        jrb4.addActionListener(this);
        add(jrb4);

        JRadioButton jrb5 = new JRadioButton("5");
        jrb5.addActionListener(this);
        add(jrb5);

        ButtonGroup bg = new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);
        bg.add(jrb3);
        bg.add(jrb4);
        bg.add(jrb5);

        jlab = new JLabel("Select number");
        add(jlab);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jlab.setText("The number is: " + e.getActionCommand());
    }
}
