package Test;

import dao.Implementation.PhotoLikeImplementation;
import dao.PhotoLikeDAO;
import domain.PhotoLike;

public class PhotoLikeTest {
    public static void main(String[] args) {
        PhotoLikeDAO photoLikeService = new PhotoLikeImplementation();
        PhotoLike photoLike = new PhotoLike();

        /*
        photoLike.setPhotoId(1);
        photoLike.setUserId(1);
        photoLike.setUserLogin("omoskaliuk");

        try {
            photoLikeService.addLike(photoLike);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */

        /*
        System.out.println(photoLikeService.getAllLikes(1));
        */
    }
}
