package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CUW extends JFrame {

    private JPanel northPanel;
    private JPanel southPanel;
   // private JPopupMenu popupMenu;

    public  CUW(){
        setSize(350,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        northPanel = new JPanel();
        northPanel.setLayout(new GridLayout( 4,2));

        northPanel.add(new JLabel("Логін:",SwingConstants.LEFT));
        JTextField loginText = new JTextField(18);
        northPanel.add(loginText);

        northPanel.add(new JLabel("Пароль:",SwingConstants.LEFT));
        JTextField passwordText = new JTextField(18);
        northPanel.add(passwordText);

        northPanel.add(new JLabel("Ім'я:",SwingConstants.LEFT));
        JTextField firstNameText = new JTextField(18);
        northPanel.add(firstNameText);

        northPanel.add(new JLabel("Прізвище:",SwingConstants.LEFT));
        JTextField lastNameText = new JTextField(18);
        northPanel.add(lastNameText);

        /*
        popupMenu = new JPopupMenu();
        JMenuItem copyItem = new JMenuItem("Копіювати");
        JMenuItem pasteItem = new JMenuItem("Вставити");
        JMenuItem cutItem = new JMenuItem("Вирізати");
        popupMenu.add(copyItem);
        popupMenu.add(pasteItem);
        popupMenu.add(cutItem);
       */


        southPanel = new JPanel();
        JButton saveButton = new JButton("Зберегти");
        JButton cancelButton = new JButton("Відмінити");
        southPanel.add(saveButton);
        southPanel.add(cancelButton);

        add(northPanel,BorderLayout.CENTER);
        add(southPanel,BorderLayout.SOUTH);
    }
}
