package Test;

import dao.Implementation.PhotoImplementation;
import dao.PhotoDAO;
import domain.Photo;

public class PhotoTest {
    public static void main(String[] args) {
        PhotoDAO photoService = new PhotoImplementation();
        Photo photo = new Photo();
/*
        photo.setId(1);

        try {
            System.out.println(photoService.getPhotoById(photo.getId()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
*/
/*
        photo.setUserId(1);
        photo.setName("111");

        try {
            photoService.addPhoto(photo);
        } catch (SQLException e) {
            e.printStackTrace();
        }
*/
/*E:\Sasha\Instagram_project\ква_2.jpg
        //photo.setUserId(1);
        try {
            System.out.println(photoService.getAllUserPhoto(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */
/*
        photo.setId(6);
        try {
            photoService.removePhoto(photo);
        } catch (SQLException e) {
            e.printStackTrace();
        }
*/
    }
}
