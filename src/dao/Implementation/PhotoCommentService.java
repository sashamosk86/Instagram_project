package dao.Implementation;

import Connection.DBConnection;
import dao.PhotoCommentDAO;
import entity.PhotoComment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PhotoCommentService extends DBConnection implements PhotoCommentDAO {
    Connection connection = getConnection();

    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    private String sql = "";

    @Override
    public void addComment(PhotoComment photoComment) throws SQLException {
        sql = "INSERT INTO PHOTO_COMMENT(PHOTO_ID, USER_ID, COMMENT) VALUES (?, ?, ?)";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1,photoComment.getPhotoId());
            preparedStatement.setLong(2,photoComment.getUserId());
            preparedStatement.setString(3,photoComment.getComment());

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
    public List<PhotoComment> getAllComments(long id) throws SQLException {
        List<PhotoComment> photoComments = new ArrayList<>();
        sql = "SELECT ID, PHOTO_ID,USER_ID,USER_LOGIN,COMMENT FROM PHOTO_COMMENT WHERE PHOTO_ID= ?";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1,id);

            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                PhotoComment photoComment = new PhotoComment();
                photoComment.setId(resultSet.getLong("ID"));
                photoComment.setPhotoId(resultSet.getLong("PHOTO_ID"));
                photoComment.setUserId(resultSet.getLong("USER_ID"));
                photoComment.setUserLogin(resultSet.getString("USER_LOGIN"));
                photoComment.setComment(resultSet.getString("COMMENT"));

                photoComments.add(photoComment);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet!=null){
                resultSet.close();
            }
            if (preparedStatement!=null){
                preparedStatement.close();
            }
            if (connection!=null) {
                connection.close();
            }
        }
        return photoComments;
    }

    @Override
    public void removeComment(PhotoComment photoComment) throws SQLException {
        sql = "DELETE FROM PHOTO_COMMENT WHERE ID = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1,photoComment.getId());

            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (preparedStatement!=null){
                preparedStatement.close();
            }
            if (connection!=null) {
                connection.close();
            }
        }
    }
}
