import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        Scanner num1 = new Scanner(System.in);
        System.out.println("Please give a number!");
        double UserInput1 = num1.nextDouble();

        Scanner num2 = new Scanner(System.in);
        System.out.println("Please give another number!");
        double UserInput2 = num2.nextDouble();

        if (UserInput1>UserInput2){
            System.out.println("The bigger number is " + UserInput1 + ".");
        }else {
            System.out.println("The bigger number is " + UserInput2 + ".");
        }


// Write a program that asks for two numbers and prints the bigger one

    }
}