package Interface;

import FromBook.FlagButton;
import FromBook.Test;
import FromBook.Toggle;

import javax.swing.*;

public class TestGUI {

    public static void main(String[] args) {

       SwingUtilities.invokeLater(new Runnable() {
           @Override
           public void run() {
               //new LoginWindow();
               //new CreateUserWindow();
               //new ExitWindow();
               new Test();
               //new FlagButton();
               //new Toggle();
           }
       });


    }
}
