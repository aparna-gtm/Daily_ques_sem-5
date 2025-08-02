// Last updated: 8/2/2025, 3:23:05 PM
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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;

        }
        ListNode mid=middle(head);
        ListNode mid_next=mid.next;
        mid.next=null;
        ListNode one=sortList(head);
        ListNode two=sortList(mid_next);
        return merge(one,two);
    }
    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode one,ListNode two){
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        while(one!=null && two!=null){
            if(one.val>two.val){
                dummy.next=two;
                two=two.next;
                dummy=dummy.next;
            }
            else{
                dummy.next=one;
                dummy=dummy.next;
                one=one.next;
            }
        }
        if(one!=null){
            dummy.next=one;
        }
        if(two!=null){
            dummy.next=two;
        }
        return temp.next;
    }
}