public class SubInt {
    public static int[] subInt(int a, int[] arr) {

        int next=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] / (a * 10) == a || arr[i] % (a * 10) == a) {
                next++;
            }
        }
        int[] indexes = new int[next];
        next=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] / (a * 10) == a || arr[i] % (a * 10) == a) {
                indexes[next] = i;
                next++;
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        int[] in = {1, 11, 34, 52, 61};

        int searchedNumber = 1;
        System.out.print("[ ");
        for (int b : subInt(searchedNumber, in)) {

                System.out.print(b + " ");
            }


        System.out.println("]");}

        //  Create a function that takes a number and an array of integers as a parameter
        //  Returns the indices of the integers in the array of which the first number is a part of
        //  Or returns an empty array if the number is not part of any of the integers in the array


        //  Example:
        //System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        //System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'
    }
