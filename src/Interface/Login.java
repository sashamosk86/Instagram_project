package Interface;

import FromBook.CheckBoxFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener{

    private JPanel panel;
    private JButton enterButton;
    private JButton registerButton;

    public Login(){
        setTitle("Вікно входу");
        setSize(300,150);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        panel = new JPanel();
        panel.setLayout(null);

        JLabel loginLabel = new JLabel("Логін:");
        loginLabel.setBounds(10,10,80,25);
        panel.add(loginLabel);

        JTextField loginText = new JTextField(20);
        loginText.setBounds(100,10,160,25);
        panel.add(loginText);

        JLabel passwordLabel = new JLabel("Пароль:");
        passwordLabel.setBounds(10,40,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,40,160,25);
        panel.add(passwordText);


        enterButton = new JButton("Вхід");
        enterButton.setBounds(10,80,80,25);
        enterButton.addActionListener(this);
        panel.add(enterButton);

        ImageIcon ukrIcon = new ImageIcon("ukraine.png");
        ImageIcon usaIcon = new ImageIcon("united-states.png");
        ImageIcon rusIcon = new ImageIcon("russia.png");
        JComboBox<ImageIcon> languageBox = new JComboBox<ImageIcon>();
        languageBox.addItem(ukrIcon);
        languageBox.addItem(usaIcon);
        languageBox.addItem(rusIcon);
        languageBox.setBounds(100,80,50,25);
        panel.add(languageBox);

        registerButton = new JButton("Реєстрація");
        registerButton.setBounds(160,80,100,25);
        registerButton.addActionListener(this);
        panel.add(registerButton);

        add(panel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Вхід")){
            System.out.println("Entering");
        }
        if (command.equals("Реєстрація")){
            System.out.println("Registering");
        }
        System.out.println("----");
    }
}
