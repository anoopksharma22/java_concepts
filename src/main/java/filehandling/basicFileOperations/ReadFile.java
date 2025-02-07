package filehandling.basicFileOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("temp/data.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while( (line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
    }
}