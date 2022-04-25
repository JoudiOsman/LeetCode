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
        ListNode curNode = head;
        ListNode prevNode = null;
        while(curNode != null && curNode.next!= null){       

            ListNode nextNode = curNode.next;
            ListNode nextCurNode = nextNode.next;            
            if(curNode == head){
                head = nextNode;
                curNode.next = nextCurNode;
            }
            else{
                prevNode.next = nextNode;
                curNode.next = nextCurNode;
            }
            nextNode.next = curNode;
            prevNode = curNode;
            curNode = curNode.next;
        }
        return head;
    }
}

