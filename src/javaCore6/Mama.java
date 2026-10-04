package javaCore6;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mama {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String[] words = scan.nextLine().split("[^\\p{L}\\p{Digit}]+");
//        Map<String, Long> map = Arrays.stream(words)
//                .map(s -> s.toLowerCase())
//                .collect(Collectors.groupingBy(
//                s -> s,
//                Collectors.counting()
//        ));
//        map.entrySet().stream()
//                .sorted(Map.Entry.<String, Long>comparingByValue().reversed()
//                .thenComparing(Map.Entry.comparingByKey()))
//                .limit(10)
//                .map(entry -> entry.getKey())
//                .forEach(System.out::println);
//
//    }
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useDelimiter("\\A");
    String text = scan.next();
    String[] words = text.split("[^\\p{L}\\p{Digit}]+");

    Map<String, Long> map = Arrays.stream(words)
            .map(s -> s.toLowerCase())
            .collect(Collectors.groupingBy(
                    s -> s,
                    Collectors.counting()
            ));

    map.entrySet().stream()
            .sorted(Map.Entry.<String, Long>comparingByValue().reversed()
                    .thenComparing(Map.Entry.comparingByKey()))
            .limit(10)
            .map(entry -> entry.getKey())
            .forEach(System.out::println);
}
}
