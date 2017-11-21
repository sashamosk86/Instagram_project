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

public class TesGrid extends JFrame{

    User user;

    private JPanel mainPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;

    private JScrollPane scrollPane;

    private JSplitPane splitPane1;






    private JPanel lLPanel;
    private JPanel lRPanel;
    private JLabel label;



    private JSplitPane splitPane2;
    private JSplitPane splitPane3;

    public TesGrid(User user){
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
        Border etched = BorderFactory.createEtchedBorder();
        Border title = BorderFactory.createTitledBorder(etched,"Friends");
        rightPanel.setBorder(title);
        scrollPane = new JScrollPane(rightPanel);
        splitPane1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,leftPanel,rightPanel);
        splitPane1.setResizeWeight(0.75);
        add(splitPane1);

        try {
            final DefaultListModel listModel = new DefaultListModel();

            for (User u: userFriendDAO.getAllIdFriends(user.getId())) {
                //System.out.println(u);
                listModel.addElement(String.valueOf(u.getFirstName() + " " + u.getLastName() + " (" + u.getLogin() + ")"));
                JList list = new JList(listModel);

                //JLabel label = new JLabel(String.valueOf(u.getFirstName() + " " + u.getLastName() + " (" + u.getLogin() + ")"));

                rightPanel.add(new JScrollPane(list));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        //  upPanel.setLayout(new GridLayout(1,3,5,5));
        //upPanel.setBorder(BorderFactory.createEtchedBorder());

        //JLabel labelIcon = new JLabel(new ImageIcon("Male_128.png"));
        //labelIcon.setBorder(BorderFactory.createEtchedBorder());
        //upPanel.add(labelIcon,BorderLayout.EAST);

//        JPanel onePanel = new JPanel();
////        JPanel twoPanel = new JPanel();
////        JPanel threePanel = new JPanel();
//        onePanel.setBorder(BorderFactory.createEtchedBorder());
////        twoPanel.setBorder(BorderFactory.createEtchedBorder());
////        threePanel.setBorder(BorderFactory.createEtchedBorder());
//        upPanel.add(onePanel,BorderLayout.CENTER);
////        upPanel.add(twoPanel);
////        upPanel.add(threePanel);
//
////        JLabel oneLabel = new JLabel("ONE");
////
////        upPanel.add();
////        upPanel.add(new Label("TWO"));
////        upPanel.add(new Label("THREE"));
//        downPanel = new JPanel();
//        downPanel.setLayout(new GridLayout(1,1));
//        leftPanel = new JPanel();
//        leftPanel.setLayout(new GridLayout(1,1));
//        lLPanel = new JPanel();
//        lRPanel = new JPanel();
//        leftPanel.add(lLPanel);
//        leftPanel.add(lRPanel);
//        ImageIcon icon = new ImageIcon("E:/Photo/MOTO/МТ/Новая папка/1.jpg");
//        label = new JLabel(icon);
//        scrollPane = new JScrollPane(label);
//
//
//
//
//
//        splitPane1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT,upPanel,downPanel);
//        splitPane1.setResizeWeight(0.2);
//        mainPanel.add(splitPane1);
//
//        splitPane2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,leftPanel, rightPanel);
//        splitPane2.setResizeWeight(0.75);
//        downPanel.add(splitPane2);
//
//        splitPane3 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,lLPanel, lRPanel);
//        splitPane3.setResizeWeight(0.7);
//        leftPanel.add(splitPane3);
//
//
//
//


        setVisible(true);
    }
}
