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

sharpie red = new sharpie ("red",(float) 1.0);
sharpie purple = new sharpie ("purple",(float) 1.2);
sharpie blue = new sharpie ("blue",(float) 0.9);
sharpie orange = new sharpie ("orange",(float) 1.1);
sharpie green = new sharpie ("green",(float) 1.05);


SharpieSet mySharpies = new SharpieSet();
mySharpies.sharpieList.add(red);
mySharpies.sharpieList.add(purple);
mySharpies.sharpieList.add(blue);
mySharpies.sharpieList.add(orange);
mySharpies.sharpieList.add(green);


// sharpie mySharpie = new sharpie("pink",30);



    for (int i = 0; i <10; i++) {
    red.use();

    }



    System.out.println(mySharpies.countUsable());
    mySharpies.removeTrash();

    System.out.println(red.inkAmmount);


  }
}
