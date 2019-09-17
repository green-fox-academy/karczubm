import java.util.ArrayList;
import java.util.Arrays;

public class ShopingList {
    public static void main(String[] args) {
        //Eggs, milk, fish, apples, bread and chicken
        String[] items={"eggs", "milk", "fish", "apples", "bread" , "chicken"};
        ArrayList<String> shopingList=new ArrayList<>(Arrays.asList(items));
        //Create an application which solves the following problems
        //Do we have milk on the list?
        System.out.println("milk: "+shopingList.contains("milk"));
        //Do we have bananas on the list?
        System.out.println("banana: "+shopingList.contains("banana"));
    }
}
