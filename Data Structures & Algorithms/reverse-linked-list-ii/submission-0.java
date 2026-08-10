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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head==null || left==right) return head;

        ListNode dummy = new ListNode(0);

        dummy.next=head;

        ListNode prev =dummy;

        for(int i=1;i<left;i++){
            prev=prev.next;
        }

        ListNode start = prev.next;

        ListNode end=start;

        for(int i=left;i<right;i++){
            end =end.next;
        }

        ListNode tail = end.next;
        end.next=null;

        ListNode midNode = reverse(start);

        prev.next=midNode;
        start.next=tail;

        return dummy.next;
        
    }

    private ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;

        ListNode nextNode = reverse(head.next);

        head.next.next=head;
        head.next=null;

        return nextNode;
    }
}