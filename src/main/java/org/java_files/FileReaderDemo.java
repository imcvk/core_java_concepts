package org.java_files;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
//        FileReader fr = null;
//        String data = "";
//        File file = new File("src/main/java/java_files/sample.txt");
//        try {
//            fr = new FileReader(file);
//int character;
//            while ((character = fr.read()) != -1) {
//                data = data + (char) fr.read();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(data);
//    }
        try (FileReader reader = new FileReader("src/main/java/java_files/sample.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("File read error: " + e.getMessage());
        }
    }
}
