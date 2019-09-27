package sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

/*
Reuse your Sharpie class
Create SharpieSet class
it contains a list of Sharpie
countUsable() -> sharpie is usable if it has ink in it
removeTrash() -> removes all unusable sharpies
 */


  List<sharpie> sharpieList = new ArrayList();

  public int countUsable() {      // ez végigmegy a sharpieList-en és ha adott sornak (sharpie)
    int counter = 0;                // az inkAmount-ja nagyobb mint nulla akkor 1-et hozzáad
    for (sharpie sharpie : sharpieList) {   // mindegyiken végigmegy és ahánynak nagyobb mint nulla
      if (sharpie.inkAmmount > 0) {         // a 23.sorban hozzáad 1-et... annyi használható.
        counter = counter + 1;
      }
    }
    return counter;
  }

  public void removeTrash(){
    for (int i = 0; i < sharpieList.size()-1 ; i++) {
      if (sharpieList.get(i).inkAmmount < 1 ) {
        sharpieList.remove(i);
      }
    }

  }







  }



