import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        Scanner legs = new Scanner(System.in);
        System.out.println("How many chickens do you have?");
        int UserInput = legs.nextInt();

        UserInput = UserInput*2;

        Scanner legs2 = new Scanner(System.in);
        System.out.println("How many pigs do you have?");
        int UserInput2 = legs2.nextInt();

        UserInput2 = UserInput2*4;

        System.out.println("All your animals have "+(UserInput+UserInput2) + "legs.");

        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
    }
}