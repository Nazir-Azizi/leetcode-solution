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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null)
            return null;
        ListNode fast = head;
        int i = 0;
        while (i < n){
            fast = fast.next;
            i++;
        }
        
        ListNode pre = head;
        ListNode slow = head;
        while (fast != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next;
        }
        if (slow == head)
            head = pre.next;
        else
            pre.next = slow.next;
        return head;
    }
}
