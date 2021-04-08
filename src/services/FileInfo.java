package services;

import entities.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInfo {
    public File writeFile(String path, String content) throws Exception{
        try(FileWriter fileWriter = new FileWriter(path)){
            fileWriter.write(content);
            System.out.println("Save content successes!");
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public File readFile(String path){
        try(FileReader fileReader = new FileReader(path)){
            int ch;
            StringBuilder sb = new StringBuilder();
            while ((ch = fileReader.read()) != -1){
                sb.append((char) ch);
            }
            System.out.printf("Content in file: "+sb.toString());
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
