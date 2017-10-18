package Test;

import dao.Implementation.PhotoCommentImplementation;
import dao.PhotoCommentDAO;
import domain.PhotoComment;

public class PhotoCommentTest {
    public static void main(String[] args) {
        PhotoCommentDAO photoCommentService = new PhotoCommentImplementation();
        PhotoComment photoComment = new PhotoComment();

        /*
        photoComment.setPhotoId(1);
        photoComment.setUserId(1);
        photoComment.setComment("Thank's");

        try {
            photoCommentService.addComment(photoComment);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */
/*
        try {
            System.out.println(photoCommentService.getAllComments(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */
/*
        photoComment.setId(2);
        try {
            photoCommentService.removeComment(photoComment);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */
    }
}
