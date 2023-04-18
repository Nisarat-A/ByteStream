package ByteStreams3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab4 {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("Data.dat");
            BufferedOutputStream out = new BufferedOutputStream(file);
            String s = "Hello World";
            byte[] b = s.getBytes();
            out.write(b);
            out.flush();
            out.close();
        } catch (FileNotFoundException e) {
                Logger.getLogger(Lab4.class.getName()).log(Level.SEVERE, null, e);
            }
        catch (IOException e) {
            Logger.getLogger(Lab4.class.getName()).log(Level.SEVERE, null, e);
        }
        try (FileInputStream file = new FileInputStream("Data.dat")) {
            BufferedInputStream in = new BufferedInputStream(file);
            int ch ;
            while ((ch = in.read()) != -1) {
                System.out.print((char) ch);
            }
        }
            catch (FileNotFoundException e) {
                Logger.getLogger(Lab4.class.getName()).log(Level.SEVERE, null, e);
            }
        catch (IOException e) {
            Logger.getLogger(Lab4.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
