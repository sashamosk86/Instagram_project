package dao;


import entity.Photo;

import java.util.List;

/**
 * Created by Sasha on 05.10.2017.
 */
public interface PhotoDAO {

    // create
    void addPhoto(Photo photo); // add new photo

    // read
    List<Photo> getAllPhotos(); // get all user photos
    Photo getPhotoById(long id); // get one photo by id

    // update

    // delete
    void removePhoto(Photo photo); // delete photo
}
