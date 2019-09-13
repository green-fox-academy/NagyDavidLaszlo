

public class ConditionalVariableMutation {
    public static void main(String[] args) {
        double a = 8;
        int out = 0;
        // if a is even increment out by one
        if (a % 2 == 0) {
            out++;
        }
        System.out.println(out);

        System.out.println("-------------------");


        int b = 48;
        String out2 = "";
        // if b is between 10 and 20 set out2 to "Sweet!"
        // if less than 10 set out2 to "Less!",
        // if more than 20 set out2 to "More!"

        if (b < 10) {
            System.out.println("Less!");
        } else if (b > 20) {
            System.out.println("More");
        } else {
            System.out.println("Sweet!");
        }


        System.out.println("-----------------");

/*

            switch (b) {

                case (b < 10):
                    out2= "Less";
                    break;
                 //   System.out.println("Less");

                case (b > 20):
                    System.out.println("More");
                    out2="More";
                    break;

                default:
                    out2="Sweet!";
                    break;
            }
               // System.out.println("Sweet");

            System.out.println(out2);



            }

*/

        int c = 123;
        int credits = 10;
        boolean isBonus = true;
        // if credits are at least 50,
        // and isBonus is false decrement c by 2
        // if credits are smaller than 50,
        // and isBonus is false decrement c by 1
        // if isBonus is true c should remain the same

        if (isBonus == false) {
            if (credits >= 50) {
                c -= 2;
            } else {
                c -= 1;
            }
        }

        System.out.println(c);

        System.out.println("------------------");


            int d = 8;
            int time = 120;
            String out3 = "";
            // if d is dividable by 4
            // and time is not more than 200
            // set out3 to "check"
            // if time is more than 200
            // set out3 to "Time out"
            // otherwise set out3 to "Run Forest Run!"

        if (d%4==0){
            if (time<=200){out3="check";}
            else{out3="Time out";}
        }else{
            out3="Run Forest Run!";
        }
            System.out.println(out3);
        }

}
