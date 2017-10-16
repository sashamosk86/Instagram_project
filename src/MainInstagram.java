import dao.*;
import dao.Implementation.*;
import domain.*;

import java.io.FileNotFoundException;
import java.text.ParseException;

import static java.time.LocalDate.now;

/**
 * Created by Sasha on 04.10.2017.
 */
public class MainInstagram {
    public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, ParseException {
        //DBConnection dbConnection = new DBConnection();
        //dbConnection.getConnection();

        UserDAO userService = new UserImplementation();
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

        PhotoDAO photoService = new PhotoImplementation();
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
        photo.setName("111");

        try {
            photoService.addPhoto(photo);
        } catch (SQLException e) {
            e.printStackTrace();
        }
*/
/*E:\Sasha\Instagram_project\ква_2.jpg
        //photo.setUserId(1);
        try {
            System.out.println(photoService.getAllUserPhoto(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */
/*
        photo.setId(6);
        try {
            photoService.removePhoto(photo);
        } catch (SQLException e) {
            e.printStackTrace();
        }
*/

        PhotoCommentDAO photoCommentService = new PhotoCommentImplementation();
        PhotoComment photoComment = new PhotoComment();

        /*
        photoComment.setPhotoId(1);
        photoComment.setUserId(1);
        photoComment.setComment("Thank's");

        try {
            photoCommentService.addComment(photoComment);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */
/*
        try {
            System.out.println(photoCommentService.getAllComments(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */
/*
        photoComment.setId(2);
        try {
            photoCommentService.removeComment(photoComment);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */

        PhotoLikeDAO photoLikeService = new PhotoLikeImplementation();
        PhotoLike photoLike = new PhotoLike();

        /*
        photoLike.setPhotoId(1);
        photoLike.setUserId(1);
        photoLike.setUserLogin("omoskaliuk");

        try {
            photoLikeService.addLike(photoLike);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */

        /*
        System.out.println(photoLikeService.getAllLikes(1));
        */

        UserFriendDAO userFriendService = new UserFriendImplementation();
        UserFriend userFriend = new UserFriend();

        /*
        userFriend.setUserMasterId(3);
        userFriend.setUserSlaveId(1);

        try {
            userFriendService.addFriend(userFriend.getUserMasterId(),userFriend.getUserSlaveId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */
        /*
        userFriend.setUserMasterId(1);
        System.out.println(userFriendService.getAllFriends(userFriend.getUserMasterId()));
        */
    }
}
