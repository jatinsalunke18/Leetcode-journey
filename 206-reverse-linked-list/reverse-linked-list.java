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
        int i=0;
        ListNode temp = head;
        while(temp!=null){
            i++;
            temp = temp.next;
        }
        int[] nums = new int[i];
        temp = head;
        i=0;
        while(temp!=null){
            nums[i++] = temp.val;
            temp = temp.next;
        }
        i--;
        temp = head;
        while(temp!=null){
            temp.val = nums[i--];
            temp = temp.next;
        }
        return head;
    }
}