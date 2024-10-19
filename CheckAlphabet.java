//13. Write a command line program for Check Whether a Character is an Alphabet or not.

public class CheckAlphabet {
    public static void main(String[] args) {
        // Check if exactly one argument is provided
       // if (args.length != 1) {
        //    System.out.println("Usage: java CheckAlphabet <character>");
         //   return;
       // }

        // Get the input character from the command line argument
        String input = args[0];

        // Check if the input is a single character
        if (input.length() != 1) {
            System.out.println("Please enter only one character.");
            return;
        }

        // Get the character from the string
        char ch = input.charAt(0);

        // Check if the character is an alphabet
        if (Character.isLetter(ch)) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
    }
}
