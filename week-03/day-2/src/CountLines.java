import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
public class CountLines {
    public static void main(String[] args) {
        System.out.println("number of lines in the file: "+numberOfLines("text.txt"));
    }

    public static int numberOfLines(String inputFileName) {
        int numberOfLines;
        try {
            Path filePath = Paths.get("assets", inputFileName);
            List<String> lines = Files.readAllLines(filePath);
            numberOfLines = lines.size();
            return numberOfLines;
        } catch (IOException e) {
            return 0;
        }

    }
}
