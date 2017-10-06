package dao.Implementation;

import Connection.DBConnection;
import dao.PhotoDAO;
import entity.Photo;

import java.util.List;

public class PhotoService extends DBConnection implements PhotoDAO{
    @Override
    public void addPhoto(Photo photo) {

    }

    @Override
    public List<Photo> getAllPhotos() {
        return null;
    }

    @Override
    public Photo getPhotoById(long id) {
        return null;
    }

    @Override
    public void removePhoto(Photo photo) {

    }
}
