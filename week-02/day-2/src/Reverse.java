public class Reverse {
    public static void main(String... args) {

        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        /*A
        StringBuilder sb=new StringBuilder(revesed);
        String ok=sb.reverse();
        System.out.println(ok);
         */

        //B

        System.out.println(reverse(reversed));
    }
    public static String reverse(String input){
        char[] reversed=new char[input.length()];
        for (int i = 0; i <reversed.length ; i++) {
            reversed[i]=input.charAt(reversed.length-1-i);
        }
        String ret=new String(reversed);
        return ret;
    }
}