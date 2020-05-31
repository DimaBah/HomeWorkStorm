package HW7.Streams2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Reverse {
    private static void convert(String fileName, String fileContent){
        StringBuilder strb = new StringBuilder(fileContent);
        try (FileWriter writer = new FileWriter(fileName, false)){
            writer.write(String.valueOf(strb.reverse()));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("File is written.");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter file name:");
        String fileName = scan.next();
        System.out.println("Enter some content:");
        String fileContent = scan.next();
        convert(fileName, fileContent);
    }
}
