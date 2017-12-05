package Interface;

import dao.Implementation.UserImplementation;
import dao.UserDAO;
import domain.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class CreateUserWindow extends JFrame{

    private JPanel panel;
    private JButton enterButton;
    private JButton cancelButton;

    public CreateUserWindow(){
        setTitle("Реєстрація");
        setSize(280,225);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


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
        enterButton.setBounds(30,150,80,25);
        panel.add(enterButton);

        cancelButton = new JButton("Відміна");
        cancelButton.setBounds(140,150,100,25);
        panel.add(cancelButton);

        add(panel);


        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

//                if (login == "" || password == "" || firstName == "" || lastName == ""){
//
//                }

                try {
                    userImp.addUser(user);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ExitWindow exitWindow = new ExitWindow();

            }
        });


        setVisible(true);

    }

}
