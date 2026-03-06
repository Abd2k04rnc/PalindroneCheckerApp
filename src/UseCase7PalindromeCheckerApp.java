import java.util.ArrayDeque;
import java.util.Deque;

public class UseCase7PalindromeCheckerApp {
    public static void main(String[] args) {
        // UC1: System Info
        System.out.println("Welcome to the Palindrome Checker Management System\n");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully\n");

        /* UC7: Optimized Deque Comparison */
        String input = "madam";
        System.out.println("Checking string: " + input);

        // 1. Initialize Deque
        Deque<Character> deque = new ArrayDeque<>();

        // 2. Add characters to the Deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // 3. Compare front and rear until only 0 or 1 element remains
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // 4. Output Result
        if (isPalindrome) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }
    }
}