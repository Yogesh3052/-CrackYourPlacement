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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        ListNode temp1=new ListNode(0,head);
        ListNode temp2=temp1.next;
        while(temp1!=null){
            if(temp2==null){
                return head;
            }
            if(head.val==val){
                head=head.next;
            }
            if(temp2.val==val){
                temp1.next=temp2.next;
                temp2=temp1.next;
                
            }
            else{
                temp1=temp1.next;
                temp2=temp2.next;
            }
        }
        return head;
    }
}