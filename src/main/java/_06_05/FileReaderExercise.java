package _06_05;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderExercise {

    // This method should return the first line of BufferedReaderVsScanner.txt.
    String getFirstLine() {
        String firstLine = null;
        try (BufferedReader buffer = new BufferedReader(
                new FileReader("src/main/java/_06_05/BufferedReaderVsScanner.txt"))) {
            firstLine = buffer.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return firstLine;
    }

    // This method should return all of the content of BufferedReaderVsScanner.txt
    // as a single String.
    String getWholeFile() {
        StringBuilder wholeFile = new StringBuilder();
        try (BufferedReader buffer = new BufferedReader(
                new FileReader("src/main/java/_06_05/BufferedReaderVsScanner.txt"))) {
            buffer.lines().forEach(line -> wholeFile.append(line + ""));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return wholeFile.toString();
    }

}
