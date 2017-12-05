package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitWindow extends JFrame{

    private JLabel label;
    private JPanel inPanel;
    private JPanel outPanel;

    public ExitWindow(){
        setSize(250,150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        outPanel = new JPanel();
        outPanel.setLayout(new GridLayout(2,1));

        label = new JLabel("Ви дійсно бажаєте вийти?",SwingConstants.CENTER);
        outPanel.add(label, BorderLayout.CENTER);

        inPanel = new JPanel();
        JButton yes = new JButton("Так");
        JButton no = new JButton("Ні");
        inPanel.add(yes);
        inPanel.add(no);
        outPanel.add(inPanel,BorderLayout.SOUTH);

        add(outPanel,BorderLayout.CENTER);


        yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                setVisible(false);
                CreateUserWindow createUserWindow = new CreateUserWindow();
                createUserWindow.setVisible(false);

            }
        });

        no.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }
}
