import java.util.HashMap;

public class TelephoneBook {
    public static void main(String[] args) {

    //Create a map with the following key-value pairs.
    HashMap<String,String> contacts=new HashMap<>();

    contacts.put("William A. Lathan",	"405-709-1865");
    contacts.put("John K. Miller",	"402-247-8568");
    contacts.put("Hortensia E. Foster",	"606-481-6467");
    contacts.put("Amanda D. Newland",	"319-243-5613");
    contacts.put("Brooke P. Askew",	"307-687-2982");

    //What is John K. Miller's phone number?
        System.out.println(contacts.get("John K. Miller"));
        // Whose phone number is 307-687-2982?
        for (int i = 0; i <contacts.size() ; i++) {
            if(contacts.values().toArray()[i].equals("307-687-2982")){
                System.out.println(contacts.keySet().toArray()[i]);
            }
        }
        //Do we know Chris E. Myers' phone number?

}}
