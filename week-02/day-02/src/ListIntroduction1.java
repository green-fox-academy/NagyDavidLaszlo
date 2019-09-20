import com.sun.javafx.UnmodifiableArrayList;

import java.util.ArrayList;

public class ListIntroduction1 {

    public static void main(String[] args) {

        /*
Create an empty list which will contain names (strings)
Print out the number of elements in the list
Add William to the list
Print out whether the list is empty or not
Add John to the list
Add Amanda to the list
Print out the number of elements in the list
Print out the 3rd element

         */

        ArrayList<String> names = new ArrayList<>();         //starting the list

        int retval = names.size();                          // size of the list
        System.out.println("Size of list = " + retval);     //print the number (size of list)

        names.add("William");                              //adding an element to the array
        int retval2 = names.size();
        System.out.println("Size of list = " + retval2);

        if (names.size() > 0) {
            System.out.println("It is not empty.");
        } else {
            System.out.println("The array is empty");
        }


     /*   if (retval2 == 0) {
            System.out.println("array is null");                    //ez itt ugyanaz mint egyel feljebb
        }else {
            System.out.println("It is not empty.");
        }
      */


        names.add("John");
        names.add("Amanda");

        int retval3 = names.size();

        System.out.println(retval3);

        System.out.println(names.get(2));


    }


}
