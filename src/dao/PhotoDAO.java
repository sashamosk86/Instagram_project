package dao;


import entity.Photo;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Sasha on 05.10.2017.
 */
public interface PhotoDAO {

    // create
    void addPhoto(Photo photo) throws SQLException, FileNotFoundException; // add new photo

    // read
    List<Photo> getAllUserPhoto(long id) throws SQLException; // get all user photos
    Photo getPhotoById(long id) throws SQLException; // get one photo by id

    // update

    // delete
    void removePhoto(Photo photo) throws SQLException; // delete photo
}
