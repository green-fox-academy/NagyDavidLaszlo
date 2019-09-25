package postit;



public class postitInstances {

  public static void main(String[] args) {


  /* Create a PostIt class that has
     a backgroundColor
     a text on it
     a textColor

     Create a few example post-it objects:
 an orange with blue text: "Idea 1"
 a pink with black text: "Awesome"
 a yellow with green text: "Superb!"
*/
    postitClass firstPostit = new postitClass("orange", "blue", "Idea1");
    postitClass secondPostit = new postitClass("pink", "black", "Awesome");
    postitClass thirdPostit = new postitClass("yellow", "green", "Superb!");

    postitClass otherPostit = new postitClass("bla-bla");

    // System.out.println(firstPostit.backgroundColor);

    firstPostit.myPrintln();

  }
}
