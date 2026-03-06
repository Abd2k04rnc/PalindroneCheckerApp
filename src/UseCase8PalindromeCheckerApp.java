class Node {
    char data;
    Node next;
    Node(char data) { this.data = data; }
}

public class UseCase8PalindromeCheckerApp {
    public static void main(String[] args) {
        // UC1: System Info
        System.out.println("Welcome to the Palindrome Checker Management System\n");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully\n");

        /* UC8: Singly Linked List with Middle Finding & Reversal */
        String input = "radar";
        System.out.println("Checking string: " + input);

        // 1. Convert String to Singly Linked List
        Node head = new Node(input.charAt(0));
        Node current = head;
        for (int i = 1; i < input.length(); i++) {
            current.next = new Node(input.charAt(i));
            current = current.next;
        }

        // 2. Find middle using Fast and Slow pointers
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 3. Reverse the second half of the list
        Node prev = null;
        Node curr = slow;
        while (curr != null) {
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        // 4. Compare first half and reversed second half
        Node left = head;
        Node right = prev; // Head of the reversed second half
        boolean isPalindrome = true;
        while (right != null) {
            if (left.data != right.data) {
                isPalindrome = false;
                break;
            }
            left = left.next;
            right = right.next;
        }

        // 5. Output Result
        if (isPalindrome) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }
    }
}
