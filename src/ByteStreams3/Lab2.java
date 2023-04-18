package ByteStreams3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab2 {
    public static void main(String[] args) {
        try {
            FileOutputStream output = new FileOutputStream("data.dat");
            String s = "Hello World";
            byte[] b = s.getBytes();
            output.write(b);
        }
        catch (FileNotFoundException e) {
            Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, e);

        } catch (IOException e) {
            Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            FileInputStream input = new FileInputStream("data.dat");
            int value;
            while ((value = input.read()) != -1) {
                System.out.println((char) value);
            }
            input.close();
        } catch (FileNotFoundException e) {
            Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, e);
        }

    }
}
