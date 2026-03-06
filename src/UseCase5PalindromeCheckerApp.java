public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {
        // UC1: System Info
        System.out.println("Welcome to the Palindrome Checker Management System\n");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully\n");

        /* UC5: High-Performance Check using StringBuilder */
        String input = "madam";
        System.out.println("Checking string: " + input);

        // 1. Create a StringBuilder object
        StringBuilder sb = new StringBuilder(input);

        // 2. Use the high-performance reverse() method
        // Note: .reverse() modifies the object itself!
        String reversed = sb.reverse().toString();

        System.out.println("Reversed string is: " + reversed);

        // 3. Compare content
        if (input.equals(reversed)) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }
    }
}