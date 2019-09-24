import java.io.File;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"
        fileWriter("my-text.txt", "Marci");

    }

    public static void fileWriter(String fileName, String newLine) {
        Path filePath = Paths.get("assets", fileName);
        try {
            List<String> listOfLines = Files.readAllLines(filePath);
            listOfLines.add(newLine);
            Files.write(filePath, listOfLines);
            //System.out.println(listOfLines);
        } catch (IOException e) {
        }


    }
}