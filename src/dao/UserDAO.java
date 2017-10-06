package dao;

import entity.User;

import java.sql.SQLException;

/**
 * Created by Sasha on 05.10.2017.
 */
public interface UserDAO {
    // create
    void addUser(User user) throws SQLException; // add new user

    // read
    User getUserById(long id); // get user data by his id
    User getUserByLoginAndPassword(String login, String password); // get user data by login and password

    // update
    void updateUser(User user) throws SQLException; // update user

    // delete
    void removeUser(User user) throws SQLException; // delete user

}
