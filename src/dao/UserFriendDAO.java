package dao;

import entity.User;
import entity.UserFriend;

import java.util.List;

/**
 * Created by Sasha on 05.10.2017.
 */
public interface UserFriendDAO {
    //create
    void addFriend(User user);

    //read
    List<UserFriend> getAllFriends();

    //update

    //delete
    void removeFriend(UserFriend userFriend);
}
