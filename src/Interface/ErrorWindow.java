package Interface;

import FromBook.CheckBoxFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ErrorWindow extends JFrame implements ActionListener {

    private JPanel panel;
    private JLabel label;
    private JButton button;

    public ErrorWindow(String name){
        this.setTitle(name);
        this.setSize(250,150);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }


        panel = new JPanel();
        panel.setLayout(null);

        label = new JLabel("Кокристувач не знайдений!");
        label.setBounds(45,20,200,25);
        panel.add(label);

        button = new JButton("Ок");
        button.setBounds(85,70,80,25);
        button.setActionCommand("ok");
        button.addActionListener(this);
        panel.add(button);


        this.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("ok")){
            this.setVisible(false);
        }
    }
}
