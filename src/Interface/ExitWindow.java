package Interface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitWindow extends JFrame implements ActionListener{

    private JLabel label;
    private JPanel panel;
    private JButton yesButton, noButton;

    public ExitWindow(String name){
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


        label = new JLabel("Ви дійсно бажаєте вийти?");
        label.setBounds(45,20,200,25);
        panel.add(label);

        yesButton = new JButton("Так");
        yesButton.setBounds(30,70,80,25);
        yesButton.setActionCommand("yes");
        yesButton.addActionListener(this);
        panel.add(yesButton);

        noButton = new JButton("Ні");
        noButton.setBounds(130,70,80,25);
        noButton.setActionCommand("no");
        noButton.addActionListener(this);
        panel.add(noButton);

        this.add(panel);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("yes")){
            System.exit(0);
        }
        if (e.getActionCommand().equals("no")){
            setVisible(false);
        }
    }
}
