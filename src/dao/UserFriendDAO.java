package dao;

import domain.UserFriend;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Sasha on 05.10.2017.
 */
public interface UserFriendDAO {
    //create
    void addFriend(long masterId, long slaveId) throws SQLException;

    //read
    List<UserFriend> getAllFriends(long masterId) throws SQLException;

    //update

    //delete
    void removeFriend(long slaveId) throws SQLException;
}
