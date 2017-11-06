package Interface;

import dao.Implementation.UserImplementation;
import dao.UserDAO;
import domain.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class CreateUserWindow extends JFrame{

    private String login;
    private String password;
    private String firstName;
    private String lastName;

    //boolean isActive = true;

   public CreateUserWindow(){
       setTitle("Create user menu");
       setLayout(new FlowLayout());
       setSize(400,200);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);

       JLabel loginLabel = new JLabel("Login: ");
       JLabel passwordLabel = new JLabel("Password: ");
       JLabel firstNameLabel = new JLabel("First name: ");
       JLabel lastNameLabel = new JLabel("Last name: ");

       JTextField loginField = new JTextField(15);
       JTextField passwordField = new JTextField(15);
       JTextField firstNameField = new JTextField(15);
       JTextField lastNameField = new JTextField(15);

       JButton saveButton = new JButton("Save");
       JButton cancelButton = new JButton("Cancel");

       add(loginLabel);
       add(loginField);
       add(passwordLabel);
       add(passwordField);
       add(firstNameLabel);
       add(firstNameField);
       add(lastNameLabel);
       add(lastNameField);

       add(saveButton);
       add(cancelButton);

       loginField.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               login = loginField.getText();
           }
       });

       passwordField.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               password = passwordField.getText();
           }
       });

       firstNameField.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               firstName = firstNameField.getText();
           }
       });

       lastNameField.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               lastName = lastNameField.getText();
           }
       });

       saveButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               User user = new User();
               UserDAO userImp = new UserImplementation();

               user.setLogin(login);
               user.setPassword(password);
               user.setFirstName(firstName);
               user.setLastName(lastName);

               //2System.out.println("LOGIN:  " + login + ", PASSWORD: " + password + " ,FIRST_NAME: " + firstName + ", LAST_NAME: " + lastName + " ");

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


   }

   public void hideWindow(){
       setVisible(false);
   }
}
