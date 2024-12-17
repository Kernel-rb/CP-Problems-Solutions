// https://leetcode.com/problems/palindrome-linked-list/submissions/1479557582/

public class Solution {
  public static boolean isPalindrome(ListNode head){
    if(head == null || head.next == null) return false;

    ListNode fast  = head;
    ListNode slow  = head;
    while( fast != null && fast.next != null){
      fast = fast.next.next;
      slow = slow.next;   
    }


    ListNode fP = head;
    ListNode rP = rev(slow);
    while( rP != null ){
      if(fP.val != rP.val){
        return false;
      }
      fP = fP.next;
      rP = rP.next;
    }
    return true;
  }

  public static ListNode rev(ListNode head){
    if(head == null) return head;
    ListNode curr = head;
    ListNode prev = null;
    while(curr != null){
      ListNode next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    return prev;
  }


}

