package Interface;

import javax.swing.*;

public class TestGUI {

    public static void main(String[] args) {

       SwingUtilities.invokeLater(new Runnable() {
           @Override
           public void run() {
               new LoginWindow();
           }
       });


    }
}
