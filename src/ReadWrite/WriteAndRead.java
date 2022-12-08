package ReadWrite;

import Model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndRead {
    static String file = "write4.txt";

    public static void write(List<Student> Student) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(Student);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {


        }

    }


    public static List<Student> read() {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return (List<Student>) objectInputStream.readObject();
        } catch (Exception e) {

            return new ArrayList<>();
        }

    }
}