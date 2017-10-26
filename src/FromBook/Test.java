package FromBook;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
        int b = 1;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                jp.add(new JButton("Button " + b));
                ++b;
            }
        }
        JScrollPane jsp = new JScrollPane(jp);
        add(jsp, BorderLayout.CENTER);
*/

        JLabel jlab;
        ImageIcon apple,banana,cherry,kiwi,lemon,strawberry;
        JComboBox<String> jcb;

        String[] fruits = {"apple","banana","cherry","kiwi","lemon","strawberry"};

        jcb = new JComboBox<>(fruits);
        add(jcb);

        jlab = new JLabel(new ImageIcon("G:\\icons\\apple.png"));

        jcb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = (String) jcb.getSelectedItem();
                jlab.setIcon(new ImageIcon("G:\\icons\\" + s + ".png"));
            }
        });

        add(jlab);






    }
}


