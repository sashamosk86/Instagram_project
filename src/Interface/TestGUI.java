package Interface;

import javax.swing.*;

public class TestGUI {

    public static void main(String[] args) {

       SwingUtilities.invokeLater(new Runnable() {
           @Override
           public void run() {
               new LoginWindow("Вікно входу").setVisible(true);
               //new CreateUserWindow();
               //new MainWindow();


              // new ErrorWindow("Помилка пошуку");
               //new ExitWindow("exit");
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
