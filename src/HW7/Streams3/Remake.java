package HW7.Streams3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Remake {
    private static void writeFile(String fileName, String fileContent) {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write(fileContent);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

        private static void remakeFile(String fileName){
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String str = reader.readLine();
            System.out.println(str);
            String[] words = str.split(" ");
            for (int i = words.length - 1; i >= 0; i--){
                System.out.print(words[i] + " ");
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        writeFile("mytxt", "Hello this is java! & another words!");
        remakeFile("mytxt");
    }
}
