package garden;


import java.util.ArrayList;

public class Garden {

  public static void main(String[] args) {
  /*
  The task is to create a garden application, so in your main method you should create a garden with flowers and trees.
  The program should demonstrate an example garden with two flowers (yellow and blue) and two trees (purple and orange).
  In the example after creating them you should show the user, how the garden looks like.
  After that the program should water the garden twice, first with the amount of 40 then with 70.
  And after every watering the user should see the state of the garden as you can see in the output.
   */

    Plants flower1 = new Flower("Yellow");
    Plants flower2 = new Flower("Blue");

    Plants tree1 = new Tree("Purple");
    Plants tree2 = new Tree("Orange");

    ArrayList<Plants> myGarden = new ArrayList<>();
    myGarden.add(flower1);
    myGarden.add(flower2);
    myGarden.add(tree1);
    myGarden.add(tree2);

    int counter = 0;
    for (int i = 0; i < myGarden.size(); i++) {

      if (myGarden.get(i).checkForWaterNeed()) {
        counter += 1;
      }
    }

    }
  }