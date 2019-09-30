package greenfoxinterherence;

public class Plants {
  String name;
  double currentWaterAmount;
  double absorbtionRate;
  double wateringLimit;
  //boolean needsWater = currentWaterAmount < wateringLimit;

  public void watering(double amount){
    if (currentWaterAmount < wateringLimit)
      currentWaterAmount = currentWaterAmount + absorbtionRate*amount;
  }

  public boolean needsWater (){
    boolean needsWater;
    if (currentWaterAmount < wateringLimit) {
      needsWater = true;
    } else {
      needsWater = false;
    }
    return needsWater;
  }
}