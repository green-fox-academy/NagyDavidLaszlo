package sharpie;

public class sharpieMain {

  public static void main(String[] args) {
/*
  Create Sharpie class
We should know about each sharpie their color (which should be a string), width
(which will be a floating point number),inkAmount (another floating point number)
When creating one, we need to specify the color and the width
Every sharpie is created with a default 100 as inkAmount
We can use() the sharpie objects
which decreases inkAmount
  */


sharpie mySharpie = new sharpie("pink",30);

mySharpie.use();

    System.out.println(mySharpie.inkAmmount);


  }
}
