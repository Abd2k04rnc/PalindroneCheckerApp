public class hardcodedstring {
    public static void main(String[] args) {
        // Hardcoded string
        String input = "A man, a plan, a canal: Panama";

        System.out.println("Is palindrome: " + isPalindrome(input));
    }

    public static boolean isPalindrome(String s) {
        // Step 1: Initialize pointers
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            // Step 2: Skip non-alphanumeric characters
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else {
                // Step 3: Compare characters (case-insensitive)
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
