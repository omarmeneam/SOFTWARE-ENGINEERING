import javax.swing.JOptionPane;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LabExercise1Question {

  @SuppressWarnings("resource")
  public static void main(String[] args) {
    // Step 1: Get user's name using JOptionPane and assign to a String variable
    String name = JOptionPane.showInputDialog("What is your name?");

    // Step 2: Create a personalized greeting String variable combining "Hello" with
    // the String variable earlier
    String greeting = "Hello, " + name + "!";

    // Step 3: Get an integer input from the user
    // Use the Scanner class
    Scanner scanner = new Scanner(System.in);
    int number = 0;
    boolean validInput = false;
    do {
      try {
        System.out.println("Enter a number: ");
        number = scanner.nextInt();
        validInput = true;
      } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a number.");
        scanner.nextLine(); // Clear the buffer to avoid infinite loop
      }
    } while (!validInput);

    // Step 4: Display the personalized greeting with the entered number by
    // calling the displayGreeting method from Greeting class
    Greeting.displayGreeting(greeting, number);
  }
}

class Greeting {
  public static void displayGreeting(String message, int number) {
    // Step 5: Display the personalized greeting with the entered number using
    // JOptionPane
    JOptionPane.showMessageDialog(null, message + " The number you entered is: " + number);
  }
}
