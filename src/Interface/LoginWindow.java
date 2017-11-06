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
    private JPanel panel;

    private String login = "";
    private String password = "";

    public LoginWindow(){

        setTitle("Log in");
        setLayout(new FlowLayout());
        setSize(400,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        JLabel jLoginLabel = new JLabel("Login:");
        JLabel jPasswordLabel = new JLabel("Password:");


        JTextField jLoginText = new JTextField(15);
        JTextField jPasswordText = new JTextField(15);

        JButton jEnterButton = new JButton("Enter");
        JButton jExitButton = new JButton("Exit");

        JButton jCreateUserButton = new JButton("Create new user");


        add(jLoginLabel);
        add(jLoginText);

        add(jPasswordLabel);
        add(jPasswordText);

        add(jEnterButton);
        add(jExitButton);

        add(jCreateUserButton);





        jLoginText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login = jLoginText.getText();
                System.out.println(login);
            }
        });

        jPasswordText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                password = jPasswordText.getText();
                System.out.println(password);
            }
        });

        jEnterButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                User user = new User();
                UserDAO userImpl = new UserImplementation();
                try {
                    System.out.println(userImpl.getUserByLoginAndPassword(login,password));
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });

        jExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Bye");
                ExitWindow exitWindow = new ExitWindow();
            }
        });

        jCreateUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateUserWindow createUserWindow = new CreateUserWindow();
                System.out.println("Ceate user");
            }
        });



    }

}
