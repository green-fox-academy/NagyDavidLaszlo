import java.util.Scanner;

public class AverageOfInput {

    public static void main(String[] args) {

        Scanner num1 = new Scanner(System.in);
        System.out.println("Please give a number!");
        double UserInput1 = num1.nextDouble();

        Scanner num2 = new Scanner(System.in);
        System.out.println("Please give a number!");
        double UserInput2 = num2.nextDouble();

        Scanner num3 = new Scanner(System.in);
        System.out.println("Please give a number!");
        double UserInput3 = num3.nextDouble();


        Scanner num4 = new Scanner(System.in);
        System.out.println("Please give a number!");
        double UserInput4 = num4.nextDouble();

        Scanner num5 = new Scanner(System.in);
        System.out.println("Please give a number!");
        double UserInput5 = num5.nextDouble();

        double sum = UserInput1 + UserInput2 + UserInput3 + UserInput4 + UserInput5;
        double average = sum/5;

        System.out.println("This is the average of the numbers you provided" + average);

    }

}