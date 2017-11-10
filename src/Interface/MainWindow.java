package Interface;

import dao.Implementation.UserImplementation;
import dao.UserDAO;
import domain.User;

import javax.swing.*;
import java.sql.SQLException;

public class MainWindow extends JFrame {
    User user = new User();

    public MainWindow(User user){
       setSize(400,500);
        this.user = user;
        UserDAO userImpl = new UserImplementation();
        try {
            userImpl.getUserById(user.getId());

// TODO create frame components....


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
