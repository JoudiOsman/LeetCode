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
    public ListNode swapPairs(ListNode head) {
        ListNode curPointer = head;
        ListNode prevPointer = null;
        while(curPointer != null){       
            if(curPointer.next == null ){                
                return head;
            }
            ListNode nextPointer = curPointer.next;
            ListNode nextCurPointer = nextPointer.next;            
            if(curPointer == head){
                head = nextPointer;
                curPointer.next = nextCurPointer;
            }
            else{
                prevPointer.next = nextPointer;
                curPointer.next = nextCurPointer;
            }
            nextPointer.next = curPointer;
            prevPointer = curPointer;
            curPointer = curPointer.next;
        }
        return head;
    }
}