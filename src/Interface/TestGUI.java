package Interface;

import FromBook.*;

import javax.swing.*;

public class TestGUI {

    public static void main(String[] args) {

       SwingUtilities.invokeLater(new Runnable() {
           @Override
           public void run() {
               //new LoginWindow();
               //new CreateUserWindow();
               //new ExitWindow();
               //new Test();
               //new FlagButton();
               //new Toggle();

               //new LoginW();

               //new Calculator();

               //new CheckBoxFrame();

               new RadioButtonFrame();
           }
       });


    }
}
