package FromBook;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Test extends JFrame implements ActionListener{
    private JLabel jlab = new JLabel();

    public Test() {
        setTitle("Menu Frame");
        setLayout(new FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);




        JMenuBar menu = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem close = new JMenuItem("Close");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");
        file.add(open);
        file.add(close);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        menu.add(file);


        JMenu options = new JMenu("Options");

        JMenu colors = new JMenu("Colors");
        JMenuItem red = new JMenuItem("Red");
        JMenuItem green = new JMenuItem("Green");
        JMenuItem blue = new JMenuItem("Blue");
        colors.add(red);
        colors.add(green);
        colors.add(blue);
        options.add(colors);

        JMenu priority = new JMenu("Priority");
        JMenuItem high = new JMenuItem("High");
        JMenuItem low = new JMenuItem("Low");
        priority.add(high);
        priority.add(low);
        options.add(priority);

        JMenuItem reset = new JMenuItem("Reset");
        options.add(reset);

        menu.add(options);

        JMenu help = new JMenu("Help");
        JMenuItem about = new JMenuItem("About");
        help.add(about);
        menu.add(help);

        open.addActionListener(this);
        close.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);
        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        high.addActionListener(this);
        low.addActionListener(this);
        reset.addActionListener(this);
        about.addActionListener(this);


        add(jlab);


        setJMenuBar(menu);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("Exit"))
            System.exit(0);
        jlab.setText(s + " Selected");
    }
}


