# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def getDecimalValue(self, head: ListNode) -> int:
        length = 0
        temp = head
        while temp is not None:
            length += 1
            temp = temp.next
        decimal_value = 0
        temp = head
        while temp is not None:
            decimal_value += temp.val * (2 ** (length - 1))
            temp = temp.next
            length -= 1
        return decimal_value
