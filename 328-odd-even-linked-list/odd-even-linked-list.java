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
    public ListNode oddEvenList(ListNode head) {
         if (head == null || head.next == null) {
            return head; // No need to process empty or single-node lists
        }
        ListNode temp = head;
        List<Integer> arr = new ArrayList<>();
        while(temp != null && temp.next != null){
            arr.add(temp.val);
            temp = temp.next.next;
        }
        if(temp != null){
            arr.add(temp.val);
        }
        temp = head.next;
        while(temp != null && temp.next != null){
            arr.add(temp.val);
            temp = temp.next.next;
        }
        if(temp != null){
            arr.add(temp.val);
        }
        int i = 0;
        temp = head;
        while(temp != null){
            temp.val = arr.get(i);
            i++;
            temp = temp.next;
        }
        return head;
    }
}