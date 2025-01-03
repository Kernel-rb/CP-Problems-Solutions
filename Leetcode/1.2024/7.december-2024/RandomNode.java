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
    private ListNode head;
    private int size = 0; 

    public Solution(ListNode head) {
        this.head = head;
        getSize(head);
    }
    
    public void getSize(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            this.size++;
            temp = temp.next;
        }
    }

    public int e() {
        return (int) (Math.random() * size);
    }

    public int getRandom() {   
        int c = e();
        ListNode temp = head;
        while (c != 0 && temp != null) {
            temp = temp.next;
            c--;
        }
        return temp != null ? temp.val : -1;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
