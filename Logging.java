import java.util.Scanner;
/**
* The program is about logging.
*
* @author Titwech Wal
* @version 1.0
* @since   2023-02-17
*/

public final class Logging {

    /**
    * This is a private constructor used to satisfy
    * the style checker.
    *
    * @exception IllegalStateException Utility class.
    * @see IllegalStateException
    */
    private Logging() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * This is the main method.
    *
    * @param args Unused.
    */
    public static void main(String[] args) {
        // Welcome the user
        System.out.println("Enter your log length (1, 0.5, 0.25)");

        // variables and Constants
        final double LOG_1 = 0.5;
        final double LOG_2 = 0.25;
        final double LOG_3 = 1;
        final double MAX_LOAD = 1100;
        final double WEIGHT = 20;

        // Using Scanner for getting input from user
        final Scanner scanner = new Scanner(System.in);
        final String logString = scanner.nextLine();

        try {
            // Convert the string to a double
            final double logDoub = Double.parseDouble(logString);

            // if radius is negative tell user
            if (logDoub == LOG_1 || logDoub == LOG_2 || logDoub == LOG_3) {
                // Calculates and displays
                final double truckLoad = MAX_LOAD / (logDoub * WEIGHT);

                System.out.print("The truck will be able to take ");
                System.out.format("%.2f", truckLoad);
                System.out.println(" logs.");

            } else if (logDoub < 0) {
                // if user enter 0
                System.out.println("Please enter a higher number.");
            } else {
                // if user enters non number
                System.out.println("Please enter one of the 3 numbers.");
            }

        } catch (NumberFormatException error) {
            System.out.println("Please enter a valid number."
                + error.getMessage());
        }

        // Close scanner
        scanner.close();

    }
}
