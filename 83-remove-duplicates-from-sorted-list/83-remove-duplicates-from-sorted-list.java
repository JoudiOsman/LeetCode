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
        if(head == null){
            return null;
        }
        ListNode prev = head;
        ListNode curhead = head.next;
        int prevInt = head.val;
        while(curhead!=null){
            if(curhead.val == prevInt){
                prev.next = curhead.next;
            }
            else{
                prev = curhead;
                prevInt = curhead.val;
            }
            curhead = curhead.next;
        }
        return head;
    }
}