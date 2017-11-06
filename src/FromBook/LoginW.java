package FromBook;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginW extends JFrame {

    public static final int TEXT_ROWS = 8;
    public static final int TEXT_COLUMNS = 20;

    public LoginW(){
        setTitle("Вхід до системи");
        setSize(350,250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        JTextField loginField = new JTextField();
        JPasswordField passwordField = new JPasswordField();


        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(2,2));
        northPanel.add(new JLabel("Логін: ",SwingConstants.RIGHT));
        northPanel.add(loginField);
        northPanel.add(new JLabel("Пароль: ",SwingConstants.RIGHT));
        northPanel.add(passwordField);

        add(northPanel,BorderLayout.NORTH);


        JTextArea textArea = new JTextArea(TEXT_ROWS,TEXT_COLUMNS);
        JScrollPane scrollPane = new JScrollPane(textArea);

        add(scrollPane,BorderLayout.CENTER);


        JPanel southPanel = new JPanel();
        JButton insertButton = new JButton("Insert");
        southPanel.add(insertButton);


        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("User_name: "
                        + loginField.getText()
                        + " Password: "
                        + new String(passwordField.getPassword())
                        + "\n");
            }
        });


        add(southPanel,BorderLayout.SOUTH);

        //pack();
    }
}
