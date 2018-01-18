package Interface;

import dao.Implementation.UserImplementation;
import dao.UserDAO;
import domain.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class CreateUserWindow extends JFrame implements ActionListener{

    private JPanel panel;
    private JButton enterButton, cancelButton;
    private JLabel loginLabel, passwordLabel, firstNameLabel, lastNameLabel;
    private JTextField loginText, passwordText, firstNameText, lastNameText;

    public CreateUserWindow(String name){
        this.setTitle(name);
        this.setSize(280,225);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        panel = new JPanel();
        panel.setLayout(null);

        loginLabel = new JLabel("Логін");
        loginLabel.setBounds(10,10,80,25);
        panel.add(loginLabel);

        loginText = new JTextField(20);
        loginText.setBounds(100,10,160,25);
        panel.add(loginText);

        passwordLabel = new JLabel("Пароль");
        passwordLabel.setBounds(10,40,80,25);
        panel.add(passwordLabel);

        passwordText = new JTextField(20);
        passwordText.setBounds(100,40,160,25);
        panel.add(passwordText);

        firstNameLabel = new JLabel("Ім'я");
        firstNameLabel.setBounds(10,70,80,25);
        panel.add(firstNameLabel);

        firstNameText = new JTextField(20);
        firstNameText.setBounds(100,70,160,25);
        panel.add(firstNameText);

        lastNameLabel = new JLabel("Прізвище");
        lastNameLabel.setBounds(10,100,80,25);
        panel.add(lastNameLabel);

        lastNameText = new JTextField(20);
        lastNameText.setBounds(100,100,160,25);
        panel.add(lastNameText);


        enterButton = new JButton("Так");
        enterButton.setBounds(30,150,80,25);
        enterButton.setActionCommand("enterEnter");
        enterButton.addActionListener(this);
        panel.add(enterButton);

        cancelButton = new JButton("Відміна");
        cancelButton.setBounds(140,150,100,25);
        cancelButton.setActionCommand("cancelEnter");
        cancelButton.addActionListener(this);
        panel.add(cancelButton);

        this.add(panel);

        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("enterEnter")){
            String login = loginText.getText();
            String password = passwordText.getText();
            String firstName = firstNameText.getText();
            String lastName = lastNameText.getText();

            User user = new User();
            UserDAO userImp = new UserImplementation();

            user.setLogin(login);
            user.setPassword(password);
            user.setFirstName(firstName);
            user.setLastName(lastName);
            try {
                userImp.addUser(user);
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
        if (e.getActionCommand().equals("cancelEnter")){
            ExitWindow exitWindow = new ExitWindow("Вихід");
        }
    }
}
