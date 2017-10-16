package dao.Implementation;

import Connection.DBConnection;
import dao.PhotoDAO;
import domain.Photo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhotoImplementation extends DBConnection implements PhotoDAO{

    private String sql = "";

    @Override
    public void addPhoto(Photo photo) throws SQLException, FileNotFoundException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;

        sql = "INSERT INTO PHOTO (NAME, FILE, USER_ID) VALUES (?, ?, ?)";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1,photo.getName());

            Scanner scanner = new Scanner(System.in);
            System.out.println("Input file path:");
            File image = new File(scanner.nextLine());
            FileInputStream fis = new FileInputStream(image);
            preparedStatement.setBinaryStream(2,fis,(int)image.length());

            preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if (preparedStatement!=null){
                preparedStatement.close();
            }
            if (connection!=null){
                connection.close();
            }
        }
    }

    @Override
    public List<Photo> getAllUserPhoto(long id) throws SQLException {
        List<Photo> photoList = new ArrayList<>();
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        sql = "SELECT ID, NAME, FILE, USER_ID FROM PHOTO WHERE USER_ID = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1,id);

            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Photo photo = new Photo();
                photo.setId(resultSet.getLong("ID"));
                photo.setName(resultSet.getString("NAME"));
                photo.setFile(resultSet.getBytes("FILE"));
                photo.setUserId(resultSet.getLong("USER_ID"));

                photoList.add(photo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (resultSet!=null){
                resultSet.close();
            }
            if (preparedStatement!=null){
                preparedStatement.close();
            }
            if (connection!=null){
                connection.close();
            }
        }
        return photoList;
    }

    @Override
    public Photo getPhotoById(long id) throws SQLException {
        Photo photo = new Photo();
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        sql = "SELECT ID, NAME, FILE, USER_ID FROM PHOTO WHERE ID = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1,id);

            resultSet = preparedStatement.executeQuery();
            photo.setId(resultSet.getLong("ID"));
            photo.setName(resultSet.getString("NAME"));
            photo.setFile(resultSet.getBytes("FILE"));
            photo.setUserId(resultSet.getLong("USER_ID"));

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (resultSet!=null){
                resultSet.close();
            }
            if (preparedStatement!=null){
                preparedStatement.close();
            }
            if (connection!=null){
                connection.close();
            }
        }
        return photo;
    }

    @Override
    public void removePhoto(Photo photo) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;

        sql = "DELETE FROM PHOTO WHERE ID = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setLong(1,photo.getId());

            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (preparedStatement!=null){
                preparedStatement.close();
            }
            if (connection!=null){
                connection.close();
            }
        }
    }
}
