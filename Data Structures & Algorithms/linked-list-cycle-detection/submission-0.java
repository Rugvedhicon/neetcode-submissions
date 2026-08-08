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
    public boolean hasCycle(ListNode head) {
        ListNode tor=head;
        ListNode rab=head;
        while(rab!=null && rab.next!=null){
            tor=tor.next;
            rab=rab.next.next;
            if(rab==tor){
                return true;
            }
        }
        return false;
    }
}
