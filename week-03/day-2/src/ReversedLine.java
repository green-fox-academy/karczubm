import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLine {
    public static void main(String[] args) {
        reversedDescryter("reversed-lines.txt");
    }

    public static void reversedDescryter(String fileName) {
        Path filePath = Paths.get("assets", fileName);
        List<String> descryptedFile = new ArrayList<>();
        List<String> originalFile = new ArrayList<>();
        try {
            originalFile = Files.readAllLines(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String newLine = "";
        for (int i = 0; i < originalFile.size(); i++) {
            for (int j = originalFile.get(i).length(); j > 0; j--) {
                newLine += originalFile.get(i).charAt(j-1);
            }
            descryptedFile.add(newLine);
            newLine = "";
        }
        try {
            Files.write(filePath, descryptedFile);
        } catch (Exception e) {
        }

    }}