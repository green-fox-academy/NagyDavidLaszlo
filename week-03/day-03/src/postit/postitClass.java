package postit;

public class postitClass {

 /* Create a PostIt class that has
      a backgroundColor
      a text on it
      a textColor

      Create a few example post-it objects:
  an orange with blue text: "Idea 1"
  a pink with black text: "Awesome"
  a yellow with green text: "Superb!"
*/

 String backgroundColor;
 String textOn;
 String textColor;


  public postitClass(String myColor, String textOn, String textColor) {
backgroundColor=myColor;
this.textOn=textOn;
this.textColor=textColor;

  }

  public postitClass(String myText){
   backgroundColor = "White";
   textOn= myText;
   textColor = "Purple";
  }


  // functions

public void myPrintln (){

 System.out.println(backgroundColor +" " + textColor +" " + textOn);
}






}
