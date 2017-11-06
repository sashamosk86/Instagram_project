package FromBook;

import javax.swing.*;
import java.awt.*;

public class TestCreateUser extends JFrame {
    //JPanel jpanel;

    public TestCreateUser(){
        setTitle("Create user");
        setSize(300,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        // CENTER
        JButton centerButton = new JButton("Center");

        JPanel jPanelC = new JPanel();
        jPanelC.add(centerButton);

        add(jPanelC, BorderLayout.CENTER);


        // SOUTH
        JButton createButton = new JButton("Create");
        JButton cancelButton = new JButton("Cancel");
        JPanel jpanelS = new JPanel();
        jpanelS.add(createButton);
        jpanelS.add(cancelButton);
        add(jpanelS,BorderLayout.SOUTH);


        // NORTH
        JButton northButton1 = new JButton("North 1");
        //JButton northButton2 = new JButton("North 2");

       // JPanel jpanelN = new JPanel();
        //jpanelN.add(northButton1);
        //jpanelN.add(northButton2);

        add(northButton1,BorderLayout.NORTH);


        //EAST
//        JButton eastButton = new JButton("East");
//
//        JPanel jpanelE = new JPanel();
//        jpanelE.add(eastButton);
//
//        add(jpanelE,BorderLayout.EAST);


        // WEST
//        JButton westButton = new JButton("West");
//
//        JPanel jpanelW = new JPanel();
//        jpanelW.add(westButton);
//
//        add(jpanelW,BorderLayout.WEST);
    }
}
