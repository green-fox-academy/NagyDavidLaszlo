import java.util.Scanner;

public class DivideByZero {

  public static int Dividing(int z) {
    int result = 0;
    try {
      result = 10 / z;
  //    System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("Go back to math class mate!");
    }
    return result;
  }

  public static void main(String[] args) {
    // Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please provide an integer!");
    int Input = scanner.nextInt();

    int k = Dividing(Input);
    System.out.println(k);

    // System.out.println(result); -> ez azért nem kell, mert a try-catch-en belül nyomtat
  }
}
