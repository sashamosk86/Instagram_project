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
        JPanel jp1 = new JPanel();
        JLabel jl1 = new JLabel("First Name");
        JLabel jl2 = new JLabel("Last Name");
        jp1.add(jl1);
        jp1.add(jl2);
        jfrm.add(jp1);


        JPanel jp2 = new JPanel();
        JButton jb1 = new JButton("Add photo");
        JButton jb2 = new JButton("Friends");
        jp2.add(jb1);
        jp2.add(jb2);
        jfrm.add(jp2);

*/

        JPanel jp3 = new JPanel();
        jp3.setLayout(new GridLayout(20,5));
        int b = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 5; j++) {
                jp3.add(new JButton("Button " + b));
                ++b;
            }
        }
        JScrollPane jsp = new JScrollPane(jp3);
        add(jsp,BorderLayout.CENTER);

/*
        JPanel jp3 = new JPanel();
        jp3.setLayout(new GridLayout(20,5));
        int b = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 5; j++) {
                jp3.add(new JButton("Button " + b));
                ++b;
            }
        }
        JScrollPane jsp = new JScrollPane(jp3);
        jfrm.add(jsp,BorderLayout.CENTER);
*/


    }
}


