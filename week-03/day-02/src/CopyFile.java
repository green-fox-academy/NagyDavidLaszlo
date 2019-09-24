import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {

  public static boolean ifCopied(String file1, String file2) {
    try {
      Path pathToTxt = Paths.get(file1);
      List<String> textLines = Files.readAllLines(pathToTxt);

      Path path = Paths.get(file2);
      Files.write(path, textLines);
      return true;
    } catch (IOException e) {
      System.out.println("Copying was not successful!");
      return false;
    }
  }

  public static void main(String[] args){

    String a = "./my-file.txt";
    String b = "./other.txt";

    ifCopied(a,b);
  }
}
