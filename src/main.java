// Import the Scanner class from the java.util package.
import java.util.Scanner;

// Declare a public class called "main".
public class main {
  // Declare a static void method called "main" that takes in an array of Strings as its argument.
  public static void main(String[] args) {
    // Create a new Scanner object called "scan".
    Scanner scan = new Scanner(System.in);

    // Print a message asking the user to enter their party affiliation.
    System.out.print("Enter your party affiliation (D, R, or I): ");

    // Read the user's input as a String and store it in a variable called "affiliation".
    String affiliation = scan.next();

    // Check if the user's input is "D" (regardless of case), and if so, print a message indicating they get a Democratic Donkey.
    if (affiliation.equalsIgnoreCase("D")) {
      System.out.println("You get a Democratic Donkey.");
    } 
    // If the user's input is "R" (regardless of case), print a message indicating they get a Republican Elephant.
    else if (affiliation.equalsIgnoreCase("R")) {
      System.out.println("You get a Republican Elephant.");
    } 
    // If the user's input is "I" (regardless of case), print a message indicating they get an Independent Person.
    else if (affiliation.equalsIgnoreCase("I")) {
      System.out.println("You get a Independent Person.");
    } 
    // If the user's input is none of the above, print a message indicating they get an Other.
    else {
      System.out.println("You get an Other.");
    }
  }
}
