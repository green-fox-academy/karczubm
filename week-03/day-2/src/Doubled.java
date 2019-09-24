import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
    // Create a method that decrypts the duplicated-chars.txt
    public static void main(String[] args) {
        duplicationDescryter("duplicated-chars.txt");
    }

    public static void duplicationDescryter(String fileName) {
        Path filePath = Paths.get("assets", fileName);
        List<String> descryptedFile = new ArrayList<>();
        List<String> originalFile = new ArrayList<>();
        try {
            originalFile = Files.readAllLines(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String newLine = "";
        for (int i = 0; i <originalFile.size(); i++) {
            for (int j = 0; j < originalFile.get(i).length(); j += 2) {
                newLine += originalFile.get(i).charAt(j);
            }
            descryptedFile.add(newLine);
            newLine="";
        }
        try {
            Files.write(filePath, descryptedFile);
        } catch (Exception e) {
        }
    }
}