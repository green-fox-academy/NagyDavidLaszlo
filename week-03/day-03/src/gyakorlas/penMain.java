package gyakorlas;
public class penMain {

  public static void main(String[] args) {
/*
Create Sharpie class
We should know about each sharpie their color (which should be a string), width (which will be a floating point number),
inkAmount (another floating point number)
When creating one, we need to specify the color and the width
Every sharpie is created with a default 100 as inkAmount
We can use() the sharpie objects
which decreases inkAmount
 */


    pen marker1 = new pen("pink", 30);
    pen marker2= new pen();

    System.out.println(marker1.inkAmmount);

    marker1.use();

    System.out.println(marker1.inkAmmount);

//    System.out.println(marker1.width);  // width private... ezt nem adja ki
                                          // kikommenteltem, hogy ne adjon hibát, de próbáld ki :)

    marker1.getwidth();

    System.out.println(marker2.color);  // létrehoztam egy üres marker 2 objectet. ez felveszi a class
                                        // alapértékeit (nézd meg :-)  )
    //Ha csak itt a 17 sort írod be de nem hozol létre egy üres objectet a "class"-ban akkor hibát dob.
  }
}
