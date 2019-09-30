package greenfoxinterherence;


public class Flower extends Plants {

  Flower(String colour){
    this.name = colour;
    this.absorbtionRate = 0.75;
    this.wateringLimit = 5.00;
  }

   /* @Override
    public void watering (double amount){
        this.currentWaterAmount = currentWaterAmount + absorbtionRate * amount;
    }*/
}


//needs water if its current water amount is less then 5
//when watering it the flower can only absorb the 75% of the water
//eg. watering with 10 the flower's amount of water should only increase with 7.5