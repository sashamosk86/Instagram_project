package dao;

import domain.PhotoLike;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Sasha on 05.10.2017.
 */
public interface PhotoLikeDAO {

    //create
    void addLike(PhotoLike photoLike) throws SQLException; // add like

    //read
    List<PhotoLike> getAllLikes(long id);

    //update

    //delete
    void removeLike(PhotoLike photoLike) throws SQLException;
}
