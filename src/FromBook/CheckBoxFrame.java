package FromBook;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxFrame extends JFrame {

    private JLabel label;
    private JPanel panel;

    private JCheckBox bold;
    private JCheckBox italic;

    private static final int FONTSIZE = 24;
    private int mode;

    public CheckBoxFrame(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        label = new JLabel("Qiuck brown fox");
        label.setFont(new Font("Serif", Font.BOLD, FONTSIZE));
        add(label, BorderLayout.CENTER);


        panel = new JPanel();

        ActionListener listEvent = new ActionListEvent();

        bold = new JCheckBox("Bold");
        bold.setSelected(true);
        bold.addActionListener(listEvent);
        panel.add(bold);

        italic = new JCheckBox("Italic");
        italic.addActionListener(listEvent);
        panel.add(italic);


        add(panel,BorderLayout.SOUTH);

        pack();
    }

    public class ActionListEvent implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            mode = 0;
            if (bold.isSelected()) {
                mode += Font.BOLD;
            }
            if (italic.isSelected()){
                mode += Font.ITALIC;
            }
            label.setFont(new Font("Serif", mode, FONTSIZE));
        }
    }


}
