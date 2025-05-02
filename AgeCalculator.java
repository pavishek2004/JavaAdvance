package javaAdvance;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user's birthdate as input
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthdateInput = scanner.nextLine();
        
        try {
            // Parse the input string to LocalDate
            LocalDate birthdate = LocalDate.parse(birthdateInput, DateTimeFormatter.ISO_DATE);
            
            // Get the current date
            LocalDate currentDate = LocalDate.now();
            
            // Validate if the birthdate is in the past
            if (birthdate.isAfter(currentDate)) {
                System.out.println("Error: Birthdate cannot be in the future.");
                return;
            }
            
            // Calculate the period between birthdate and current date
            Period age = Period.between(birthdate, currentDate);
            
            // Display the age in years, months, and days
            System.out.println("Your age is: " + age.getYears() + " years, " + 
                              age.getMonths() + " months, and " + 
                              age.getDays() + " days.");
        } catch (DateTimeParseException e) {
            System.out.println("Error: Please enter a valid date in the format yyyy-mm-dd.");
        } finally {
            scanner.close();
        }
    }
}