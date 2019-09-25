import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Double {

  public static void main(String[] args) throws IOException {
    // Create a method that decrypts the duplicated-chars.txt

    Path charsDoubled = Paths.get("./TextDouble.txt");      //points to used file
    List<String> textLines = Files.readAllLines(charsDoubled);    //String list lesz belőle ->textLines

    String generatedString = "";
    for (String s : textLines) {          // abból meg string, aminek a neve: enerated string
      generatedString += s;
    }
    //   System.out.println(generatedString.length());

    String result = "";           // kezdő értéke a későbbi eredménynek

    for (int i = 0; i < generatedString.length(); i = i + 2) {       // minden második karakter kell csak (i+2)
      result = result + generatedString.charAt(i);                  // önmaga + a következő 2. karakter
    }
    System.out.println(result);                                     // print
  }
}

