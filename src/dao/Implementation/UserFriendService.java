package dao.Implementation;

import Connection.DBConnection;
import dao.UserFriendDAO;
import entity.UserFriend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserFriendService extends DBConnection implements UserFriendDAO {

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
    public List<UserFriend> getAllFriends(long masterId) {
        List<UserFriend> userFriends = new ArrayList<>();
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        sql = "SELECT ID, USER_MASTER_ID, USER_SLAVE_ID FROM USER_FRIEND WHERE USER_MASTER_ID = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1,masterId);

            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                UserFriend userFriend = new UserFriend();
                userFriend.setId(resultSet.getLong("ID"));
                userFriend.setUserMasterId(resultSet.getLong("USER_MASTER_ID"));
                userFriend.setUserSlaveId(resultSet.getLong("USER_SLAVE_ID"));

                userFriends.add(userFriend);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userFriends;
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
