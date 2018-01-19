package Interface;

import dao.*;
import dao.Implementation.*;
import domain.*;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Arrays;

public class MainWindow extends JFrame{

    User user;

    private JPanel mainPanel, topPanel, topNamePanel, topButtonPanel, bottomPanel;

    private JScrollPane scrollPane;

    private JSplitPane splitPane1;

    JButton homeButton, infoButton, addButton, friendsButton;
    JLabel userName;

    JLabel photoLabel;







    public MainWindow(User user){
        this.user = user;
        UserDAO userDAO = new UserImplementation();

        UserFriend userFriend = new UserFriend();
        UserFriendDAO userFriendDAO = new UserFriendImplementation();

        PhotoLike photoLike = new PhotoLike();
        PhotoLikeDAO photoLikeDAO = new PhotoLikeImplementation();

        PhotoComment photoComment = new PhotoComment();
        PhotoCommentDAO photoCommentDAO = new PhotoCommentImplementation();

        Photo photo = new Photo();
        PhotoDAO photoDAO = new PhotoImplementation();



        int counter = 0;


        this.setSize(600,700);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(1,1));
        this.add(mainPanel);

        topPanel = new JPanel();

        topNamePanel = new JPanel();
        topNamePanel.setLayout(new FlowLayout(0,150,0));
        topButtonPanel = new JPanel();
        topButtonPanel.setLayout(new FlowLayout(0,50,10));
        bottomPanel = new JPanel();

        userName = new JLabel(user.getLastName() + " " + user.getFirstName());
        userName.setFont(new Font("Arial",Font.BOLD,25));
        topNamePanel.add(userName);
        topPanel.add(topNamePanel,BorderLayout.NORTH);

        homeButton = new JButton(new ImageIcon("Home_48.png"));
        infoButton = new JButton(new ImageIcon("Information_48.png"));
        addButton = new JButton(new ImageIcon("Add_48.png"));
        friendsButton = new JButton(new ImageIcon("Affiliate_48.png"));
        topButtonPanel.add(homeButton);
        topButtonPanel.add(infoButton);
        topButtonPanel.add(addButton);
        topButtonPanel.add(friendsButton);
        topPanel.add(topButtonPanel);




        Border etched = BorderFactory.createEtchedBorder();
        //Border title = BorderFactory.createTitledBorder(etched,"Friends");
        topPanel.setBorder(etched);
        bottomPanel.setBorder(etched);
        //scrollPane = new JScrollPane(bottomPanel);
        splitPane1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, topPanel,bottomPanel);
        splitPane1.setResizeWeight(0.05);

        photoLabel = new JLabel();
        photoLabel.setBounds(10,10,250,250);



        try {
            System.out.println(photoDAO.getPhotoById((long)2));
            byte[] b = photoDAO.getPhotoById((long)2).getFile();
            System.out.println(Arrays.toString(b));

            ImageIcon image = new ImageIcon(b);
            Image im = image.getImage();
            Image myImg = im.getScaledInstance(photoLabel.getWidth(), photoLabel.getHeight(),Image.SCALE_SMOOTH);
            ImageIcon newImage = new ImageIcon(im);

            photoLabel.setIcon(newImage);
            bottomPanel.add(photoLabel);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        this.add(splitPane1);

        try {
           // final DefaultListModel listModel = new DefaultListModel();
            JLabel jLabel;

            for (User u: userFriendDAO.getAllIdFriends(user.getId())) {
                System.out.println(u.getFirstName() + " " + u.getLastName());
                //jLabel = new JLabel(u.getFirstName() + " " + u.getLastName());
                //topPanel.add(jLabel);
                           // listModel.addElement(String.valueOf(u.getFirstName() + " " + u.getLastName() + " (" + u.getLogin() + ")"));
                            //JList list = new JList(listModel);

                            //JLabel label = new JLabel(String.valueOf(u.getFirstName() + " " + u.getLastName() + " (" + u.getLogin() + ")"));

                            //topPanel.add(new JScrollPane(list));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }




        //setVisible(true);
    }
}
