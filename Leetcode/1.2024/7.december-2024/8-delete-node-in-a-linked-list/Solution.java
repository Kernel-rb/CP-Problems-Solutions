// https://leetcode.com/problems/delete-node-in-a-linked-list/submissions/1479519718/

public class Solution {
  public void deleteNode(ListNode node){
    if( node  != null && node.next != null ){
      node.val = node.next.val;
      node.next = node.next.next;
    }
  }
}
