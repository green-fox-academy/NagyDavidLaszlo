import java.util.Scanner;

public class Summing {


    public static void main(String[] args) {
        // Create the usual class wrapper and main method on your own.

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter

        Scanner UserInput = new Scanner(System.in);
        System.out.println("Please give the an integer!");
        int z = UserInput.nextInt();
        addingUp(z);

        int x = addingUp(z);
        System.out.println(x);


        //     System.out.println("The sum of numbers from zero to the given parameter is " + );
        // 28 sortól a funkcióban használt név (number) eltérhet a "z"-tól.... a lényeg, hogy
        //a funkcióban lévő logika lezajlik mindennel, ami az "addingUp" után van

    }



    public static int addingUp(int number) {
        int result = 0;

        for (int i = 0; i < number; i++) {
            result = result + (number - i);


        }
        return result;

    }

}

