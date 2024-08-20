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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode fpointer = dummy;
        
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        
        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                fpointer.next = temp1;
                temp1 = temp1.next;
            } else {
                fpointer.next = temp2;
                temp2 = temp2.next;
            }
            fpointer = fpointer.next;
        }
        
        // Attach the remaining nodes of list1 or list2
        if (temp1 != null) {
            fpointer.next = temp1;
        } else {
            fpointer.next = temp2;
        }
        
        return dummy.next; // Return the merged list, excluding the dummy node
    }
}
