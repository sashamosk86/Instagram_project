import Logic.DBConnection;
import Service.UserService;
import entity.User;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;

import static java.time.LocalDate.now;

/**
 * Created by Sasha on 04.10.2017.
 */
public class MainInstagram {
    public static void main(String[] args) throws ClassNotFoundException {
        //DBConnection dbConnection = new DBConnection();
        //dbConnection.getConnection();

        UserService userService = new UserService();

        User user = new User();
        user.setLogin("mashera");
        user.setPassword("mashera");
        user.setFirstName("Valera");
        user.setLastName("Mashera");

        try {
            userService.addUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
