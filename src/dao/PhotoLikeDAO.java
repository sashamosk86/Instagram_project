package dao;

import entity.PhotoLike;

import java.util.List;

/**
 * Created by Sasha on 05.10.2017.
 */
public interface PhotoLikeDAO {

    //create
    void addLike(PhotoLike photoLike); // add like

    //read
    List<PhotoLike> getAllLikes();

    //update

    //delete
    void removeLike(PhotoLike photoLike);
}
