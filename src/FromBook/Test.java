package FromBook;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;


public class Test extends JFrame implements ActionListener{
    private JLabel jlab = new JLabel();

    public Test() {
        setTitle("Menu Frame");
        setLayout(new FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        /*Полоса меню*/
        JMenuBar menu = new JMenuBar();

        JMenu file = new JMenu("File");
        ImageIcon openI = new ImageIcon("G:\\icons\\open.png");
        JMenuItem open = new JMenuItem("Open",openI);
        open.setToolTipText("Открытие файла");
        ImageIcon closeI = new ImageIcon("G:\\icons\\close.png");
        JMenuItem close = new JMenuItem("Close",closeI);
        ImageIcon saveI = new ImageIcon("G:\\icons\\save.png");
        JMenuItem save = new JMenuItem("Save",saveI);
        ImageIcon exitI = new ImageIcon("G:\\icons\\exit.png");
        JMenuItem exit = new JMenuItem("Exit",exitI);
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


        JMenu settings = new JMenu("Settings");
        JMenu display = new JMenu("Display");
        JMenu rezolution = new JMenu("Rezolution");
        JMenuItem small = new JMenuItem("1024x720");
        JMenuItem medium = new JMenuItem("1920x1080");
        JMenuItem big = new JMenuItem("2600x1400");
        rezolution.add(small);
        rezolution.add(medium);
        rezolution.add(big);
        display.add(rezolution);
        settings.add(display);
        menu.add(settings);


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
        small.addActionListener(this);
        medium.addActionListener(this);
        big.addActionListener(this);

        add(jlab);

        setJMenuBar(menu);

        JButton enterB = new JButton("Вход");
        JButton exitB = new JButton("Выход");
        enterB.setToolTipText("Вход в аккаунт");
        exitB.setToolTipText("Выход из программы");

        add(enterB);
        add(exitB);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("Exit"))
            System.exit(0);
        jlab.setText(s + " Selected");
    }
}


