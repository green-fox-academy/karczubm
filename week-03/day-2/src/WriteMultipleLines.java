import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.
// The path parameter should be a string that describes the location of the file you wish to modify
// The word parameter should also be a string that will be written to the file as individual lines
// The number parameter should describe how many lines the file should have.
// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'
// The function should not raise any errors if it could not write the file.
public class WriteMultipleLines {
    public static void main(String[] args) {
        lineWriter("mytext.txt","pear",6);
    }

    public static void lineWriter(String file, String word, int number) {
        Path filePath = Paths.get("assets", file);
        try {
            List<String> listOfLines = Files.readAllLines(filePath);
            for (int i = 0; i <number; i++) {
                listOfLines.add(word);
            }
            Files.write(filePath, listOfLines);
        } catch (Exception e) {

        }
    }
}
