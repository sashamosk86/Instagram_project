package dao.Implementation;

import Connection.DBConnection;
import dao.PhotoLikeDAO;
import entity.PhotoLike;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class PhotoLikeService extends DBConnection implements PhotoLikeDAO {
    Connection connection = getConnection();
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    private String sql = "";

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();

    @Override
    public void addLike(PhotoLike photoLike) throws SQLException {
        sql = "INSERT INTO PHOTO_LIKE (PHOTO_ID,USER_ID,USER_LOGIN,INSERT_DT) VALUES(?,?,?,?)";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1,photoLike.getPhotoId());
            preparedStatement.setLong(2,photoLike.getUserId());
            preparedStatement.setString(3,photoLike.getUserLogin());
            preparedStatement.setString(4,dtf.format(now));
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
    public List<PhotoLike> getAllLikes() {
        return null;
    }

    @Override
    public void removeLike(PhotoLike photoLike) {

    }
}
