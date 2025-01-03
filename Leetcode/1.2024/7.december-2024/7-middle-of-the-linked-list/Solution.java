// https://leetcode.com/problems/middle-of-the-linked-list/submissions/1479475102ZZz

public class Solution {
  public ListNode middleNode(ListNode head){
    ListNode fast = head;
    ListNode slow = head;
    while(fast != null && fast.next != null){
        fast = fast.next.next;
        slow = slow.next;
    }
    return slow; 
  }
}
