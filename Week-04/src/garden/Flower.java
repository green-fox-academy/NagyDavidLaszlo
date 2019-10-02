package garden;

public class Flower extends Plants{
  /*
The Flower
needs water if its current water amount is less then 5
when watering it the flower can only absorb the 75% of the water
eg. watering with 10 the flower's amount of water should only increase with 7.5
   */

public Flower(String color){        //minden flower 12-13-14. sor erteke ugyanaz, de a szín nem
  this.waterAmount = 0;             // ezért amikor bejün a main-ből (itt Garden) a "new" akkor color-t adsz neki
  this.absorbationRate=0.75;
  this.absorbationLimit= 5;
  this.color=color;
}





}
