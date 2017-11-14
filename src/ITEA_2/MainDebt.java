package ITEA_2;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

public class MainDebt {

    public static void main(String[] args) throws IOException {
        DebtMan dn1 = new DebtMan("Mike", 1500);
        Object cc;

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(dn1);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);

            cc = (CollectorCompany) ois.readObject();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
