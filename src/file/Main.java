package file;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "test.txt";
        File file = new File(fileName);
        FileReader fileReader;
        FileWriter fileWriter;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader =new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bufferedReader != null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
