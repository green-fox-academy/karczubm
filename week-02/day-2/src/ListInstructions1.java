import java.util.ArrayList;
import java.util.Iterator;

public class ListInstructions1 {
    public static void main(String[] args) {
        //Create an empty list which will contain names (strings)
        ArrayList<String> names = new ArrayList<>();
        //Print out the number of elements in the list
        System.out.println(names.size());
        //Add William to the list
        names.add("William");
        //Print out whether the list is empty or not
        System.out.println("Is it empty? :" + names.isEmpty());
        //Add John to the list
        names.add("John");
        //Add Amanda to the list
        names.add("Amanda");
        //Print out the number of elements in the list
        System.out.println(names.size());
        //Print out the 3rd element
        System.out.println(names.get(2));
    /*Iterate through the list and print out each name
            William
            John
            Amanda*/
        /*A
            System.out.println(names);*/

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    /*Iterate through the list and print
        1. William
        2. John
        3. Amanda*/
        int b = 1;
        for (String i : names.toArray(new String[0])
        ) {
            System.out.println(b + ". " + i);
            b++;
        }
        //Remove the 2nd element
        names.remove(1);
    /*Iterate through the list in a reversed order and print out each name
            Amanda
            William*/
        String[] namesArray = names.toArray(new String[0]);
        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(namesArray[i]);
        }
        //Remove all elements
        names.clear();
    }
}
