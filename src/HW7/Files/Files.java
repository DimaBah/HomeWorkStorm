package HW7.Files;

import java.io.*;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Files {
    private static void writeFile(String fileName, String fileContent) {
        File myFile = new File(fileName);
        try{
            boolean created = myFile.createNewFile();
            if (created){
                FileWriter writer = new FileWriter(myFile, false);
                writer.write(fileContent);
                writer.close();
                System.out.print(fileName + " is created.  ");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    private static void toZip (String fileName){
        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("c://StudentDir/output.zip"));
             FileInputStream fis= new FileInputStream(fileName);
        ){
            ZipEntry entry = new ZipEntry(fileName);
            zout.putNextEntry(entry);
            byte[] buffer = new byte[fis.available()];
            zout.write(buffer);
            zout.closeEntry();
            System.out.print(fileName + " is packed.  ");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        File dir = new File("c://StudentDir");
        boolean created = dir.mkdir();
        if (created) {
            System.out.println("Directory is created.");
            writeFile("c://StudentDir/file1", "798");
            writeFile("c://StudentDir/file2", "456");
            writeFile("c://StudentDir/file3", "123");
            System.out.println();
            toZip("c://StudentDir/file1");
            toZip("c://StudentDir/file2");
            toZip("c://StudentDir/file3");
            System.out.println();
            File newDir = new File("c://StudentNew");
            boolean renamed = dir.renameTo(newDir);
            if (renamed){
                System.out.println("Directory is renamed.");
                if (newDir.isDirectory()) {
                    System.out.print("All files:  ");
                    for (File item : Objects.requireNonNull(newDir.listFiles())) {
                        System.out.print(item.getName() + "  ");
                    }
                    System.out.println();
                    for (File item : Objects.requireNonNull(newDir.listFiles())){
                        item.delete();
                    }
                    boolean deleted = newDir.delete();
                    if (deleted){
                        System.out.println("Directory is deleted.");
                    } else {
                        System.out.println("Directory is NOT deleted.");
                    }
                }
            } else {
                System.out.println("Directory is NOT renamed.");
            }

        } else {
            System.out.println("Directory is NOT created!");
        }

    }
}