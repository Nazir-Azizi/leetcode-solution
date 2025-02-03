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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;
        while (head.next != null && head.val == head.next.val)
            head = head.next;
        ListNode cur = head;
        while (cur != null){
            ListNode temp = cur.next;
            while (temp != null && cur.val == temp.val)
                temp = temp.next;
            cur.next = temp;
            cur = cur.next;
        }
        return head;
    }
}
