// Last updated: 8/2/2025, 3:25:25 PM
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        int idx_start = len - n;

        if (idx_start == 0) {
            return head.next;
        }

        ListNode prev = GetNode(idx_start - 1, head);
        prev.next = prev.next.next;

        return head;
    }

    public ListNode GetNode(int k, ListNode head) {
        int st = 0;
        ListNode temp = head;
        while (st != k) {
            temp = temp.next;
            st++;
        }
        return temp;
    }
}
