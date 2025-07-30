package Day5;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\wipro.txt");

            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }

            FileWriter writer = new FileWriter(file);
            writer.write("HI JAVA B1");
            writer.close();

            FileReader reader = new FileReader(file);
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
            reader.close();

        } catch (IOException e) {
            System.out.print("Exception: " + e.getMessage());
        }
    } 
}
