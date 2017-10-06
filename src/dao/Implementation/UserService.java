package dao.Implementation;

import Connection.DBConnection;
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

    PreparedStatement preparedStatement = null;

    ResultSet resultSet = null;

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();

    private String sql = "";


    @Override
    public void addUser(User user) throws SQLException {
        sql = "INSERT INTO USER (LOGIN, PASSWORD, FIRST_NAME, LAST_NAME, INSERT_DT) VALUES(?,?,?,?,?)";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, user.getLogin());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getFirstName());
            preparedStatement.setString(4, user.getLastName());
            preparedStatement.setString(5, dtf.format(now));

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
    public User getUserById(long id) throws SQLException {
        User user = new User();

        sql = "SELECT ID, LOGIN, PASSWORD, FIRST_NAME, LAST_NAME, INSERT_DT FROM USER WHERE ID = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);

            resultSet = preparedStatement.executeQuery();
            user.setId(resultSet.getLong("ID"));
            user.setLogin(resultSet.getString("LOGIN"));
            user.setPassword(resultSet.getString("PASSWORD"));
            user.setFirstName(resultSet.getString("FIRST_NAME"));
            user.setLastName(resultSet.getString("LAST_NAME"));
            //user.setInsertDt(resultSet.getDate("ID"));

        } catch (SQLException e1) {
            e1.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null){
                connection.close();
            }
        }
        return user;
    }

    @Override
    public User getUserByLoginAndPassword(String login, String password){
        User user = new User();

        sql = "SELECT ID, LOGIN, PASSWORD, FIRST_NAME, LAST_NAME, INSERT_DT FROM USER WHERE LOGIN = ? AND PASSWORD = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, password);

            resultSet = preparedStatement.executeQuery();

            user.setId(resultSet.getLong("ID"));
            user.setLogin(resultSet.getString("LOGIN"));
            user.setPassword(resultSet.getString("PASSWORD"));
            user.setFirstName(resultSet.getString("FIRST_NAME"));
            user.setLastName(resultSet.getString("LAST_NAME"));
           // user.setInsertDt(resultSet.getDate("INSERT_DT"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void updateUser(User user) throws SQLException {
        sql = "UPDATE USER SET LOGIN = ?, FIRST_NAME = ?, LAST_NAME = ? WHERE ID = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, user.getLogin());
            preparedStatement.setString(2, user.getFirstName());
            preparedStatement.setString(3, user.getLastName());
            preparedStatement.setLong(4, user.getId());

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
    public void removeUser(User user) throws SQLException {
        sql = "DELETE FROM USER WHERE ID = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, user.getId());

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
}
