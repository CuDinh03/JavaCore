package baitap;



import java.io.*;
import java.util.ArrayList;


public class IOStudent_nhiPhan {
    static File file = new File("Students.txt");

    public static void write(ArrayList<Students> students){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static ArrayList<Students> read(){
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<Students> students = (ArrayList<Students>) objectInputStream.readObject();
            return students;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
