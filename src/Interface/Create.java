package Interface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Create extends JFrame implements ActionListener {

    private JPanel panel;
    private JButton enterButton;
    private JButton cancelButton;

    public Create(){
        setTitle("Реєстрація");
        setSize(300,225);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        panel = new JPanel();
        panel.setLayout(null);

        JLabel loginLabel = new JLabel("Логін");
        loginLabel.setBounds(10,10,80,25);
        panel.add(loginLabel);

        JTextField loginText = new JTextField(20);
        loginText.setBounds(100,10,160,25);
        panel.add(loginText);

        JLabel passwordLabel = new JLabel("Пароль");
        passwordLabel.setBounds(10,40,80,25);
        panel.add(passwordLabel);

        JTextField passwordText = new JTextField(20);
        passwordText.setBounds(100,40,160,25);
        panel.add(passwordText);

        JLabel firstNameLabel = new JLabel("Ім'я");
        firstNameLabel.setBounds(10,70,80,25);
        panel.add(firstNameLabel);

        JTextField firstNameText = new JTextField(20);
        firstNameText.setBounds(100,70,160,25);
        panel.add(firstNameText);

        JLabel lastNameLabel = new JLabel("Прізвище");
        lastNameLabel.setBounds(10,100,80,25);
        panel.add(lastNameLabel);

        JTextField lastNameText = new JTextField(20);
        lastNameText.setBounds(100,100,160,25);
        panel.add(lastNameText);


        enterButton = new JButton("Так");
        enterButton.setBounds(10,150,80,25);
        enterButton.addActionListener(this);
        panel.add(enterButton);

        cancelButton = new JButton("Відміна");
        cancelButton.setBounds(160,150,100,25);
        cancelButton.addActionListener(this);
        panel.add(cancelButton);

        add(panel);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Так")){
            System.out.println("Yes");
        }
        if (command.equals("Відміна")){
            System.out.println("Cancel");
            System.exit(0);
        }
    }
}
