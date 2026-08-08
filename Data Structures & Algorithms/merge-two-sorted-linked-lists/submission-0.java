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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode dummy1=dummy;
        ListNode head1=list1;
        ListNode head2=list2;
        while(head1!=null && head2!=null){
            if(head1.val>head2.val){
                dummy1.next=head2;
                head2=head2.next;
                dummy1=dummy1.next;
            }
            else{
                dummy1.next=head1;
                head1=head1.next;
                dummy1=dummy1.next;
            }
        }
        if(head1==null){
            dummy1.next=head2;
        }
        else{
            dummy1.next=head1;
        }


        return dummy.next;
    }
}