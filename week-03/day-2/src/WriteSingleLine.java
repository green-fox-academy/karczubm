import java.io.File;
import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"

    }
    public static void fileWriter(String fileName, String newLine){
        Path filePath = Paths.get("assets", fileName);
        Files file=new Files();

    }
}