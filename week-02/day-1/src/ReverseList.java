

public class ReverseList {
    public static void main(String[] args) {

// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`


        int aj[] = {3, 4, 5, 6, 7};

        int[] reverse = new int[aj.length];

        for (int i = 0; i < aj.length; i++) {
            reverse[i] = aj[aj.length-1 - i];
        }

        for (int i = 0; i <reverse.length ; i++) {
            System.out.println(reverse[i]);
        }
    }
}