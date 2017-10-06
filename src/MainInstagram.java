import dao.Implementation.UserService;
import dao.UserDAO;
import entity.User;

import java.sql.SQLException;

import static java.time.LocalDate.now;

/**
 * Created by Sasha on 04.10.2017.
 */
public class MainInstagram {
    public static void main(String[] args) throws ClassNotFoundException {
        //DBConnection dbConnection = new DBConnection();
        //dbConnection.getConnection();

        UserDAO userService = new UserService();

        User user = new User();
/*
        user.setLogin("111");
        user.setPassword("33");
        user.setFirstName("44");
        user.setLastName("55");

        try {
            userService.addUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
*/

        user.setLogin("tmoskaliuk");
        user.setPassword("tania1991");


        //System.out.println(login + " " + password );

        System.out.println("user id: " + userService.getUserByLoginAndPassword(user.getLogin(),user.getPassword()));


    }
}
