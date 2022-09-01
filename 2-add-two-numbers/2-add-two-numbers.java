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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carryOver=0;
        int added=0;
        ListNode node1 = l1;
        ListNode node2 = l2;
        ListNode retList = new ListNode(0);
        ListNode original = retList;
        int iteration =0;
        while(node1!=null && node2!=null){
            //getting the numbers to add and the "carrys"
        
                added = (node1.val+node2.val+carryOver)%10;
                carryOver =(node1.val+node2.val+carryOver)/10;


            //retList.val = added;
            //System.out.println(retList.val);
            retList.next = new ListNode(added);
            retList = retList.next;
            node1 = node1.next;
            node2 = node2.next;
        }
        if(node1!=null){
            while(node1!=null){
                
                if(node1.val+carryOver>9){        
                    added = node1.val+carryOver-10;
                    carryOver=1;
                } else {    
                    added = node1.val+carryOver;    
                    carryOver =0;
                }
                
                retList.next = new ListNode(added);
                retList = retList.next;
                node1 = node1.next;        
            }
            
        } else if (node2!=null){
            while(node2!=null){
                if(node2.val+carryOver>9){        
                    added = node2.val+carryOver-10;
                    carryOver=1;
                } else {    
                    added = node2.val+carryOver;    
                    carryOver =0;
                }
                
                retList.next = new ListNode(added);
                retList = retList.next;
                node2 = node2.next;        
            }
        }
        if(carryOver==1){
            retList.next = new ListNode(1);
        }
    
        return original.next;
    }
}