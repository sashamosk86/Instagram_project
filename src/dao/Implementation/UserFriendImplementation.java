package dao.Implementation;

import Connection.DBConnection;
import dao.UserFriendDAO;
import domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserFriendImplementation extends DBConnection implements UserFriendDAO {

    String sql = "";

    @Override
    public void addFriend(long masterId, long slaveId) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;

        sql = "INSERT INTO USER_FRIEND (USER_MASTER_ID, USER_SLAVE_ID) VALUES (?, ?)";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1,masterId);
            preparedStatement.setLong(2,slaveId);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (preparedStatement!=null){
                preparedStatement.close();
            }
            if (connection!=null){
                connection.close();
            }
        }
    }

    @Override
    public List<User> getAllIdFriends(long masterId) throws SQLException {
        List<User> users = new ArrayList<>();
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;


        sql = "SELECT UF.ID, U.LOGIN, U.PASSWORD, U.FIRST_NAME, U.LAST_NAME\n" +
                "FROM USER_FRIEND UF\n" +
                " INNER JOIN USER U ON U.ID=UF.USER_SLAVE_ID\n" +
                "WHERE UF.USER_MASTER_ID = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1,masterId);

            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                User user = new User();

                user.setId(resultSet.getLong("ID"));
                user.setLogin(resultSet.getString("LOGIN"));
                user.setPassword(resultSet.getString("PASSWORD"));
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
    public void removeFriend(long slaveId) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;

        sql = "DELETE FROM USER_FRIEND WHERE USER_SLAVE_ID = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1,slaveId);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (preparedStatement!=null){
                preparedStatement.close();
            }
            if (connection!=null){
                connection.close();
            }
        }
    }
}
