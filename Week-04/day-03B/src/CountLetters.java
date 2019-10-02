import java.util.HashMap;
import sun.text.normalizer.UCharacter;

public class CountLetters {

//Write a function, that takes a string as an argument and returns a dictionary with all letters in the string as keys,
// and numbers as values that shows how many occurrences there are.
//Create a test for that.


  public static HashMap dictionary(String word) {        //String[] - helyén mindig az van amit visszaad (argument)
    char[] charactresOfWord = word.toCharArray();       // String word  - a bemeneti típus (String)
    // return charactresOfWord;
    HashMap<Character, Integer> hmap = new HashMap<>();
    for (int i = 0; i <charactresOfWord.length; i++) {
      if (hmap.containsKey(charactresOfWord[i])){
      hmap.put(charactresOfWord[i],hmap.get(charactresOfWord[i])+1);
      }else{
        hmap.put(charactresOfWord[i],1);
      }
    }
    return hmap;
  }


  // HashMap<Integer, String> hmap = new HashMap<Integer, String>();

  public static void main(String[] args) {
    String word2 = "apple";
    System.out.println(dictionary(word2));
  }





}