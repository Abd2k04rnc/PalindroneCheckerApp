public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {
        // UC1: System Initialization
        System.out.println("Welcome to the Palindrome Checker Management System\n");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully\n");

        /* UC3: Palindrome Check Using String Reverse
           Requirement: Use a loop and string concatenation (+)
        */
        String original = "radar";
        String reversed = "";

        System.out.println("Checking string: " + original);

        // 1. Reverse string using a for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i); // Building the string char by char
        }

        System.out.println("Reversed string is: " + reversed);

        // 2. Compare original and reversed using equals()
        if (original.equals(reversed)) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }
    }
}