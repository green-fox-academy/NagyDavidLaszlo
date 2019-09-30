package greenfoxinterherence;

import java.util.ArrayList;
import java.util.List;

public class GardenMain {
  List<Plants> plantList = new ArrayList<>();

  public static void main(String[] args) {

    GardenMain myGarden = new GardenMain();
    Flower yellow = new Flower("yellow");
    Flower violet = new Flower("blue");
    Tree oak = new Tree("purple");
    Tree pine = new Tree("orange");


    myGarden.plantList.add(yellow);
    myGarden.plantList.add(violet);
    myGarden.plantList.add(oak);
    myGarden.plantList.add(pine);

    status(myGarden.plantList);
    Watering(myGarden.plantList, 40);
    status(myGarden.plantList);
    Watering(myGarden.plantList, 70);
    status(myGarden.plantList);


  }
  public static void Watering(List<Plants> plantList, double fullAmount){
    System.out.println("");
    System.out.println("Watering with " + fullAmount);

    int counter = 0;
    for (int i = 0; i < plantList.size() ; i++) {
      if (plantList.get(i).needsWater()){
        counter += 1;
      }
    }
    for (int i = 0; i < plantList.size() ; i++) {
      if (plantList.get(i).needsWater()){
        plantList.get(i).watering(fullAmount/counter);
      }
    }
  }
  public static void status(List<Plants> plantList){
    for (Plants plants: plantList) {
      if (plants.needsWater()) {
        System.out.println("The " + plants.name + " " +  plants.getClass().getSimpleName() + " need water");
      } else {
        System.out.println("The " + plants.name + " " + plants.getClass().getSimpleName() + " doesn't need water");
      }


    }
  }
}

//The task is to create a garden application, so in your main method you should create a garden with flowers and trees.
// The program should demonstrate an example garden with two flowers (yellow and blue) and two trees (purple and orange).
// In the example after creating them you should show the user, how the garden looks like.
// After that the program should water the garden twice, first with the amount of 40 then with 70.
// And after every watering the user should see the state of the garden as you can see in the output.

//The Garden is able to hold unlimited amount of flowers or trees
//when watering it should only water those what needs water with equally divided amount amongst them
//eg. watering with 40 and 4 of them need water then each gets watered with 10