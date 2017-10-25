package FromBook;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlagButton extends JFrame implements ActionListener{

    private JLabel jlab;

    public FlagButton(){
        setLayout(new FlowLayout());
        setSize(400,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        ImageIcon canada = new ImageIcon("C:\\Users\\Sasha\\Downloads\\icons\\Canada-icon.png");
        JButton jb1 = new JButton(canada);
        jb1.setActionCommand("Canada");
        jb1.addActionListener(this);
        add(jb1);

        ImageIcon brazil = new ImageIcon("C:\\Users\\Sasha\\Downloads\\icons\\Brazil-icon.png");
        JButton jb2 = new JButton(brazil);
        jb2.setActionCommand("Brazil");
        jb2.addActionListener(this);
        add(jb2);

        ImageIcon usa = new ImageIcon("C:\\Users\\Sasha\\Downloads\\icons\\United-States-icon.png");
        JButton jb3 = new JButton(usa);
        jb3.setActionCommand("USA");
        jb3.addActionListener(this);
        add(jb3);

        ImageIcon ukraine = new ImageIcon("C:\\Users\\Sasha\\Downloads\\icons\\Ukraine-icon.png");
        JButton jb4 = new JButton(ukraine);
        jb4.setActionCommand("Ukraine");
        jb4.addActionListener(this);
        add(jb4);

        jlab = new JLabel("Choose flag");
        add(jlab);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jlab.setText("You choosed: " + e.getActionCommand());

    }
}
