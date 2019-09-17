
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroductions2 {
    public static void main(String[] args) {

        //Create a list ('List A') which contains the following values
        //Apple, Avocado, Blueberries, Durian, Lychee
        String[] fruitsArray = {"Apple", "Avocado", "Blueberries", "Durian", "Lychee"};
        ArrayList<String> fruits1 = new ArrayList<String>(Arrays.asList(fruitsArray));
        //.asList() static ezért az osztályon érhető el az egyes példányokon nem!

        //Create a new list ('List B') with the values of List A
        /*Alternatív megoldás .clone()
            ArrayList fruits2=(ArrayList) fruits1.clone();
            downcast-olni kell sz osztálytípust mivel Object.class-ként nem veszi be*/

        ArrayList<String> fruits2 = new ArrayList<>();
        for (String fruit : fruits1.toArray(new String[0])) {
            fruits2.add(fruit);
        }
        System.out.println(fruits1);
        System.out.println(fruits2);

        //Print out whether List A contains Durian or not
        System.out.println(fruits1.contains("Durian"));
        //Remove Durian from List B
        fruits2.remove("Durian");
        //Add Kiwifruit to List A after the 4th element
        fruits1.add(4, "Kiwifruit");
        //Compare the size of List A and List B
        if (fruits1.size() != fruits2.size()) {
            System.out.println("not the same size");
        } else {
            System.out.println("Same size");
        }
        //Get the index of Avocado from List A
        fruits1.indexOf("Avocado");
        //Get the index of Durian from List B
        fruits2.indexOf("Durian");
        //Add Passion Fruit and Pomelo to List B in a single statement
        String[] otherFruits = {"Passion fruit", "Pomelo"};
        fruits2.addAll(Arrays.asList(otherFruits));

        //Print out the 3rd element from List A
        System.out.println(fruits1.get(2));
    }
}
