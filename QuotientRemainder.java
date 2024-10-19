public class QuotientRemainder {
    public static void main(String[] args) {
        // Ensure the correct number of arguments are provided
        if (args.length != 2) {
            System.out.println("Usage: java QuotientRemainder <dividend> <divisor>");
            return;
        }

        // Convert command-line arguments to integers
        int dividend = Integer.parseInt(args[0]);
        int divisor = Integer.parseInt(args[1]);

        // Check for division by zero
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }

        // Compute quotient and remainder
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        // Output the results
        System.out.println(quotient + " " + remainder);
    }
}
