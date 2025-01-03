# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head):
        f = head
        s = head
        while f and f.next:
            f = f.next.next
            s = s.next
        return s