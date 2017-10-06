package dao.Implementation;

import Connection.DBConnection;
import dao.PhotoLikeDAO;

import java.util.List;

public class PhotoLike extends DBConnection implements PhotoLikeDAO {
    @Override
    public void addLike(entity.PhotoLike photoLike) {

    }

    @Override
    public List<entity.PhotoLike> getAllLikes() {
        return null;
    }

    @Override
    public void removeLike(entity.PhotoLike photoLike) {

    }
}
