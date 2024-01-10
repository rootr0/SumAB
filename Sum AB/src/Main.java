import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){
            try {
                System.out.println("Hello, please enter two whole numbers to add them together!");
                System.out.print("First number: ");
                int a = scanner.nextInt();
                System.out.print("First number is " + a);

                System.out.print("\nSecond number: ");
                int b = scanner.nextInt();
                System.out.print("Second number is " + b);

                System.out.print("\nTotal: " + (a + b));
                options();
            } catch (InputMismatchException d) {
                System.out.print("Invalid input. Please enter valid numbers.");
                scanner.nextLine();
            }
        }
    }

    public static void options() {
        System.out.print("\nWould you like to try again?");
        System.out.print("\n1 - Yes\n2 - No");

        System.out.print("\nEnter your choice: ");
        int c = scanner.nextInt();

        if (c == 1) {
            System.out.print("Returning to get new sums!");
        }
        else if (c == 2) {
            exit();
        } else {
            System.out.print("This is not a valid number.");
            options();
        }
    }

    public static void exit() {
        System.out.print("Exiting the program. Goodbye!");
        System.exit(0);
    }
}