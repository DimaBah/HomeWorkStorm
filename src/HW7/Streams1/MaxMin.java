package HW7.Streams1;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MaxMin {
    private static void writeFile(String fileName, String fileContent){
        try (FileWriter writer = new FileWriter(fileName, false)){
            writer.write(fileContent);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("File is written.");
    }
    private static void readFile(String fileName){
        try (FileInputStream fis = new FileInputStream(fileName)){
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            int min = buffer[0];
            int max = buffer[0];
            for (byte i : buffer){
                max = Math.max(i, max);
                min = Math.min(i, min);
            }
            System.out.println("Maximum byte is: " + max);
            System.out.println("Minimum byte is: " + min);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter file name:");
        String fileName = scan.next();
        System.out.println("Enter some content:");
        String fileContent = scan.next();
        writeFile(fileName, fileContent);
        readFile(fileName);
    }
}
