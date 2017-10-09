package dao;

import entity.PhotoComment;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Sasha on 05.10.2017.
 */
public interface PhotoCommentDAO {
    //create
    void addComment(PhotoComment photoComment) throws SQLException;

    //read
    List<PhotoComment> getAllComments(long id) throws SQLException;

    //update

    //delete
    void removeComment(PhotoComment photoComment) throws SQLException;
}
