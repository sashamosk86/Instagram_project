package dao.Implementation;

import Connection.DBConnection;
import dao.PhotoLikeDAO;
import domain.PhotoLike;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhotoLikeImplementation extends DBConnection implements PhotoLikeDAO {

    private String sql = "";

    @Override
    public void addLike(PhotoLike photoLike) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        sql = "INSERT INTO PHOTO_LIKE (PHOTO_ID,USER_ID,USER_LOGIN) VALUES(?,?,?)";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1,photoLike.getPhotoId());
            preparedStatement.setLong(2,photoLike.getUserId());
            preparedStatement.setString(3,photoLike.getUserLogin());
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
    public List<PhotoLike> getAllLikes(long id) {
        List<PhotoLike> photoLikes = new ArrayList<>();
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        sql = "SELECT ID, PHOTO_ID, USER_ID, USER_LOGIN FROM PHOTO_LIKE WHERE PHOTO_ID = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1,id);

            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                PhotoLike photoLike = new PhotoLike();
                photoLike.setId(resultSet.getLong("ID"));
                photoLike.setPhotoId(resultSet.getLong("PHOTO_ID"));
                photoLike.setUserId(resultSet.getLong("USER_ID"));
                photoLike.setUserLogin(resultSet.getString("USER_LOGIN"));

                photoLikes.add(photoLike);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return photoLikes;
    }

    @Override
    public void removeLike(PhotoLike photoLike) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;

        sql = "DELETE FROM PHOTO_LIKE WHERE ID = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1,photoLike.getId());

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
