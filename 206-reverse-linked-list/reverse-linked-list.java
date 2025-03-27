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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
       Stack<Integer> stack = new Stack<>();
       ListNode temp = head;
       while(temp != null){
        stack.push(temp.val);
        temp = temp.next;
       }
       ListNode temp1 = head;
       while(temp1 != null){
        temp1.val = stack.peek();
        stack.pop();
        temp1 = temp1.next;
       }
       return head;
    }
}