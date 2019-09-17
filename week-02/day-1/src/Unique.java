public class Unique {
    public static int[] unique(int[] arr) {
        int tmp[] = new int[arr.length];
        for (int i = 0; i <tmp.length ; i++) {
            tmp[i]=1;
        }
        int counter = 0;
        for (int i = 0; i <arr.length; i++) {
            for (int j =i+1; j <arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counter++;
                    tmp[j] = 0;
                }
            }
        }
        int[] ret = new int[arr.length-counter];
        for (int i = 0; i < ret.length ; i++) {
            ret[i]=1;
        }
        counter = 0;
        for (int i = 0; i <arr.length; i++) {
            if (tmp[i] == 1) {
                ret[counter] = arr[i];
                counter++;
            }
        }
        return ret;
    }


    public static void main(String[] args) {
        int[]input=new int[]{1, 11, 34, 11, 52, 61, 1, 34};
        int[]indexedArray=unique(input);
        for (int i:indexedArray) {
            System.out.println(i+" ");
        }

        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
       // System.out.println(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`
    }
}
