public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {
        // UC1: System Initialization
        System.out.println("Welcome to the Palindrome Checker Management System\n");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully\n");

        /* UC4: Character Array and Two-Pointer Technique */
        String input = "radar";

        // 1. Convert string to character array
        char[] charArray = input.toCharArray();

        // 2. Initialize two pointers
        int left = 0;
        int right = charArray.length - 1;
        boolean isPalindrome = true;

        System.out.println("Checking string: " + input + " using character array.");

        // 3. Two-pointer comparison
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break; // Exit loop if a mismatch is found
            }
            left++;
            right--;
        }

        // 4. Display result
        if (isPalindrome) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }
    }
}