package dao.Implementation;

import Connection.DBConnection;
import dao.UserDAO;
import domain.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sasha on 05.10.2017.
 */
public class UserImplementation extends DBConnection implements UserDAO {
    private String sql = "";


    @Override
    public void addUser(User user) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;

        sql = "INSERT INTO USER (LOGIN, PASSWORD, FIRST_NAME, LAST_NAME) VALUES(?,?,?,?)";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, user.getLogin());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getFirstName());
            preparedStatement.setString(4, user.getLastName());

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
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        sql = "SELECT ID, LOGIN, PASSWORD, FIRST_NAME, LAST_NAME FROM USER WHERE ID = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);

            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {

                user.setId(resultSet.getLong("ID"));
                user.setLogin(resultSet.getString("LOGIN"));
                user.setPassword(resultSet.getString("PASSWORD"));
                user.setFirstName(resultSet.getString("FIRST_NAME"));
                user.setLastName(resultSet.getString("LAST_NAME"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet!=null){
                resultSet.close();
            }
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
    public User getUserByLoginAndPassword(String login, String password) throws SQLException {
        User user = new User();
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        sql = "SELECT ID, LOGIN, PASSWORD, FIRST_NAME, LAST_NAME FROM USER WHERE LOGIN = ? AND PASSWORD = ?";

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

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return user;
    }

    @Override
    public List<User> getUserListByLogin(String userLogin) throws SQLException {
        List<User> users = new ArrayList<>();
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        sql = "SELECT ID, LOGIN, FIRST_NAME, LAST_NAME FROM USER WHERE lower(LOGIN) LIKE lower(?)";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"%" + userLogin + "%");

            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                User user = new User();
                user.setId(resultSet.getLong("ID"));
                user.setLogin(resultSet.getString("LOGIN"));
                user.setFirstName(resultSet.getString("FIRST_NAME"));
                user.setLastName(resultSet.getString("LAST_NAME"));

                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (resultSet!=null){
                resultSet.close();
            }
            if (preparedStatement!=null){
                preparedStatement.close();
            }
            if (connection!=null){
                connection.close();
            }
        }
        return users;
    }

    @Override
    public void updateUser(User user) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;

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
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;

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
