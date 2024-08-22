import java.util.Stack;

class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;

        // Push all elements onto the stack
        while (temp != null) {
            st.push(temp.val);
            temp = temp.next;
        }

        // Reset temp to head to start comparing
        temp = head;

        // Compare elements from the stack with the list
        while (temp != null) {
            if (temp.val != st.pop()) {
                return false;  // If any element does not match, it's not a palindrome
            }
            temp = temp.next;
        }

        return true;  // If all elements matched, it is a palindrome
    }
}
