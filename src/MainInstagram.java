import dao.Implementation.PhotoService;
import dao.Implementation.UserService;
import dao.PhotoDAO;
import dao.UserDAO;
import entity.Photo;
import entity.User;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import static java.time.LocalDate.now;

/**
 * Created by Sasha on 04.10.2017.
 */
public class MainInstagram {
    public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException {
        //DBConnection dbConnection = new DBConnection();
        //dbConnection.getConnection();
/*
        UserDAO userService = new UserService();

        User user = new User();
*/

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

        PhotoDAO photoService = new PhotoService();
        Photo photo = new Photo();

/*
        photo.setId(1);

        try {
            System.out.println(photoService.getPhotoById(photo.getId()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
*/
/*
        photo.setUserId(1);
        photo.setName("dfdfdf/dfdfdf.jpg");

        try {
            photoService.addPhoto(photo);
        } catch (SQLException e) {
            e.printStackTrace();
        }
*/
/*
        //photo.setUserId(1);
        try {
            System.out.println(photoService.getAllUserPhoto(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */
        /*
        photo.setId(5);
        try {
            photoService.removePhoto(photo);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */
    }
}
