import java.util.Arrays;
import java.util.Scanner;


public class Reverse {

    public static void main(String[] args) {
        Scanner myWord = new Scanner(System.in);
        System.out.println("Please provide a word!");
        String word = myWord.nextLine();

        String WordBack =  ReversingWords(word);
        System.out.println(WordBack);

  /*      String[] reverse = new String[word.length()];


        for (int i = 0; i < word.length(); i++) {
            reverse[i] = String.valueOf(word.charAt(word.length() - 1 - i));

        }

        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i]);
        }
*/
    }

    public static String ReversingWords(String word) {
        String[] reverse = new String[word.length()];

        for (int i = 0; i < word.length(); i++) {
            reverse[i] = String.valueOf(word.charAt(word.length() - 1 - i));
        }

        String result ="";
        for (int i = 0; i <reverse.length ; i++) {
            result = result + reverse[i];
        }
        return result;
    }
}

