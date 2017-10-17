package Interface;

import dao.Implementation.UserImplementation;
import dao.UserDAO;
import domain.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class LoginWindow{
    private JLabel jlab;
    private JTextField jtf;

    private String enteredLogin = "";
    private String enteredPassword = "";

    public LoginWindow(){

        JFrame jfrm = new JFrame("Instagram");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(400,250);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Ярлыки
        JLabel jLoginLabel = new JLabel("Login:");
        JLabel jPasswordLabel = new JLabel("Password:");
        // Поля ввода текста
        JTextField jLoginText = new JTextField(15);
        JTextField jPasswordText = new JTextField(15);
        // Кнопки
        JButton jEnterButton = new JButton("Enter");
        JButton jExitButton = new JButton("Exit");


        JButton jCreateUserButton = new JButton("Create new user");


        jLoginText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enteredLogin = jLoginText.getText();
                System.out.println(enteredLogin);
            }
        });

        jPasswordText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enteredPassword = jPasswordText.getText();
                System.out.println(enteredPassword);
            }
        });


        jEnterButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                User user = new User();
                UserDAO userImpl = new UserImplementation();
                try {
                    System.out.println(userImpl.getUserByLoginAndPassword(enteredLogin,enteredPassword));
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });

        jExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Exit");
                System.out.println("Bye");
            }
        });

        jCreateUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Create user");
                System.out.println("Ceate user");
            }
        });

        // добавляем все в Фрейм
        jfrm.add(jLoginLabel);
        jfrm.add(jLoginText);

        jfrm.add(jPasswordLabel);
        jfrm.add(jPasswordText);

        jfrm.add(jEnterButton);
        jfrm.add(jExitButton);

        jfrm.add(jCreateUserButton);

        jlab = new JLabel("Press a button.");

        jfrm.add(jlab);

//        ImageIcon ii = new ImageIcon("C:\\Users\\Sasha\\Desktop\\IMAG0701.jpg");
//        JLabel jl = new JLabel("AAA", ii,JLabel.CENTER );
//
//        jfrm.add(jl);

        jfrm.setVisible(true);

    }
}
