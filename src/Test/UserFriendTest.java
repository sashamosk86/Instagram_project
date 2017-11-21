package Test;

import dao.*;
import dao.Implementation.*;
import domain.*;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.text.ParseException;

import static java.time.LocalDate.now;

/**
 * Created by Sasha on 04.10.2017.
 */
public class UserFriendTest {
    public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, ParseException {

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
        try {
            System.out.println(userFriendService.getAllIdFriends(userFriend.getUserMasterId()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
*/
    }
}
