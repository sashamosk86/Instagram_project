package dao;

import domain.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Sasha on 05.10.2017.
 */
public interface UserDAO {
    // create
    void addUser(User user) throws SQLException; // add new user

    // read
    User getUserById(long id) throws SQLException; // get user data by his id
    User getUserByLoginAndPassword(String login, String password) throws SQLException; // get user data by login and password
    List<User> getUserListByLogin(String userLogin) throws SQLException;

    // update
    void updateUser(User user) throws SQLException; // update user

    // delete
    void removeUser(User user) throws SQLException; // delete user

}
