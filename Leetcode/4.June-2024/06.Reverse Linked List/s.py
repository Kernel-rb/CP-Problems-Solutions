# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head):
        temp = head
        prev = None
        while temp:
            after = temp.next
            temp.next = prev
            prev = temp
            temp = after
        return prev

    


