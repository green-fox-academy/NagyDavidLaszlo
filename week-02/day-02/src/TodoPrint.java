
public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        String others1 = " - Download games\n ";
        String others2 = "\t Diablo";
        String firstLine = "My to do:\n";




        StringBuilder str = new StringBuilder(todoText);  // ez a kívánt végeredmény,ami = új dologgal ami ugy jön ki ha ezzel (quote) mókolok
        int index=0;
        str.insert(index, firstLine);
        str.append(others1).append(others2);

        System.out.println(str);



        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo








    }
}