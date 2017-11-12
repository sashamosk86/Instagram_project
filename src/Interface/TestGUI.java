package Interface;

import FromBook.BagLayout;
import FromBook.CheckBoxFrame;

import javax.swing.*;

public class TestGUI {

    public static void main(String[] args) {

       SwingUtilities.invokeLater(new Runnable() {
           @Override
           public void run() {
               new LoginWindow();
               //new MainWindow();
               //new ErrorWindow();
               //new CreateUserWindow();
               //new ExitWindow();
               //new Test();
               //new FlagButton();
               //new Toggle();

               //new LoginW();

               //new Calculator();

               //new CheckBoxFrame();

               //new RadioButtonFrame();
               //new BorderFrame();

              // new ExitWindow();

               //new CUW();

              // new BagLayout();
           }
       });


    }
}
