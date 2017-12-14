package FromBook;

import javax.swing.*;
import java.awt.*;

public class Ref extends JFrame {


    public Ref(){
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600,600);
        setLocationRelativeTo(null);

        JMenuBar jMenuBar = new JMenuBar();

        JMenu jMenu = new JMenu("Справочники");
        JMenu jMenu1 = new JMenu("Автомобили");
        JMenu jMenu2 = new JMenu("Квартиры");
        JMenu jMenu3 = new JMenu("Суды");
        jMenu.add(jMenu1);
        jMenu.add(jMenu2);
        jMenu.add(jMenu3);
        jMenuBar.add(jMenu);

        JMenu jMenu4 = new JMenu("Марка");
        jMenu1.add(jMenu4);
        JMenuItem jMenuItem2 = new JMenuItem("Цвет");
        JMenuItem jMenuItem3 = new JMenuItem("Обьем двигателя");
        JMenuItem jMenuItem4 = new JMenuItem("Модель");
        jMenu4.add(jMenuItem2);
        jMenu4.add(jMenuItem3);
        jMenu4.add(jMenuItem4);

        JMenuItem jMenuItem5 = new JMenuItem("Этаж");
        JMenuItem jMenuItem6 = new JMenuItem("К-во комнат");
        JMenuItem jMenuItem7 = new JMenuItem("Класс");
        jMenu2.add(jMenuItem7);
        jMenu2.add(jMenuItem5);
        jMenu2.add(jMenuItem6);



        setJMenuBar(jMenuBar);


    }

    public static void main(String[] args) {
        new Ref();
    }

}
