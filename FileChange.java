import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class FileChange {
    public static void main(String[] args) throws IOException {
        String fileName = args[0]; //user inputs file name
        File outputFile = new File(fileName); // creates file with that name
        FileWriter outputWrite = new FileWriter(outputFile);
        //creates file write to the path 
        outputWrite.write("You named and created this file :3");
        outputWrite.close();
    }
}