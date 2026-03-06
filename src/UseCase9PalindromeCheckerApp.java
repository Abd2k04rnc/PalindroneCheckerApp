public class UseCase9PalindromeCheckerApp {
    public static void main(String[] args) {
        // UC1: System Initialization
        System.out.println("Welcome to the Palindrome Checker Management System\n");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully\n");

        /* UC9: Recursive Palindrome Checker */
        String input = "radar";
        System.out.println("Checking string: " + input);

        // Call the recursive method starting with the first and last indices
        boolean isPalindrome = isPalindromeRecursive(input, 0, input.length() - 1);

        // Output Result
        if (isPalindrome) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }
    }

    // The Recursive Method
    public static boolean isPalindromeRecursive(String str, int left, int right) {
        // Base Condition 1: If pointers cross or meet, all characters matched!
        if (left >= right) {
            return true;
        }

        // Base Condition 2: If characters don't match, stop immediately
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // Recursive Call: Move both pointers inward and call the method again
        return isPalindromeRecursive(str, left + 1, right - 1);
    }
}