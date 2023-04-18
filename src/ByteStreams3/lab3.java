package ByteStreams3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class lab3 {
    public static void main(String[] args)  {

        try {
            FileOutputStream file = new FileOutputStream("Data.dat");
            DataOutputStream out = new DataOutputStream(file);
            out.writeUTF("Jim Henry");
            out.writeDouble(65.5);
            out.writeInt(30);
            out.writeChar('A');
        }  catch (FileNotFoundException e) {
            Logger.getLogger(lab3.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            Logger.getLogger(lab3.class.getName()).log(Level.SEVERE, null, e);

        }
        try {
            FileInputStream file = new FileInputStream("Data.dat");
            DataInputStream in = new DataInputStream(file);
            String name = in.readUTF();
            int age = in.readInt();
            System.out.println(in.readDouble());
            System.out.println(age);
            System.out.println(name);
        } catch (FileNotFoundException e) {
            Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, e);
        }

        // มันอ่านทีละ byte การที่จะทำให้มันมีหลาย bits เราต้องใช้ DataOutputStream

    }
}
