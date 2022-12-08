package ReadWrite;

import Model.Subject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadSubject {
    static String file = "write3.txt";

    public static void write(List<Subject> subjects) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(subjects);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {


        }

    }


    public static List<Subject> read() {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return (List<Subject>) objectInputStream.readObject();
        } catch (Exception e) {

            return new ArrayList<>();
        }

    }
}
