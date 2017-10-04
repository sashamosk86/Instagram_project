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
    User getUserByLoginAndPassword(User login, User password); // get user data by login and password

    // update
    void updateUser(User user); // update user

    // delete
    void removeUser(User user); // set user inactive and invisible

}
