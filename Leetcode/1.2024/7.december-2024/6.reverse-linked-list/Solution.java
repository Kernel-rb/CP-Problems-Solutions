//https://leetcode.com/problems/reverse-linked-list/submissions/1479458463/
public class Solution {
    public static Node revLL(Node head){
        if(head == null) return head;
        Node curr = head;
        Node prev = null;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
