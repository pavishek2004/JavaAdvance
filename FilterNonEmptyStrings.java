package javaAdvance;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNonEmptyStrings {
    public static void main(String[] args) {
        // Create a List of strings with some empty strings
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        
        // Filter out empty strings using stream's filter() method
        List<String> nonEmptyStrings = strings.stream()
                                             .filter(s -> !s.isEmpty())
                                             .collect(Collectors.toList());
        
        // Print the original list
        System.out.println("Original list: " + strings);
        
        // Print the list with non-empty strings
        System.out.println("Non-empty strings: " + nonEmptyStrings);
        
        // Print the count of empty strings
        long emptyCount = strings.size() - nonEmptyStrings.size();
        System.out.println("Number of empty strings: " + emptyCount);
    }
}