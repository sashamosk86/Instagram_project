package Interface;

import dao.Implementation.UserImplementation;
import dao.UserDAO;
import domain.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class LoginWindow extends JFrame{
    private JPanel northPanel;
    private JPanel centerPpanel;
    private JPanel southPpanel;

    private String login = "";
    private String password = "";

    public LoginWindow(){

        setTitle("Вхід до системи");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(2,2));

        northPanel.add(new JLabel("Логін:",SwingConstants.LEFT));
        JTextField LoginText = new JTextField(15);
        northPanel.add(LoginText);

        northPanel.add(new JLabel("Пароль:",SwingConstants.LEFT));
        JTextField PasswordText = new JTextField(15);
        northPanel.add(PasswordText);


        centerPpanel = new JPanel();
        JButton EnterButton = new JButton("Вхід");
        JButton ExitButton = new JButton("Відміна");
        centerPpanel.add(EnterButton);
        centerPpanel.add(ExitButton);


        southPpanel = new JPanel();
        JButton CreateUserButton = new JButton("Зареєструватися");
        southPpanel.add(CreateUserButton);


        add(northPanel,BorderLayout.NORTH);
        add(centerPpanel,BorderLayout.CENTER);
        add(southPpanel,BorderLayout.SOUTH);
/*

        LoginText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login = LoginText.getText();
                System.out.println(login);
            }
        });

        PasswordText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                password = PasswordText.getText();
                System.out.println(password);
            }
        });
*/
        EnterButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                login = LoginText.getText();
                System.out.println(login);

                password = PasswordText.getText();
                System.out.println(password);

                User user = new User();
                UserDAO userImpl = new UserImplementation();
                try {
                    System.out.println(userImpl.getUserByLoginAndPassword(login,password));
                    userImpl.getUserByLoginAndPassword(login,password);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                    //ErrorWindow errorWindow = new ErrorWindow();
                }
            }
        });

        ExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Bye");
                ExitWindow exitWindow = new ExitWindow();
            }
        });

        CreateUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateUserWindow createUserWindow = new CreateUserWindow();
                System.out.println("Ceate user");
            }
        });

        pack();

    }

}
