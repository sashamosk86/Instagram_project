package Interface;

import dao.Implementation.UserImplementation;
import dao.UserDAO;
import domain.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class CreateUserWindow {

    private String login;
    private String password;
    private String firstName;
    private String lastName;

   public CreateUserWindow(){
       JFrame jfrm = new JFrame("Create user menu");
       jfrm.setLayout(new FlowLayout());
       jfrm.setSize(400,200);
       jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jfrm.setVisible(true);

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

       jfrm.add(loginLabel);
       jfrm.add(loginField);
       jfrm.add(passwordLabel);
       jfrm.add(passwordField);
       jfrm.add(firstNameLabel);
       jfrm.add(firstNameField);
       jfrm.add(lastNameLabel);
       jfrm.add(lastNameField);

       jfrm.add(saveButton);
       jfrm.add(cancelButton);

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
}
