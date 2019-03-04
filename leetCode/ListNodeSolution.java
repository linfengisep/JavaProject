/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 *
 *Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 *Output: 7 -> 0 -> 8
 *Explanation: 342 + 465 = 807.
 */

import java.util.ArrayList;

class ListNodeSolution {
    private boolean addOne = false;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode start = new ListNode(treatValue(l1.val+l2.val));
        ListNode current = start;
        l1 = (l1.next !=null)? l1.next:null;
        l2 = (l2.next !=null)? l2.next:null;

        int value=0;
        while(l1 !=null || l2 !=null){
            if(l1 !=null && l2 !=null){
                value = treatValue(addOne? (l1.val + l2.val+1):(l1.val + l2.val));
                l1 = (l1.next !=null)? l1.next:null;
                l2 = (l2.next !=null)? l2.next:null;
            }else if(l1 !=null && l2 ==null){
                value = treatValue(addOne? (l1.val+1) : l1.val);
                l1 = (l1.next !=null)? l1.next:null;
            }else if(l2 !=null && l1 ==null){
                value = treatValue(addOne? (l2.val+1) : l2.val);
                l2 = (l2.next !=null)? l2.next:null;
            }
            ListNode node = new ListNode(value);
            current.next = node;
            current = current.next;
        }

        if(l1==null && l2 ==null){
            if(addOne){
              ListNode finalNode = new ListNode(1);
                current.next = finalNode;
                current = current.next;
            }
        }
        return start;
    }

    int treatValue(int value){
        if(value>=10){
            value %=10;
            addOne = true;
        }else{
            addOne = false;
        }
        return value;
    }
}
