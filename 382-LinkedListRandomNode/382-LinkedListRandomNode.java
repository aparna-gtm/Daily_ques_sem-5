// Last updated: 8/2/2025, 3:21:18 PM
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
        private List<Integer> list;
        private Random rand;
    public Solution(ListNode head) {
        list = new ArrayList<>();
        rand = new Random();

       
        ListNode current = head;
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }
    }
    
    public int getRandom() {
        int index = rand.nextInt(list.size());
        return list.get(index);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */