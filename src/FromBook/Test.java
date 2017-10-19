package FromBook;

import javax.swing.*;
import java.awt.*;



public class Test extends JFrame{
    public Test() {
        setTitle("Test");
        setLayout(new FlowLayout());
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
/*
        JTabbedPane jtb = new JTabbedPane();
        jtb.addTab("Cities", new CitiesPanel());
        jtb.addTab("Colors", new ColorsPanel());
        jtb.addTab("Flavors", new FlavorsPanel());

        add(jtb);
*/
/*
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(20,20));

        int b = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                jp.add(new JButton("Button " + b));
                ++b;
            }
        }

        JScrollPane jsp = new JScrollPane(jp);
        add(jsp, BorderLayout.CENTER);
*/

    }
}


