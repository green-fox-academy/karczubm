import java.util.ArrayList;

public class ListInstructions1 {
    public static void main(String[] args) {
    //Create an empty list which will contain names (strings)
        ArrayList<String> names=new ArrayList<>();
    //Print out the number of elements in the list
        System.out.println(names.size());
    //Add William to the list
        names.add("William");
    //Print out whether the list is empty or not
        System.out.println("Is it empty? :"+names.isEmpty());
    //Add John to the list
        names.add("Jhon");
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
        System.out.println(names.iterator());
    /*Iterate through the list and print
        1. William
        2. John
        3. Amanda*/
    //Remove the 2nd element
    /*Iterate through the list in a reversed order and print out each name
            Amanda
            William*/
    //Remove all elements
}}
