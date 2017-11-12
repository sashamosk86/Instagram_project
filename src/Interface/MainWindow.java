package Interface;

import dao.Implementation.PhotoCommentImplementation;
import dao.Implementation.PhotoImplementation;
import dao.Implementation.PhotoLikeImplementation;
import dao.Implementation.UserImplementation;
import dao.PhotoCommentDAO;
import dao.PhotoDAO;
import dao.PhotoLikeDAO;
import dao.UserDAO;
import domain.Photo;
import domain.PhotoComment;
import domain.PhotoLike;
import domain.User;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class MainWindow extends JFrame {
    private User user;

    private JPanel northPanel;
    private JPanel southPanel;


    public MainWindow(User user){
        setSize(700,900);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.user = user;
        UserDAO userImpl = new UserImplementation();

        Photo photo = new Photo();
        PhotoDAO photoImpl = new PhotoImplementation();

        PhotoLike photoLike = new PhotoLike();
        PhotoLikeDAO photoLikeImpl = new PhotoLikeImplementation();

        PhotoComment photoComment = new PhotoComment();
        PhotoCommentDAO photoCommentImpl = new PhotoCommentImplementation();


        northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(2,4));
        JButton homePageButton = new JButton("Додому");
        JButton informationButton = new JButton("Інформація");
        JButton addPhotoButton = new JButton("Додати фото");
        JButton friendsButton = new JButton("Друзі");
        add(northPanel, BorderLayout.NORTH);

        try {
            System.out.println(photoImpl.getAllUserPhoto(user.getId()));

// TODO create frame components....


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
