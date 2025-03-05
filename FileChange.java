import java.io.FileReader;
import java.io.FileWriter;

public class FileChange {
    public static void main(String[] args) {
        String fileName = args[0]; //user inputs file name
        File outputFile = new File(fileName); // creates file with that name
        FileWriter outputWrite = new FileWriter(outputFile);
        //creates file write to the path 
        outputWrite.write("You named and created this file :3");
    }
}