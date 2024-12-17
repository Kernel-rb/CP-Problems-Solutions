// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

class Solution {
    public int getDecimalValue(ListNode head) {
        int result = 0;
        while (head != null) {
            result = (result << 1) | head.val; 
            head = head.next;
        }
        return result;
    }
}

