// Last updated: 8/2/2025, 3:24:19 PM
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        int len=1;
        ListNode curr=head;
        while(curr.next!=null){
            len++;
            curr=curr.next;
        }
        curr.next=head;
        k=k%len;
        k=len-k;

        curr=head;
        for(int i=0;i<k-1;i++){
            curr=curr.next;
        }
        ListNode newH=curr.next;
        curr.next=null;

        return newH;
    }
}