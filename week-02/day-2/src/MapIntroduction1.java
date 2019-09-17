import java.util.HashMap;

public class MapIntroduction1 {
    public static void main(String[] args) {
        //Create an empty map where the keys are integers and the values are characters
        HashMap<Integer, String> myMap = new HashMap<>();
        //Print out whether the map is empty or not
        System.out.println(myMap.isEmpty());
        //Add the following key-value pairs to the map
        /*Key	Value
        97	a
        98	b
        99	c
        65	A
        66	B
        67	C*/
        myMap.put(97, "a");
        myMap.put(98, "b");
        myMap.put(99, "c");
        myMap.put(65, "A");
        myMap.put(66, "B");
        myMap.put(67, "C");

        //Print all the keys
        System.out.println(myMap.keySet());
        //Print all the values
        System.out.println(myMap.values());
        //Add value D with the key 68
        myMap.put(68, "D");
        //Print how many key-value pairs are in the map
        System.out.println(myMap.size());
        //Print the value that is associated with key 99
        System.out.println(myMap.get(99));
        //Remove the key-value pair where with key 97
        myMap.remove(97);
        //Print whether there is an associated value with key 100 or not
        System.out.println(myMap.containsKey(100));
        //Remove all the key-value pairs
        myMap.clear();
    }
}
