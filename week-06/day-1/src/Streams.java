import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {


        //EX1
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        List<Integer> evenNums = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        //EX2
        List<Integer> squaredNums = numbers.stream().filter(n -> n > 0).map(n -> n * n).collect(Collectors.toList());

        //EX3
        List<Integer> numbers3 = Arrays.asList(3, 9, 2, 8, 6, 5);
        List<Integer> squaredIsMoreThanTen = numbers3.stream().filter(n -> n * n > 20).collect(Collectors.toList());

        //EX4
        List<Integer> numbers4 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        double averageOfOdds = numbers4.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
        double averageOfOdds2 = numbers4.stream().filter(n -> n % 2 != 0).mapToInt(n -> n.intValue()).average().getAsDouble();

        //EX5
        List<Integer> numbers5 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        double sumOfOdds = numbers4.stream().filter(n -> n % 2 != 0).mapToInt(n -> n.intValue()).sum();

        //EX6
        String string = "AbCdE";
        List<Character> upperCaseChars = string.chars().mapToObj(c -> (char) c).filter(c -> Character.isUpperCase(c)).collect(Collectors.toList());

        //EX7
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS")
                .stream()
                .filter(s -> s.startsWith("r"))
                .collect(Collectors.toList());

        //EX8
        List<Character> chars = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f');
        String charArray = chars.stream().map(s -> s.toString()).collect(Collectors.joining());

        //EX9
        String string2 = "asdkjasfjalékndlfhiskldb";
        Map<Character, Integer> freq = string2.chars()
                //.boxed()
                // .collect(Collectors.toMap(k -> Character.valueOf((char) k.intValue()),v -> 1,Integer::sum));
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Math.toIntExact(Collectors.counting())));
        //v ->1, Integer.sum(1, v)));???

        //EX10
        List<Fox> foxes = new ArrayList<>();
        foxes.add(new Fox("A", "red", 1));
        foxes.add(new Fox("B", "green", 2));
        foxes.add(new Fox("C", "blue", 13);
        foxes.add(new Fox("D", "yellow", 14));
        foxes.add(new Fox("E", "green", 18));

        List<Fox> greenFox = foxes.stream().filter(f -> f.coloure.equals("green")).collect(Collectors.toList());
        List<Fox> greenFox5 = foxes.stream().filter(f -> f.coloure.equals("green") && f.age < 5).collect(Collectors.toList());
        Map<String, Integer> foxFreq = foxes.stream().collect(Collectors.toMap(f -> f.coloure, v -> 1, Integer::sum));

    }
}
