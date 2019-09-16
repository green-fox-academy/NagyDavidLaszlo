public class Colors {


    public static void main(String[] args) {

// - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"`

  /*      String green[] = {"lime", "forest green", "olive", "pale green", "spring green"};
        String red[] = {"orange red", "red", "tomato"};
        String pink[] = {"orchid", "violet", "pink", "hot pink"};

        String[] colors[] = {green, red, pink};

        System.out.println(colors[1][0]);
*/

        String colours[][] = {
                {"lime", "forest green", "olive", "pale green", "spring green"},
        {
            "orange red", "red", "tomato"
        } ,
        {
            "orchid", "violet", "pink", "hot pink"
        } ,
    };
        System.out.println(colours[0][1]);

    }
}