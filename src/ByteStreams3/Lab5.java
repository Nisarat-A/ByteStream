package ByteStreams3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab5 {
    public static void main(String[] args) {
        Student s = new Student("65130500107", "Noey A.");

        try { FileOutputStream file = new FileOutputStream("data.dat");
            ObjectOutputStream out = new ObjectOutputStream(file);
        }catch (FileNotFoundException e) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, e);
        }
        catch (IOException e) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            FileInputStream file = new FileInputStream("data.dat");
            ObjectInputStream in = new ObjectInputStream(file);
            Student o = (Student) in.readObject();
            System.out.println(s.id+" "+s.name);
        }
        catch (FileNotFoundException e) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, e);
        }
        catch (IOException e) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, e);
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
