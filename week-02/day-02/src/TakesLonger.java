public class TakesLonger {




    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)



        int index = quote.indexOf("you");


        String extratext = "always takes longer than ";

        StringBuilder str = new StringBuilder(quote);  // ez a kívánt végeredmény,ami = új dologgal ami ugy jön ki ha ezzel (quote) mókolok

        str.insert(index, extratext);


        index = quote.indexOf("you");

        System.out.println(str);


    }
}