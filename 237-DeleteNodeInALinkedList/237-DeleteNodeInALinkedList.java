// Last updated: 8/2/2025, 3:22:01 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode prev=null;
        while(node.next!=null){
            node.val=node.next.val;
            prev=node;
            node=node.next;
        }
        prev.next=null;

    }
}