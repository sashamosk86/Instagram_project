package Test;

import dao.Implementation.UserImplementation;
import dao.UserDAO;
import domain.User;

import java.sql.SQLException;

public class UserTest {
    public static void main(String[] args) {
        UserDAO userImpl = new UserImplementation();
        User user = new User();


        // ----------------- addUser
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

        // ----------------- getUserById
/*
        user.setId(1);

        try {
            System.out.println(userService.getUserById(user.getId()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
*/

        // ----------------- getUserByLoginAndPassword
/*
        user.setLogin("tmoskaliuk");
        user.setPassword("tania1991");

        System.out.println("user id: " + userService.getUserByLoginAndPassword(user.getLogin(),user.getPassword()));
*/

        // ----------------- updateUser
/*
        user.setId(3);
        user.setLogin("vmoskaliuk");
        user.setFirstName("Slava");
        user.setLastName("Mosklaiuk");

        try {
            userService.updateUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
*/

        // ----------------- removeUser
        /*
        user.setId(4);

        try {
            userService.removeUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */
/*
        try {
            System.out.println(userImpl.getUserListByLogin("MoSkA"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */
    }
}
