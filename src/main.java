import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter your party affiliation (D, R, or I): ");
    String affiliation = scan.next();

    if (affiliation.equalsIgnoreCase("D")) {
      System.out.println("You get a Democratic Donkey.");
    } else if (affiliation.equalsIgnoreCase("R")) {
      System.out.println("You get a Republican Elephant.");
    } else if (affiliation.equalsIgnoreCase("I")) {
      System.out.println("You get a Independent Person.");
    } else {
      System.out.println("You get an Other.");
    }
  }
}
