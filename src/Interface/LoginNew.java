package Interface;

import javax.swing.*;
import java.awt.*;

public class LoginNew extends JFrame {
    private JLabel loginLabel, passwordLabel;
    private JTextField loginField;
    private JPasswordField passwordField;
    private JComboBox themeList, languageList;
    private JButton enterButton, regButton, exitButton;


    public LoginNew(String name){
        super(name);
        this.setSize(280,200);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        loginLabel = new JLabel("Login: ");
        passwordLabel = new JLabel("Password: ");

        loginField = new JTextField(20);
        passwordField = new JPasswordField(20);

        enterButton = new JButton("Enter");
        regButton = new JButton("Registration");
        exitButton = new JButton("Exit");





        this.setVisible(true);
    }

    public static void main(String[] args) {
        new LoginNew("Login Window");
    }
}
