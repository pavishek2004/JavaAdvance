package javaAdvance;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UppercaseConverter {
    public static void main(String[] args) {
        // Create a Stream of strings
        Stream<String> names = Stream.of("aBc", "d", "ef");
        
        // Convert all strings to uppercase using map()
        List<String> uppercaseNames = names.map(String::toUpperCase)
                                          .collect(Collectors.toList());
        
        // Print the result
        System.out.println("Original strings: [aBc, d, ef]");
        System.out.println("Uppercase strings: " + uppercaseNames);
    }
}