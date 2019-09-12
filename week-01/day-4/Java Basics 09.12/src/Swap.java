public class Swap {


        public static void main(String[] args) {
            // Swap the values of the variables
            int a = 123;
            int b = 526;

            // Value of first is assigned to temporary
            int temporary = a;
            // Value of second is assigned to first
            a = b;
            // Value of temporary (which contains the initial value of first) is assigned to second
            b = temporary;


            System.out.println(a);
            System.out.println(b);

    }
}
