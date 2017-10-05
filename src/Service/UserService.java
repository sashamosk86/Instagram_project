package Service;

import Logic.DBConnection;
import dao.UserDAO;
import entity.User;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Sasha on 05.10.2017.
 */
public class UserService extends DBConnection implements UserDAO {
    Connection connection = getConnection();


    @Override
    public void addUser(User user) throws SQLException {
        PreparedStatement preparedStatement = null;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        String sql = "INSERT INTO USER (LOGIN, PASSWORD, FIRST_NAME, LAST_NAME, INSERT_DT) VALUES(?,?,?,?,?)";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, user.getLogin());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getFirstName());
            preparedStatement.setString(4, user.getLastName());
            preparedStatement.setString(5, dtf.format(now));
           // preparedStatement.setDate(5, user.getInsertDt());

           preparedStatement.execute();
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
