public class SumAllElements {
    public static void main(String[] args) {

// - Create an array variable named `ai`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements in `ai`

        int result =0;

        int ai [] = {3, 4, 5, 6, 7};

        for (int i = 0; i < ai.length; i++) {
            result = result + ai[i];
        }

        System.out.println(result);

    }





}
