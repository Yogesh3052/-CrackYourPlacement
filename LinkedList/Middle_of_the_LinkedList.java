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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int size = 0;
        
        // Calculate the size of the linked list
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        
        // Find the middle index
        int mid = size / 2;
        
        
        // Traverse to the middle node
        for (int i = 0; i < mid; i++) {
            head = head.next;
        }
        
        return head;
    }
}
