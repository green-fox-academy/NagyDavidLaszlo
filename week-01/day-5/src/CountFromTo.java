import java.util.Scanner;

public class CountFromTo {

    public static void main(String[] args) {


// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

        Scanner num1 = new Scanner(System.in);
        System.out.println("Please give a number!");
        int UserInput1 = num1.nextInt();

        Scanner num2 = new Scanner(System.in);
        System.out.println("Please give a number!");
        int UserInput2 = num2.nextInt();

        int dif = UserInput2 - UserInput1;

        if (UserInput2 <= UserInput1) {
            System.out.println("Second number should be bigger");
        } else {
            for (int i = 0; i < dif; i++) {
                System.out.println(UserInput1);
                UserInput1++;
            }

        }


    }

}
