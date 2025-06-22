package java_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) {
        File f = new File("src/main/java/java_files/test.txt");
        try {
            FileWriter fw = new FileWriter(f);
            fw.write("Hello World");
            fw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
