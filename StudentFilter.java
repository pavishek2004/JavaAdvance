package javaAdvance;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentFilter {
    public static void main(String[] args) {
        // Create a List to store 10 student names
        List<String> studentNames = new ArrayList<>();
        
        // Adding 10 student names to the list
        studentNames.add("Alice");
        studentNames.add("Bob");
        studentNames.add("Andrew");
        studentNames.add("Jennifer");
        studentNames.add("Michael");
        studentNames.add("Amanda");
        studentNames.add("David");
        studentNames.add("Ashley");
        studentNames.add("Thomas");
        studentNames.add("Alexander");
        
        // Using Stream API with lambda expression to filter students whose names start with 'A'
        List<String> specialGiftStudents = studentNames.stream()
                                                      .filter(name -> name.startsWith("A"))
                                                      .collect(Collectors.toList());
        
        // Display all students in the class
        System.out.println("All students in the class:");
        studentNames.forEach(name -> System.out.println("- " + name));
        
        // Display students who will receive special gifts
        System.out.println("\nStudents who will receive special gifts (names starting with 'A'):");
        if (specialGiftStudents.isEmpty()) {
            System.out.println("No students qualify for special gifts.");
        } else {
            specialGiftStudents.forEach(name -> System.out.println("- " + name));
            System.out.println("\nTotal number of students receiving special gifts: " + specialGiftStudents.size());
        }
    }
}