package dao;

import entity.PhotoComment;

import java.util.List;

/**
 * Created by Sasha on 05.10.2017.
 */
public interface PhotoCommentDAO {
    //create
    void addLike(PhotoComment photoComment);

    //read
    List<PhotoComment> getAllComments();

    //update

    //delete
    void removeComment(PhotoComment photoComment);
}
