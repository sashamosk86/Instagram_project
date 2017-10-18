package Interface;

import dao.Implementation.UserImplementation;
import dao.UserDAO;
import domain.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class LoginWindow {
    private JLabel jlab;

    private String login = "";
    private String password = "";

    public LoginWindow(){

        JFrame jfrm = new JFrame("Instagram");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(500,250);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setVisible(true);


        JLabel jLoginLabel = new JLabel("Login:");
        JLabel jPasswordLabel = new JLabel("Password:");
        jlab = new JLabel("");

        JTextField jLoginText = new JTextField(15);
        JTextField jPasswordText = new JTextField(15);

        JButton jEnterButton = new JButton("Enter");
        JButton jExitButton = new JButton("Exit");

        JButton jCreateUserButton = new JButton("Create new user");




        // добавляем все в Фрейм:
        jfrm.add(jLoginLabel);
        jfrm.add(jLoginText);

        jfrm.add(jPasswordLabel);
        jfrm.add(jPasswordText);

        jfrm.add(jEnterButton);
        jfrm.add(jExitButton);

        jfrm.add(jCreateUserButton);

        jfrm.add(jlab);


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
                jlab.setText("Loading...");
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
                jlab.setText("Closing...");
                System.exit(0);
                System.out.println("Bye");
            }
        });

        jCreateUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateUserWindow createUserWindow = new CreateUserWindow();
                jlab.setText("Go to create user...");
                System.out.println("Ceate user");
            }
        });



    }
}
