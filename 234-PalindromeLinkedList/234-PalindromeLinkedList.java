// Last updated: 8/2/2025, 3:22:04 PM
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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        Stack<Integer> st=new Stack<>();
        ListNode curr=head;
        int len=1;
        while(curr!=null && curr.next!=null){
            st.push(curr.val);
            curr=curr.next;
            len++;
        }
        st.push(curr.val);
        //System.out.println(len);
        curr=head;
        int i=0;
        while(i<len/2){
            if(!st.isEmpty() && st.pop()!=curr.val){
                return false;
            }
            curr=curr.next;
            i++;
        }
        return true;

        

    }
    
}