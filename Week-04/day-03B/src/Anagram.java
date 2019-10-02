import java.util.Arrays;

public class Anagram {
  //Write a function, that takes two strings and returns a boolean value based on if the two strings are Anagramms or not.
  //Create a test for that.

  public static  boolean anagram (String one, String two) {

    String [] temp1 = one.split("");
    String [] temp2 = two.split("");

    Arrays.sort(temp1);
    Arrays.sort(temp2);

    return (Arrays.equals(temp1,temp2));
  }












  public static void main(String[] args) {
    String first= "mama";
    String second = "ammajj";

    System.out.println( anagram(first,second));
  }
}
