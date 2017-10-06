package dao.Implementation;

import Connection.DBConnection;
import dao.PhotoCommentDAO;

import java.util.List;

public class PhotoComment extends DBConnection implements PhotoCommentDAO {
    @Override
    public void addLike(entity.PhotoComment photoComment) {

    }

    @Override
    public List<entity.PhotoComment> getAllComments() {
        return null;
    }

    @Override
    public void removeComment(entity.PhotoComment photoComment) {

    }
}
