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
     private ListNode reverse(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode node = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==0) return head;

        int length=0;
        ListNode cur = head;

        while(cur!=null){
            length++;
            cur=cur.next;
        }

        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode prevgroup = dummy;
        cur=head;
        while(length>=k){
            ListNode start=cur;

            for(int i=1;i<k;i++){
                cur=cur.next;
            }

            ListNode nextGroup = cur.next;
            cur.next=null;
            ListNode revNode = reverse(start);

            prevgroup.next = revNode;
            start.next=nextGroup;

            prevgroup=start;
            cur=nextGroup;

            length-=k;

        }

        return dummy.next;
    }
}
