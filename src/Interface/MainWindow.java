package Interface;

import dao.Implementation.PhotoCommentImplementation;
import dao.Implementation.PhotoLikeImplementation;
import dao.Implementation.UserFriendImplementation;
import dao.Implementation.UserImplementation;
import dao.PhotoCommentDAO;
import dao.PhotoLikeDAO;
import dao.UserDAO;
import dao.UserFriendDAO;
import domain.PhotoComment;
import domain.PhotoLike;
import domain.User;
import domain.UserFriend;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.sql.SQLException;

public class MainWindow extends JFrame{

    User user;

    private JPanel mainPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;

    private JScrollPane scrollPane;

    private JSplitPane splitPane1;







    public MainWindow(User user){
        this.user = user;
        UserDAO userDAO = new UserImplementation();

        UserFriend userFriend = new UserFriend();
        UserFriendDAO userFriendDAO = new UserFriendImplementation();

        PhotoLike photoLike = new PhotoLike();
        PhotoLikeDAO photoLikeDAO = new PhotoLikeImplementation();

        PhotoComment photoComment = new PhotoComment();
        PhotoCommentDAO photoCommentDAO = new PhotoCommentImplementation();

        int counter = 0;


        setSize(900,700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(1,1));
        add(mainPanel);

        leftPanel = new JPanel();
        rightPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(2,1));
        Border etched = BorderFactory.createEtchedBorder();
        Border title = BorderFactory.createTitledBorder(etched,"Friends");
        rightPanel.setBorder(title);
        scrollPane = new JScrollPane(rightPanel);
        splitPane1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,leftPanel,rightPanel);
        splitPane1.setResizeWeight(0.75);
        add(splitPane1);

        try {
           // final DefaultListModel listModel = new DefaultListModel();
            JLabel jLabel;

            for (User u: userFriendDAO.getAllIdFriends(user.getId())) {
                System.out.println(u.getFirstName() + " " + u.getLastName());
                jLabel = new JLabel(u.getFirstName() + " " + u.getLastName());
                rightPanel.add(jLabel);
               // listModel.addElement(String.valueOf(u.getFirstName() + " " + u.getLastName() + " (" + u.getLogin() + ")"));
                //JList list = new JList(listModel);

                //JLabel label = new JLabel(String.valueOf(u.getFirstName() + " " + u.getLastName() + " (" + u.getLogin() + ")"));

                //rightPanel.add(new JScrollPane(list));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }




        //setVisible(true);
    }
}
