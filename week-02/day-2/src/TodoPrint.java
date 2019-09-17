public class TodoPrint {
    public static void main(String... args){

        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        String todoText = " - Buy milk\n";
        String frstPart="My todo:\n";

        todoText=frstPart.concat(todoText).concat(" - Download games\n").concat("\t- Diablo");
        System.out.println(todoText);
    }
}