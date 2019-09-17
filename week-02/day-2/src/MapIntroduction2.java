import java.util.Arrays;
import java.util.HashMap;

public class MapIntroduction2 {
    public static void main(String[] args) {


    /*Create a map where the keys are strings and the values are strings with the following initial values

    Key	Value
    978-1-60309-452-8	A Letter to Jo
    978-1-60309-459-7	Lupus
    978-1-60309-444-3	Red Panda and Moon Bear
    978-1-60309-461-0	The Lab*/
        String[] keys = {"978-1-60309-452-8", "978-1-60309-459-7", "978-1-60309-444-3", "978-1-60309-461-0"};
        String[] values = {"A Letter to Jo", "Lupus", "Red Panda and Moon Bear", "The Lab"};
        HashMap<String, String> myMap = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            myMap.put(keys[i], values[i]);
        }

    /*Print all the key-value pairs in the following format

    A Letter to Jo (ISBN: 978-1-60309-452-8)
    Lupus (ISBN: 978-1-60309-459-7)
    Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
    The Lab (ISBN: 978-1-60309-461-0)*/

        int i = 0;
        //if keys[] doesn't already exist:
        //String[] keys2= myMap.keySet().toArray(new String [0]);
        while (i < myMap.size()) {
            String value = myMap.get(keys[i]);
            String key = keys[i];
            System.out.println(value + " (ISBN: " + key + ")");
            i++;
        }

        //Remove the key-value pair with key 978-1-60309-444-3
        myMap.remove("978-1-60309-444-3");

        //Remove the key-value pair with value The Lab
        String[] keys2 = myMap.keySet().toArray(new String[0]);
        String[] values2 = myMap.values().toArray(new String[0]);
        String searchedString="The Lab";
        String searchedKey="";
        for (int j = 0; j < values2.length; j++) {
            if(searchedString.equals(values2[j])){
                searchedKey=keys2[j];
            }
        }
        myMap.remove(searchedKey);
        /*for (HashMap.Entry<String,String> myIt: myMap.entrySet()) {
            myIt.getKey();
        }*/


        /*Add the following key-value pairs to the map

        Key	Value
        978-1-60309-450-4	They Called Us Enemy
        978-1-60309-453-5	Why Did We Trust Him?*/
        myMap.put( "978-1-60309-450-4","They Called Us Enemy");
        myMap.put("978-1-60309-453-5","Why Did We Trust Him?");

        //Print whether there is an associated value with key 478-0-61159-424-8 or not
        System.out.println(myMap.containsKey("478-0-61159-424-8"));

        //Print the value associated with key 978-1-60309-453-5
        System.out.println(myMap.get("978-1-60309-453-5"));
    }
}
