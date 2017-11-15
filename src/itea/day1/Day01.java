package itea.day1;

import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class Day01 {
    public static void main(String[] args) throws IOException {
        System.out.println("Try to read...");

        // For Binary
       /* FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("setup.exe");
            fos = new FileOutputStream("copy_setup.exe");
            int c;
            while ((c = fis.read()) != -1) {
                fos.write(c);
            }
            System.out.println("Success");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            try {
                fis.close();
                fos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
*/
    // Symbol streem
        /*
        FileReader fis = null;
        FileWriter fos = null;

        try {
            fis = new FileReader("setup.exe");
            fos = new FileWriter("FR_setup.exe");
            int c;
            while ((c = fis.read()) != -1) {
                fos.write(c);
            }
            System.out.println("Success");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            try {
                fis.close();
                fos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        */

        // Buffer Reader
        /*
        BufferedReader br = null;
        PrintWriter pw = null;

        try {
            br = new BufferedReader(new FileReader("111.txt"));
            pw = new PrintWriter(new FileWriter("new_111.txt"));

            String line;
            while ((line=br.readLine()) != null) {
                pw.println(line);
            }
            System.out.println("Success");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            try {
                br.close();
                pw.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        */

        Console c;
        String s;


        try {

            c = System.console();
            if (c != null) {
                s = c.readLine();
                System.out.println("password: " + s);

                char[] pwd = c.readPassword();
                System.out.println("password is: " + pwd);
            }
        }catch (Exception e){
            e.printStackTrace();
        }






    }
}
