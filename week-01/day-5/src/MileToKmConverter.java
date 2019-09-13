import java.util.Scanner;


public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner miles = new Scanner(System.in);
        System.out.println("Please give the distance in miles.");
        double UserInput = miles.nextDouble();


        UserInput = UserInput*1.6;

        System.out.println(UserInput);



        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
    }
}