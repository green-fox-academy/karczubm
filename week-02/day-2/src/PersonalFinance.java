import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class PersonalFinance {
    public static void main(String[] args) {
        Integer[] input = {500, 1000, 1250, 175, 800, 120};
        ArrayList<Integer> sepndings = new ArrayList<>();
        sepndings.addAll(Arrays.asList(input));

        Integer sum = 0;
        Integer max = 0;
        Integer min = sepndings.get(0);
        int spendingTimes = 0;
        Integer average;
        Iterator myIt = sepndings.iterator();
        while (myIt.hasNext()) {
            Integer iterator = (Integer) myIt.next();
            sum += iterator;
            max = iterator > max ? iterator : max;
            min = iterator < min ? iterator : min;
            spendingTimes++;
        }
        average = sum / spendingTimes;
    }
}
