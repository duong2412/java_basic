package file;

import java.io.*;

public class fileInOutStream {
    public static void main(String[] args) {
        String nameFile = "test.mp3";
        FileOutputStream fileOs;
        Student student = new Student(1,"nam");
        try {

            fileOs = new FileOutputStream(nameFile);
            ObjectOutputStream os = new ObjectOutputStream(fileOs);
//            os.writeInt(1234);
//            os.writeDouble(3.12321);
//            os.writeBytes("test out put stream");

            os.writeObject(student);
            os.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Ghi file thành công");
        FileInputStream fileInputStream;
        try {
            fileInputStream  = new FileInputStream(nameFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            try {
                Student st =(Student) objectInputStream.readObject();
                System.out.println(st);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
//            int dataInt = objectInputStream.readInt();
//            System.out.println(dataInt);
//            double dataDouble = objectInputStream.readDouble();
//            System.out.println(dataDouble);
//            String dataString = objectInputStream.readLine();
//            System.out.println(dataString);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Đọc file thành công");
    }
}
