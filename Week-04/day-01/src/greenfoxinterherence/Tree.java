package greenfoxinterherence;



public class Tree extends Plants {
  Tree(String colour){
    this.name = colour;
    this.absorbtionRate = 0.4;
    this.wateringLimit = 10.00;
  }

  /*  @Override
    public void watering (double amount){
        currentWaterAmount = currentWaterAmount + absorbtionRate*amount;
    }*/
}


//needs water if its current water amount is less then 10
//when watering it the tree can only absorb the 40% of the water
//eg. watering with 10 the tree's amount of water should only increase with 4