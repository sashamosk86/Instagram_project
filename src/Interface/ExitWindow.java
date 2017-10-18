package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.javaws.ui.SplashScreen.hide;

public class ExitWindow{

    public ExitWindow(){
        JFrame jfrm = new JFrame("");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(250, 120);
        jfrm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jfrm.setVisible(true);

        JLabel askText = new JLabel("Do you really want to exit?");
        JButton yesButton = new JButton("Yes");
        JButton noButton = new JButton("No");

        jfrm.add(askText);
        jfrm.add(yesButton);
        jfrm.add(noButton);

        yesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        noButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // hide();
            }
        });
    }
}
