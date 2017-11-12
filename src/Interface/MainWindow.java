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

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

public class MainWindow extends JFrame {
    private User user;

    private JPanel northPanel;
    private JPanel southPanel;
    Container cp = getContentPane();


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
        southPanel = new JPanel();
        northPanel.setLayout(new GridLayout(2,4));
        // ICONS
        ImageIcon homeIcon = new ImageIcon("Home_48.png");
        ImageIcon informationIcon = new ImageIcon("Information_48.png");
        ImageIcon addPhotoIcon = new ImageIcon("Add_48.png");
        ImageIcon friendsIcon = new ImageIcon("Affiliate_48.png");
        // ICON_BUTTONS
        JButton homePageButton = new JButton(homeIcon);
        JButton informationButton = new JButton(informationIcon);
        JButton addPhotoButton = new JButton(addPhotoIcon);
        JButton friendsButton = new JButton(friendsIcon);

        northPanel.add(homePageButton);
        northPanel.add(informationButton);
        northPanel.add(addPhotoButton);
        northPanel.add(friendsButton);
        northPanel.add(new JLabel("Додому",SwingConstants.CENTER));
        northPanel.add(new JLabel("Інформація",SwingConstants.CENTER));
        northPanel.add(new JLabel("Додати фото",SwingConstants.CENTER));
        northPanel.add(new JLabel("Друзі",SwingConstants.CENTER));

        Border raised_1 = BorderFactory.createRaisedBevelBorder();
        Border title_1 = BorderFactory.createTitledBorder(raised_1,"Інформація");
        northPanel.setBorder(title_1);
        add(northPanel, BorderLayout.NORTH);


        Border raised_2 = BorderFactory.createRaisedBevelBorder();
        Border title_2 = BorderFactory.createTitledBorder(raised_2,"Фото");
        southPanel.setBorder(title_2);
        add(southPanel,BorderLayout.CENTER);

        try {
            System.out.println(photoImpl.getAllUserPhoto(user.getId()));



// TODO create frame components....


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
