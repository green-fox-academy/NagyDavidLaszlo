import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {

  public static void CountLines(String myPath) {

    try {
      Path pathToTxt = Paths.get("./" + myPath);
      List<String> textLines = Files.readAllLines(pathToTxt);
      System.out.println(textLines.size());
    } catch (IOException e) {
      System.out.println("zero");
    }
  }

  // Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

  public static void main(String[] args) {

    CountLines("my-file.txt");
  }
}