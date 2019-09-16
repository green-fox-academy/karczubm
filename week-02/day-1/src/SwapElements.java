// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`
public class SwapElements {
    public static void main(String[] args) {
        String abc[]={"first", "second", "third"};
        String tmp=abc[0];
        abc[0]=abc[2];
        abc[2]=tmp;

        for (String i:abc
             ) {
            System.out.println(i);
        }
    }
}
