// Last updated: 8/2/2025, 3:22:54 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      
        ListNode bf=headA;
        ListNode gf=headB;
        while(bf!=gf){
            if(bf!=null){
                bf=bf.next;
            }
            else{
                bf=headB;
            }
            if(gf!=null){
                gf=gf.next;
            }
            else{
                gf=headA;
            }
        }
        return bf;

    }
}