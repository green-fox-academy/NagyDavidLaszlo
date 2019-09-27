package petrolstation;

public class MainCarStation {

  public static void main(String[] args) {
    /*
    Petrol Station
    Create Station and Car classes
    Station
    gasAmount
    refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
    Car
    gasAmount
    capacity
    create constructor for Car where:
    initialize gasAmount -> 0
    initialize capacity -> 100
     */

    Station molStation = new Station();
    Car toyota = new Car();

    molStation.refill(toyota);

    System.out.println(toyota.gasAmount);
    System.out.println(molStation.gasAmount);
  }

}
