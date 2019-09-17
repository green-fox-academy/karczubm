
public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        String  missing="always takes longer than";
        StringBuilder str=new StringBuilder(quote);
        str.insert(quote.indexOf(" you"),missing);
        quote=str.toString();
        System.out.println(quote);
    }
}