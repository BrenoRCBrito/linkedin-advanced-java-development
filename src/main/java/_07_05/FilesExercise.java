package _07_05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FilesExercise {

    public static void main(String[] args) throws IOException {
        // Create a new empty file called example.txt inside folderA
        Path folderAPath = Path.of("src/main/java/_07_05/folderA");
        if (Files.notExists(folderAPath)) {
            Files.createDirectory(folderAPath);
            Files.createFile(Path.of("src/main/java/_07_05/folderA/example.txt"));
        }
        // Copy the file to folderB
        Path folderBPath = Path.of("src/main/java/_07_05/folderB");
        if (Files.notExists(folderBPath)) {
            Files.createDirectory(folderBPath);
            Path copyPath = Path.of("src/main/java/_07_05/folderA/example.txt");
            Path newCopyPath = Path.of("src/main/java/_07_05/folderB/example.txt");
            Files.copy(copyPath, newCopyPath);
        }
        // List the contents of folderB to check that your file is in there
        try (Stream<Path> contents = Files.list(Path.of("src/main/java/_07_05/folderB"))) {
            contents.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
