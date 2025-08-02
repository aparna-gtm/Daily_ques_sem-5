// Last updated: 8/2/2025, 3:25:52 PM
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
        ListNode temp=new ListNode();
        ListNode ans=temp;
        int c=0;
        int total=0;
        while(l1!=null || l2!=null || c!=0){
            total=c;
            if(l1!=null ){
                total+=l1.val;
                l1=l1.next;
            }
            
            if(l2!=null ){
                total+=l2.val;
                l2=l2.next;
            }
            int num=(total)%10;
            c=(total)/10;
            
            temp.next=new ListNode(num);
            temp=temp.next;
           
           
        }
        return ans.next;
    }
}