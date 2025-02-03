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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null)
            return head;
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null){
            ListNode newNode = new ListNode(gcd(pre.val, cur.val));
            pre.next = newNode;
            newNode.next = cur;
            pre = cur;
            cur = cur.next;
        }
        return head;
    }
    public int gcd(int a, int b){
        while (b != 0){
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
