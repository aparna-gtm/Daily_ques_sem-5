// Last updated: 8/2/2025, 3:22:25 PM
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
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         return helper(null,head);
//     }
//     public static ListNode helper(ListNode prev,ListNode curr){
//         if(curr==null){
//             return prev;
//         }
//         ListNode temp=helper(curr,curr.next);
//         curr.next=prev;
//         return temp;
//     }

// }
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode ahead=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ahead;
        }
        return prev;
    }
    

}