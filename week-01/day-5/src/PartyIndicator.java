import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {

        Scanner num1 = new Scanner(System.in);
        System.out.println("Please give the number of girls!");
        int girls = num1.nextInt();

        Scanner num2 = new Scanner(System.in);
        System.out.println("Please give the number of boys!");
        int boys = num2.nextInt();

        int participants = girls + boys;
        System.out.println(participants);

        if (participants >= 20) {
            if (girls == boys) {
                System.out.println("The party is excellent!");
            }else {
                System.out.println("Quite cool party!");
            }
        }else if (girls == 0) {
            System.out.println("Sausage party");
        } else
        {System.out.println("Average party!");}


// Write a program that asks for two numbers
// The first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is excellent!
// If the the number of girls and boys are equal and 20 or more people are coming to the party
//
// It should print: Quite cool party!
// If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people

    }
}
