import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);

        System.out.println("Please type in your name!");
        String Userinput = name.nextLine();

        System.out.println("Hello, " + Userinput + "!");
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user

    }
}