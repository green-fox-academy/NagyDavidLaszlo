package gyakorlas;

public class pen {
/*
Create Sharpie class
We should know about each sharpie their color (which should be a string), width (which will be a floating point number),
inkAmount (another floating point number)
When creating one, we need to specify the color and the width
Every sharpie is created with a default 100 as inkAmount
We can use() the sharpie objects
which decreases inkAmount
 */

String color = "Purple";
private float width= 30;
float inkAmmount=100;

public pen (String color, float width){

  this.color= color;
  this.width=width;

}

public void use(){
  inkAmmount = inkAmmount-2;
}

public float getwidth(){

  return this.width;
}


public pen(){}






}
