public class Matrix {
    public static void main(String[] args) {
        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output

int a [] = {1, 0, 0, 0};
int b [] = {0, 1, 0, 0};
int c [] = {0, 0, 1, 0};
int d [] = {0, 0, 0, 1};

int e [][] = {a,b,c,d};

     for (int k[] : e)
     {
         for (int l:k) {
             System.out.print(" "+l);


         }
         System.out.println();

     }


    }



}
