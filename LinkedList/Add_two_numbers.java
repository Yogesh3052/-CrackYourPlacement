/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list = new ListNode(0);  // Create a dummy node
        ListNode tlist = list;  // Pointer to traverse the result list
        boolean carry = false;  // Initialize carry as false

        while (l1 != null || l2 != null) {
            int val1 = (l1 != null) ? l1.val : 0;  // Get value from l1 or 0 if null
            int val2 = (l2 != null) ? l2.val : 0;  // Get value from l2 or 0 if null
            int sum = val1 + val2 + (carry ? 1 : 0);  // Calculate sum including carry
            carry = sum >= 10;  // Update carry status

            tlist.next = new ListNode(sum % 10);  // Create a new node with the digit value
            tlist = tlist.next;  // Move to the next node

            // Move to the next nodes in l1 and l2 if they exist
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // If there's a carry left, add a new node with carry value
        if (carry) {
            tlist.next = new ListNode(1);
        }

        return list.next;  // Return the result list, skipping the dummy node
    }
}
