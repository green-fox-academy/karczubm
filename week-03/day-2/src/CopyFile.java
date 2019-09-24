import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful
public class CopyFile {
    public static void main(String[] args) {
        System.out.println(fileCopier("mytext.txt"));
    }

    public static boolean fileCopier(String fileName) {
        Path filePath = Paths.get("assets", fileName);
        Path copyPath= Paths.get("assets/copy.txt");
        try {
            List<String> list = Files.readAllLines(filePath);
            Files.write(copyPath,list);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
