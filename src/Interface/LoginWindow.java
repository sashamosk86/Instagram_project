package Interface;

import dao.Implementation.UserImplementation;
import dao.UserDAO;
import domain.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.TreeMap;

public class LoginWindow extends JFrame implements ActionListener{

    private JPanel panel;
    private JLabel loginLabel, passwordLabel;
    private JTextField loginText, passwordText;
    private JButton enterButton, registerButton, exitButton;



    public LoginWindow(String name){
        this.setTitle(name);
        this.setSize(320,190);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
/*
        UIManager.LookAndFeelInfo[] lookAndFeelInfos = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo l: lookAndFeelInfos) {
            System.out.println(l.getName());
            System.out.println(l.getClassName());

//            Metal
//            javax.swing.plaf.metal.MetalLookAndFeel
//                    Nimbus
//            javax.swing.plaf.nimbus.NimbusLookAndFeel
//            CDE/Motif
//            com.sun.java.swing.plaf.motif.MotifLookAndFeel
//                    Windows
//            com.sun.java.swing.plaf.windows.WindowsLookAndFeel
//            Windows Classic
//            com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel


        }

*/
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        panel = new JPanel();
        panel.setLayout(null);

        loginLabel = new JLabel("Логін: ");
        loginLabel.setBounds(10,10,80,25);
        panel.add(loginLabel);

        loginText = new JTextField(20);
        loginText.setBounds(100,10,200,25);
        panel.add(loginText);

        passwordLabel = new JLabel("Пароль: ");
        passwordLabel.setBounds(10,40,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100,40,200,25);
        panel.add(passwordText);


        ImageIcon ukrIcon = new ImageIcon("ukraine.png","ua");
        ImageIcon usaIcon = new ImageIcon("united-states.png","en");
        ImageIcon rusIcon = new ImageIcon("russia.png","ru");
        JComboBox<ImageIcon> languageBox = new JComboBox<>();
        languageBox.addItem(ukrIcon);
        languageBox.addItem(usaIcon);
        languageBox.addItem(rusIcon);

        languageBox.setBounds(250,80,50,25);
        panel.add(languageBox);

        enterButton = new JButton("Вхід");
        enterButton.setBounds(10,120,80,25);
        enterButton.setActionCommand("enterSystem");
        enterButton.addActionListener(this);
        panel.add(enterButton);

        registerButton = new JButton("Реєстрація");
        registerButton.setBounds(105,120,100,25);
        registerButton.setActionCommand("registerNewUser");
        registerButton.addActionListener(this);
        panel.add(registerButton);

        exitButton = new JButton("Вихід");
        exitButton.setBounds(220,120,80,25);
        exitButton.setActionCommand("exitSystem");
        exitButton.addActionListener(this);
        panel.add(exitButton);

        this.add(panel);

        //this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("enterSystem")){
            String login = "omoskaliuk"; //loginText.getText();
            System.out.println(login);

            String password = "sasha1986";//new String(passwordText.getText());
            System.out.println(password);

            User user = new User();
            UserDAO userImpl = new UserImplementation();
            try {
                user = userImpl.getUserByLoginAndPassword(login,password);
                long id = user.getId();
                //System.out.println("" + id);
                if (id == 0){
                    new ErrorWindow("Помилка").setVisible(true);
                }else {
                    new MainWindow(user).setVisible(true);
                    this.setVisible(false);
                }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
        }
        if (e.getActionCommand().equals("registerNewUser")){
            CreateUserWindow createUserWindow = new CreateUserWindow("Реєстрація");
        }
        if (e.getActionCommand().equals("exitSystem")){
            System.exit(0);
        }
    }
}
