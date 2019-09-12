public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // make the "a" variable's value bigger by 10
        a += 10;
        System.out.println(a);


        int b = 100;
        // make b smaller by 7

        b -= 7;

        System.out.println(b);

        int c = 44;
        // please double c's value
        c = c * 2;
        System.out.println(c);

        int d = 125;
        // please divide by 5 d's value
        d = d / 5;
        System.out.println(d);

        int e = 8;
        // please cube of e's value

        for (int i = 0; i < 2; i++) {
            e = e * 8;
        }
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        if (f1 > f2) {
            System.out.println("F1 is bigger than f2.");
        } else {
            System.out.println("F1 is smaller than f2.");
        }


        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)

        if (g2 * 2 > g1) {
            System.out.println("The double of g2 is bigger than g1.");
        } else {
            System.out.println("The double of g2 is less than g1.");
        }


        double h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        double p = h % 11;

        //   System.out.println(p);

        if (p != 0) {
            System.out.println("11 is not divisor of value h.");
        } else {
            System.out.println("11 is the divisor of value h.");
        }


        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

        if (i1 > (i2 * i2) && i1 < i2 * i2 * i2) {
            System.out.println("I1 is higher than the square of i2 and smaller than the cube of it.");
        } else {
            System.out.println("It is not the that i1 is higher than the square of i2 and smaller than the cube of it");
        }


        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)

        if ((j % 3 == 0) && (j % 5 == 0)) {
            System.out.println("3 and 5 are divisors of value j.");

        } else {
            System.out.println("At least one of 3 or 5 are not divisors of value j.");
        }


    }
}