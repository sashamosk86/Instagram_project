package dao.Implementation;

import Connection.DBConnection;
import dao.UserFriendDAO;
import entity.User;

import java.util.List;

public class UserFriend extends DBConnection implements UserFriendDAO {
    @Override
    public void addFriend(User user) {

    }

    @Override
    public List<entity.UserFriend> getAllFriends() {
        return null;
    }

    @Override
    public void removeFriend(entity.UserFriend userFriend) {

    }
}
