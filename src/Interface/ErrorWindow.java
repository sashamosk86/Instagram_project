package Interface;

import FromBook.CheckBoxFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ErrorWindow extends JFrame {

    private JPanel northPanel;
    private JPanel southPanel;
    private  JButton button;

    public ErrorWindow(){
        setTitle("Помилка входу");
        setSize(300,100);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        northPanel = new JPanel();
        northPanel.add(new JLabel("Кокристувач не знайдений!",SwingConstants.CENTER));

        ActionListener listEvent = new ActionListEvent();

        southPanel = new JPanel();
        button = new JButton("Ок");
        button.addActionListener(listEvent);
        southPanel.add(button);


        add(northPanel, BorderLayout.NORTH);
        add(southPanel, BorderLayout.CENTER);
    }

    public class ActionListEvent implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
        }
    }
}
