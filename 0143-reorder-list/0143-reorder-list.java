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
    public void reorderList(ListNode head) {

        ListNode slow=head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode second=slow.next;
        slow.next=null;

        ListNode prev=null;

        while(second!=null)
        {
            ListNode next =second.next;
            second.next=prev;
            prev=second;
            second=next;
        }

        second=prev;

        ListNode first =head;

        while(second!=null)
        {
            ListNode p1=first.next;
            ListNode p2=second.next;

            first.next=second;
            second.next=p1;

            first=p1;
            second=p2;
        }

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna