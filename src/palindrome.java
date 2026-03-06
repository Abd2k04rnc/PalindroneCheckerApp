class PalindromeChecker {
    /* UC1 */
    public static void main(String[] args){
        System.out.println("Welcome to the Palindrome Checker Management System\n");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully\n");

        /* UC2: Hardcoded string check */
        String hardcodedString = "radar";
        System.out.println("Checking hardcoded string: " + hardcodedString);

        if (isPalindrome(hardcodedString)) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }
    }

    // Logic for UC2
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}