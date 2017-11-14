package ITEA_2;

import java.io.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class MainObj {

    public static void main(String[] args) {

    SomeObj ob = new SomeObj();
/*
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("Obj.bin"))){

            dos.writeUTF(ob.getName());
            dos.writeInt(ob.age);
            dos.writeDouble(ob.weight);
            dos.writeUTF(ob.sex);
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
/*
        try (DataInputStream dos = new DataInputStream(new FileInputStream("Obj.bin"))){

            ob.setName(dos.getName());
            ob.setAge(dos.getAge());
            ob.setWeight(dos.getWeight());
            ob.setSex(dos.getSex());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("ok");
        */

        Console c;
        String st1;
        String st2;

        try {
            c = System.console();
            if (c != null) {
                //st1 = c.readLine();
                //st2 = c.readLine();
                st1 = args[0];
                st2 = args[1];

                Locale curLocale = new Locale(st1, st2);
                ResourceBundle message = ResourceBundle.getBundle("resource.message", curLocale);
                String s = "Hello";
                message.getString(s);
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}



