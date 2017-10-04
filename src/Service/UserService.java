package Service;

import Logic.DBConnection;
import dao.UserDAO;
import entity.User;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Sasha on 05.10.2017.
 */
public class UserService extends DBConnection implements UserDAO {
    Connection connection = getConnection();

    @Override
    public void addUser(User user) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO USER (LOGIN, PASSWORD, FIRST_NAME, LAST_NAME) VALUES(?,?,?,?)";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, user.getLogin());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getFirstName());
            preparedStatement.setString(4, user.getLastName());
           // preparedStatement.setInt(5,user.getIsactive());
           // preparedStatement.setDate(5, user.getInsertDt());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null){
                preparedStatement.close();
            }
            if (connection != null){
                connection.close();
            }
        }

    }

    @Override
    public User getUserById(long id) {
        return null;
    }

    @Override
    public User getUserByLoginAndPassword(User login, User password) {
        return null;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void removeUser(User user) {

    }
}
