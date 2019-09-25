import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

  public static void main(String[] args) throws IOException {

    Path reversedLines = Paths.get("./ReversedLinesText.txt");
    List<String> textLines = Files.readAllLines(reversedLines);
    List<String> reverse = new ArrayList<>();

    for (String line :textLines) {

   //   System.out.println(line);
     // System.out.println();
      for (int i = line.length()-1; i >0; i--) {
        System.out.print(line.charAt(i));
      }
      System.out.println();
    }



    }
    }

    
    
    
    
    
    
    
    
    
    
    
    
 /*  String generatedString = "";
    for (String s : textLines) {
      generatedString += s;
    }
*/
/*
    for (int i = 0; i <textLines.size(); i++) {
      for (int j = generatedString.length()-1; j >0; j--) {




        result=result + generatedString.charAt(j);
*/


