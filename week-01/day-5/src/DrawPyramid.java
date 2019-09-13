public class DrawPyramid {
    public static void main(String[] args) {

        int a = 4;
        int b = 2 * a + 1;


        for (int i = 0; i < (b); i++) {

            for (int j = 0; j < i; j++) {
                if (i % 2 == 1) {
                        System.out.print("*");
                    }
                }
                if (i % 2 == 1) System.out.println();
            }

        }
    }

//                     for (int k = 0; k <j ; k++) {
//
//                    } System.out.println(" ");

            // sor + 2 db csillag
            // space elotte = az (utolso szám mínusz -1)/2 --- itt épp a-1







// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was



